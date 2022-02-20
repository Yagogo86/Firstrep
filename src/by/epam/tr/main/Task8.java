package by.epam.tr.main;

public class Task8 {

	public static void main(String[] args) {
		
		int num = 3;
		int[] array = { 2, 7, 9, 15, 43, 64, 81, 99 };
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % num == 0) {
				sum += array[i];
			}
		}
		System.out.println("Сумма элементов массива A[N], кратных K = " + num + " равна sum = " + sum);
	}
}