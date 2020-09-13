package week05;

import java.util.Scanner;

public class RemoveCharacters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str1 = input.nextLine();
		System.out.println("Enter another string");
		String str2 = input.nextLine();

		System.out.println(getRemovedString(str1, str2));
	}

	public static String getRemovedString(String str1, String str2) {
		String str3 = "";
		for (int i = 0; i < str1.length(); i++) {
			boolean isEqual = false;
			for (int j = 0; j < str2.length(); j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					isEqual = true;
				}
			}
			if (!isEqual) {
				str3 += str1.charAt(i);
			}
		}
		return str3;
	}
}
