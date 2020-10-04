package week10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DifferentWords {
	public static void main(String[] args) {
		String text = "I love java since I have started Introduction to java Programming";
		String[] words = text.split(" ");
		Set <String> list = new HashSet<>(Arrays.asList(words));
		list.size();
	}
}
