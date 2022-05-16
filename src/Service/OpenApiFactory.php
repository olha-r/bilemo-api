<?php

namespace App\Service;

use ApiPlatform\Core\OpenApi\Factory\OpenApiFactoryInterface;
use ApiPlatform\Core\OpenApi\Model\MediaType;
use ApiPlatform\Core\OpenApi\Model\Operation;
use ApiPlatform\Core\OpenApi\Model\PathItem;
use ApiPlatform\Core\OpenApi\Model\Paths;
use ApiPlatform\Core\OpenApi\Model\RequestBody;
use ApiPlatform\Core\OpenApi\Model\Response;
use ApiPlatform\Core\OpenApi\OpenApi;

class OpenApiFactory implements OpenApiFactoryInterface
{
    private OpenApiFactoryInterface $decorated;

    public function __construct(OpenApiFactoryInterface $decorated)
    {
        $this->decorated = $decorated;
    }
    public function __invoke(array $context = []): OpenApi
    {
        $openApi = $this->decorated->__invoke($context);


        $openApi = $this->addSchema(
            $openApi,
            [
                'type' => 'object',
                'required' => ['email', 'password'],
                'properties' => [
                    'email' => new \ArrayObject(['type' => 'string', 'format' => 'email']),
                    'password' => new \ArrayObject(['type' => 'string']),
                ]
            ]
        );

        // Add the JWT Authentication endpoint
        $this->addPostOperation(
            $openApi,
            '/api/login_check',
            'jwt_token',
            ['Authentication'],
            [
                200 => $this->createResponse('Login successful', 'JWTResponse'),
                400 => $this->createResponse('Bad request: missing or incorrect body'),
                401 => $this->createResponse('Invalid credentials: user does not exist or password is incorrect'),
            ],
            'Login',
            $this->createRequestBody('Credentials', 'JWTAuth')
        );
        $paths = $openApi->getPaths()->getPaths();

        unset(
            $paths['/api/customers/{id}'],
        );

        $newPaths = new Paths();

        foreach ($paths as $path => $pathItem) {
            $newPaths->addPath($path, $pathItem);
        }

        return $openApi->withPaths($newPaths);


    }

    private function addSchema(OpenApi $openApi, array $errorSchema): OpenApi
    {
        $components = $openApi->getComponents();
        $schemas = $components->getSchemas();

        if ($schemas === null) {
            $schemas = new \ArrayObject();
        }

        $schemas['JWTAuth'] = new \ArrayObject($errorSchema);

        $schemas->ksort();

        return $openApi->withComponents(
            $components->withSchemas($schemas)
        );
    }

    private function addPostOperation(OpenApi $openApi, string $path, string $operationId, array $tags, array $responses, string $summary, ?RequestBody $requestBody): void
    {
        $operation = new Operation(
            $operationId,
            $tags,
            $responses,
            $summary,
            $summary,
            null,
            [],
            $requestBody
        );

        $openApi->getPaths()->addPath(
            $path,
            (new PathItem())
                ->withPost($operation)
        );
    }

    private function createResponse(string $description, ?string $reference = null): Response
    {
        $schema = null;
        if ($reference !== null) {
            $schema = new \ArrayObject([
                'application/json' => [
                    'schema' => new \ArrayObject([
                        '$ref' => '#/components/schemas/'.$reference,
                    ]),
                ],
            ]);
        }

        return new Response($description, $schema);
    }

    private function createRequestBody(string $description, string $reference): RequestBody
    {
        return new RequestBody(
            $description,
            new \ArrayObject([
                'application/json' => new MediaType(
                    new \ArrayObject([
                        '$ref' => '#/components/schemas/' . $reference,
                    ])
                )
            ]),
            true
        );
    }
}