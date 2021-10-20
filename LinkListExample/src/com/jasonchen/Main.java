package com.jasonchen;

public class Main {

    public static void main(String[] args) {
        LinkList <Integer> list = new LinkList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list.printList();

        LinkList <String> list2 = new LinkList<>();
        list2.add("Amy");
        list2.add("Bob");
        list2.add("Cathy");
        list2.add("David");
        list2.add("Ethan");

    }
}
