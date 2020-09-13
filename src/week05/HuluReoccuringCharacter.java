package week05;

import java.util.Scanner;

public class HuluReoccuringCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = input.nextLine().toLowerCase();

		char ch = findReoccuringChar(str);
		System.out.println(ch);
	}

	public static char findReoccuringChar(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return (str.charAt(i));
				}
			}
		}
		return ' ';
	}
}
