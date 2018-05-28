
public class Stack2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stk = new Stack();
		stk.push("asd");
		stk.push("efg");
		
		Stack2 rs = new Stack2();
		Stack stk1;
		stk1 = rs.move(stk);
		System.out.println(stk1.pop());
		System.out.println(stk1.pop());
	}

}
