package by.epam.tr.main;

public class Task4 {
	public static void main(String[] args) {

		int coordX = -2;
		int coordY = 4;

		System.out.println(
				"����� � ������������ x = " + coordX + " � y = " + coordY + " - " + coordinates(coordX, coordY));
	}

	public static boolean coordinates(int coordX, int coordY) {
		if (coordX >= -4 && coordX <= 4 && coordY >= -3 && coordY <= 0) {
			return true;

		} else if (coordX >= -2 && coordX <= 2 && coordY >= 0 && coordY <= 4) {
			return true;

		} else {
			return false;
		}
	}
}