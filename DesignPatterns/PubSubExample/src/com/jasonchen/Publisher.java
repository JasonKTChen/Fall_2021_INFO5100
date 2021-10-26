package com.jasonchen;

import java.util.ArrayList;
import java.util.HashMap;

public class Publisher {
    private ArrayList<Student> subscribers;
    private HashMap<Integer,String> grades;

    private String name;
    private String className;

    public Publisher(){
        subscribers = new ArrayList<>();
        grades = new HashMap<>();
    }
    public void Notify(){
        for (Student student: subscribers){
//            student.getGrades(this,this.className,grades.get(student.getStudentID()));
        }
    }
}
