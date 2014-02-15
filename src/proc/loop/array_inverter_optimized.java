package proc.loop;
import java.util.Arrays;
/*���� ��������, ��� ��������� �������� ����� �� 0 �������� �������, ��� ��������� �������� ����� �� ������������� �� ������� 0 ��������.
    ������� ������� � ���, ��� �� ���������� ��������� �������� ����� �� ��������� � ������ �������� 0 � ������� ������, �������������� ������.*/

public class array_inverter_optimized {


	    public static void main(String[] args) {
	        int[] arr;

	        arr = new int[]{};
	        System.out.print(Arrays.toString(arr) + " -> ");
	        invert(arr);
	        System.out.println(arr.length+ " "+ Arrays.toString(arr));
			
	        arr = new int[]{0};
	        System.out.print(Arrays.toString(arr) + " -> ");
	        invert(arr);
	        System.out.println(Arrays.toString(arr));

	        arr = new int[]{0, 1};
	        System.out.print(Arrays.toString(arr) + " -> ");
	        invert(arr);
	        System.out.println(Arrays.toString(arr));

	        arr = new int[]{0, 1, 2};
	        System.out.print(Arrays.toString(arr) + " -> ");
	        invert(arr);
	        System.out.println(Arrays.toString(arr));

	        arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	        System.out.print(Arrays.toString(arr) + " -> ");
	        invert(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	    
	    public static void invert(int[] arr) {
	    	for (int k = (arr.length/2)-1; k >= 0 ; k--) {
	            int tmp = arr[k];
	            arr[k] = arr[arr.length - k - 1];
	            arr[arr.length - k - 1] = tmp;
	        }
	    }
	}