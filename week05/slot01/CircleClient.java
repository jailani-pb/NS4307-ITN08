package week05.slot01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CircleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 9001);
		System.out.println("Connected to server.");
		
		DataOutputStream toServer = 
				new DataOutputStream(socket.getOutputStream());
		DataInputStream fromServer =
				new DataInputStream(socket.getInputStream());
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please type radius value:"
					+ " Value less than or"
					+ " equal to 0 will disconnect.");
			String radiusInput = scanner.nextLine();
			
			try {
				double radius = Double.parseDouble(radiusInput);
				toServer.writeDouble(radius);
				
				if(radius <= 0) {
					System.out.println("Disconnect from server.");
					break;
				}
				
				double area = fromServer.readDouble();
				System.out.println("Sent radius: " + radius 
						+ ", Received area: " + area);
			} catch (NumberFormatException e) {
				System.out.println("Input is invalid.");
			}
		}
	}
	
}
