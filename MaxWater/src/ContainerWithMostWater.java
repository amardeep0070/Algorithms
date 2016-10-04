
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int left=0;
		int right=height.length-1;
		int maxarea=0;
		int maxHeight=0;
		if(right<1) return 0;
		while(left<right){
			int heightLow=height[left];
			int heightRight=height[right];
			int size = Math.min(height[left], height[right]) * (right-left);
			maxarea= Math.max(maxarea,size); 
			if(heightLow<heightRight){
				while(left<height.length-1 && height[left]<=heightLow){
					left++;
					System.out.println(left);
				}
			}
			else{
				while(right>0 && height[right]<=heightRight) right--;
			}
		}
		return maxarea;
	}
	public static void main(String[] args) {
		ContainerWithMostWater q = new ContainerWithMostWater();

		int[] height = {5,2,12,1,5,3,4,11,9,4};
		
		int res = q.maxArea(height);

		System.out.println(res);
	}
}
