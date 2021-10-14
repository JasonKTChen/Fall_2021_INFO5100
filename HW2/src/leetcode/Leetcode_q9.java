package leetcode;

public class Leetcode_q9 {
    public static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] parts = s.split(" ");
        for(int i = parts.length-1; i >=0; i--){
            if (parts[i].length() > 0){
                sb.append(parts[i]);
                sb.append(" ");
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords(" the sky is blue "));
        System.out.println(reverseWords("the sky is blue "));
        System.out.println(reverseWords(" the sky is blue"));
        System.out.println(reverseWords("the sky is blue "));
        System.out.println(reverseWords("the sky is blue"));
    }
}
