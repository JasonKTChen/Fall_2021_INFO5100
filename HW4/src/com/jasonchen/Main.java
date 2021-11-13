package com.jasonchen;

public class Main {

    public static void main(String[] args) {
        LinkedList lt = new LinkedList();
        lt.addAtPosition(0,1);
        lt.addAtPosition(0,2);
        lt.addAtPosition(0,3);
        lt.addAtPosition(7,4);
        System.out.println(lt.getFirst());
        System.out.println(lt.getLast());//!!
        System.out.println(lt.size());
        lt.print();
        System.out.println("------------");
        lt.removeAtPosition(2);
        lt.removeAtPosition(1);
        lt.print();
        System.out.println("------------");
    }
}