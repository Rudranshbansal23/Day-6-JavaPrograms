package com.bridgelabz.LogicalPrograms;
import java.util.Scanner;

public class Coupon {
	
	public static void main(String[] args) {
		printCoupon();
	}
	public static void printCoupon() {
		String coupon = null;
		System.out.println("Enter number of coupons: ");
		@SuppressWarnings("resource")
		int n = new Scanner(System.in).nextInt();
		char[] codeValues = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		System.out.println("Coupon code generated are:");
		for (int i = 0; i < n; i++) {
			int randomValue = (int) (Math.random() * 999999999);
			StringBuffer alpha = new StringBuffer();
			while (randomValue > 0) {
				//for generating alphabetic sequence
				alpha.append(codeValues[randomValue % codeValues.length]);
				randomValue = randomValue / alpha.length();
			}
			coupon = alpha.toString();
			System.out.println(coupon);
		}
	}

}