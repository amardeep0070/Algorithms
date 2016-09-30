package anagram;

import java.util.HashMap;
public class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h = new HashMap<Character, Integer>();
        if(s.length()!=t.length()){
            return false;
        }
        for (char s1: s.toCharArray()){
            if(h.containsKey(s1)){
                h.put(s1,h.get(s1)+1);
            }
            else {
                h.put(s1,1);
            }
        }
        for (char t1: t.toCharArray()){
        	System.out.println(h.toString());
            if(h.containsKey(t1)){
            	System.out.println("contains");
                if(h.get(t1)<=1){
                    h.remove(t1);
                    if(h.isEmpty()){
                        return true;
                    }
                    System.out.println("removing" + t1);
                }
                else{
                    h.put(t1,h.get(t1)-1);
                }
            }
             if(h.isEmpty()){
            	 System.out.println("here1");
                return true;
            }
            else{ 
            	continue;
            }
//            	System.out.println("here");
//            	return false;}
        }
        System.out.println(h.toString());
        return h.isEmpty();
    }
    public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isAnagram("ab", "ba"));
	}
}
