package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int num1 = reader.nextInt();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Second Number");
        int num2 = scanner.nextInt();


        Scanner r = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num3 = r.nextInt();


        System.out.println("The three numbers are" + num1 + "," + num2 + "," + num3);
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is " + num2);
        } else {
            System.out.println("The largest number is " + num3);
        }
    }
}
