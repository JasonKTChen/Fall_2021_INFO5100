package com.jasonchen;

public class Mercedes extends Car{
    //must contain the same constructor
    public Mercedes( String modelName, int whealSize, boolean isAutomatic, int numSeats, boolean hasLeatherSeats) {
        super( modelName, whealSize, isAutomatic, numSeats, hasLeatherSeats);
        super.setName("Mercedes");
    }

    @Override
    public int getSpeed(){
        int speed = 0;
        switch (getGearBox().currentGear){
            case 1:
                speed = 30;
                break;
            case 2:
                speed = 50;
                break;
            case 3:
                speed = 70;
                break;
            case 4:
                speed = 90;
                break;
            case 5:
                speed = 130;
                break;
            default:
                return 0;
        }
        return speed;
    }
}
