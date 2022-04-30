<?php

namespace App\Entity;

use ApiPlatform\Core\Annotation\ApiResource;
use App\Repository\ProductRepository;
use Doctrine\ORM\Mapping as ORM;
use Symfony\Component\Serializer\Annotation\Groups;

/**
 * @ApiResource(
 * itemOperations={
 *          "get"={
 *              "normalization_context" = {
 *                  "groups"={"read:collection", "read:items"}}
 *           }
 *      },
 *
 *     collectionOperations={
 *          "get"={
 *              "normalization_context" = {"groups"={"read:collection"}}
 *          }
 *      },
 *     attributes={
 *     "pagination_items_per_page" = 5
 *     },
 *     cacheHeaders={
 *     "max_age" = 7200,
 *     "shared_max_age" = 7200,
 *     "vary" = {"Authorization", "Accept-Language"}
 *     }
 * )
 * @ORM\Entity(repositoryClass=ProductRepository::class)
 */
class Product
{
    /**
     * @ORM\Id
     * @ORM\GeneratedValue
     * @ORM\Column(type="integer")
     * @Groups({"read:collection"})
     */
    private $id;

    /**
     * @ORM\Column(type="string", length=255)
     * @Groups({"read:collection"})
     */
    private $brand;

    /**
     * @ORM\Column(type="string", length=255)
     * @Groups({"read:collection"})
     */
    private $model;

    /**
     * @ORM\Column(type="text")
     * @Groups({"read:items"})
     */
    private $description;

    /**
     * @ORM\Column(type="float")
     * @Groups({"read:items"})
     */
    private $price;

    /**
     * @ORM\Column(type="string", length=255)
     * @Groups({"read:items"})
     */
    private $color;

    /**
     * @ORM\Column(type="integer")
     * @Groups({"read:collection"})
     */
    private $stock;

    /**
     * @ORM\Column(type="datetime")
     * @Groups({"read:items"})
     */
    private $createdAt;

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getBrand(): ?string
    {
        return $this->brand;
    }

    public function setBrand(string $brand): self
    {
        $this->brand = $brand;

        return $this;
    }

    public function getModel(): ?string
    {
        return $this->model;
    }

    public function setModel(string $model): self
    {
        $this->model = $model;

        return $this;
    }

    public function getDescription(): ?string
    {
        return $this->description;
    }

    public function setDescription(string $description): self
    {
        $this->description = $description;

        return $this;
    }

    public function getPrice(): ?float
    {
        return $this->price;
    }

    public function setPrice(float $price): self
    {
        $this->price = $price;

        return $this;
    }

    public function getColor(): ?string
    {
        return $this->color;
    }

    public function setColor(string $color): self
    {
        $this->color = $color;

        return $this;
    }

    public function getStock(): ?int
    {
        return $this->stock;
    }

    public function setStock(int $stock): self
    {
        $this->stock = $stock;

        return $this;
    }

    public function getCreatedAt(): ?\DateTimeInterface
    {
        return $this->createdAt;
    }

    public function setCreatedAt(\DateTimeInterface $createdAt): self
    {
        $this->createdAt = $createdAt;

        return $this;
    }
}
