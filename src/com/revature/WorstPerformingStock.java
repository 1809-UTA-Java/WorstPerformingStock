package com.revature;

class WorstPerformingStock {

    public static int testArray[][] = {{42, 4635, 5640}, {44, 342, 345}, {45, 2345, 2124}};

    public static int worstPerformingStock(int[][] matrix){
        // assuming the stock ID cannot be negative
        int worstStockId = -1;
        int tempWorstStockId = 0;
        
        // arbitrary large number.
        double worstStockValue = 100000;
        double tempWorstStockValue;

        int tempMatrix[];

        for (int i = 0; i < matrix.length; i++){
            //set the the array i in matrix to the tempMatrix array
            tempMatrix = matrix[i];
            tempWorstStockId = tempMatrix[0];
            double openingPrice = (double) tempMatrix[1];
            double closingPrice = (double) tempMatrix[2];

            //calculate the worst stock value by performing (closing price - opening price)/opening price
            tempWorstStockValue = (closingPrice - openingPrice)/openingPrice;
            

            if (tempWorstStockValue < worstStockValue){
                worstStockValue = tempWorstStockValue;
                worstStockId = tempWorstStockId;
            }
        }
        return worstStockId;
    }

    public static void main(String[] args){
        System.out.println(worstPerformingStock(testArray));
        
    }
}