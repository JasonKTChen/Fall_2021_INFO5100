package com.jasonchen;

import java.util.ArrayList;
import java.util.HashMap;

public class ParkingLevel {

    static HashMap<Integer,ParkingLevel> map = new HashMap<>();
    private ParkingLevel(){}
    private  String levelID;
    private ArrayList<ParkingSpot> listElectricSpot; // 10/level
    private ArrayList<ParkingSpot> listCompactSpot; // 50/level
    private ArrayList<ParkingSpot> listSUVSpot; // 10/level

    private static Object obj = new Object();

    public ParkingLevel getInstance(int levelID){
        if(levelID > 5){
            return null;
        }
        if(map.containsKey(levelID) == false){
            synchronized (obj){
                if(map.containsKey(levelID)){
                    map.put(levelID, new ParkingLevel());
                }
            }
        }
        return map.get(levelID);
    }

    public boolean isSpotAvailable(ParkingSpot parkingSpot){
        // implement the logic
        if (ElectricSpot.class.equals(parkingSpot.getClass())) {
            for(ParkingSpot spot: listElectricSpot){
                if(spot.isOccupied()){
                    return true;
                }
            }
        } else if (SUVSpot.class.equals(parkingSpot.getClass())) {
            for(ParkingSpot spot: listSUVSpot){
                if(spot.isOccupied()){
                    return true;
                }
            }
        } else if (CompactSpot.class.equals(parkingSpot.getClass())) {
            for(ParkingSpot spot: listCompactSpot){
                if(spot.isOccupied()){
                    return true;
                }
            }
        }
        return false;
    }
}
