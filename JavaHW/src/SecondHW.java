import java.util.Scanner;
import java.util.StringTokenizer;
public class SecondHW {

	public static void main(String[] args) {
		String s; 
		Scanner in = new Scanner(System.in);
		
		int cnt = 0;
		for(;;) {
		System.out.print(">>");
		s = in.nextLine();
		if(s.equals("�׸�")){
			System.out.println("�����մϴ�...");
			break;
		}
		StringTokenizer st = new StringTokenizer(s, " ");
		while(st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}
		System.out.println("���� ������"+ cnt);
		cnt= 0;
	}
	}

}
