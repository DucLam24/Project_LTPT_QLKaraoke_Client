package request;

import java.io.DataOutputStream;
import java.net.Socket;

import service.OutputDOS;

public class RequestChiTietDatMon {
	private Socket socket;
	private DataOutputStream dos;

	public RequestChiTietDatMon(Socket socket) {
		this.socket = socket;
		dos = OutputDOS.getInstance().getDos();
	}
	
	public void requestGetByPhieuDatMonID(String phieuDatMonID) {
		try {

			dos.writeUTF("MonAn.getByPhieuDatMonID");
			dos.writeUTF(phieuDatMonID);
			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
