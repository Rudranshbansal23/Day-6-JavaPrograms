package com.bridgelabz.JUnit;
import java.util.Scanner;
/*
 * To the Util Class add dayOfWeek static function that takes a date as input and
 * prints the day of the week that date falls on. Your program should take three
 * command-line arguments: m (month), d (day), and y (year).
 */
public class DaysOfWeek {
	static void dayOfWeek(int y, int m, int d) {
		//Calculating the Gregorian Calendar Values
		int Y = y - (14 - m) / 12;
		int X = Y + Y / 4 - Y / 100 + Y / 400;
		int M = m + 12 * ((14 - m) / 12) - 2;
		int D = (d + X + 31 * M / 12) % 7;
		System.out.println("The day is : " + D);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner object for user input
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year :");
		int y = scan.nextInt();
		System.out.println("Enter the month :");
		int m = scan.nextInt();
		System.out.println("Enter the date :");
		int d = scan.nextInt();
		dayOfWeek(y, m, d);
	}
}