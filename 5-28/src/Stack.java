
public class Stack {
	
	int top; //��� ����
	String[]st;//type ����. 
	
	public Stack() {
		
		st  = new String[10]; //stack�� ���ڹ迭����. 
		top = 0; //�ʱ�ȭ 
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
