package task19twoDimArrays;

public class TwoDimArraysMagicSquare {

	public static void main(String[] args) {
		//input
		int[][] magicSquare = {{17,10,15},{12,14,16},{13,18,11}};
		
		//processing
		// check if rows and columns are equal count
		boolean rowsCols = false;
		for (int i = 0; i < magicSquare.length; i++){
			if (magicSquare[i].length == magicSquare.length){
				rowsCols = true;
			}else{
				rowsCols = false;
				break;
			}
		}
				
		//check sums of diagonals
		boolean diags = false;
		int diagSum1 = 0;
		int diagSum2 = 0;
		for (int i = 0; i < magicSquare.length; i++){
			diagSum1 =  diagSum1+magicSquare[i][i];
		}
		for (int i = 0; i < magicSquare.length; i++){
			diagSum2 =  diagSum2+magicSquare[i][magicSquare.length-1-i];
		}
		if (diagSum1 == diagSum2){
			diags = true;
		}		
		
		// check sums of rows and columns
		boolean sums = false;
		for (int i = 0; i < magicSquare.length; i++){
			int rowSum = 0;
			int colSum = 0;
			for (int j = 0; j < magicSquare[i].length; j++){
				rowSum = rowSum + magicSquare[i][j];
				colSum = colSum + magicSquare[j][i];
			}
			if (diagSum1 == rowSum && diagSum1 == colSum){
				sums = true;
			}else{
				sums = false;
				break;
			}
		}
		
		//output
		if (rowsCols && diags && sums){
			System.out.println("This is a magic square!");
		}else{
			System.out.println("This is not a magic square.");
		}
	}
}
