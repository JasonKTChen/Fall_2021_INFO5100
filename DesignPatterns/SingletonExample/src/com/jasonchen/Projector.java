package com.jasonchen;
//https://skyyen999.gitbooks.io/-study-design-pattern-in-java/content/singleton.html
public class Projector {

    private static Projector _instance;
    private Projector(){}
    private static Object obj = new Object();

    public String name = "default";
    public static Projector get_instance(){
        if (_instance == null){// double locking
            synchronized (obj){// Projector.class
                if(_instance == null){
                    _instance = new Projector();
                }
            }
        }
        return _instance;
    }
}
