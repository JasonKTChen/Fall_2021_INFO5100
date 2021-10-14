package com.jasonchen;

public class Fish extends Animal{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("I am a fish");
    }
    public void swim(){
        System.out.println("I can swim");
    }
}
