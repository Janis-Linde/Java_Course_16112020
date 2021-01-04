package task04mathCompare;

import java.util.Scanner;

public class MathCompare {
	public static void main(String[] args) {
		//input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 3 integers to get sum of the unique."
				+ "\nEnter number 1: ");
		int firstNum = scanner.nextInt();
		
		System.out.println("Enter number 2: ");
		int secondNum = scanner.nextInt();
		
		System.out.println("Enter number 3: ");
		int thirdNum = scanner.nextInt();
		
		scanner.close();
		
		//processing
		int sum = -1;
		if (firstNum == secondNum && firstNum == thirdNum){
			sum = 0;
		}
		else if (firstNum == secondNum && firstNum != thirdNum){
			sum = thirdNum;
		}
		else if (firstNum == thirdNum){
			sum = secondNum;
		}
		else if (secondNum == thirdNum){
			sum = firstNum;
		}
		else {
			sum = firstNum + secondNum + thirdNum;
		}
		
		//output
		System.out.println("The sum of unique is: " + sum + ".");
	}

}
