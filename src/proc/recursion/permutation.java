package proc.recursion;

import java.util.Arrays;

public class permutation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		permutat(arr, arr.length);
	}

	private static void permutat(int[] arr, int size) {
		if (size < 2) {
			System.out.println(Arrays.toString(arr));
		} else {
			for (int k = 0; k < size; k++) {
				swap(arr, k, size - 1);
				// System.out.println("до  "+(Arrays.toString(arr)+ "size " +
				// size+ "  k " + k));
				permutat(arr, size - 1);
				// System.out.println("после "+(Arrays.toString(arr)));
			}
		}
	}

	private static void swap(int[] arr, int index0, int index1) {
		if (index0 == index1) {
			int tmp = arr[0];
			arr[0] = arr[index1];
			arr[index1] = tmp;
		} else {
			int tmp = arr[index0];
			arr[index0] = arr[index1];
			arr[index1] = tmp;
		}

	}
}
