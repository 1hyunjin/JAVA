import java.util.Vector;
public class VectorPrac {

	public static void main(String[] args) {
		Vector<Integer> vt = new Vector<Integer>();
		vt.add(5);  //���� ��ü 5�� ������ �ȴ�. 
		vt.add(7);
		vt.add(1,6); //ù��° ��ġ�� 6�� �����Ѵ�.
		int sum = 0;
		
		//�� ���
		for(int i=0; i < vt.size(); i++) {
			System.out.println(vt.get(i));
		}
		//�� �� ã��
		for(int i=0; i < vt.size(); i++) {
			sum += vt.get(i);
		}
		System.out.println(sum);
		
		

	}

}		
		
	
