package com.jasonchen.Decorator;

public class BasicCar extends Car implements ICar{
    String description;
    @Override
    public void assemble() {
        System.out.println(description);
    }
    BasicCar(){
        this.description = "Basic Car.";
    }
    @Override
    public String getName() {
        return description;
    }
}
