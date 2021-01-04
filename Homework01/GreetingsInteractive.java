import java.util.Scanner;


public class GreetingsInteractive {

	public static void main(String[] args) {
		
		//input
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		String myName = scanner.next();
		
		System.out.println("Please enter your age: ");
		int myAge = scanner.nextInt();
		
		scanner.close();
		
		//processing
		String message = "My name is " + myName + " and my age is " + myAge +"."; 

		//output
		System.out.println(message);
		
	}

}
