package week04;

import java.util.Scanner;

public class ReverseWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = input.nextLine();

		System.out.println(reverse(str));
	}

	public static String reverse(String str) {
		String answer = "";
		int count = 0;
		int lastSpace = str.length();
		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ' || str.charAt(i) == '\t' || str.charAt(i) == '\n' || i == 0) {
				if (i == 0) {
					answer += str.substring(i, lastSpace);
				} else {
					answer += str.substring(i + 1, lastSpace) + " ";
					lastSpace = i;
				}
			} else {
				count++;
			}
		}

		return answer;
	}
}
