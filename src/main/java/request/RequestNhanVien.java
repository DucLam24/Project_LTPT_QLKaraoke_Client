package request;

import java.io.DataOutputStream;
import java.net.Socket;

import service.OutputDOS;

public class RequestNhanVien {
	private Socket socket;
	private DataOutputStream dos;

	public RequestNhanVien(Socket socket) {
		this.socket = socket;
		dos = OutputDOS.getInstance().getDos();
	}
	
	public void requestGetAllNhanVien() {
		try {

			dos.writeUTF("getAllNhanVien");
			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void requestGetNhanVienById(String id) {
		try {

			dos.writeUTF("getNhanVienById");
			dos.writeUTF(id);
			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
