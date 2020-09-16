package week08;

public class StringCompression {
	public static void main(String[] args) {
		String str = "aabcccccaaa";
		System.out.println(compression(str));
	}

	public static String compression(String str) {
		String s2 = "";
		for (int i = 0; i < str.length() - 1; i++) {
			int count = 1;
			for (int j = 1; /* fix here */ i + j < str.length(); j++) {
				if (str.charAt(i) != str.charAt(i + j)) {
					i = i + j - 1;
					break;
				}
				count++;
			}
			if (i == str.length() - 1) {
				break;
			}
			s2 = s2 + str.charAt(i) + count;
		}
		return s2;
	}
}
