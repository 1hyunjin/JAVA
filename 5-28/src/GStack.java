
public class GStack<T> {
	int top;
	Object[] stk;
	
	public GStack() {
		
		stk  = new Object[10]; //stack을 문자배열으로. 
		top = 0; //초기화 
	}
	public void push(T element) {
		
		stk[top] = element;
		top++;
	}
	public T pop() {
		
		top--;
		return (T) stk[top];
	}
		
}
