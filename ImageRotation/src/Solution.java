public class Solution {
	public void rotate(int[][] matrix) {
		int lengthMatrix=matrix.length;
		int[][] result = new int[lengthMatrix][lengthMatrix];
		int k=0;
		for (int i=lengthMatrix-1; i>=0; i--){
			for(int j=0; j<=lengthMatrix-1;j++){
				result[j][k]=matrix[i][j];
			}
			k++;
		}
		
		for (int i=0; i<lengthMatrix;i++){
			for (int j=0; j<lengthMatrix;j++){
				matrix[i][j]=result[i][j];
			}
		}
	}
	public static void main(String[] args) {
		Solution s = new  Solution();
		int[][] matrix = new int[][]{{1,2},{3,4}};
		s.rotate(matrix);
	}
}
