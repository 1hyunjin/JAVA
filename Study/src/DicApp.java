import java.util.Scanner;
public class DicApp extends Dictionary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�ѱ� �ܾ� �˻� ���α׷��Դϴ�.");
		String word;
		
		while(true) {
			System.out.print("�ѱ� �ܾ�?");
		
			word = in.next();
			if(word.equals("�׸�")) break;
			if("1" == kor2Eng(word)) {
				
			}
			else if("0" == kor2Eng(word)){
				System.out.println(word+ "�� �������� �����ϴ�.");
			}
		
		}
	}
}
