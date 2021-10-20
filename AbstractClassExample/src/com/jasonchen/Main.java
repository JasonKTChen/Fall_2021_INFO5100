package com.jasonchen;
//use Abstract class can prevent forgetting the override function
//can defer the abstract the implementation to children class
public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal dog = new Dog("Dog");
        dog.speak();
        Animal cat = new Cat("Cat");
        cat.speak();
        Animal bird = new Bird("Bird");
        bird.speak();
        Fish fish = new Fish("Fish");
        fish.speak();
        fish.swim();

        zoo.listAnimals.add(dog);
        zoo.listAnimals.add(dog);
        zoo.listAnimals.add(dog);
        zoo.listAnimals.add(dog);

        Animal animal = zoo.listAnimals.add(dog);
        System.out.println(animal.getClass().toString());


    }
}
