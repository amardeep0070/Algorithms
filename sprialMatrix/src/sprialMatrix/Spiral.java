package sprialMatrix;

import java.util.ArrayList;

public class Spiral {
	public static ArrayList<Integer> solution;
	public static void main(String[] args) {
		int []a = {1};
		int []b = {4};
		int []c = {7};
		int []d = {10};
		int [][]arr = {a,b,c,d};
		int m = arr[0].length;
		int n = arr.length;
		solution = new ArrayList<Integer>();
		printSpiral(arr, 0, 0, m-1, 0, n-1);
		System.out.println(solution);
	}
	public static void printSpiral(int[][] arr, int dir, int left, int right, int top, int bottom){
		switch(dir){
		case 0 : for(int i = left; i <= right; ++i)  //traverse L to R
					solution.add(arr[top][i]);
				 ++top; break;
		case 1 : for(int i = top; i <= bottom; ++i)  //traverse T to B
					solution.add(arr[i][right]);
		 		 --right; break;
		case 2 : for(int i = right; i >= left; --i)  //traverse R to L
					solution.add(arr[bottom][i]);
		 		 --bottom; break; 
		case 3 : for(int i = bottom; i >= top; --i)  //traverse B to T
				 	solution.add(arr[i][left]);
		 		 ++left; break;
		}
		if(left <= right && top <= bottom)
			printSpiral(arr, (dir+1)%4, left, right, top, bottom);
	}
}