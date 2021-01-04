package task06strLength;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		//collect 2 strings from user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 2 Strings to concatenate. "
				+  "\nEnter String 1: ");
		String firstString = scanner.nextLine();
		
		System.out.println("Enter String 2: ");
		String secondString = scanner.nextLine();
		
		scanner.close();
		
		//processing
		String message = "";
		if(firstString.length()< secondString.length()){
			message = firstString + secondString + firstString;
		} 
		else {
			message = secondString + firstString + secondString;
		}
		
		//output
		System.out.println(message);
		
	}

}
