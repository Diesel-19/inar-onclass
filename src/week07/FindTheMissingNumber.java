package week07;

import java.util.Scanner;

public class FindTheMissingNumber {
	public static void main(String[] args) {
		final int AMOUNT_OF_NUMBERS = 10;
		int[] array = new int[AMOUNT_OF_NUMBERS - 1];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		findTheMissingNum(AMOUNT_OF_NUMBERS, array);
	}

	public static void findTheMissingNum(int AMOUNT_OF_NUMBERS, int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Missing number: " + ((AMOUNT_OF_NUMBERS * (AMOUNT_OF_NUMBERS + 1) / 2) - sum));
	}
}
