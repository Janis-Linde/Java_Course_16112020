package task07forLoop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		//input - collect an integer from user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer.");
		int myNum = scanner.nextInt();
		scanner.close();
		
		// processing
		String message = ""+myNum+" -> ";
		
		int imin;
		int imax;
		
		if (myNum >= 0){
			imin = 0;
			imax = myNum;

		}else {
			imin = myNum;
			imax = 0;
		}
		for (int i = imin; i <= imax; i++){
			message = message + i+",";
		}
		
		// output
		System.out.println(message.substring(0, message.length()-1));
	}	
}
