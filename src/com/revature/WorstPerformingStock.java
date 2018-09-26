package com.revature;
/**
* This is an attempt at solving the WorstPerformingStock problem.
* @author Zach Leonard
* v1
*/
class WorstPerformingStock {
	public static void main (String[] args) {
		int[][] stockValues;
		
		//id number, an opening price, and a closing price
		stockValues = new int[][] { {42, 4635, 5640}, {44, 342, 345}, {45, 2345, 2124}, {99, 1, 5000}};
		System.out.print("Worst performing Stock ID: ");
		System.out.print(WorstPerformingStock(stockValues) + "\n");
	}
	public static int WorstPerformingStock(int[][] stockValues) {
		int lowestIndex = 0;
		float lowestStockValue = 0f;
		float tempStockValue = 0f;
		for(int i = 0; i < stockValues.length; i++) {
		//worst performing stock following the equation: ( ClosingPrice - OpeningPrice) / OpeningPrice
			tempStockValue = (stockValues[i][2] - stockValues[i][1]) / (float) stockValues[i][1];
			if (tempStockValue < lowestStockValue) {
				lowestStockValue = tempStockValue;
				lowestIndex = i;
			}
		}
		return stockValues[lowestIndex][0];
	}
}