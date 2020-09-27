package week09.FilteringSystem;

public class Test {
	public static void main(String[] args) {
		Comment wBadWord = new Comment("idiot guy thinks he can scam me");
		printValid(wBadWord);
		Comment woBadWord = new Comment("I love this product <3333");
		printValid(woBadWord);
	}

	public static void printValid(Comment wBadWord) {
		if (wBadWord.check()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
