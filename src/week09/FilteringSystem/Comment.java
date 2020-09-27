package week09.FilteringSystem;

public class Comment {
	private String comment;

	public Comment(String comment) {
		this.comment = comment;

	}

	public String[] getWords() {
		return comment.split(" ");
	}

	public boolean check() {
		for (int i = 0; i < Filter.length(); i++) {
			for (int j = 0; j < getWords().length; j++) {
				if (Filter.getBadWord(i).equalsIgnoreCase(getWords()[j])) {
					return false;
				}
			}
		}
		return true;
	}

	public String getComment() {
		return comment;
	}

}
