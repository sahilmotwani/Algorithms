package code;

import java.util.Arrays;

public class PrintMatrixDiagonal {

	public static void main(String[] args) {
		int row = 4, col = 5;
		int k = 1;
		int matrix[][] = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				matrix[i][j]=k++;
			}
		}

		System.out.println("Input Matrix" );
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		displayMatrix(matrix);
	}

	public static void displayMatrix(int[][] matrix){
		int row,col;
		int rowCount=matrix.length;
		int colCount = matrix[0].length;
		for(int i=0;i<rowCount;i++){
			for(row=i,col=0;row>=0 && col<colCount-1;row--,col++){
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}
		for(int i=1;i<colCount;i++){
			for(col=i,row=rowCount-1;col<=colCount-1 && row>=0;col++,row--){
				System.out.print(matrix[row][col]+" ");
			}
			System.out.println();
		}
	}

}
