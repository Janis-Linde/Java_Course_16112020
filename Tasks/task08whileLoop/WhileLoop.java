package task08whileLoop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		//input - collect 2 integers from user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 2 integers. "
				+  "\nEnter number 1: ");
		int firstNum = scanner.nextInt();
		
		System.out.println("Enter number 2: ");
		int secondNum = scanner.nextInt();
		
		scanner.close();
		
		// processing
		String message = "";
		while (firstNum <= secondNum){
			if (firstNum %2 == 0 && firstNum %3 == 0 && firstNum % 5 != 0){
			message += firstNum+", ";
			}
			firstNum++;
		}
		
		// output
		System.out.println(message);
	}
}
