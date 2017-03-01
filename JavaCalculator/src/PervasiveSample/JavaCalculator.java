package PervasiveSample;

import java.util.Scanner;

public class JavaCalculator {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter an expression of the form 3 * 5");
			double n1 = scanner.nextDouble();
			String operation = scanner.next();
			double n2 = scanner.nextDouble();

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
				System.out.println("Your answer: " + Math.pow(n1, n2));
				break;

			default:
				System.out.println("Unknown operation");
			}
		}

	}

}
