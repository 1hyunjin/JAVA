
public class Stack2 {
	
	public Stack move(Stack st1) {
		Stack st2 = new Stack();
		st2.push(st1.pop());
		st2.push(st1.pop());
		
		return st2; //stack reverse วั stack = st2.
		
	}
}
