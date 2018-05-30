
public class GStackMain {

	public static void main(String[] args) {
		
		GStack<String> gt = new GStack<String>();
		gt.push("abc");
		gt.push("efg");
		gt.push("hij");
		
		GStackPrint gp = new GStackPrint();
		gp.PrintStack(gt);
	}

}
