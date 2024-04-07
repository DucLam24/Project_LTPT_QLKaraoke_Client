package service;

import java.io.DataOutputStream;
import java.net.Socket;

public class OutputDOS {
	private static OutputDOS instance;
	private DataOutputStream dos;

	public static OutputDOS getInstance() {
		if (instance == null) {
			instance = new OutputDOS();
		}
		return instance;
	}

	private OutputDOS() {

	}

	public void start(Socket socket) {
		try {
			dos = new DataOutputStream(socket.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public DataOutputStream getDos() {
		return dos;
	}
}
