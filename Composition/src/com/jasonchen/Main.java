package com.jasonchen;

public class Main {

    public static void main(String[] args) {
	    Car mercedes = new Mercedes("c300",12,true,5,true);
        Car kia = new Kia("k5",15,true,5,false);
        Car tesla = new Tesla("roadster",18,false,5,true);

        mercedes.getGearBox().setCurrentGear(1);
        System.out.println(mercedes.getSpeed());//same function name but different class
        kia.getGearBox().setCurrentGear(2);
        System.out.println(kia.getSpeed());

    }
}
