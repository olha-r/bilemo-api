<?php

namespace App\Entity;

use ApiPlatform\Core\Annotation\ApiResource;
use App\Repository\UserRepository;
use Doctrine\ORM\Mapping as ORM;
use Symfony\Bridge\Doctrine\Validator\Constraints\UniqueEntity;
use Symfony\Component\Serializer\Annotation\Groups;
use Symfony\Component\Validator\Constraints as Assert;

/**
 * @ApiResource(
 *     itemOperations={
 *          "get"={
 *              "normalization_context"={
 *                  "groups"={"read:user_details"}
 *              }
 *          },
 *          "delete"
 *      },
 *      collectionOperations={
 *          "post"},
 *     subresourceOperations={
 *          "api_customers_users_get_subresource"={
 *                 "normalization_context"={
 *                      "groups"={"users_subresource"}
 *                  }
 *          }
 *     },
 *     attributes={
 *          "pagination_items_per_page" = 10
 *     }
 * )
 * @UniqueEntity("email", message="Un utilisateur ayant cette adresse email existe déjà")
 * @ORM\Entity(repositoryClass=UserRepository::class)
 */
class User
{
    /**
     * @ORM\Id
     * @ORM\GeneratedValue
     * @ORM\Column(type="integer")
     * @Groups({"read:user_details", "users_subresource", "read:customer"})
     */
    private $id;

    /**
     * @ORM\Column(type="string", length=255)
     * @Assert\NotBlank(message = "Le prénom d'utilisateur est obligatoire")
     * @Assert\Length(
     *      min = 3,
     *      max = 20,
     *      minMessage = "Le prénom dois contenir entre 3 et 20 caractères",
     *      maxMessage = "Le prénom dois contenir entre 3 et 20 caractères"
     * )
     * @Groups({"read:user_details", "users_subresource", "read:customer"})
     */
    private $firstName;

    /**
     * @ORM\Column(type="string", length=255, nullable=true)
     * @Assert\NotBlank(message = "Le nom d'utilisateur est obligatoire")
     * @Assert\Length(
     *      min = 3,
     *      max = 100,
     *      minMessage = "Le nom dois contenir entre 3 et 100 caractères",
     *      maxMessage = "Le nom dois contenir entre 3 et 100 caractères"
     * )
     * @Groups({"read:user_details", "users_subresource", "read:customer"})
     */
    private $lastName;

    /**
     * @ORM\Column(type="string", length=255)
     * @Assert\NotBlank(message = "L'adresse email est obligatoire")
     * @Assert\Email(
     *     message = "Le format de l'adresse email doit être valid."
     * )
     * @Groups({"read:user_details"})
     */
    private $email;

    /**
     * @ORM\ManyToOne(targetEntity=Customer::class, inversedBy="users")
     * @ORM\JoinColumn(nullable=false)
     * @Assert\NotBlank(message = "Le client est obligatoire")
     * @Groups({"read:user_details"})
     */
    private $customer;

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getFirstName(): ?string
    {
        return $this->firstName;
    }

    public function setFirstName(string $firstName): self
    {
        $this->firstName = $firstName;

        return $this;
    }

    public function getLastName(): ?string
    {
        return $this->lastName;
    }

    public function setLastName(?string $lastName): self
    {
        $this->lastName = $lastName;

        return $this;
    }

    public function getEmail(): ?string
    {
        return $this->email;
    }

    public function setEmail(string $email): self
    {
        $this->email = $email;

        return $this;
    }

    public function getCustomer(): ?Customer
    {
        return $this->customer;
    }

    public function setCustomer(?Customer $customer): self
    {
        $this->customer = $customer;

        return $this;
    }
}
