import java.util.StringTokenizer;
public class Practice {

	public static void main(String[] args) {
	
		
		String s = "A BCD E FGD FG F";
		StringTokenizer st = new StringTokenizer(s, " ");
		int cnt = 0;
		while(st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}
		System.out.println(cnt);
		
		
		
		

	}

}
//String s = "A BCD E FGD, FG F";
//int cnt = 0;
//for(int i=0; i<s.length(); i++) {
//	if(s.charAt(i)==' ');
//	cnt++;
//}
//System.out.println(cnt);
//


//StringBuffer st = new StringBuffer("ASDV"); 
//st.append("sd"); //끝에 붙임
//st.insert(2,"BC"); //중간 삽입
//System.out.println(st);
//	