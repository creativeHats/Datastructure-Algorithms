package backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {

	public static void main(String[] args) {
		
		print(generateParenthesis(4));
		
	}
	
	public static void print(List<String> ans) {
		for(String a : ans){
			System.out.println(a);
		}
	}
	
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public static void backtrack(List<String> ans, String cur, 
    		int open, int close, int n){
        if (cur.length() == n * 2) {
            ans.add(cur);
            return;
            
        }

        if (open < n)
            backtrack(ans, cur+"(", open+1, close, n);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, n);
        
    }
    
	

}
