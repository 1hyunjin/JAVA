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
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			tmp = in.nextLine();
			StringTokenizer tn = new StringTokenizer(tmp,", ");
			std = new Student(tn.nextToken(),tn.nextToken(),tn.nextToken(),tn.nextToken());
			a[i]=std.name;
			st.put(std.name,std);
		}
		for(int i=0; i<4; i++) {
			
			
			System.out.println("이름 :" + st.get(a[i]).name);
			System.out.println("학과 :" + st.get(a[i]).department);
			System.out.println("학번 :" + st.get(a[i]).num);
			System.out.println("학점 평균 :" + st.get(a[i]).average);
		}
		System.out.println("------------------------------");
		while(true) {
			System.out.print("학생이름>>");
			String s = in.next();
			if(s.equals("그만")) {
				break;
			}
			else {
				System.out.println(st.get(s).name+", "+st.get(s).department+", "+st.get(s).num+", "+st.get(s).average);	
			}
		}
	}

}
