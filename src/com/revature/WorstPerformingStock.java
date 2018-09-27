package com.revature;

/**
* Worst Performing Stock
*
* @author Leonardo De Leon
*/
class WorstPerformingStock {
	
	public static int getWorstStockId (int[][] stock) {

		int worstStockId = 0;
		int rate = 0;
		int temp = 0;
		int arr1Len = stock.length;
		
		// go through the list of stock
		for (int row = 0; row < arr1Len; row++) {
			// calculate the worst performing stock			
			temp = (stock[row][2] - stock[row][1]) * 100 / stock[row][2];
			
			// if it is the first time then initialize rate
			if (row == 0) {
				rate = temp;
				worstStockId = stock[row][0];
			} else {
				// if rate is greater than temp then update the stock id			
				if (rate > temp) {
					worstStockId = stock[row][0];
				}
			}		
		}		
		
		return worstStockId;

	}

	public static void main (String args[]) {
		
		// sample stocks	
		int[][] arrsOfStock = {{42, 4635, 5640},{44, 342, 345},{45, 2345, 2124}};
		
		// print out the worst performing stock
		System.out.println(WorstPerformingStock.getWorstStockId(arrsOfStock));	// -> 45
	}

}