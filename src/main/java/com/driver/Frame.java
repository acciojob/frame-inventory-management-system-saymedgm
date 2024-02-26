package com.driver;

public class Frame {
    private String brand;
    private String model;
    private String size;

    public Frame(String brand, String model, String size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    // Getters and setters...
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Frame [brand=" + brand + ", model=" + model + ", size=" + size + "]";
    }
}
