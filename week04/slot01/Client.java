package week04.slot01;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = 
				new Socket("localhost", 9001);
		System.out.println("Connected to the server");
		Scanner scanner = new Scanner(System.in);
		
		DataOutputStream toServer = new
				DataOutputStream(socket.getOutputStream());
		
		while(true) {
			System.out.println("Type to send data:");
			String sendData = scanner.nextLine();
			
			toServer.writeUTF(sendData);
			if(sendData.equalsIgnoreCase("q")) {
				System.out.println("Closing client.");
				break;
			} else {
				System.out.println("Sent: " + sendData);
			}
		}
		
		scanner.close();
		socket.close();
	}
	
}
