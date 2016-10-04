import java.util.HashMap;


public class Solution_two {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();
         int[] Sum = new int[2];
         int[] Sum1 = new int[2];
            for (int i=0; i<nums.length;i++){
            	 h.put(nums[i],i); 
               
            }
            System.out.println(h.toString());
            for(int i=0; i<nums.length;i++){
              //  h.remove(nums[i]);
               // System.out.println(nums[i]);
                if(h.containsKey(target-nums[i])){
                    System.out.println("nums is" + nums[i]);
                    Sum[0]=i;
                    Sum[1]=h.get(target-nums[i]);
                    //System.out.println(Sum[0]+"   " + Sum[1]);
                    break;
                }
              //  h.put(nums[i],i);
            }
			return Sum;
    }
	public static void main(String[] args) {
		Solution_two s = new Solution_two();
		int[] a = new int[]{3,2,4};
		System.out.println(s.twoSum(a, 6)[1]);
	}
}
