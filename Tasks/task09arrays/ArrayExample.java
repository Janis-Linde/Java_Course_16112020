package task09arrays;

import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		
		//input - collect an integer from user
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer in the range of month number 1 - 12.");
		int myNum = scanner.nextInt();
		while (myNum < 1 || myNum > 12) {
			System.out.println("Error! Please enter an integer in the range of month number 1 - 12.");
			myNum = scanner.nextInt();
		}
		scanner.close();

		//processing
		String[] months = {"January" , "February", "March", "April", "May", "June", "July", "August", "September", "November", "December"};
		String message = months[myNum-1];
		
		// output
		System.out.println(message);
	}
}
