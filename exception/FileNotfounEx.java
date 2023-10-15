package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotfounEx {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\OneSoft Technologies\\Documents\\HelloWrd.txt");
		FileReader fr = new FileReader(f);
		int temp = 0; 
		while((temp = fr.read()) != -1) {
			System.out.println((char)(temp));
		}
	}

}
