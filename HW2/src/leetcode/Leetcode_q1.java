package leetcode;

public class Leetcode_q1 {
    public static int[][] transpose(int[][] A) {
        int M = A.length, N = A[0].length;
        int[][] B = new int[N][M];
        for (int j = 0; j < N; j++)
            for (int i = 0; i < M; i++)
                B[j][i] = A[i][j];
        return B;
    }
    public static void print(int[][] A){
        int M = A.length, N = A[0].length;
        for (int i = 0; i < M; i++) {
            String temp = "";
            for (int j = 0; j < N; j++) {
                temp += (A[i][j] + " ");
            }
            System.out.println(temp);
        }
    }
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Initial matrix:");
        print(matrix1);
        System.out.println("Matrix after transpose:");
        print(transpose(matrix1));
        System.out.println("-------------------------");
        int[][] matrix2 = {{1,2,3},{4,5,6}};
        System.out.println("Initial matrix:");
        print(matrix2);
        System.out.println("Matrix after transpose:");
        print(transpose(matrix2));
    }
}
