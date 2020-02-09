package week02.slot01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileInputStream input = 
				new FileInputStream("test.dat")) {
			int value;
			while((value = input.read()) != -1) {
				System.out.print(value + " ");
			}
		}
	}
	
}
