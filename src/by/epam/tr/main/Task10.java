package by.epam.tr.main;

public class Task10 {
	public static void main(String[] args) {

		int numElement = 6;

		int[][] matrix = new int[numElement][numElement];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (i % 2 != 0) {
					System.out.print((matrix[i][j] = (numElement - j)) + " ");
				}

				else {
					System.out.print((matrix[i][j] = (j + 1)) + " ");
				}
			}
			System.out.println();
		}
	}
}
