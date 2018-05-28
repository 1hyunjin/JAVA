
public class Stack {
	
	int top; //멤버 변수
	String[]st;//type 선언. 
	
	public Stack() {
		
		st  = new String[10]; //stack을 문자배열으로. 
		top = 0; //초기화 
	}
	public void push(String element) {
		
		st[top] = element;
		top++;
	}
	public String pop() {
		
		top--;
		return st[top];
	}
}
