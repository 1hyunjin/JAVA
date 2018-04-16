import java.util.Scanner;
public class Sample {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] unit= {50000,10000,1000,500,100,50,10,1};
		int money;
		int n;
		System.out.print("돈의 액수 입력:");
		money = in.nextInt();
		for( int i=0; i < unit.length; i++) {
			if(money >= unit[i]) {
				n = money/unit[i];
				System.out.println(unit[i] + "원: " + n + "개");
				money -= n*unit[i];
			}
		}
		in.close();
	}
}
