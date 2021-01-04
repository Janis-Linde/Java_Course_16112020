package task18twoDimArrays;

public class TwoDimensionalArraysEx1 {

	public static void main(String[] args) {
		//input
		int[][] testResults = {{68,58,79},{79,76,81}};
		
		//processing
		double[] averages = new double [testResults.length];
		for (int i = 0; i < testResults.length; i++){
			int sum = 0;
			for (int j = 0; j < testResults[i].length; j++){
				sum = sum + testResults[i][j];
			}
			double avg = ((double) sum)/testResults[i].length;
			averages[i] = avg;
		}
		
		//output
		for (int i = 0; i < averages.length; i++){
			System.out.println(String.valueOf(averages[i]).substring(0,4)+String.valueOf(averages[i]).substring(16));
		}
		
	}
}
