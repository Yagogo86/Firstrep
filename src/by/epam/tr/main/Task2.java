package by.epam.tr.main;

import static java.lang.Math.*;

public class Task2 {
	public static void main(String[] args) {

		double numA = 2;
		double numB = 4;
		double numC = 6;

		double result = (numB + sqrt(numB * numB + 4 * numA * numC)) / (2 * numA) - pow(numA, 3) * numC + pow(numB, -2);

		System.out.println("Результат выражения y = " + result);
	}
}