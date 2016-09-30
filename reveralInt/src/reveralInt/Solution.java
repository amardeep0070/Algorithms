package reveralInt;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
	public int reverse(int x) {
	    int sign=x<0?-1:1;
            x=Math.abs(x);
	    long r=0;
	    for ( ; x>0; x=x/10) {
	    	r= r*10+x%10;
	    	if (r>Integer.MAX_VALUE)
	    	    return 0;
	    }
	    return (int)r*sign;
	}
    public static void main(String[] args) {
//		Solution s = new Solution();
//		//System.out.println(s.reverse(-2147483648));
//		Long x = Integer.MAX_VALUE;
//		System.out.println(x);
//		//int a = (int)x;
//		int a = x.intValue();
//		System.out.println(a);
//		
    	System.out.println(Integer.parseInt("4/2"));
    	HashSet a = new HashSet<Integer>();
    String s = new String();
    s.su
		
	}
}
