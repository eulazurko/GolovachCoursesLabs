package proc.dyn;

public class Single_lib2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Node tail = null;
		
		for (int i = 0; i < 10; i++){
			tail = new Node(i, tail);
		}
		
		
		System.out.println("ADD :" + '\n');
		tail = SingleLLUtils_2.add(tail, 100500);
		SingleLLUtils_2.printNodes(tail);
		
		System.out.println("REMOVE :" + '\n');
		tail = SingleLLUtils_2.remove(tail);
		SingleLLUtils_2.printNodes(tail);
		
		System.out.println("ADD POS:" + '\n');
		tail = SingleLLUtils_2.add(tail, 10, 100500);
		SingleLLUtils_2.printNodes(tail);
		
		System.out.println("REMOVE POS:" + '\n');
		tail = SingleLLUtils_2.remove(tail, 2);
		SingleLLUtils_2.printNodes(tail);
		
		
	}

}

class SingleLLUtils_2 {

    public static Node add(Node tail, int elem) {
    	
    	return tail = new Node(elem, tail);
    }

    public static Node remove(Node tail) {
    	if(tail == null){
    		return null;
    	} else{
    		return tail = tail.next;
    	}
    	
    	
    }

    public static Node add(Node tail, int index, int elem) {
    	Node tmp;
    	if (tail == null){
    		return tail = new Node(elem, tail);
    	}
    	
    	if (index == 0){
    		return tail = new Node(elem, tail);
    	}
    	
    	if (index > SingleLLUtils_1.length(tail)){
    		return tail;
    	}
    	
    	if (index == SingleLLUtils_1.length(tail)){
    		
    		for (tmp = tail; tmp != null; tmp = tmp.next){
    			if (tmp.next == null){
    				tmp.next = new Node(elem, null);
    				return tail;
    			}
    			
    		}
    		return tail;
    	}
    	
    	else{
    		int count = 0;
    		for (tmp = tail; tmp != null; tmp = tmp.next){
    			if (count == index - 1){
    				Node extra = tmp.next;
    				tmp.next = new Node(elem, extra);
    				return tail;
    			}
    			count++;
    		}
    		return tail;
    	}
    	
    }

    public static Node remove(Node tail, int index) {
    	Node tmp;
    	if (tail == null){
    		return tail;
    	}
    	
    	if (index == 0){
    		return tail = tail.next;
    	}
    	
    	if (index > SingleLLUtils_1.length(tail)-1){
    		return tail;
    	}
    	
    	if (index == SingleLLUtils_1.length(tail)-1){
    		
    		for (tmp = tail; tmp != null; tmp = tmp.next){
    			if (tmp.next.next == null){
    				tmp.next = null;
    				return tail;
    			}
    			
    		}
    		return tail;
    	}
    	
    	else{
    		int count = 0;
    		for (tmp = tail; tmp != null; tmp = tmp.next){
    			if (count == index - 1){
    				
    				tmp.next = tmp.next.next;
    				return tail;
    			}
    			count++;
    		}
    		return tmp;
    	}
    	
    }
    
    
    public static void printNodes(Node tail){
    	
    	for (Node tmp = tail; tmp != null; tmp = tmp.next){
    		System.out.print("("+ tmp.value + ") ");
    	}
    	System.out.println('\n');
    }

}

