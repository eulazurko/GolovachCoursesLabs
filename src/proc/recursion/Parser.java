package proc.recursion;

/*��� ������ ���������� � ������������� �� ���������������� ������� �������������� ���������.
    �� �����:
1) �������� ������ � ���� ������ - ������ ������ � ������� ����������� ������ 
(������:"(1+1)" -> "1+1", ������ "(1+(2/3))" -> "1+(2/3)");
2) �������� �����-����-XXX - ������ ������ � ������� XXX
(������:"1*(10-3)" -> "(10-3)", ������ "3+(2/(9+1))" -> "(2/(9+1)");

    �������: ���������� ���, ��� �� �� ������ ������ 2 ���� ����� 2'
2') �������� XXX-����-����� - ������ ������ � ������� XXX.
(������:"(10-3)*1" -> "(10-3)", ������ "(2/(9+1))+3" -> "(2/(9+1)");

    �������������� #1: ��� �� ����������� ������ �������������� ���������, ���� ��������� ����������
��������� �� ������� �� "������" ��� ��������� ����������� ("(1+1)+(1+1)", "-1", ...).

    �������������� #2: � �������� ������������ ���������, ��� ������ ��������� ���� �����-����-XXX
������ �� �����������.*/

public class Parser {

    public static void main(String[] args) {
        System.out.println(eval("123"));
        System.out.println(eval("(((((1+(2*3)-1)/2)*100)+100)*1/1*100+200)-1"));
        System.out.println(eval("2*(1+3)"));
        System.out.println(eval("((13/6)*2-5)+1"));

    }

    private static int eval(String expr) {
        return eval(expr, 0, expr.length()-1);
    }

    private static int eval(String expr, int from, int to) {
        if (expr.charAt(from) == '(' && expr.charAt(to) == ')' ) {
            return eval(expr, from + 1, to-1);
        }
        if (expr.charAt(from) == '(' && Character.isDigit(expr.charAt(to))){
        	int pos = to;
        	while (pos > from){
        		
        		if (Character.isDigit(expr.charAt(pos))) {
                    pos--;

        	
        		}
        		else {
                    int leftOperand = eval (expr, from, pos-1);
                    char operation = expr.charAt(pos);
                    int rightOperand = Integer.valueOf(expr.substring(pos + 1, to + 1));

                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expr.substring(from, to));	
        	
        }
        
         else {
            int pos = from;
            while (pos < to) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos++;
                } else {
                    int leftOperand = Integer.valueOf(expr.substring(from, pos));
                    char operation = expr.charAt(pos);
                    int rightOperand = eval(expr, pos + 1, to);
                    
                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }

            return Integer.valueOf(expr.substring(from, to+1));
        }
    }
}