package com.collectionFramework;

public class Vehicle {
    String make;
    String model;
    int price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Vehicle(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
}
