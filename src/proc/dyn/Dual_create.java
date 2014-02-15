package proc.dyn;

public class Dual_create {

	/**
	 * @param args
	 */
public static void main(String[] args) {
		
		DualNode tail = new DualNode(0);
		DualNode temp, temp2;
		temp = tail;
		temp2 = tail;
		for (int i = 1; i < 100; i++){
			
			temp.next = new DualNode(i);
			temp = temp.next;
			temp.prev = temp2;
			temp2 = temp;
			System.out.println(temp.value + "   " + temp.prev.value);
		}
		
		for (DualNode tmp = tail; tmp != null; tmp = tmp.next){
			System.out.println(tail.value);
			System.out.println(tail.next);
			tail = tail.next;
		}
	}
		
}



class DualNode{
	int value;
	DualNode next;
	DualNode prev;
	
	DualNode(int v){
		value = v;
		
	}
}