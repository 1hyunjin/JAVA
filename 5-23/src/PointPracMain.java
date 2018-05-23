import java.util.Iterator;
import java.util.Vector;
public class PointPracMain {
	
	
	public static void PrintPointPrac(Vector<PointPrac> vt) {
		
		for(int i=0; i< vt.size(); i++) {
			System.out.println(vt.get(i).toString());
		}
	}

	
	
	public static void main(String[] args) {
		//Iterator
		Vector<Integer> vt = new Vector<Integer>();
		vt.add(2);
		vt.add(3);
		vt.add(4);
		
		Iterator<Integer> it = vt.iterator();
		while(it.hasNext()) { //다음 객체가 있는지 없는지 확인하는 것 = hasNext
			System.out.println(it.next());
		}
		
		
//		Vector<PointPrac> vt = new Vector<PointPrac>();
//		vt.add(new PointPrac(2,3));
//		vt.add(new PointPrac(4,5));
//		vt.add(new PointPrac(3,4));
//		
//		PrintPointPrac(vt);
		
		
	}

}
