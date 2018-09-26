public class WorstPerformingStock {

    //Finds the stock id with the worst performance according to the equation ((Opening - Closing)/Opening)
    public static int WorstStock(int[][] matrix){

        //Initialize vars to keep track of the initial performance and initial stock id
        double WPerformance = (matrix[0][1] - matrix[0][2]) / matrix[0][1];
        int WStockID = matrix[0][0];

        //The var used to calculate the performace of each stock
        double diff = 0;

        for( int[] nest : matrix ){
            diff = (nest[1] - nest[2]);
            diff = (diff / nest[1]);

            //If the performance is worse than what we already have stored, replace the existing value
            if( diff < WPerformance ){
                WPerformance = diff;
                WStockID = nest[0];
            }
        }

        return WStockID;        
    }

    public static void main( String [] args ){

        int [][] matrix = new int[][]{{42, 4635, 5640}, {44, 342, 345}, {45, 2345, 2124}};
        System.out.println( WorstStock(matrix) );
    }
}