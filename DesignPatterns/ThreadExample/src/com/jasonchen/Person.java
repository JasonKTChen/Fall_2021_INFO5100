package com.jasonchen;

public class Person extends Thread{
    public void run(){
        for(int i = 0; i< 10;i++){
            System.out.println("I am alive");
//            try{
//                Thread.sleep(1000);
//            }catch (
//
//            )
        }
    }
}
