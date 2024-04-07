package service;

import java.net.Socket;

public class Service {
	private static Service instance;
	private Socket socket;
	public  final int NUMBER_PORT = 9999;
	public final String SERVER_IP = "localhost";
	
	public static Service getInstance() {
		if (instance == null) {
			instance = new Service();
		}
		return instance;
	}
	
	private Service() {
		
	}
	
	public void start() {
		try {
            socket = new Socket(SERVER_IP, NUMBER_PORT);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
	}

	public void close() {
		try {
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Socket getSocket() {
		return socket;
	}
}
