import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class CollectionsPrac {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		LinkedList<String> vt = new LinkedList<String>();
		vt.add("�Ʊ�");
		vt.add("��");
		vt.add("����");
		//Collections.reverse(vt); //sort = ����.
		
		
		for(int i=0; i< vt.size(); i++) {
			System.out.println(vt.get(i));
		}
		System.out.println(Collections.max(vt));

	}

}
