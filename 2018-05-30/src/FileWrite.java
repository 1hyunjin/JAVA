import java.io.*;

public class FileWrite {

	public static void main(String[] args) {
		//FileWriter fw =null;
		FileOutputStream fw = null; //bite
		byte b[] = {1,2};
		try {
			//fw = new FileWriter("c:\\t2.txt");
			fw = new FileOutputStream("c:\\t2.txt");
			//fw.write("abc\r\n");
			//fw.write("def");
			
			fw.write((byte)2);
			fw.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
