package week08;

/*Is Unique: Given two strings, write a method to decide if one is a permutation of the other 
 * https://leetcode.com/problems/permutation-in-string/
 * 
 * Input: s1 = "ab" s2 = "eidbaooo"
 * Output: True
 * Explanation: s2 contains one permutation of s1 ("ba").
 * 
 * Input: s1= "ab" s2 = "eidboaoo"
 * Output: False
 * 
 * The input strings only contain lower case letters.
 * The length of both given strings is in range [1, 10,000].
 */

public class CheckPermutation {
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaooo";
		System.out.println(isPermutation(s1, s2));
		
		s1 = "ab";
		s2 = "eidboaoo";
		System.out.println(isPermutation(s1, s2));
	}
	
	public static boolean isPermutation(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			for (int j = 0; j < s2.length(); j++) {
				
			}
		}
		return false;
	}
}
