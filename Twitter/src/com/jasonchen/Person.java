package com.jasonchen;

import java.util.ArrayList;

public class Person extends Thread{
    private String name;
    private ArrayList<Person> followers;

    public String getPersonName() {
        return name;
    }
    public Person(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Threads");
    }
    public void tweet(String message){
        for (Person follower : followers){
            follower.getTweet(this,message);
        }
    }
    public void addFollower(Person person){
        if(followers.contains(person)){
            followers.add(person);
        }
    }
    public void removeFollower(Person person){
        if(followers.contains(person)){
            followers.remove(person);
        }
    }
    public void getTweet(Person person,String message){
        System.out.println(this.getPersonName() + " has tweeted " + message);
    }
    public void followerPerson(Person person){ person.addFollower(this); }
    public void unfollowerPerson(Person person){ person.removeFollower(this); }

}
