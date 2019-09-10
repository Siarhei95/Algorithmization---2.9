package Question_9;

import java.util.Scanner;

public class question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix: ");
        int size = sc.nextInt();
        int[][] a = new int[size][size];
        System.out.println("Enter the elements of matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (a[i][j] >= 0) {
                } else a[i][j] = 0;
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum of columns: ");
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) sum = sum + a[j][i];
            System.out.print(sum + "\t");
        }
        System.out.println();

        if(sum>=maxSum) {
            maxSum = sum;
        }
        System.out.println("Max sum: " + maxSum);
    }
}







