package com.jasonchen.Decorator;

public class LuxuryCar extends CarDecorator{
    String description;
    String name = "Luxury Car.";
    @Override
    public void assemble() {
        System.out.println(description);
    }
    LuxuryCar(Car car){
        super(car);
        this.description = car.getName() + " Adding features of " + name;
    }

    @Override
    public String getName() {
        return description;
    }
}
