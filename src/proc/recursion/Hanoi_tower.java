package proc.recursion;
import java.util.Stack;

	

	public class Hanoi_tower {

	    public static void main(String[] args) {
	        Stack<Integer> from = new Stack<>();
	        Stack<Integer> help = new Stack<>();
	        Stack<Integer> to = new Stack<>();
	        //from.push(3);
	        from.push(2);
	        from.push(1);
	        System.out.println(from.toString());
	        exchange(from, help, to, from.size());
	        System.out.println("FROM "+from.toString());
	        System.out.println("HELP "+help.toString());
	        System.out.println("TO "+to.toString());
	    }

	    public static void exchange(Stack<Integer> from, Stack<Integer> help, Stack<Integer> to, int count) {
	        if (count > 0) {
	        	System.out.println("Level " + count);
	            exchange(from, to, help, --count);
	            int biggest = from.pop();
	            to.push(biggest);
	            exchange(help, from, to, count--);
	        }
	    }
	}