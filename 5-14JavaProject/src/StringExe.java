import java.util.Scanner;
public class StringExe {

	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		Scanner in = new Scanner(System.in);
		String s = new String();
		s = in.nextLine();
		
		for(int i=1; i<=s.length(); i++) {
			System.out.print(s.substring(i));
			System.out.println(s.substring(0, i));
		
		}	
	}
}
