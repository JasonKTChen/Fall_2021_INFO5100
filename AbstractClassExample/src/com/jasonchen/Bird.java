package com.jasonchen;

public class Bird extends Animal implements iFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("I am charping");
    }
    @Override
    public void fly(){
        System.out.println("I can flying");
    }

}
