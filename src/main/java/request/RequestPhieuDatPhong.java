package request;

import java.io.DataOutputStream;
import java.net.Socket;

import service.OutputDOS;

public class RequestPhieuDatPhong {
	private Socket socket;
	private DataOutputStream dos;

	public RequestPhieuDatPhong(Socket socket) {
		this.socket = socket;
		dos = OutputDOS.getInstance().getDos();
	}
	
	public void requestGetPDPByPhongIDAndTinhTrang(String id, int tinhTrang) {
		try {

			dos.writeUTF("getPDPByPhongIDAndTinhTrang");
			dos.writeUTF(id);
			dos.writeInt(tinhTrang);
			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
