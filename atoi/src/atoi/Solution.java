package atoi;
////
////import java.util.HashSet;
////
////public class Solution {
////    public int myAtoi(String str) {
////        String result="0";
////        HashSet j = new HashSet<String>();
////        for(int i=0; i<10;i++){
////            j.add(i+"");
////        }
////        str=str.trim();
////        
////       // System.out.println(str);
////        int sign=1;
////        if(str.startsWith("+")){
////            sign=1;
////            str=str.substring(1);
////        }
////        else if (str.startsWith("-")){
////            sign=-1;
////            str=str.substring(1);
////        }
////        if(str.length()==0){
////        	return 0;
////        }
////        //System.out.println(str);
////        char[] input = str.toCharArray();
////        int i=0;
////        //System.out.println(input[0]);
////        //System.out.println(j.toString());
////        //System.out.println(j.contains(input[i]+""));
////        
////        while (j.contains(input[i]+"") ){
////            result=result+input[i];
////           // System.out.println("r is " + result);
////            if(i< input.length-1 ){i++;
////            }
////            else break;
////            
////            
////        }
////        
////        Long l = Long.parseLong(result);
////        System.out.println(l);
////        if(l*sign<Integer.MIN_VALUE){
////        	return Integer.MIN_VALUE;
////        }
////        else if(l*sign>Integer.MAX_VALUE){
////            return Integer.MAX_VALUE*sign;
////        }
////        
////        return l.intValue()*sign;
////        
////    }
////    public static void main(String[] args) {
////		Solution  s = new Solution();
////		System.out.println(s.myAtoi("-2147483649"));
////		System.out.println();
////	}
////}
public class Solution {
    public int myAtoi(String str) {
        double result = 0;
        int POrN = 1;
        int count = 0;
        char[] charArr = str.toCharArray();
        for(char c:charArr){
            count ++;
            if( c >='0' && c <='9' ){
            	System.out.println(c);
            	System.out.println("result before mul" + result);
                result *= 10;
                System.out.println("result after mul" + result);
                result =result +( c - '0');
                System.out.println(result);
            }else if( c == '-' && count == 1){
                POrN = -1;
            }else if( c == '+' && count == 1){
                POrN =  1;
            }else if( c == ' ' && count == 1){
                count --;
            }else{
                break;
            }
            
        }
        if( result > Integer.MAX_VALUE ){
            if(POrN == 1)
                return Integer.MAX_VALUE;
            else
                return Integer.MIN_VALUE;
        }else{
            return (int)(result * POrN);
        }
    }
  public static void main(String[] args) {
		Solution  s = new Solution();
		System.out.println(s.myAtoi("123"));
		//System.out.println();
	}
}





//public class Solution{
//	public int myAtoi(String str) {
//		str=str.trim();
//		if(str.length()==0){
//			return 0;
//		}
//		char[] input= str.toCharArray();
//		for(char c : input){
//			
//		}
//	}
//}
