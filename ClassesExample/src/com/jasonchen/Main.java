package com.jasonchen;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        House h1 = new House("green", 1);
        System.out.println(h1.color);
        System.out.println(h1.color);
        h1.color = "pink";
        System.out.println(h1.color);
        System.out.println(h1.color);
        System.out.println("------------");
        House h3 = new House("blue", 21, 1 ,true);
        h3.printdetails();
        h3.printdetails(true);
        
    }
}