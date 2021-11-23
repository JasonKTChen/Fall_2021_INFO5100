package com.jasonchen.Decorator;

public class CarDecorator extends Car implements ICar{
    String description;

    public CarDecorator(Car car) {
        description = car.getName() + ". Adding features of ";
    }

    @Override
    public void assemble() {
        System.out.println(description);
    }
    @Override
    public String getName() {
        return description;
    }
}
