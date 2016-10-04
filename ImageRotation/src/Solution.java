public class Solution {
    public void rotate(int[][] matrix) {
            int[][] result = new int[matrix.length][matrix.length];
            int k=0;
            for (int i=matrix.length-1; i>=0; i--){
            	for(int j=0; j<=matrix.length-1;j++){
            		result[j][k]=matrix[i][j];
            	}
            	k++;
            }
            for (int i=0; i<matrix.length;i++){
    			for (int j=0; j<matrix[0].length;j++){
    				System.out.println(result[i][j]);
    			}
    }
    }
            
    public static void main(String[] args) {
		Solution s = new  Solution();
		int[][] matrix = new int[][]{{1,2},{3,4}};
		s.rotate(matrix);
//		//System.out.println("m is" + matrix[1][1]);
//		for (int i=0; i<matrix.length;i++){
//			for (int j=0; j<matrix.length;j++){
//				System.out.println(matrix[i][j]);
//			}
//		}
   }
	}
