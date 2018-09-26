class Stock {
    public static void main (String[] args) {
        int[][] matrix = {{42, 4635, 5640},{44, 342, 345}, {45, 2345, 2124}};
        System.out.println(WorstPerformingStock(matrix));
    }

    /*This method shall take in a 2D integer array reprsenting a stock price
    * each row shall be comprise of an ID for the stock. Then the opening price of
    * a stock on a given day. Then the closing price for that stock on the same day.
    * This function shall return the ID of the worst performing stock
    */
    public static int WorstPerformingStock(int[][] matrix) {
        //A variable to hold the value of the worst performing stock
        //Initialized with the first stock's performance
        double worstPerformingStock = (matrix[0][1]-matrix[0][2]) / matrix[0][1];
        //A variable to hold the ID of the stock with the worst performance
        //Initialized with the first stock's ID
        int worstID = matrix[0][0];

        //This will go through the table one row at a time.
        //Since worstPerfoming stock is initialized as the first stock, we can skip it
        for (int i=1; i < matrix.length; ++i) {
            //this checks if the current stock's performance is worse than the lowest we have saved.
            if (((matrix[i][1]-matrix[i][2])/matrix[i][1]) < worstPerformingStock) {
                //If it is we make this the new worst perfoming stock and change the ID to reflect that
                worstPerformingStock = ((matrix[i][1]-matrix[i][2])/matrix[i][1]);
                worstID = matrix[i][0];
            }
            //if not we do nothing
        }
        //returns the previously found ID number
        return worstID;
    }
}