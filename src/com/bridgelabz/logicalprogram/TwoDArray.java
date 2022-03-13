package com.bridgelabz.logicalprogram;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 3; n++) {
                System.out.print("Enter Values for array : ");

                arr[m][n] = sc.nextInt();
                System.out.println();
            }
        }

        for (int m = 0; m < 3; m++) {
            System.out.println();
            for (int n = 0; n < 3; n++) {
                System.out.print(arr[m][n] + " ");
            }
        }
    }
}
