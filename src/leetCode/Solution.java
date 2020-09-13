package leetCode;

public class Solution {
	public boolean isValid(String s) {
		int roundClosedCount = 0;
		int roundOpenCount = 0;
		int squareOpenCount = 0;
		int squareClosedCount = 0;
		int curlyOpenCount = 0;
		int curlyClosedCount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				roundOpenCount++;
				boolean hasCloser = false;
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(j) == ')') {
						hasCloser = true;
					}
				}
				if (!hasCloser) {
					return false;
				}
			}
			if (s.charAt(i) == ')') {
				roundClosedCount++;
			}
			if (s.charAt(i) == '[') {
				squareOpenCount++;
				boolean hasCloser = false;
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(j) == ']') {
						hasCloser = true;
					}
				}
				if (!hasCloser) {
					return false;
				}
			}
			if (s.charAt(i) == ']') {
				squareClosedCount++;
			}
			if (s.charAt(i) == '{') {
				curlyOpenCount++;
				boolean hasCloser = false;
				for (int j = i + 1; j < s.length(); j++) {
					if (s.charAt(j) == '}') {
						hasCloser = true;
					}
				}
				if (!hasCloser) {
					return false;
				}
			}
			if (s.charAt(i) == '}') {
				curlyClosedCount++;
			}
		}
		if (roundClosedCount != roundOpenCount || squareOpenCount != squareClosedCount
				|| curlyOpenCount != curlyClosedCount) {
			return false;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '(') {
				switch (s.charAt(i + 1)) {
				case ']':
					return false;
				case '}':
					return false;
				}
				
			} else if (s.charAt(i) == '{') {
				switch (s.charAt(i + 1)) {
				case ']':
					return false;
				case ')':
					return false;
				}
			} else if (s.charAt(i) == '[') {
				switch (s.charAt(i + 1)) {
				case ')':
					return false;
				case '}':
					return false;
				}
			}
		}

		return true;

	}
}