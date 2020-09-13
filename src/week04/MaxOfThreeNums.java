package week04;

import java.util.Scanner;

public class MaxOfThreeNums {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(max(a, b));
	}

	public static int max(int a, int b) {
		return a < b ? b : a;
	}

	public static int max(int a, int b, int c) {
		return max(max(a, b), c);
	}
}
