package com.benjamin;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is armstrong number: ");
        int number = input.nextInt();
        System.out.printf("%d " + (isArmstrong(number)? "is" : "is not") + " is armstrong number.", number);
    }

    private static boolean isArmstrong(int number) {
        int sum = 0;
        String numberString = String.valueOf(number);
        char numberChar[] = new char[numberString.length()];
        for (int i = 0; i < numberString.length(); i++){
            numberChar[i] = numberString.charAt(i);
            int base = Integer.parseInt(String.valueOf(numberChar[i]));
            sum += Math.pow(base, numberString.length());
        }
        return (sum == number);
    }
}
