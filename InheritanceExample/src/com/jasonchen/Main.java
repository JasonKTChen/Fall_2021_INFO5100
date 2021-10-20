package com.jasonchen;

public class Main {

    public static void main(String[] args) {
        Rhino rhino = new Rhino("bob",15,123.2,true,true);
        System.out.println(rhino.getAge());

        Fish ff = new Fish("jay",10,12.2,false,false);
        ff.breath();
    }
}
