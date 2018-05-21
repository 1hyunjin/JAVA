import java.util.Vector;
public class VectorPrac {

	public static void main(String[] args) {
		Vector<Integer> vt = new Vector<Integer>();
		vt.add(5);  //정수 객체 5가 저장이 된다. 
		vt.add(7);
		vt.add(1,6); //첫번째 위치에 6을 삽입한다.
		int sum = 0;
		
		//값 출력
		for(int i=0; i < vt.size(); i++) {
			System.out.println(vt.get(i));
		}
		//갑 합 찾기
		for(int i=0; i < vt.size(); i++) {
			sum += vt.get(i);
		}
		System.out.println(sum);
		
		

	}

}		
		
	
