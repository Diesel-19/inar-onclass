package week04;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String n = input.nextLine();
		System.out.println(isPalindrome(n));
	}

	public static boolean isPalindrome(String n) {
		String reverse = "";
		for (int i = 0; i < n.length(); i++) {
			reverse += n.charAt(n.length() - 1 - i);
		}
		return (reverse.equals(n)) ? true : false;
	}
}
