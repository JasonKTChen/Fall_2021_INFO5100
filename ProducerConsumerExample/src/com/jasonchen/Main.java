package com.jasonchen;

import java.util.ArrayList;

public class Main {

    public static ArrayList<String> items = new ArrayList<>();

    public static void main(String[] args) {
        Thread[] producers = new Thread[5];
        Thread[] consumers = new Thread[10];
        for(int i = 0; i < producers.length;i++){
            producers[i] = new Thread(new Producer());
            producers[i].start();
        }
        for(int i = 0; i < consumers.length;i++){
            consumers[i] = new Thread(new Consumer());
            consumers[i].start();
        }
    }
}
