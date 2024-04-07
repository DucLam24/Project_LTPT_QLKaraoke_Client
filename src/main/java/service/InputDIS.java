package service;

import java.io.DataInputStream;
import java.net.Socket;

public class InputDIS {
	private static InputDIS instance;
	private DataInputStream dis;

	public static InputDIS getInstance() {
		if (instance == null) {
			instance = new InputDIS();
		}
		return instance;
	}

	private InputDIS() {

	}

	public void start(Socket socket) {
		try {
			dis = new DataInputStream(socket.getInputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DataInputStream getDis() {
		return dis;
	}
}
