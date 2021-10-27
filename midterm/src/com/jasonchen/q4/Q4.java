package com.jasonchen.q4;

import java.util.*;

public class Q4 {
    public static String longestSubString(String s){
        // use hashmap to store the index of the characters
        // find the duplicate first count the length and store the index(substring begin)
        // replace the index to the new one
        if (s.length()==0) {
            return "";
        }
        HashMap<Character, Integer> map = new HashMap<>();
        List<List<Integer>> length = new ArrayList<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                int last = map.get(s.charAt(i));
                List<Integer> temp = new ArrayList<>();
                temp.add(i - j); // max length
                temp.add(i - 1); // start index
                length.add(temp);
                j = Math.max(j,last + 1);
            }
            map.put(s.charAt(i), i);
        }
        int max = 0;
        for(int i = 0; i < length.size(); i++){
            int len = length.get(i).get(0);
            max = Math.max(max,len);
        }
        int position = 0;
        for(int i = 0; i < length.size(); i++){
            if(max == length.get(i).get(0)){
                position = length.get(i).get(1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i >= position - max + 1 && i <= position){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String test1 = "abcabcbb";
        System.out.println(test1);
        System.out.println(longestSubString(test1));
        String test2 = "abcdbcbb";
        System.out.println(test2);
        System.out.println(longestSubString(test2));
        String test3 = "abcdebcbb";
        System.out.println(test3);
        System.out.println(longestSubString(test3));
        String test4 = "ababcdefgbb";
        System.out.println(test4);
        System.out.println(longestSubString(test4));
        String test5 = "abbb";
        System.out.println(test5);
        System.out.println(longestSubString(test5));
    }
}

