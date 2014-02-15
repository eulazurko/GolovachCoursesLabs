package proc.loop;
import java.util.Arrays;

/*На этой странице приведен полный исходный код сортировки "пузырьком". 
 * Алгоритм допускает вариации и оптимизации. В данном случае приведен алгоритм, при котором "всплывает" самый большой элемент. 
 * Перепишите алгоритм на такой, при котором "тонет" самый маленький элемент (). 
 * Порядок сортировки должен сохраниться - по возрастанию. 
 * Элементы должны перебираться справа - налево. Всплывал - вправо, тонет - влево. 
 * Цикл не доходил до правого конца, теперь не доходит до левого.
 В массиве из 6 элементов должны сравниваться (и в случае инверсии переставляться) пары
4-5 3-4 2-3 1-2 0-1
4-5 3-4 2-3 1-2
4-5 3-4 2-3 
4-5 3-4
4-5 */

public class Bubble_sort_inverted {

	    public static void main(String[] args) {

	        int[] arr = {9, 1, 2, 3, 4, 5, 6, 7, 8, 0};

	        System.out.print(Arrays.toString(arr) + " -> ");

	        for (int barrier = 0; barrier < arr.length; barrier++) {

	            for (int index = arr.length - 1; index > barrier; index--) {

	                if (arr[index] < arr[index - 1]) {

	                    int tmp = arr[index];

	                    arr[index] = arr[index - 1];

	                    arr[index - 1] = tmp;

	                }

	            }
	            
	        }
	        System.out.println(Arrays.toString(arr));
	    }
}
	    
