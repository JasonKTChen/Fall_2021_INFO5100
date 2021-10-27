package com.jasonchen.q2;

public class Printer {
    private Printer(){};
    private static Printer instance;
    private static Object obj = new Object();

    public static Printer getInstance(){
        if(instance == null){
            synchronized (obj){
                if(instance == null){
                    instance = new Printer();
                }
            }
        }
        return instance;
    }
    public static void getConnection(){
        System.out.println("Your Printer is working");
    }

    class Main {
        public static void main(String[] args) {
            Printer p1;
            p1 = Printer.getInstance();
            p1.getConnection();
        }
    }
}
