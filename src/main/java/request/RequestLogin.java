package request;

import java.io.DataOutputStream;
import java.net.Socket;

import service.OutputDOS;

public class RequestLogin {
	private Socket socket;
	private DataOutputStream dos;

	public RequestLogin(Socket socket) {
		this.socket = socket;
		dos = OutputDOS.getInstance().getDos();
	}

	public void requestLogin(String username, String password) {
		try {

			dos.writeUTF("login");
			dos.writeUTF(username);
			dos.writeUTF(password);
			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
