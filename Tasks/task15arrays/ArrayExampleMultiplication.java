package task15arrays;

import java.util.Arrays;

public class ArrayExampleMultiplication {

	public static void main(String[] args) {
		//input
		int[] ints = {1,2,3,5,7};
		
		//processing
		
		for (int i = 0; i < ints.length; i++){
			ints[i] = ints[i]*ints[i]*ints[i];
		}
		
		String message = Arrays.toString(ints).replaceAll("\\s","") + " -> " +(Arrays.toString(ints)).replaceAll("\\s","");
		
		//output
		System.out.println(message);
	}
}
