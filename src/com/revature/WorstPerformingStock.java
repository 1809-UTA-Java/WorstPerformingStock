package com.revature;
/**
* This is an attempt at solving the WorstPerformingStock problem.
* @author Zach Leonard
* v1
*/
class WorstPerformingStock {
	public static void main (String[] args) {
		float[][] stockValues;
		int lowestIndex = 0;
		float lowestStockValue = 0f;
		float tempStockValue = 0f;
		//id number, an opening price, and a closing price
		stockValues = new float[][] { {42f, 4635f, 5640f}, {44f, 342f, 345f}, {45f, 2345f, 2124f}, {99f, 1f, 5000f}};
		for(int i = 0; i < stockValues.length; i++) {
		//worst performing stock following the equation: (OpeningPrice - ClosingPrice) / OpeningPrice
			tempStockValue = (stockValues[i][1] - stockValues[i][2]) / stockValues[i][1];
			if (tempStockValue < lowestStockValue) {
				lowestStockValue = tempStockValue;
				lowestIndex = i;
			}
		}
		System.out.print("Worst performing Stock ID: ");
		System.out.print(stockValues[ lowestIndex][0] + "\n");
	}
}