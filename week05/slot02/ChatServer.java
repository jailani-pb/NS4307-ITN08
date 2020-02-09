package week05.slot02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9001);
			System.out.println("Server is running.");
			
			while(true) {
				Socket client1 = serverSocket.accept();
				System.out.println("Client1 has connected");
				Socket client2 = serverSocket.accept();
				System.out.println("Client2 has connected");
				
				new Thread(
						new ChatSessionHandler(client1, client2))
						.start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
