package com.jasonchen;
import java.util.Arrays;
public class Main {
    private static void print (String name){
        String full = name;
        System.out.println(name);
    }

    public static void main(String[] args) {
//        //class 0921
//        int a = 16;
//        int b = 3;
//        int add = a + b;
//        int substract = a - b;
//        int multiply  = a * b;
//        int divide = a / b;
//        int remainder = a % b;
//        System.out.println(add);
//        System.out.println(substract);
//        System.out.println(multiply);
//        System.out.println(divide);
//        System.out.println(remainder);
//        boolean bvalue = true;
//        if (bvalue){
//            System.out.println("true");
//        }
//
//        b = 6;
//        int result =  b > 5 ? 10:20;
//        System.out.println(result);
//        /**
//        0^0 = 0
//        0^1 = 1
//        1^0 = 1
//        1^1 = 0
//        two compliment
//        1. flip all the digit
//        2. +1 on the value
//
//
//         **/
//        a = 100000000;
//        a = ~a;
//        a = a+1;
//        System.out.println(a);
//
//        //loop
//        int[] ss = {0,1,2};
//        int[] arr = {0,20,3,4,501,2,3,23};//index only positive integer
//        ss = Arrays.copyOf(ss,ss.length+1);
//        ss[3] = 5;
//        for(int i : ss)
//            System.out.println(i);
//        int count = arr.length-1;
//        // do while
//        // do the loop first before check the condition
//        count = 0;
//        do{
//            System.out.println(arr[count]);
//            count--;
//        } while (count > 0);
//        //String
//        String name = "Bob james";
//        System.out.println(name);
//        System.out.println(name.charAt(2));
//        print(name);
//        NameClass myName = new NameClass("Jay","sji");
        printMonth("Jan");
        printtheDayoftheweek(0);

    }
    public static void printtheDayoftheweek(int day){

        switch(day){
            case 0:
                System.out.println("Today is sunday");
            case 1:
                System.out.println("Today is monday");

        }
    }
    public static void printMonth(String month){
        switch (month.toLowerCase()){
            case "jan" ,"feb","mar";
                System.out.println("winter");
                break;
            case "apr","may","jun":
                System.out.println("spring");
                break;
        }
    }

}
