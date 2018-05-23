import java.util.HashMap;
import java.util.Scanner;
public class Hash {

	public static void main(String[] args) {
		
		HashMap<String, String >hm = new HashMap<String, String>();
		Scanner in = new Scanner(System.in);
		
		hm.put("apple", "사과");
		hm.put("꽃","Flower");
		hm.put("영어","English");
		String eng;
		
		while(true) {
			System.out.print("찾고 싶은 단어는?");
			eng = in.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			else if(hm.get(eng) == null){
				System.out.println(eng + "은 없는 단어입니다.");
			}
			else
				System.out.println(hm.get(eng));
		}
			
	}

}
//위치를 바로 계산 -> 처리 속도가 넘나 빠르당
//한계 : 충돌이 있다. 
//예제 7.7 해보깅