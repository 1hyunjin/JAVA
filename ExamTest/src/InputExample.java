import java.util.Scanner;
public class InputExample {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		int cnt = 0;
		while(true) {
			num = in.nextInt();
			if(num == -1) {
				break;
			}
			cnt++;
		}
		System.out.println("�Էµ� ������"+ cnt);
		in.close();
	}

}
