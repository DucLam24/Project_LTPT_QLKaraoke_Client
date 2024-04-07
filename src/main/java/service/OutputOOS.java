package service;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class OutputOOS {
	private static OutputOOS instance;
	private ObjectOutputStream oos;

	public static OutputOOS getInstance() {
		if (instance == null) {
			instance = new OutputOOS();
		}
		return instance;
	}

	private OutputOOS() {

	}

	public void start(Socket socket) {
		try {
			oos = new ObjectOutputStream(socket.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ObjectOutputStream getOos() {
		return oos;
	}
}
