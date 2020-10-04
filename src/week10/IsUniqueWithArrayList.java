package week10;

import java.util.ArrayList;

/*Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * Inar -> true
 * Los Angeles -> false (ee) 
 */
public class IsUniqueWithArrayList {
	public static void main(String[] args) {
		String str = "Los AngEleS";
		System.out.println(isUnique(str));
	}

	public static boolean isUnique(String str) {
		ArrayList<Character> chars = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (chars.contains(Character.toLowerCase(str.charAt(i)))) {
				return false;
			}
			chars.add(Character.toLowerCase(str.charAt(i)));
		}
		System.out.println(chars.toString());

		return true;
	}
}
