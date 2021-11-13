package com.jasonchen;

public class Main {
// thread can run simetaneiously
    public static void main(String[] args) {
//        Thread[] threads = new Thread[10];
//        for(int i = 0;i < threads.length; i++){
//            RunnableClass runnable = new RunnableClass();
//            threads[i] =  new Thread(runnable);
//            threads[i].setName("Thread " + i);
//            threads[i].start();
//        }
//        Thread th = new Thread(new RunnableWithArgument(5));
//        th.start();
        Tweet tweet = new Tweet("This is a sample","Trump");
        Thread th = new Thread(new RunnableWithArgument(5));
        th.start();
    }
}
