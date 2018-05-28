
public class GStack2 {

	public <T> GStack<T> move(GStack<T> st1) {
		GStack <T> st2 = new GStack<T>();
		st2.push(st1.pop());
		st2.push(st1.pop());
		
		return st2; //stack reverse วั stack = st2.
		
	}
	
	
	
	
}
