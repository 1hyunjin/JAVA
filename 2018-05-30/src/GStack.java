
public class GStack<T> {
	int top;
	Object [] st;
	
	public GStack() {
		top = 0;
		st = new Object[10];
	}
	public void push( T element ) {
		st[top] = element;
		top++;
		//no return.		
	}
	public T pop() {
		top--;
		return (T) st[top];  //casting
	}
	
}
