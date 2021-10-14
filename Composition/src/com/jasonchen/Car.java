package com.jasonchen;

//composition is a class contains multiple classes
//you can not use abstract class
public abstract class Car {
    //always keep things private
    private String name;
    private Wheels wheels;
    private GearBox gearBox;
    private Seats seats;
    private String modelName;
    private int speed;



    public Car(String modelName, int whealSize, boolean isAutomatic, int numSeats, boolean hasLeatherSeats){

        this.modelName = modelName;
        wheels = new Wheels(whealSize);
        gearBox = new GearBox(isAutomatic);
        seats = new Seats(numSeats,hasLeatherSeats);
    }

    public String getName() {
        return name;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public Seats getSeats() {
        return seats;
    }

    public String getModelName() {
        return modelName;
    }

    // use abstract to verify unsure value
    // children classes can have different functionality
    public abstract int getSpeed();

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

