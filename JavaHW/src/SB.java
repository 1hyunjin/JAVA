import java.util.Scanner;
import java.util.StringTokenizer;
public class SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print(">>");
		int id;
		String tmp;
		String s;
		StringBuffer sb = new StringBuffer(in.nextLine());
		for(;;) {
			
			System.out.print("���:");
			s = in.nextLine();
			if(s.equals("�׸�")) {
				System.out.println("�����մϴ�");
				break;
			}
			StringTokenizer st = new StringTokenizer(s,"!");
			tmp = st.nextToken();
			if(tmp.equals(" ")) {
				System.out.println("�߸��� ����Դϴ�!");
				continue;
			}
			id = sb.indexOf(tmp);
			if(id < 0) {
				System.out.println("ã�� �� �����ϴ�!");
				continue;
			}
			sb.replace(id, id+tmp.length(), st.nextToken());
			System.out.println(sb);
			 
		}
		
		
	}

}
