package task16arrays;

import java.util.Arrays;

public class ArraysMoveZeros {

	public static void main(String[] args) {
		//input
		int[] ints = {0,4,0,7,8,9,0,1};
		
		//processing
		System.out.println(Arrays.toString(ints));
		

		
		while (true) {
			boolean done = true;
			for (int i = 0; i < ints.length - 1; i++) {
				int first = ints[i];
				int second = ints[i + 1];
				if (first == 0 && second != 0) {
					ints[i] = second;
					ints[i + 1] = first;
					done = false;
				}
			}
			if (done) {
				break;
			}
		}
		
		// output
		System.out.println(Arrays.toString(ints));
	}
}
