package inPlaceDuplicateArray;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int length=nums.length, j=1;
       // System.out.println(length);
        int k=1;
        for(int i=0; i<=nums.length-2;i++){
        	//System.out.println(i);
        	//System.out.println(nums[i]+ "  "+ nums[j]);
            if(nums[i]==nums[j]){
                length=length-1;
                j++;
            }
            else{
            	nums[k]=nums[j];
            	//System.out.println(nums[k]);
            	k=k+1;
            j++;
            }
            
        }
        for (int f=0; f<length;f++){
			System.out.println(nums[f]);
		}
        return length;
    }
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = new int[]{1,1,2,2,3,3,4,5};
		System.out.println("length is "+ s.removeDuplicates(nums));
		
	}
}