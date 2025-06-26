package assignment4;

import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0, num2 = 0;

		System.out.println("Enter 1st number:");
		if (sc.hasNextDouble()) {
			num1 = sc.nextDouble();
		} else {
			System.out.println("The input is not a valid double.");
			sc.close();
			return;
		}

		System.out.println("Enter 2nd number:");
		if (sc.hasNextDouble()) {
			num2 = sc.nextDouble();
		} else {
			System.out.println("The input is not a valid double.");
			sc.close();
			return;
		}

		double avg = (num1 + num2) / 2;
		System.out.println("Average is: " + avg);
		sc.close();
	}
}
