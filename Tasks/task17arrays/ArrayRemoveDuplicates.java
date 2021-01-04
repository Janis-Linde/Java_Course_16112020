package task17arrays;

import java.util.Arrays;

public class ArrayRemoveDuplicates {

	public static void main(String[] args) {
		//input
		String[] original = {"ABC", "CDE", "FGA", "CDE", "GAE", "ABC", "ABO"};
		System.out.println(Arrays.toString(original));
		
		//processing
		int size = original.length;
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++){
				if (original[i].equals(original[j])){
					for (int k = j; k < size -1; k++){
						original[k] = original[k+1];
					}
					size = size -1;
				}
			}
		}
		String[] updated = new String[size];
		System.arraycopy(original, 0, updated, 0, size);
		
		//output
		System.out.println(Arrays.toString(updated));
	}
}
