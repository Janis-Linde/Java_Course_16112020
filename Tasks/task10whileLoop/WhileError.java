package task10whileLoop;

import java.util.Scanner;

public class WhileError {
	public static void main(String[] args) {
		
		//input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter one alphabet letter");
		String myInput = scanner.next().toLowerCase();
		
		String patskani = "aeiou";
		String divskani = "o";
		String lidzskani = "bcdfghjklmnprstvz";
		
		while(myInput.length() != 1 && !patskani.contains(myInput)&& !lidzskani.contains(myInput)){
			System.out.println("Error. Please enter one alphabet letter");
			myInput = scanner.next().toLowerCase();
		
		}
		scanner.close();		

		//processing
		String message = "";
		if (patskani.contains(myInput) && divskani.contains(myInput)){
			message = myInput+ " ir patskanis un divskanis.";
		} else if (patskani.contains(myInput)){
			message = myInput+ " ir patskanis.";
		} else if (lidzskani.contains(myInput)){
			message = myInput+ " ir līdzskanis.";
		}
		
		//output
		System.out.println(message);
	}
}
