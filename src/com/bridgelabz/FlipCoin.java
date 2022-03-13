package com.bridgelabz;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Coin Flip times");
        int flipTimes = scanner.nextInt();
        System.out.println("Coin Flip times =" +flipTimes);

        Random random = new Random();

        System.out.println(random);

        for (int i=1; i<=flipTimes; i++) {
            float x = random.nextFloat(1);
            if (x <= 0.5) {
                System.out.println("The flipped coin results TAIL");
            } else {
                System.out.println("The flipped coin results HEAD");
            }
        }

    }
}
