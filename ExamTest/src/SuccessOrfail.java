import java.util.Scanner;
public class SuccessOrfail {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�:");
		int score = in.nextInt();
		if(score >= 80) {
			System.out.println("�����մϴ�!");
		}
		else
			System.out.println("���հ��Դϴ�!");
		in.close();
	}

}
