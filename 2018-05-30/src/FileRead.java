//Read a C's text File
import java.io.*;

public class FileRead {

	public static void main(String[] args)  {
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\hello.txt");
			int c; 
			while((c = fr.read()) != -1) {   // != end of file(=-1)
				System.out.print((char) c); //int -> char casting
			}
			fr.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}	
	}
}
