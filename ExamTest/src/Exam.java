import java.util.Scanner;
public class Exam {
	public static int sum(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int b;
		int c;
		int s;
		b = a.nextInt();
		c = a.nextInt();
		s = sum(b,c);
		System.out.println(s);
		a.close();
	}
	
}
