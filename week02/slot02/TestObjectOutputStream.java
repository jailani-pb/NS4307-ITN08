package week02.slot02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(
			ObjectOutputStream output = new ObjectOutputStream(
					new FileOutputStream("object.dat"))	
				) {
			output.writeInt(100);
			output.writeBoolean(true);
			output.writeObject(new Student(1, "Jailani"));
			output.writeObject(new Student(2, "Rahman"));
		}
	}
	
}
