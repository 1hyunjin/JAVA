import java.util.Scanner;
public class DicApp extends Dictionary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("한글 단어 검색 프로그램입니다.");
		String word;
		
		while(true) {
			System.out.print("한글 단어?");
		
			word = in.next();
			if(word.equals("그만")) break;
			if("1" == kor2Eng(word)) {
				
			}
			else if("0" == kor2Eng(word)){
				System.out.println(word+ "는 제사전에 없습니다.");
			}
		
		}
	}
}
