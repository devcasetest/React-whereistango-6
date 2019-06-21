package de.sulzer.presentation;


import java.util.Objects;
import java.util.Scanner;

public class Calculator {

	private static final String END = "end";

	public static void main(String[] args) {
		System.out.println("This is a calculator to work with two numbers");

		Scanner scanner = null;
		try {
			boolean calculateNext = true;
			do {
				calculateNext = calculate(scanner);

			} while (calculateNext);
		} finally {
			scanner.close();
		}
	}

	static double scanDouble(Scanner scan) {
		while (!scan.hasNextDouble()) {

			System.out.println("Wrong number! Please try again.");
		}

		return scan.nextDouble();
	}

	static String scanOperator(Scanner scan) {
		String In = scan.next();

		while (!(In.equals("+") || In.equals("-") || In.equals("*") || In.equals("/") || In.equals(END))) {

			System.out.println("Not known operation, please enter one of the following operations: +,-,*,/");
		}

		return In;
	}

	private static boolean calculate(Scanner scan) {

		double firstNumber = 0, secondNumber = 0, result = 0;
		String operator;

		System.out.println("Choose operation: (+,-,*,/), to quit enter 'end': ");
		operator = scanOperator(scan);

		if (Objects.equals(END, operator)) {
			System.out.println("Exit Calculator.");

			return false;
		}

		System.out.println("Enter first number: ");
		firstNumber = scanDouble(scan);

		System.out.println("Enter second number: ");
		secondNumber = scanDouble(scan);

		result = calculateOperation(firstNumber, secondNumber, operator);


		System.out.println(String.format("Calculation: %1$s %2$s %3$s", firstNumber, operator, secondNumber));
		System.out.println("Result: " + result);
		System.out.println();

		return true;
	}

	public static double calculateOperation(double first, double second, String operator) {
		return 0.0;
	}
}
