package com.jasonchen.Decorator;

public abstract class Car implements ICar {
    public abstract String getName();
    @Override
    public abstract void assemble();
}
