package task01sum;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		//input -  collect 2 integers from user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 2 integers to get their sum. "
				+  "\nEnter number 1: ");
		int firstNum = scanner.nextInt();
		
		System.out.println("Enter number 2: ");
		int secondNum = scanner.nextInt();
		scanner.close();
		
		//processing
		int sum = firstNum + secondNum;
		
		// output
		System.out.println("The sum is: " +sum +".");
	}

}
