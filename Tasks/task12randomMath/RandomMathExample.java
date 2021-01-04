package task12randomMath;

import java.util.Random;
import java.util.Scanner;

public class RandomMathExample {

	public static void main(String[] args) {
		//constants
		int randomInt = new Random().nextInt(10)+1;
		
		//input
		Scanner scanner = new Scanner(System.in);
		System.out.println("I have chosen number between 1 and 10, try to guess it. "
							+  "\nWhat's your number?");
		int input = scanner.nextInt();
		
		//processing and output
		while (input != randomInt){
			System.out.println("Nope, try again.");
			input = scanner.nextInt();
		}
		
		scanner.close();
		System.out.println("Correct, the number was " +randomInt);
	}
}
