package com.jasonchen.q3;

import java.util.HashSet;
import java.util.Set;

public class Q3 {
    public static int returnSumOfRepeated(int[] array){
        // use first set to detect duplicate
        // use second set to prevent add one number multiple times
        Set<Integer> nums = new HashSet<>();
        Set<Integer> addedSet = new HashSet<>();
        int ans = 0;
        for(int a:array){
            if(nums.contains(a)){
                if(!addedSet.contains(a)) {
                    ans += a;
                    addedSet.add(a);
                }
            }else{
                nums.add(a);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] test1 = {1,3,-1,3,4,-1};
        System.out.println(returnSumOfRepeated(test1));
        int[] test2 = {1,3,-1,3,4,-1,4};
        System.out.println(returnSumOfRepeated(test2));
        int[] test3 = {1,3,3,4,-1};
        System.out.println(returnSumOfRepeated(test3));
        int[] test4 = {1,3,-1,3,4,-1,5,5,5};
        System.out.println(returnSumOfRepeated(test4));
        int[] test5 = {1,-3,-1,3,4,-2};
        System.out.println(returnSumOfRepeated(test5));
    }
}
