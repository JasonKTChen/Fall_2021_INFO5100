package leetcode;

public class Leetcode_q7 {
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        while (len1 >= 0 || len2 >= 0 || carry != 0) {
            int value1 = len1 >= 0 ? num1.charAt(len1) - '0' : 0;
            int value2 = len2 >= 0 ? num2.charAt(len2) - '0' : 0;
            int value = (value1 + value2 + carry) % 10;
            carry = (value1 + value2 + carry) / 10;
            sb.append(value);
            len1--;
            len2--;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("123","34"));
        System.out.println(addStrings("123","99"));
        System.out.println(addStrings("123222","999"));

    }
}
