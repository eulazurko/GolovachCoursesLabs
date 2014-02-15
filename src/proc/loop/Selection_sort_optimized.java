package proc.loop;

import java.util.Arrays;

/*���� ��������, ��� ��������� � ��������� ���������� ���� int ���������� ������� ��� ��������� � �������� ��������� 
 * ���������� ���� int[].
    ������� ������� � ���, ��� �� ���������� �������� Selection Sort:
    - ������ ��������� �� ���������� ����� � �������� ������� arr[barrier]
    - ������ ����� ���������� arr[barrier] c arr[index] ������ ���, ����� ��������� ��������� ������� �������. 
    ����� ���������� ������� - �������� � ���.*/


public class Selection_sort_optimized {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mass = {9, 8, 7, 8, 4, 3, 2, 1};
		
		for(int i = 0; i < mass.length-1; i++){
			int min = i, minValue = mass[i];
			for(int j = i + 1; j < mass.length; j++){
				if (minValue > mass[j])
					min = j;
			}
			if (min != i){
			int buff = mass[i];
			mass[i] = mass[min];
			mass[min] = buff;
			}
		}
		
		System.out.println(Arrays.toString(mass));

	}

}
