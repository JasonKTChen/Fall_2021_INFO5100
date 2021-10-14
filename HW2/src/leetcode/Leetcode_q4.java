package leetcode;

public class Leetcode_q4 {
    // time complexity O(n)
    // space O(1)
    public static void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
    public static void print(int[][] A){
        int M = A.length, N = A[0].length;
        for (int i = 0; i < M; i++) {
            String temp = "";
            for (int j = 0; j < N; j++) {
                temp += (A[i][j] + "    ");
            }
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before");
        print(matrix1);
        rotate(matrix1);
        System.out.println("After the rotation");
        print(matrix1);
        System.out.println("------------------");
        int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        System.out.println("Before");
        print(matrix2);
        rotate(matrix2);
        System.out.println("After the rotation");
        print(matrix2);

    }
}
