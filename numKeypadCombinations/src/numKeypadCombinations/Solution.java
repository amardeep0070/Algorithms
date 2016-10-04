package numKeypadCombinations;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<String> letterCombinations(String digits) {
	    LinkedList<String> ans = new LinkedList<String>();
	    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	    ans.add("");
	    for(int i =0; i<digits.length();i++){
	        int x = Character.getNumericValue(digits.charAt(i));
	        System.out.println("X is " + x);
	        while(ans.peek().length()==i){
	            String t = ans.remove();
	            for(char s : mapping[x].toCharArray())
	            	{
	            	System.out.println(t+s);
	            	ans.add(t+s);
	            	}
	        }
	    }
	    return ans;
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.letterCombinations("23"));
	}
}
