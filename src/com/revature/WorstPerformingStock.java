package com.revature;

class WorstPerformingStock {

    public static int[][] stocks = {
        {32, 4893, 7949},
        {38, 7834, 3724},
        {73, 2374, 4387}
    };
    public static void main(String[] args) {
    
    int bestStock = WorstPerformStock(stocks);

    }

    public static int WorstPerformStock(int[][] matrix){
       //int[][] matrix = this.mat
        for(int i=0; i<= matrix.length; i++){
            system.out.println("Stock ID: " + matrix[i][1]);
        } 
        return 1;
    }

}