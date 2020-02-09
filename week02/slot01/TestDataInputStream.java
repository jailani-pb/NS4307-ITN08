package week02.slot01;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestDataInputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(DataInputStream input =
				new DataInputStream(
				new FileInputStream("temp.dat"))) {
			while(true) {
				System.out.println(input.readUTF());
				System.out.println(input.readDouble());
			}
		} catch (EOFException e) {
			System.out.println("End of File");
		}
	}
	
}
