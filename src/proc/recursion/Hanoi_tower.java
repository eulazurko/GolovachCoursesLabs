package proc.recursion;
import java.util.Stack;

	/*Проставьте правильные аргументы методов в рекурсивных вызовах exchange. 
	Итоговый код должен корректно решать задачу о Ханойской башне.*/

	public class Hanoi_tower {

	    public static void main(String[] args) {
	        Stack<Integer> from = new Stack<>();
	        Stack<Integer> help = new Stack<>();
	        Stack<Integer> to = new Stack<>();

	        from.push(2);
	        from.push(1);

	        exchange(from, help, to, from.size());

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
