package request;

import java.io.DataOutputStream;
import java.net.Socket;

import service.OutputDOS;

public class RequestHoaDon {
	private Socket socket;
	private DataOutputStream dos;

	public RequestHoaDon(Socket socket) {
		this.socket = socket;
		dos = OutputDOS.getInstance().getDos();
	}
	
	public void requestGetHoaDonByPhongIDAndTinhTrang(String phongID, boolean tinhTrang) {
		try {

			dos.writeUTF("getHoaDonByPhongIDAndTinhTrang");
			dos.writeUTF(phongID);
			dos.writeBoolean(tinhTrang);
			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
