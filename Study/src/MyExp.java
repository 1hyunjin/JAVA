public class MyExp{
	int base;
	int exp;
	
	public MyExp(int b, int e) {
		base = b;
		exp = e;
	}
	public int getValue() {
		int mul = 1;
		for(int i=1; i<= exp; i++) {
			 mul = mul*base;
		}
		return mul;
	}
}
