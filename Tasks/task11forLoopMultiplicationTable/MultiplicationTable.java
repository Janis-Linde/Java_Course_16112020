package task11forLoopMultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		//input
		System.out.println("Please enter an integer.");
		Scanner scanner = new Scanner(System.in);
		int myNum = scanner.nextInt();
		scanner.close();
		
		//processing
		String message = "";
		for(int i = 0; i <=myNum; i++){
			message += ""+myNum+" X "+i+" = "+ (myNum * i)+ "\n";
		}
		
		//output
		System.out.println(message);
	}
}
