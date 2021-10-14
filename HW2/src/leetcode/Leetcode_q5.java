package leetcode;

import java.util.ArrayList;

public class Leetcode_q5 {

    public static ArrayList<String> spiralOrder(int[][] matrix) {

        ArrayList<String> ans = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {
                ans.add(String.valueOf(matrix[top][col]));
            }
            for (int row = top + 1; row <= bottom; row++) {
                ans.add(String.valueOf(matrix[row][right]));
            }
            for (int col = right - 1; col >= left && top != bottom; col--) {
                ans.add(String.valueOf(matrix[bottom][col]));
            }
            for (int row = bottom - 1; row >= top + 1 && left != right; row--) {
                ans.add(String.valueOf(matrix[row][left]));
            }
            top++;
            bottom--;
            left++;
            right--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0; i < spiralOrder(matrix1).size();i++){
            System.out.println(spiralOrder(matrix1).get(i));
        }
        int[][] matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for(int i = 0; i < spiralOrder(matrix2).size();i++){
            System.out.println(spiralOrder(matrix2).get(i));
        }
    }
}
