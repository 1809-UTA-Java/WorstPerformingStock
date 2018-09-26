import java.util.Arrays;
import java.util.Comparator;

class WorstPerformingStock {

	public static final int ID = 0;
	public static final int OPENING = 1;
	public static final int CLOSING = 2;
	public static final int PERFORMANCE = 1;

	public static void main (String[] args) {
		WorstPerformingStock();
	}

	static void  WorstPerformingStock() {
		int[][] iStocksArray;
		int[][] iPerformanceArray;

		//Loop through with equation and save results in new array
		for(int iCntr = 0; iCntr < iStocksArray.length; iCntr++) {
			iPerformanceArray[iCntr][ID] = iStocksArray[iCntr][ID];
			iPerformanceArray[iCntr][PERFORMANCE] = ((iStocksArray[iCntr][OPENING] - iStocksArray[iCntr][CLOSING]) / iStocksArray[iCntr][OPENING]);
		}

		//Sort array based on result
		Arrays.sort(iPerformanceArray, Comparator.comparingInt(arr -> arr[1]));

		//print id for first element
		System.out.println(iPerformanceArray[0][ID]);
	}
}
