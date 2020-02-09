package week05.slot02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ChatSessionHandler implements Runnable {
	// 192.168.1.111 --> 9001
	private Socket client1;
	private Socket client2;
	
	public ChatSessionHandler(Socket client1, Socket client2) {
		this.client1 = client1;
		this.client2 = client2;
	}
	
	@Override
	public void run() {
		try {
			DataInputStream fromClient1 = 
					new DataInputStream(client1.getInputStream());
			DataOutputStream toClient1 =
					new DataOutputStream(client1.getOutputStream());
			DataInputStream fromClient2 = 
					new DataInputStream(client2.getInputStream());
			DataOutputStream toClient2 =
					new DataOutputStream(client2.getOutputStream());
			
			while(true) {
				if(fromClient1.available() > 0) {					
					String client1Msg = fromClient1.readUTF();
					toClient2.writeUTF(client1Msg);
					System.out.println("Client1 to Client2: " 
							+ client1Msg);
				}
				if(fromClient2.available() > 0) {
					String client2Msg = fromClient2.readUTF();
					toClient1.writeUTF(client2Msg);
					System.out.println("Client2 to Client1: " 
							+ client2Msg);	
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
