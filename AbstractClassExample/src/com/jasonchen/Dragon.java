package com.jasonchen;

public class Dragon extends Animal implements iSwim,iFly{
    public Dragon(String name) {
        super(name);
    }

    @Override
    public void speak() {

    }
    @Override
    public void swim(){
        System.out.println("I can swim");
    }
    @Override
    public void fly(){
        System.out.println("I can fly");
    }
}
