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
		if(s.equals("그만")){
			System.out.println("종료합니다...");
			break;
		}
		StringTokenizer st = new StringTokenizer(s, " ");
		while(st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}
		System.out.println("어절 개수는"+ cnt);
		cnt= 0;
	}
	}

}
