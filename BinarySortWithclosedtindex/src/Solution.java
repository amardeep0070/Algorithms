public class Solution {
	int mid=0;
    public int searchInsert(int[] nums, int target) {
       return binarySearch(nums,0,nums.length-1,target,0);
        
        
    }
    int binarySearch(int[] nums,int start, int end,int target,int index){
    	//int mid=0;
    	while(start<=end){
        int length=end-start;
        mid=Math.round(length/2)+index;
        System.out.println("Mid is" + mid);
        System.out.println(nums[mid]);
        if(nums[mid]==target){
            return mid;
        }
        else if(target<nums[mid]){
        	System.out.println("less");
            return binarySearch(nums,0,mid-1,target,0);
        }
        else {
        	System.out.println("more");
        	return binarySearch(nums,mid+1,end,target,mid+1);
        }
        
    	}
    	if(nums[mid]>target)return mid;
    	else return mid+1;
    }
    public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = new int[]{1};
		System.out.println(s.searchInsert(nums, 2));
	}
}