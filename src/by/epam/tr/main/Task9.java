package by.epam.tr.main;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {
		int k = 5;
		int maxNum = 100;
		int lengthA = 20;
		int lengthB = 15;
		
		int[] arrayA = new int[lengthA + lengthB];
		int[] arrayB = new int[lengthB];
		
		int minNum = 0;
		for (int i = 0; i < lengthA; i++) {
			arrayA[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);}
		
		System.out.println("Исходный массив A: " + Arrays.toString(arrayA));
		
		for (int i = 0; i < arrayB.length; i++) {
			arrayB[i] = (int) (random() * ((maxNum - minNum) + 1) + minNum);}
		
		System.out.println("Исходный массив B: " + Arrays.toString(arrayB));
		
		System.arraycopy(arrayA, k, arrayA, lengthA, lengthA - k);
		
		System.arraycopy(arrayB, 0, arrayA, k + 1, lengthB);
		
		System.out.println("Новый массив: " + Arrays.toString(arrayA));
	}

	private static int random() {
		
		return 0;
	}
}