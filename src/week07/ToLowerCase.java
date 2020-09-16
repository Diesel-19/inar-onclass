package week07;

public class ToLowerCase {
	public static void main(String[] args) {
		String str = "AbC21JKlA";
		System.out.println(toLowerCase(str));
	}
	
	public static String toLowerCase(String str) {
		String answer = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) <= 'Z' && 'A' <= str.charAt(i)) {
				answer += (char)(str.charAt(i) + 32);
			} else {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}
}
