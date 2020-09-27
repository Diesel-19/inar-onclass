package week09.FilteringSystem;

public class Filter {
	private static String[] badWords = { "idiot", "stupid", "shit", "dumb" };

	public Filter() {
	}

	public static int length() {
		return badWords.length;
	}

	public static String getBadWord(int i) {
		return badWords[i];
	}

}
