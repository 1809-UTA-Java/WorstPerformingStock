package com.revature;

public class WorstPerformingStock{
	
	public static void main(String args[]){
		int[][] matrix = new int[3][3];
		matrix[0][0] = 42;
		matrix[0][1] = 4635;
		matrix[0][2] = 5640;
		matrix[1][0] = 44;
		matrix[1][1] = 342;
		matrix[1][2] = 345;
		matrix[2][0] = 45;
		matrix[2][1] = 2345;
		matrix[2][2] = 2124;
		int result = WorstPerformingStock(matrix);
		System.out.println(result);
	}

	public static int WorstPerformingStock(int[][] matrix){
		double worst = Double.MAX_VALUE * -1;
		int[] stock = new int[3];
		for (int i = 0; i < matrix.length; i++){
			double size = (matrix[i][1] - matrix[i][2]);
			size = size/matrix[i][1];
			if (size > worst){
				worst = size;
				stock = matrix[i];
			}
		}
		return stock[0];
	}
}