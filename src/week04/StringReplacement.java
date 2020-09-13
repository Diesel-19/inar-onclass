package week04;

import java.util.Scanner;

public class StringReplacement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		System.out.println(vowelChanger(s));
	}
	
	public static String vowelChanger(String s) {
		String vowel = "AEIOU";
		String answer = "";
		
		for (int i = 0; i < s.length(); i++) {
			String character = "";
			character = "" + s.charAt(i);
			if (vowel.contains(character.toUpperCase())) {
				answer = answer + "x";
			} else {
				answer = answer + s.charAt(i);
			}
		}
		return answer;
	}
}
