package proc.recursion;

import java.util.Arrays;


/*Задача о генерации всех возможных перестановок элементов заданного списка.
Из списка длины N можно построить N! возможных перестановок (N! = 1 * 2 * … * (N – 1) * N, 1!=1, 2!=1*2=2, 3!=1*2*3=6, 4!=1*2*3*4=24, …).
Пример:
Из элементов списка [10, 20, 30] можно построить 6 различных перестановок:
[20, 30, 20]
[10, 20, 30]
[30, 20, 10]
[20, 10, 30]
[30, 10, 20]
[10, 30, 20]*/

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

				permutat(arr, size - 1);

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
