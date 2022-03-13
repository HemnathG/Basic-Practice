package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Harmonic Value Number");
        int n = scanner.nextInt();
        System.out.println("The Harmonic Value Number is =" +n);

        double x=0;
        while (n>0){
            x+=(1.0)/n;
            n--;

            System.out.println(x);
        }
        System.out.println("Harmonic Number is :"+x);

    }
}
