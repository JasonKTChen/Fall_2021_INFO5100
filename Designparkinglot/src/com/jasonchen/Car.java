package com.jasonchen;

public class Car {
    private String lisencePlate;
    private String make;
    private String model;
    private String year;
    private String color;

    public Car(String lisencePlate, String make, String model, String year, String color) {
        this.lisencePlate = lisencePlate;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String getLisencePlate() {
        return lisencePlate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
