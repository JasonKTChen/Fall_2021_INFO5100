package leetcode;

public class Leetcode_q8 {
    public static boolean isPalindrome(String s) {
        String s_new = s.toLowerCase();
        int l = 0, r = s_new.length()-1;
        while (l < r){
            if(!Character.isLetterOrDigit(s_new.charAt(l))){
                l++;

            }else if(!Character.isLetterOrDigit(s_new.charAt(r))){
                r--;
            }
            if(Character.isLetterOrDigit(s_new.charAt(l)) && Character.isLetterOrDigit(s_new.charAt(r))){
                if(s_new.charAt(l) != s_new.charAt(r)){return false;}
                l++;
                r--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("Hello word! I am a master student"));
        System.out.println(isPalindrome("Today is a good for leetcode practice"));
    }
}
