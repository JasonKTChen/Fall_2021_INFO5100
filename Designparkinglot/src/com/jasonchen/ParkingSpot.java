package com.jasonchen;

public class ParkingSpot {
    private String spotID;
    private Main.SpotSize spotSize;
    private boolean isOccupied;

    public Main.SpotSize getSpotSize() {
        return spotSize;
    }

    public String getSpotID() {
        return spotID;
    }

    public ParkingSpot(String spotID, Main.SpotSize spotSize){
        this.spotID = spotID;
        this.spotSize = spotSize;
        this.isOccupied = false;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
}
