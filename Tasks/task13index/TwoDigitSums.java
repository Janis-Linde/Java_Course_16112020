package task13index;

public class TwoDigitSums {
	public static void main(String[] args) {
		
		// processing
		String message = "";
		for (int i = 10; i < 100; i++){
			
			int num1 = i /10;
			int num2 = i % 10;
			int sum = num1+num2;
			
			message = message +i+", "+num1+"+"+num2+"="+ sum + "\n";
		}
		
		//output
		System.out.println(message);
	}
}
