
public class GStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GStack <String> st = new GStack<String>();
		st.push("abc");
		st.push("def");
		System.out.println(st.pop());
		System.out.println(st.pop());
	}

}
