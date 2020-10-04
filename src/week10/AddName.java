package week10;

import java.util.ArrayList;
import java.util.Scanner;

public class AddName {
	// + add, - remove, ! print
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		String str;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter");
			str = input.nextLine();
			arrayList(str, list);
		} while (str.charAt(0) != '!');

		System.out.println(list.toString());
	}

	public static ArrayList<String> arrayList(String str, ArrayList<String> list) {
		String name = str.substring(1);
		if (str.charAt(0) == '+') {
			list.add(name);
		} else if (str.charAt(0) == '-') {
			list.remove(name);
		}
		return list;
	}
}
