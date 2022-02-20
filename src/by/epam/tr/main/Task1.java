package by.epam.tr.main;

public class Task1 {

	public static void main(String[] args) {
		int x = 1234;
		int a, b, c, d;

		a = x % 10; // 4
		x = x / 10; // x=123

		b = x % 10; // 3
		x = x / 10; // x=12

		c = x % 10; // 2
		x = x / 10; // x=1
		d = x % 10; // x=1

		if ((a + b) == (c + d)) {
			System.out.println("true");
		} else if ((a + b) < (c + d)) {
			System.out.println("false");
		} else if ((a + b) > (c + d)) {
			System.out.println("false");
		}
	}

}
