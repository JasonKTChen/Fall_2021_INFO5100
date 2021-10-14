package com.jasonchen;

public class House {
    public String color;
    public int number;
    public int numofbedroom;
    public boolean issold;
    public Person owner;

    public House(String color, int num){
        this.color = color;
        this.number = num;
    }
    public House(String color, int num, int beds, boolean issold){
        this.color = color;
        this.number = num;
        this.numofbedroom = beds;
        this.issold = issold;
    }

    public void printdetails(){
        System.out.println("No. " + number + "   owner: " + owner);
        System.out.println("This is a " + color +" house with " + numofbedroom + " bedrooms");
    }
    public int printdetails(boolean isprint){
        if (isprint){
            return numofbedroom;
        }
        return 0;
    }
}
