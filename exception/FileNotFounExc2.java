package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFounExc2 {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\OneSoft Technologies\\Documents\\HelloWrd.txt");
		FileReader fr = null;
		try {
			fr = new FileReader(f);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int temp = 0; 
		try {
			while((temp = fr.read()) != -1) {
				System.out.println((char)(temp));
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
