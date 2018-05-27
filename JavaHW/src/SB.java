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
			
			System.out.print("명령:");
			s = in.nextLine();
			if(s.equals("그만")) {
				System.out.println("종료합니다");
				break;
			}
			StringTokenizer st = new StringTokenizer(s,"!");
			tmp = st.nextToken();
			if(tmp.equals(" ")) {
				System.out.println("잘못된 명령입니다!");
				continue;
			}
			id = sb.indexOf(tmp);
			if(id < 0) {
				System.out.println("찾을 수 없습니다!");
				continue;
			}
			sb.replace(id, id+tmp.length(), st.nextToken());
			System.out.println(sb);
			 
		}
		
		
	}

}
