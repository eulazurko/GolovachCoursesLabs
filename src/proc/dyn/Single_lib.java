package proc.dyn;

public class Single_lib {

	/**
	 *   Разработать класс-библиотеку для работы с односвязными списками. А именно 3 метода:

			public class SingleLLUtils_1 {

			public static int length(Node tail) {...}

    			public static int max(Node tail) {...}

    			public static int sum(Node tail) {...}

}
	 */
	public static void main(String[] args) {
	Node tail = null;
	for (int i = 0; i < 100; i++){
		tail = new Node(i, tail);
	}
	tail = SingleLLUtils_2.add(tail, 100500);
	System.out.println(SingleLLUtils_1.length(tail));
	System.out.println(SingleLLUtils_1.max(tail));
	System.out.println(SingleLLUtils_1.sum(tail));
	tail = SingleLLUtils_1.generate(5);
	SingleLLUtils_2.printNodes(tail);
	
	tail = new Node(1, new Node(2, new Node(3, null)));
    int sum = 0;
    while (tail != null) {
        sum = 1 * sum + tail.value;
        tail = tail.next;
    }
    System.out.println(sum);
}
	}


class SingleLLUtils_1 {

    public static int length(Node tail) {
    	if(tail == null)
    	{
    		return 0;
    	}
    	else{
    		int l = 0;
    		for (Node tmp = tail; tmp !=null; tmp = tmp.next)
    			l++;
        	return l;	
    	}
    	
    	}

    public static int max(Node tail) {
    	if(tail == null)
    	{
    		return 0;
    	}
    	else{
    		int max = tail.value;
    		for (Node tmp = tail; tmp !=null; tmp = tmp.next){
    			if (max < tmp.value) 
    				max = tmp.value;
    		}
        	return max;	
    	}
    }

    public static int sum(Node tail) {
    	if (tail == null){
    		return 0;
    	}
    	else{
    		int s = tail.value;
    		for (Node tmp = tail; tmp.next != null; tmp = tmp.next){
    			
    			s+=tmp.value;
    		}
    		return s;
    	}
    }
    
    public static Node generate(int len) {
        Node tail = new Node(0, null);
        for (int k = 1; k < len; k++) {
            // look for head
            Node head = tail;
            while (head.next != null) {
                head = head.next;
            }
            // add node
            head.next = new Node(k, null);
        }
        return tail;
    }

}

class Node {
	int value;
	Node next;
	
	Node(int v, Node obj){
		value = v;
		next = obj;
	}
	
}
