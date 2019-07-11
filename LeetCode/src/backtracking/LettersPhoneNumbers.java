/**
 * 
 */
package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author prashant
 *
 */
public class LettersPhoneNumbers {

	/**
	 * @param args
	 */
public static void main(String[] args) {
		
		print(generateLetters("23456789"));
		
	}
	
	public static void print(List<String> ans) {
		for(String a : ans){
			System.out.println(a);
		}
	}
	
	public static List<String> generateLetters( String digits) {
		
		Map<String, String> phone = new HashMap<String, String>() {{
		    put("2", "abc");
		    put("3", "def");
		    put("4", "ghi");
		    put("5", "jkl");
		    put("6", "mno");
		    put("7", "pqrs");
		    put("8", "tuv");
		    put("9", "wxyz");
		  }};
		  
		  
		  List<String> ans = new ArrayList<String>();
				  
		
		backtrack(digits,phone, ans, "");
		return ans;
	}

	private static void backtrack(String digits, Map<String, String> phone, List<String> ans, String comb) {
		if(digits.length()==0) {
			ans.add(comb);
			return;
		}
		
		String digit = digits.substring(0, 1);
		char[] letters = phone.get(digit).toCharArray();
		
		for(Character c : letters) {
			backtrack(digits.substring(1, digits.length()), phone, ans, comb+c);
		}
		
		
	}

}
