import java.util.HashMap;
import java.util.Scanner;
public class Hash {

	public static void main(String[] args) {
		
		HashMap<String, String >hm = new HashMap<String, String>();
		Scanner in = new Scanner(System.in);
		
		hm.put("apple", "���");
		hm.put("��","Flower");
		hm.put("����","English");
		String eng;
		
		while(true) {
			System.out.print("ã�� ���� �ܾ��?");
			eng = in.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			else if(hm.get(eng) == null){
				System.out.println(eng + "�� ���� �ܾ��Դϴ�.");
			}
			else
				System.out.println(hm.get(eng));
		}
			
	}

}
//��ġ�� �ٷ� ��� -> ó�� �ӵ��� �ѳ� ������
//�Ѱ� : �浹�� �ִ�. 
//���� 7.7 �غ���