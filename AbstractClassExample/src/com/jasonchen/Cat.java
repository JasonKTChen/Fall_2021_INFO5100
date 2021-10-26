package com.jasonchen;

public class Cat extends Animal implements iSwim{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("I am saying meow");
    }
    @Override
    public void swim() {}
}
