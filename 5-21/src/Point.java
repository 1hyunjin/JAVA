//String  ��ü�� vector�ȿ� �ִ� �ڵ�
import java.util.Vector;
public class Point {
	
	int x,y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public String toString() {
		return("(" + x + "," + y + ")");
	}
	
	public static void main(String[] args) {
//		Vector<Point> vt = new Vector<Point>();
//		Point pt = new Point(3,4);
//		vt.add(pt);
//		vt.add(new Point(2,3));
//		vt.add(new Point(4,5));
//		vt.add(new Point(3,4));
//		
//		for(int i=0; i<vt.size(); i++) {
//			System.out.println(vt.get(i).toString());
//		}
		Point[] arr = new Point[5]; //�迭�� Point ��ü �����.���� Vector�� ���� ����ϱ�.
		arr[0] = new Point(2,3);
		arr[1] = new Point(4,5);
		arr[2] = new Point(3,4);
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].toString());
		}
	}
}
