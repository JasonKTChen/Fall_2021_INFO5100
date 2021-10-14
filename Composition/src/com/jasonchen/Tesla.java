package com.jasonchen;

public class Tesla extends Car{

    public Tesla(String modelName, int whealSize, boolean isAutomatic, int numSeats, boolean hasLeatherSeats) {
        super(modelName, whealSize, isAutomatic, numSeats, hasLeatherSeats);
        super.setName("Tesla");
    }
    @Override
    public int getSpeed(){
        int speed = 0;
        switch (getGearBox().currentGear){
            case 1:
                speed = 40;
                break;
            case 2:
                speed = 60;
                break;
            case 3:
                speed = 80;
                break;
            case 4:
                speed = 100;
                break;
            case 5:
                speed = 150;
                break;
            default:
                return 0;
        }
        return speed;
    }
    public void ludicriousMode(){
        setSpeed(200);
    }
}
