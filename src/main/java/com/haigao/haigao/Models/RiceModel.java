package com.haigao.haigao.Models;

public class RiceModel {

    private int id;
    private String name;
    private String image;
    private double kilograms;
    private double price;
    private String brand;
    private String description;

    public RiceModel() {
    };

    public RiceModel(String name, String image, double kilograms, double price, String brand, String description) {
        this.name = name;
        this.image = image;
        this.kilograms = kilograms;
        this.price = price;
        this.brand = brand;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getKilograms() {
        return kilograms;
    }

    public void setKilograms(double kilograms) {
        this.kilograms = kilograms;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "RiceModel [id=" + id + ", name=" + name + ", image=" + image + ", kilograms=" + kilograms + ", brand="
                + brand + ", description=" + description + "]";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
