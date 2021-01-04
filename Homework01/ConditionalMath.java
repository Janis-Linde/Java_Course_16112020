import java.util.Scanner;

public class ConditionalMath {

	public static void main(String[] args) {
		// input
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name!");
		String myName = scanner.next();

		System.out.println("Please enter the first integer:");
		int myInt1 = scanner.nextInt();

		System.out.println("Please enter the second integer:");
		int myInt2 = scanner.nextInt();

		scanner.close();

		// processing
		// check integers
		String message1 = "";
		if (myInt1 > myInt2) {
			message1 = "The first integer is greater than the second.";
		} else if (myInt1 < myInt2) {
			message1 = "The second integer is greater than the first.";
		} else if (myInt1 == myInt2) {
			message1 = "Both integers are equal.";
		}

		// check name length vs integer sum
		int nameLength = myName.length();
		int intSum = myInt1 + myInt2;
		String message2 = "";

		if (intSum > nameLength) {
			message2 = "Integer sum is greater than letters in your name.";
		} else if (intSum < nameLength) {
			message2 = "Letters in your name are greater than integer sum.";
		} else if (intSum == nameLength) {
			message2 = "Integer sum is equal to letters in your name.";
		}

		// output
		System.out.println(message1);
		System.out.println(message2);

	}
}
