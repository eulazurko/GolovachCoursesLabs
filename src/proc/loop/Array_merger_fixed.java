package proc.loop;
import java.util.Arrays;

/*����� Merger.merge(...) ���������� � ��������� ������� - �� ��������� �������, �� ����������� ������������ ��������, ����� ���� �� �������� ��������� ������. 
1. ��������� ������.
2. ����� ���� ��� �����������, ��� ���� �� �������� "��������" ��������� ������ �� ������� �� � �����, � ����� ������� System.arraycopy(...).*/

public class Array_merger_fixed {

public static int[] merge(int[] a, int[] b) { // wron
			int[] result = new int[a.length + b.length];
	        int aIndex = 0;
	        int bIndex = 0;
	        while (bIndex < b.length && aIndex < a.length && aIndex + bIndex != result.length ) {
	        	System.out.println("!!!");
	            if (a[aIndex] < b[bIndex]) {
	                result[aIndex + bIndex] = a[aIndex];
	                aIndex++;
	            } else {
	                result[aIndex + bIndex] = b[bIndex];
	                bIndex++;
	            }
	            if (aIndex >= a.length){
	            	System.out.println("a out");
	            	System.arraycopy(b, bIndex, result, result.length - (b.length - bIndex), b.length - bIndex);
	            }
	            if (bIndex >= b.length){
	            	System.out.println("b out");
	            	System.arraycopy(a, aIndex, result, result.length - (a.length - aIndex), a.length - aIndex);
	            }//(src, srcPos, dest, destPos, length)
	        }
	        return result;
	    }
public static void main(String args[]){
int[] a = {1, 2, 3, 4 ,5};
int b[] = {1,2,3,4,6};
System.out.println(Arrays.toString(merge(a, b)));
}
	}