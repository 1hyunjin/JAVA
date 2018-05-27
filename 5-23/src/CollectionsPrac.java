import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class CollectionsPrac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<String> vt = new LinkedList<String>();
		vt.add("아기");
		vt.add("꽃");
		vt.add("영어");
		//Collections.reverse(vt); //sort = 정렬.
		
		
		for(int i=0; i< vt.size(); i++) {
			System.out.println(vt.get(i));
		}
		System.out.println(Collections.max(vt));

	}

}
