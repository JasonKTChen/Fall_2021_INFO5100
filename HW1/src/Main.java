import java.util.*;

public class Main {

    public static void main(String[] args) {
        //question 1 test case
        int[] arr1_q1 = {1,2,3,2};
        int[] arr2_q1 = {1,1,1,1,1};
        int[] arr3_q1 = {1,2,3,4,5};
        System.out.println(question1(arr1_q1));
        System.out.println(question1(arr2_q1));
        System.out.println(question1(arr3_q1));

        //question 2 test case
        int[] arr1_q2 = {-4,-1,0,3,10};
        int[] arr2_q2 = {-7,-3,2,3,11};
        print(question2(arr1_q2));
        System.out.println("----------");
        print(question2(arr2_q2));

        //question 3 test case
        int[] arr1_q3 = {2,2,7,5,5,3};
        System.out.println(question3(arr1_q3));

        //question 4 test case
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(qusetion4(ransomNote,magazine));

        //question 5 test case
        String str1 = "1A3d4s5t";
        String str2 = "A2bb2d4";
        System.out.println(question5(str1));
        System.out.println(question5(str2));

    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static int question1(int[] arr){
        //use hashmap to count the frequency of the array
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < arr.length; i ++)
        {
            int val = map.getOrDefault(arr[i],0);
            map.put(arr[i],val +1);
        }
        //interate hashmap to find the frequency == 1
        for(int i = 0; i < arr.length; i++)
        {
            if(map.getOrDefault(arr[i],0) == 1)
                //sum up the unique element
                sum += arr[i];
        }
        return sum;
    }

    public static int[] question2 (int[] arr){
        int[] ans = new int[arr.length];
        //loop once count the square of each element
        for (int i = 0; i < arr.length; i++)
        {
            ans[i] = arr[i]*arr[i];
        }
        // sort the array
        Arrays.sort(ans);
        return ans;
    }

    public static int question3 (int[] arr) {

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            Integer freq = map.get(arr[i]);
            map.put(arr[i], (freq == null) ? 1 : freq + 1);
        }
        for (int i = 0; i < n; i++)
        {
            if (map.get(arr[i])==1)
            {
                return arr[i];
            }
        }
        return -11111111;
    }

    public static boolean qusetion4 (String ransomNote, String magazine){
        if (ransomNote.length() > magazine.length()){
            return false;
        }
        HashMap<Character, Integer> map_r = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++)
        {
            int val = map_r.getOrDefault(ransomNote.charAt(i),0);
            map_r.put(ransomNote.charAt(i),val +1);
        }
        for (int i = 0; i < magazine.length(); i++)
        {
            int value = map_r.getOrDefault(magazine.charAt(i),0);
            map_r.put(magazine.charAt(i),value -1);
        }
        for (Map.Entry<Character, Integer> entry : map_r.entrySet())
        {
            if (entry.getValue() > 0){
                return false;
            }
        }
        return true;
    }

    public static boolean question5(String str){
        boolean check = false;
        for(int i = 0; i < str.length(); i++){
            boolean numeric = isNumeric(String.valueOf(str.charAt(i)));
            if (numeric) {
                if (check && i!=0){
                    return false;
                }
                check = true;
            }else{
                if (!check && i!=0){
                    return false;
                }
                check = false;
            }
        }
        return true;
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
