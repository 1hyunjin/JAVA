import java.io.*;
import java.io.IOException;

public class FileStrream {
	public static void main(String[] args)  {
		FileInputStream fr = null;
		InputStreamReader fin = null;
		try {
			fr = new FileInputStream("c:\\hello.txt");
			fin = new InputStreamReader(fr,"MS949");
			int c; 
			while((c = fin.read()) != -1) {   // != end of file(=-1)
				System.out.print((char) c); //int -> char casting
			}
			fr.close();
			fin.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch(IOException e) {
			System.out.println(e);
		}	
	}
}
