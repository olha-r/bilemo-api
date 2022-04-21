<?php

namespace App\DataFixtures;

use App\Entity\Product;
use Doctrine\Bundle\FixturesBundle\Fixture;
use Doctrine\Persistence\ObjectManager;
use Faker;

class ProductFixtures extends Fixture
{
    public function load(ObjectManager $manager): void
    {
        $faker = Faker\Factory::create('fr_FR');
        for ($i = 0; $i < 50; $i++) {
            $product = new Product();
            $product->setBrand('Phone-'.$i)
                ->setModel($faker->regexify('[A-Z]{5}[0-4]{3}'))
                ->setDescription($faker->text())
                ->setColor($faker->safeColorName())
                ->setPrice($faker->randomFloat(2, 120, 1100))
                ->setStock($faker->numberBetween(0, 500))
                ->setCreatedAt(new \DateTime())
            ;
            $manager->persist($product);
        }

        $manager->flush();
    }
}
