package proc.loop;

import java.util.Arrays;
/*�� �������� ���������� �������� ���������� ���� while ���� ������� ��� ������� ��������� ��������������� ��������, 
 * ��� ���� �� ����������� "�������" ������.
    � ����� ����������� ���������� ��������:
1) ������������� ����� ������� ��� ������� �������� ������� (Arrays.binarySearch(...))
2) ����� ������� - ��������� ��� ����� ������� �� ���� ����� (System.arraycopy(...))
    ����������: ������ ������ � �������� binarySearch(...) � arraycopy(...) �� ������ ���������� �� ���� ��������.*/



 class InsertionSort {

	    static void sort(int[] arr) {

	        for (int k = 1; k < arr.length; k++) {

	            int newElement = arr[k];

	            int location = k - 1;

	            while (location >= 0 && arr[location] > newElement) {

	                arr[location + 1] = arr[location];

	                location--;

	            }

	            arr[location + 1] = newElement;

	        }

	    }
static void mySort(int mass[]){

	for (int i = 1; i < mass.length; i++){
		
		for(int j = i - 1; j >= 0 && mass[j + 1] > mass[j]; j-- ){
			
			int buff = mass[j + 1];
			
			mass[j + 1] = mass[j];
			
			mass[j] = buff;
			
			//Arrays.
			
		}
			
	}
}
 }	


	

	public class Insertion_sort_optimized {
	    public static void main(String[] args) {
	        int[][] data = {
	                {},
	                {1},
	                {0, 3, 2, 1},
	                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
	        };
	        for (int[] arr : data) {
	            System.out.print(Arrays.toString(arr) + " -> ");
	            InsertionSort.sort(arr);
	            System.out.println(Arrays.toString(arr));
	        }
	        
	        for (int[] arr : data) {
	            System.out.print(Arrays.toString(arr) + " -> ");
	            InsertionSort.mySort(arr);
	            System.out.println(Arrays.toString(arr));
	        }
	    }
	}