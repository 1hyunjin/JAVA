import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.println(">>");
		rect.width = in.nextInt();
		rect.height = in.nextInt();
		
		System.out.println("사각형의 면적은" + rect.getArea());
		
		in.close();
		
	}

}









