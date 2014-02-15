package proc.loop;

import java.util.Arrays;

/*Есть гипотеза, что обращение к локальной переменной типа int происходит быстрее чем обращение к элементу локальной 
 * переменной типа int[].
    Задание состоит в том, что бы переписать алгоритм Selection Sort:
    - убрать обращение во внутреннем цикле к элементу массива arr[barrier]
    - убрать обмен элементами arr[barrier] c arr[index] каждый раз, когда находится очередной меньший элемент. 
    Найти наименьший элемент - обменять с ним.*/


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
