package com.jasonchen.Decorator;

public class SportsCar extends CarDecorator{
    String description;
    String name = "Sports Car.";
    @Override
    public void assemble() {
        System.out.println(description);
    }
    SportsCar(Car car){
        super(car);
        this.description = car.getName() + " Adding features of " + name;
    }

    @Override
    public String getName() {
        return description;
    }
}
