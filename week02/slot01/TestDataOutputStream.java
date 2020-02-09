package week02.slot01;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(DataOutputStream output =
				new DataOutputStream(
				new FileOutputStream("temp.dat"))) {
			output.writeUTF("Jailani");
			output.writeDouble(85.5);
			output.writeUTF("Abdul");
			output.writeDouble(70.3);
			output.writeUTF("Rahman");
			output.writeDouble(67.7);
			
//			output.writeShort(50);
//			output.writeInt(100);
		}
	}
	
}
