import java.util.*;
import java.util.regex.Pattern;

public class August_1 {

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
