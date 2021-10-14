package leetcode;

import java.util.HashMap;

public class Leetcode_q6 {

    public static boolean isIsomorphic(String s, String t) {
        HashMap <Character,Character> Smap = new HashMap<>();
        HashMap <Character,Character> Tmap = new HashMap<>();
        for (int i = 0; i < s.length();i++){
            if (Smap.containsKey(s.charAt(i)) && (Smap.get(s.charAt(i)) != t.charAt(i))){
                return false;
            }
            if (Tmap.containsKey(t.charAt(i)) && (Tmap.get(t.charAt(i)) != s.charAt(i))){
                return false;
            }
            Smap.put(s.charAt(i),t.charAt(i));
            Tmap.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","add"));
        System.out.println(isIsomorphic("eat","tss"));
        System.out.println(isIsomorphic("aas","add"));
    }
}
