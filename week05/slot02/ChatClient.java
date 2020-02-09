package week05.slot02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ChatClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost", 9001);
			System.out.println("Connected to the server.");
			
			DataInputStream fromServer =
					new DataInputStream(socket.getInputStream());
			DataOutputStream toServer =
					new DataOutputStream(socket.getOutputStream());
			
			Scanner scanner = new Scanner(System.in);
			
			new Thread(new Runnable() {
				public void run() {
					while(true) {
						try {
							String receivedMsg = fromServer.readUTF();
							System.out.println(">>> " + receivedMsg);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
			
			while(true) {
				String msg = scanner.nextLine();
				toServer.writeUTF(msg);
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
