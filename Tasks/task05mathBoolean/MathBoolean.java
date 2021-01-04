package task05mathBoolean;

import java.util.Scanner;

public class MathBoolean {

	public static void main(String[] args) {
		//input - collect an integer from user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer in the range of [50..100).");
		int myNum = scanner.nextInt();
		scanner.close();
	
		
		//process and output the result
		
		System.out.println(myNum >= 50 && myNum < 100); 
	}

}
