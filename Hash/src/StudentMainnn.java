import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentMainnn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Student> st = new HashMap<String, Student>();
		Scanner in = new Scanner(System.in);
		String tmp;
		Student std;
		String []a=new String[4];
		System.out.println("�л� �̸�, �а�, �й�, ������� �Է��ϼ���.");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			tmp = in.nextLine();
			StringTokenizer tn = new StringTokenizer(tmp,", ");
			std = new Student(tn.nextToken(),tn.nextToken(),tn.nextToken(),tn.nextToken());
			a[i]=std.name;
			st.put(std.name,std);
		}
		for(int i=0; i<4; i++) {
			
			
			System.out.println("�̸� :" + st.get(a[i]).name);
			System.out.println("�а� :" + st.get(a[i]).department);
			System.out.println("�й� :" + st.get(a[i]).num);
			System.out.println("���� ��� :" + st.get(a[i]).average);
		}
		System.out.println("------------------------------");
		while(true) {
			System.out.print("�л��̸�>>");
			String s = in.next();
			if(s.equals("�׸�")) {
				break;
			}
			else {
				System.out.println(st.get(s).name+", "+st.get(s).department+", "+st.get(s).num+", "+st.get(s).average);	
			}
		}
	}

}
