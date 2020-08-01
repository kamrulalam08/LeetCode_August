import java.util.*;
import java.util.regex.Pattern;

/*
 * Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
 */

public class August_1 {
	
	/*
	 * Although I have used regular expressions to make my life easier here,
	 * this could also be done much simple for faster time complexity in a different
	 * manner. This is not the fastest implementation you can find.
	 */

	public static boolean detectCapitalUse(String word) {
	
		final String regex1 = "[A-Z][a-z]*";
		final String regex2 = "[A-Z]*";
		final String regex3 = "[a-z]*";
		boolean case1 = Pattern.matches(regex1, word);
		boolean case2 = Pattern.matches(regex2, word);
		boolean case3 = Pattern.matches(regex3, word);
		
		if (case1 == true) return case1;
		if (case2 == true) return case2;
		if (case3 == true) return case3;
		else return false;
		
	}//detectCapitcalUse

	public static void main (String [] args) {
		
		System.out.println(detectCapitalUse("Flag"));
		
	}//main
	
}// August_1
