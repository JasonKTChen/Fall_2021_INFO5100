package com.jasonchen;

public class RunnableWithArgument implements Runnable{
    private int value;
    @Override
    public void run() {
        System.out.println("Thread " + value);
    }
    public RunnableWithArgument(int value){
        this.value = value;
    }
}
