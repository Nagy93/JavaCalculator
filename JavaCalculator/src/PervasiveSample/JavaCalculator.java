package PervasiveSample;

import java.util.Scanner;

public class JavaCalculator {

	public static void main(String[] args) {

		double n1, n2;
		String operation;
		Scanner scanObject = new Scanner(System.in);

		System.out.println("Enter first number");
		n1 = scanObject.nextDouble();
		System.out.println("Enter second number");
		n2 = scanObject.nextDouble();

		Scanner op = new Scanner(System.in);

		System.out.println("Enter your operation");
		operation = op.next();

		switch (operation) {
		case "+":
			System.out.println("Your answer: " + (n1 + n2));
			break;

		case "-":
			System.out.println("Your answer: " + (n1 - n2));
			break;

		case "*":
			System.out.println("Your answer: " + (n1 * n2));
			break;

		case "/":
			System.out.println("Your answer: " + (n1 / n2));
			break;
			
		case "^":
			System.out.println("Your answer: " + Math.pow(n1 , n2));
			break;	

		default:
			System.out.println("Unknown operation");
		}

	}

}
