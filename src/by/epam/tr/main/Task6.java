package by.epam.tr.main;

public class Task6 {

	public static void main(String[] args) {
		double a = 3;
		double b = 4;
		double c = 5;
		
		double max;
		double min;
		double sum;
		
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (a < b) {
			min = a;
		} else {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		sum = min + max;
		System.out.println("sum = " + sum);
	}
}