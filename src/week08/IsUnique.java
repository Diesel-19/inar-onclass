package week08;

/*Is Unique: Implement an algorithm to determine if a string has all unique characters. 
 * Inar -> true
 * Los Angeles -> false (ee) 
 */
public class IsUnique {
	public static void main(String[] args) {
		String str = "Los AngEleS";
		System.out.println(isUnique(str));
	}

	public static boolean isUnique(String str) {
		boolean[] charList = new boolean[26];

		for (int i = 0; i < str.length(); i++) {

			// assume that (a, A) are not unique characters
			// assume that all characters are letters (otherwise: whole ascii table in charList)
			if (Character.isLetter(str.charAt(i))) {
				if (charList[str.toLowerCase().charAt(i) - 97] == true) {
					return false;
				} else {
					charList[str.toLowerCase().charAt(i) - 97] = true;
				}
			}
		}
		return true;
	}
}
