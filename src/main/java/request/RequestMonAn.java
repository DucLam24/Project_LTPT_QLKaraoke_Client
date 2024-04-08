package request;

import java.io.DataOutputStream;
import java.net.Socket;

import service.OutputDOS;

public class RequestMonAn {
	private Socket socket;
	private DataOutputStream dos;

	public RequestMonAn(Socket socket) {
		this.socket = socket;
		dos = OutputDOS.getInstance().getDos();
	}
	
	public void requestFindMonAnByLoai(String loai) {
		try {

			dos.writeUTF("findMonAnByLoai");
			dos.writeUTF(loai);
			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
