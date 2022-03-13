package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Power");
        int number = scanner.nextInt();
        System.out.println("The Power is =" +number);

        int i=1;
        while (i <= number){
            int a= (int) Math.pow(2,i);
            System.out.println(a);
            i++;
        }

    }
}
