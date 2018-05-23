//문자열 제일 긴거 출력하기.

import java.util.Vector;
import java.util.Iterator;
import java.util.Scanner;
public class VectorString {
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vt = new Vector<String>();
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<4; i++) {
			vt.add(in.nextLine());
		}
		Iterator<String> it = vt.iterator();
		String max = vt.get(0);
		String temp;
		while(it.hasNext()) {
			temp = it.next();
			if(max.length() < temp.length() ) {
				max =  temp;
			}
		}
		System.out.println(max);
		
		
	}

}
