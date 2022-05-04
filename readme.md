### Formation OpenClassrooms Developer d’application PHP/Symfony - Project 7 :
# Create a web service exposing an API: BileMo

[![Codacy Badge](https://app.codacy.com/project/badge/Grade/d9d0bd5ce1464609ab9bf37e99423fb0)](https://www.codacy.com/gh/olha-r/bilemo-api/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=olha-r/bilemo-api&amp;utm_campaign=Badge_Grade)

## Installation

1. **CLONE** or **DOWNLOAD** the project
2. Open the project in your IDE/text editor.
3. You need to configure at least these lines in **.env** file:

```php

###> doctrine/doctrine-bundle ###
DATABASE_URL="mysql://db_user:db_password@127.0.0.1:3306/db_name?serverVersion=5.7"
###< doctrine/doctrine-bundle ###

```

4. Install dependencies with ```composer install```.
5. Create the database with the command ```php bin/console doctrine:database:create```.
6. Generate your own SSL keys for LexikJWTAuthentication bundle, see  [the bundle documentation](https://github.com/lexik/LexikJWTAuthenticationBundle/blob/2.x/Resources/doc/index.rst#configuration).
7. Create the database ``` php bin/console doctrine:database:create ```
8. Run the command ``` php bin/console doctrine:schema:create ``` to create the schema in the database.
9. Run the following command to load the fixtures: ```php bin/console doctrine:fixtures:load --append ```.
10. Run the server in your terminal ```php bin/console server:start```.
11. Use Postman to navigate through the API.

## API Documentation
To access the API documentation, request the route '/doc' (example: http://127.0.0.1:8000/doc ).

## Login to the app
To access the secured routes of the api, you need to be authentified. To do so:

- Request the following route in Postman via the POST method: http://127.0.0.1:8000/login_check
- In the Body of the request, add your username and password like that:
```php
{
     "username": "your_username",
     "password": "your_password"
}
```
- Send the request.
- The API sends back a token. Copy that token and paste it in Authorization under the value Bearer token.
- You can now access all the secured routes of the api.
