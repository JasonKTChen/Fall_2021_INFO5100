package com.jasonchen;

public class Main {

    public static void main(String[] args) {
        String arr = "aaaabaaaa";
        System.out.println(isPalindrome(arr));
    }
    private static boolean isPalindrome(String str){
        if(str == null || str.length() <= 1){
            return true;
        }
        int start = 0;
        int end = str.length() -1;
        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    private static boolean isAnagrams(String str1,String str2){
        if (str1.isBlank()||str2.isBlank()||str1.isEmpty()||str2.isEmpty()||str1.length() != str2.length(){
            return false;
        }
        
    }

}
