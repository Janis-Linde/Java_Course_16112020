import java.util.Scanner;


public class BasicMath {

	public static void main(String[] args) {
		
		// input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter an integer:");
		int myInt = scanner.nextInt();
		
		System.out.println("Please enter a double:");
		double myDouble = scanner.nextDouble();
		scanner.close();
		
		//processing
		String message1 = "The sum is "+ (myInt + myDouble);
		String message2 = "The substraction is "+ (myInt - myDouble);
		String message3 = "The multiplication is "+ (myInt * myDouble);
		String message4 = "The division is "+ (myInt / myDouble);
		String message5 = "The sum square is "+ (myInt + myDouble)*(myInt + myDouble);

		//output
		System.out.println(message1);
		System.out.println(message2);
		System.out.println(message3);
		System.out.println(message4);
		System.out.println(message5);
	}
}
