package com.jasonchen;

public class Main {
    public static void main(String[] args) {
        Projector proj = Projector.get_instance();
        Projector proj1 = Projector.get_instance();
        Projector proj2 = Projector.get_instance();
        proj.name = "hello world";
        System.out.println(proj1.name);
        System.out.println(proj2.name);
    }
}
// design pattern