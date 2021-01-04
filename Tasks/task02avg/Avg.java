package task02avg;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		
		//input - collect three integers from user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 3 integers to get their average."
				+ "\nEnter number 1: ");
		int firstNum = scanner.nextInt();
		
		System.out.println("Enter number 2: ");
		int secondNum = scanner.nextInt();
		
		System.out.println("Enter number 3: ");
		int thirdNum = scanner.nextInt();
		
		scanner.close();
		
		//processing - calculate average
		float avg = ((float)firstNum + secondNum + thirdNum)/3;
		
		//output
		System.out.println("The average is: " +avg+".");
	}

}
