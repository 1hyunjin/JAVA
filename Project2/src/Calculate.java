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
		
		System.out.print("�� ������ �����ڸ� �Է��Ͻÿ�>>");
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
