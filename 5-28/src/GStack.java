
public class GStack<T> {
	int top;
	Object[] stk;
	
	public GStack() {
		
		stk  = new Object[10]; //stack�� ���ڹ迭����. 
		top = 0; //�ʱ�ȭ 
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
