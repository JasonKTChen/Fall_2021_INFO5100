package com.jasonchen;

public class RunnableWithComplex implements Runnable{
    Tweet tweet;
    public RunnableWithComplex(Tweet tweet){
        this.tweet = tweet;
    }

    @Override
    public void run() {
        System.out.println(tweet.sentBy + " sent a test " + tweet.message);
    }
}
