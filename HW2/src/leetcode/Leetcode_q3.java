package leetcode;

public class Leetcode_q3 {
    public static void moveZeroes(int[] nums) {
        // time complexity O(n)
        // space O(1)
        int zero = 0;
        for(int i = 0; i < nums.length; i++){
            int temp = 0;
            if (nums[i] != 0){
                temp = nums[i];
                nums[i] = nums[zero];
                nums[zero] = temp;
                zero++;
            }
        }
    }
    public static void print(int[] nums){
        String temp = "";
        for(int i = 0; i < nums.length;i++){
            temp += nums[i] + " ";
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        print(nums);
        moveZeroes(nums);
        print(nums);
    }
}
