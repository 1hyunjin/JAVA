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
//st.append("sd"); //³¡¿¡ ºÙÀÓ
//st.insert(2,"BC"); //Áß°£ »ðÀÔ
//System.out.println(st);
//

import java.until.Vector;

Vector<Integer> vi = new Vector<Integer>();
		vi.add(7);
		vi.add(9);
		for(int i=0; i< vi.size(); i++) {
			System.out.println(vi.get(i));
		}
		
