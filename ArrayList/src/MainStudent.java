import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
public class MainStudent {


	
	public static void main(String[] args) {
		
		ArrayList<Student> st = new ArrayList<Student>();
		Scanner in = new Scanner(System.in);
		String tmp;
		Student std;
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			tmp = in.nextLine();
			
			StringTokenizer tn = new StringTokenizer(tmp,", ");
			std = new Student(tn.nextToken(),tn.nextToken(),tn.nextToken(),tn.nextToken());
			st.add(std);
				
		}
		for(int i=0; i<4; i++) {
			System.out.println("------------------------------");
			System.out.println("�̸� :" + st.get(i).name);
			System.out.println("�а� :" + st.get(i).department);
			System.out.println("�й� :" + st.get(i).num);
			System.out.println("���� ��� :" + st.get(i).average);
		}
		System.out.println("------------------------------");
		while(true) {
			System.out.print("�л� �̸�>>");
			String na = in.next();
			if(na.equals("�׸�")) {
				break;
			}
			else {
				for(int i=0;i<4;i++) {
					if(na.equals(st.get(i).name)) {
				System.out.println(st.get(i).name + ", " + st.get(i).department + ", " + st.get(i).num + ", " + st.get(i).average);
					}
				}
			}
		}	
	}
	
}
