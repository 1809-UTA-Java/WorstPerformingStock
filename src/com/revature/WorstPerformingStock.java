package com.revature;

class WorstPerformingStock {

    public static int testArray[][] = {{42, 4635, 5640}, {44, 342, 345}, {45, 2345, 2124}};

    public static int worstPerformingStock(int[][] matrix){
        // assuming the stock ID cannot be negative
        int worstStockId = -1;
        int tempWorstStockId = -1;
        
        int worstStockValue = 0;
        int tempWorstStockValue = 0;

        int tempMatrix[];

        for (int i = 0; i < matrix.length; i++){
            //set the the array i in matrix to the tempMatrix array
            tempMatrix = matrix[i];
            tempWorstStockId = tempMatrix[0];
            worstStockValue = 
            tempWorstStockValue = (tempMatrix[2] - tempMatrix[1])/tempMatrix[1];
            
            if (tempWorstStockValue < worstStockValue){
                worstStockValue = tempWorstStockValue;
                worstStockId = tempWorstStockID;
            }
        }
        return worstStockId;
    }

    public static void main(String[] args){
        int worstId = worstPerformingStock(testArray);
    }
}