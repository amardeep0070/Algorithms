public class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] Sum = new int[2];
         int[] Sum1 = new int[]{2,2};
            for(int i=0; i<=nums.length-2; i++){
                for (int j=i+1; j<=nums.length-1;j++ ){
                	System.out.println(nums[i] +"   "+ nums[j]);
                    if(nums[i]+nums[j]==target){
                    	System.out.println("in");
                        Sum[0]=i;
                        Sum[1]=j;
                        return Sum;
                    }
                    else continue;
                
            }
                
        }
			return Sum;
    }
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] input = new int[]{1,2,3};
		int[] output = new int[2];
		output=s.twoSum(input, 5);
		System.out.println(output[0]);
		System.out.println(output[1]);
	}
}
