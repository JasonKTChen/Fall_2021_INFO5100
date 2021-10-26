package com.jasonchen;

public class Rhino extends Animal{

    //reconstruct the constructer
    public Rhino(String name, int age, double weight, boolean isMammal, boolean isVetarian) {
        super(name, age, weight, isMammal, isVetarian);
        type = animaltype.mamal;
    }

    public void eat(){
        super.eat();
        System.out.println("I am a rhino");
    }
}

