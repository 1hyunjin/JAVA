

//import java.util.Scanner;
public class LaLa {
	
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		String arr[] = {"1","2","3","4","5"};
		int sum = 0;
		try {
			for(int i=0; i<arr.length; i++) {
				sum = sum+ Integer.parseInt(arr[i]);
			}
		}
		catch(NumberFormatException e) {
			System.out.println("������ �ٲ� �� �����ϴ�.");
		}
		System.out.println(sum);
		//in.close();
	}
}
