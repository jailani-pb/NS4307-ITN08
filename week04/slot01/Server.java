package week04.slot01;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = 
				new ServerSocket(9001);
		System.out.println("Server able to run");
		
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println("A client has connected.");
			
			new Thread(new Runnable() {

				@Override
				public void run() {
					DataInputStream fromClient;
					try {
						fromClient = new
								DataInputStream(socket.getInputStream());
					
						while(true) {
							String receivedData =
									fromClient.readUTF();
							if(receivedData.equalsIgnoreCase("q")) {
								System.out.println("Close server request.");
								break;
							} else {
								System.out.println("Received: " + receivedData);
							}
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}).start();
		}
		
//		int count = 0;
//		Socket socket = null;
//		while(true) {
//			socket = serverSocket.accept();
//			System.out.println("A client has connected.");
//			count++;
//			if(count >= 100) {
//				System.out.println("101 clients has connected");
//				break;
//			}
//		}
	}
	
}
