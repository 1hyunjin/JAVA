
public class GStackPrint<T> {

	public <T> void PrintStack( GStack<T> st1 ){
		int tmp = st1.top;
		for(int i=0; i< tmp; i++) {
			System.out.println(st1.pop());
		}
	}

}
