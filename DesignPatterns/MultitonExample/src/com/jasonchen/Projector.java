package com.jasonchen;

import java.util.HashMap;
import java.util.UUID;

public class Projector {
    static HashMap<Integer,Projector> projectors = new HashMap<>();

    private Projector(){

    }

    private static Object obj = new Object();

    public static Projector getInstance(int id){
        if (projectors.containsKey(id) == false){
            synchronized(obj){
                if(projectors.containsKey(id) == false){
                    projectors.put(id,new Projector());
                }
            }
        }
        return projectors.get(id);
    }

}
