package leetcode;

public class Leetcode_q10 {
    public static int compress(char[] chars) {
        int i = 0, n = chars.length, idx = 0;
        while(i < n){
            int j = i+1;
            while(j < n && chars[i] == chars[j]){
                j++;
            }
            chars[idx++] = chars[i];
            String count = Integer.toString(j - i);
            if((j - i) > 1){
                for(char c: count.toCharArray()){
                    chars[idx++] = c;
                }
            }
            i = j;
        }
        return idx;
    }

    public static void main(String[] args) {
        char[] c1 = {'a','a','b','b','c','c','c'};
        System.out.println(compress(c1));
        for(char c: c1){
            System.out.println(c);
        }
        System.out.println("---------------");
        char[] c2 = {'a','a','b','b','b','b','b','b','b','b','b','b','c','c','c'};
        System.out.println(compress(c2));
        for(char c: c2){
            System.out.println(c);
        }
        System.out.println("---------------");
        char[] c3 = {'a','a','b','b','c','c','c','c','c','c','c','c','c','a'};
        System.out.println(compress(c3));
        for(char c: c3){
            System.out.println(c);
        }
    }
}
