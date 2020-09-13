package week06;

import java.util.Scanner;

public class AnagramCheck {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("First word");
		String first = input.nextLine().toLowerCase();

		System.out.println("Second word");
		String second = input.nextLine().toLowerCase();

		System.out.println(isAnagram(first, second));

		input.close();
	}

	public static boolean isAnagram(String first, String second) {
		char[] arr = new char[26];

		if (first.length() != second.length()) {
			return false;
		}

		for (int i = 0; i < first.length(); i++) {
			arr[first.charAt(i) - 'a']++;
			arr[second.charAt(i) - 'a']--;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
