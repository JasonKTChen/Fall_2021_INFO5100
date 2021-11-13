package com.jasonchen;

public class Producer implements Runnable{
    @Override
    public void run() {
        while (true){
            Main.items.add(Thread.currentThread().getName() + " item");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
