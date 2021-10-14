package com.jasonchen;
//
enum animaltype {mamal, fish, reptile};

public class Animal {

    public animaltype type;

    private String name;
    private int age;
    private double weight;
    private boolean isMammal;
    private boolean isVetarian;

    public Animal(String name, int age, double weight,boolean isMammal,boolean isVetarian){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isMammal = isMammal;
        this.isVetarian = isVetarian;
    }
    //use private then subclass cannot access to this function
    public void eat(){
        System.out.println("Animal Eat function");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public boolean isVetarian() {
        return isVetarian;
    }

}
