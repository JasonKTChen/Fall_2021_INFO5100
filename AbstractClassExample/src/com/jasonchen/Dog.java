package com.jasonchen;

public class Dog extends Animal implements iSwim{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("I am a dog and I am eating");
    }
    public void getFamily(){
        System.out.println("I am wolf family");
    }
    @Override
    public void speak(){
        System.out.println("I bark");
    }


    @Override
    public void swim() {

    }
}
