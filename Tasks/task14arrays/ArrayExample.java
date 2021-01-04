package task14arrays;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// input
		String[] numbers = { "1", "2", "3", "5", "8", "30", "15", "12", "7" };
		System.out.println(Arrays.toString(numbers));

		// processing
		for (int i = 0; i < numbers.length; i++) {
			int test = Integer.parseInt(numbers[i]);
			if (test % 3 == 0 && test % 5 == 0) {
				numbers[i] = "fizzBuzz";
			} else if (test % 3 == 0) {
				numbers[i] = "fizz";
			} else if (test % 5 == 0) {
				numbers[i] = "buzz";
		
			}
		}

		// output
		System.out.println(Arrays.toString(numbers));
	}
}
