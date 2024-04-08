package request;

import java.io.DataOutputStream;
import java.net.Socket;

import service.OutputDOS;

public class RequestCombo {
	private Socket socket;
	private DataOutputStream dos;

	public RequestCombo(Socket socket) {
		this.socket = socket;
		dos = OutputDOS.getInstance().getDos();
	}
	
	public void requestGetAllCombo() {
		try {

			dos.writeUTF("getAllCombo");
			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
