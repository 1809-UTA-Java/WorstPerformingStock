/** 
* Taking a 2D array as input, with each row containing 
* a stock id number, an opening price, and a closing price, 
* find the worst performing stock following the equation: 
* (OpeningPrice - ClosingPrice) / OpeningPrice, and return 
* the id number of that stock.
*
* Example input: [[42, 4635, 5640], [44, 342, 345], [45, 2345, 2124]]
*
* public int WorstPerformingStock(int[][] matrix)
*
* @author su ean lim
*/

package demo;

import java.util.Arrays;

public class WorstPerformingStock {

	public static int WorstPerformingStock(int[][] matrix) {
		/*
		* worstPerfStock initialized to a large number; stores the lowest value as 			*	computed
		* temp is a comparison variable to compare against current worstPerfStock
		* j is the index for the array containing the numerical values
		* stockID stores the stockID of the worst performing stock
		*/

		int worstPerfStock = 10000;
		int temp = 0;
		int j = 1;
		int stockID = matrix[0][0];

		// for loops iterates through the arrays inside the array			
		for (int i = 0; i < matrix.length; i++) {
			//for (int j = 1; j < matrix[i].length; j++) {
				// temp stores the value computed by given equation
				temp = (matrix[i][j] - matrix[i][j+1]) / matrix[i][j];
			
				// if temp is lower in value than current value in worstPerfStock,
				// worstPerfStock will take on temp's value and the associated
				// stock ID is stored in stockID
				if (temp < worstPerfStock) {
					worstPerfStock = temp;
					stockID = matrix[i][0];
				}
			//}
		}		
		
		// returns stock ID of worst performing stock
		return stockID;

	}

	
	public static void main(String args[]) {
		//initial test case
		int[][] myMX = {{42, 4635, 5640}, {44, 342, 345}, {45, 2345, 2124}};
		System.out.println(WorstPerformingStock(myMX));
			
	}

}