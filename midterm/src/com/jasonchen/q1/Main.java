package com.jasonchen.q1;

public class Main {

    public static void main(String[] args) {
        Fiction fiction = new Fiction("fiction",100,"2020");
        System.out.println(fiction.description());
        NonFiction nonFiction = new NonFiction("nonfiction",200,"2021");
        System.out.println(nonFiction.description());
        Reference reference = new Reference("reference",300,"2022","cooking");
        System.out.println(reference.description());
    }
}
