import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int b;
		char ch;
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		System.out.print("두 정수와 연산자를 입력하시오>>");
		a = in.nextInt();
		b = in.nextInt();
		ch = in.next().charAt(0);
		 switch(ch){
		 
	            case '+' :
	            {
	                add.setValue(a, b);
	                System.out.println(add.calculate());
	                break;
	            }
	                    
	            case '-' :
	            {
	                sub.setValue(a, b);
	                System.out.println(sub.calculate());
	                break;
	            }
	            
	            case '*' :
	            {
	                mul.setValue(a, b);
	                System.out.println(mul.calculate());
	                break;
	            }
	            case '/' :
	            {
	                div.setValue(a, b);
	                System.out.println(div.calculate());
	                break;
	            }
	        }
		in.close();
	}

}
