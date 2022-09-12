package com.bridgelabz.LogicalPrograms;
import java.util.Scanner;
/*
 * Program for prime numbers
 * When the number is divided greater than 1 and
 * Divided by 1 or itself is referred to as the Prime number.
 *  */
public class PrimeNumber {
    public static boolean primeNumber(int num) {
        // Checking condition for Prime Number
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime Number");
                return false;
            }
        }
        System.out.println(num + " is a prime Number");
        return true;
    }

    public static void main(String[] args) {
        // Scanner Object for Taking Input from User
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        primeNumber(num);
    }
}