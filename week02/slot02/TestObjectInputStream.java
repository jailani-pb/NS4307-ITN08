package week02.slot02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(
			ObjectInputStream input = new ObjectInputStream(
					new FileInputStream("object.dat"))
				) {
			System.out.println(input.readInt());
			System.out.println(input.readBoolean());
			Student student = (Student) input.readObject();
			System.out.println(student.id + " " + student.name);
			Student student2 = (Student) input.readObject();
			System.out.println(student2.id + " " + student2.name);
		}
	}
	
}
