class Stock {
    public static void main (String[] args) {
        int[][] matrix = {{42, 4635, 5640},{44, 342, 345}, {45, 2345, 2124}};
        System.out.println(WorstPerformingStock(matrix));
    }

    /*This method shall take in a 2D integer array reprsenting a stock price
    * each row shall be comprise of an ID for the stock. Then the opening price of
    * a stock on a given day. Then the closing price for that stock on the same day.
    *
    * This function shall return the ID of the worst performing stock, if multiple stock have the same performace
    * it shall return the ID of first one that is found.
    */
    public static int WorstPerformingStock(int[][] matrix) {
        //A variable to hold the value of the worst performing stock
        //Initialized with the first stock's performance
        double worstPerformingStock = stockPerformance (matrix[0][1], matrix[0][2]);
        //A variable to hold the ID of the stock with the worst performance
        //Initialized with the first stock's ID
        int worstID = matrix[0][0];

        //This will go through the table one row at a time.
        //Since worstPerfoming stock is initialized as the first stock, we can skip it
        for (int i=1; i < matrix.length; ++i) {
            //this checks if the current stock's performance is worse than the lowest we have saved.
            if (stockPerformance (matrix[0][1], matrix[0][2]) < worstPerformingStock) {
                //If it is we make this the new worst perfoming stock and change the ID to reflect that
                worstPerformingStock = stockPerformance (matrix[0][1], matrix[0][2]);
                worstID = matrix[i][0];
            }
            //if not we do nothing and check the next row
        }
        //returns the previously found ID number
        return worstID;
    }

    /* A method to determine the stock's performance
    *  Returns the performance as a double
    */
    public static double stockPerformance (int open, int close) {
        return (open - close) / open;
    }
}