package com.jasonchen;

public abstract class Animal{
    String name;

    public void eat() {
        System.out.println("I am an animal.");
    }
    // want the children class has this function
    public abstract void speak();
    public Animal(String name){
        this.name = name;
    }
}
