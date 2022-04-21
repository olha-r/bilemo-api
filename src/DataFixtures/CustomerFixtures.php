<?php

namespace App\DataFixtures;

use App\Entity\Customer;
use Doctrine\Bundle\FixturesBundle\Fixture;
use Doctrine\Persistence\ObjectManager;
use Faker;
use Symfony\Component\PasswordHasher\Hasher\UserPasswordHasherInterface;

class CustomerFixtures extends Fixture
{
    protected $hasher;

    public function __construct(UserPasswordHasherInterface $hasher)
    {
        $this->hasher = $hasher;
    }

    public function load(ObjectManager $manager): void
    {
        $faker = Faker\Factory::create('fr_FR');
        $customer1 = new Customer();

        $hash = $this->hasher->hashPassword($customer1, 'password');
        $customer1->setFirstName($faker->firstName())
            ->setLastName($faker->lastName())
            ->setCompanyName('ABS-phones')
            ->setEmail($faker->companyEmail())
            ->setPassword($hash);
        $manager->persist($customer1);

        $this->addReference('customer_1', $customer1);

        $customer2 = new Customer();

        $hash = $this->hasher->hashPassword($customer2, 'password');
        $customer2->setFirstName($faker->firstName())
            ->setLastName($faker->lastName())
            ->setCompanyName('My-phones')
            ->setEmail($faker->companyEmail())
            ->setPassword($hash);
        $manager->persist($customer2);

        $this->addReference('customer_2', $customer2);

        $manager->flush();
    }
}
