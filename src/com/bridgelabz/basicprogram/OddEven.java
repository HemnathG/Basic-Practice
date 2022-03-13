package com.bridgelabz.basicprogram;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = reader.nextInt();
        System.out.println("The Number is:" +num);

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
