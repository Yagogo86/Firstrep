package by.epam.tr.main;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		{
			System.out.println("���������� ������� ��� ����� ����� (��������: 2; 4; -4)");
		}
		@SuppressWarnings("resource")
		Scanner scanIn = new Scanner(System.in);

		double a, b, c;

		a = scanIn.nextDouble();
		b = scanIn.nextDouble();
		c = scanIn.nextDouble();

		if (a >= 0) {
			double G = a * a;
			System.out.println("������� a =" + G);
		}

		if (b >= 0) {
			double H = b * b;
			System.out.println("������� b  =" + H);
		}

		if (c >= 0) {
			double J = c * c;
			System.out.println("������� � =" + J);
		}
		if (a < 0) {
			double G = a * a * a * a;
			System.out.println("��������� ������� a =" + G);
		}
		if (b < 0) {
			double H = b * b * b * b;
			System.out.println("��������� ������� b =" + H);
		}
		if (c < 0) {
			double J = c * c * c * c;
			System.out.println("��������� ������� � =" + J);
		}
	}
}