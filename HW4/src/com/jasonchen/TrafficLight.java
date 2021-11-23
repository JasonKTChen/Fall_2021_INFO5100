package com.jasonchen;

public class TrafficLight {

    int isGreen;
    public TrafficLight() {
        this.isGreen = 1;
    }

    public void carArrived(
            int carId,           // ID of the car
            int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
            int direction,       // Direction of the car
            Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
            Runnable crossCar    // Use crossCar.run() to make car cross the intersection
    ) {
        synchronized(this) {
            if (isGreen != roadId) {
                turnGreen.run();
                isGreen = roadId;
            }
            crossCar.run();
        }
    }
}