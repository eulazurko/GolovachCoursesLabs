package proc.loop;

public class BinSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	 int m [] = {0, 1 ,2 , 3, 4};
	 try{

	 System.out.println(bin(m, 4, 0, m.length));
	 
	 }
	 catch(Exception e){
		 System.out.println(e);
	 }
	 
	}
public static int bin(int m[], int value, int first, int end){
	int result;
	if (first == 0 & end == 0 || value > m[end - 1]){
		System.out.println("Not found");
		result = -1;
	} else{
	result =  m[(end - first) / 2 + first] == value ?
									(end - first) / 2 + first : (m[(end - first) / 2 + first] > value ? 
									  bin(m, value, first, ((end - first) / 2 + first)) : bin(m, value, ((end - first) / 2 + first), end));
	
}
return result;
}
}
