public class WorstPerformingStock {
    public static void main(String[] args) {
        final int[][] matrix = {{ 42, 4635, 5640 }, { 44, 342, 345 }, { 45, 2345, 2124 }};

        System.out.println("Worst perfoming stock: ");
        System.out.print(worstPerformingStoc(matrix) + "\n");
    }

    public static int worstPerformingStoc(int[][] matrix) {
        int opening =  matrix[0][1];
        int closing = matrix[0][2];
        int worstPerformance = (opening - closing) / opening;
        int id = 0;

        for (int row = 1; row < matrix.length; row++) {
            int openingPrice = matrix[row][1];
            int closingPrice = matrix[row][2];
            if (((openingPrice - closingPrice) / openingPrice) < worstPerformance) {
                worstPerformance = matrix[row][0];
                id = row;
            }
        }

        return matrix[id][0];
    }
}