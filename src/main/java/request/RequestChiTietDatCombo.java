package request;

import java.io.DataOutputStream;
import java.net.Socket;

import service.OutputDOS;

public class RequestChiTietDatCombo {
	private Socket socket;
	private DataOutputStream dos;

	public RequestChiTietDatCombo(Socket socket) {
		this.socket = socket;
		dos = OutputDOS.getInstance().getDos();
	}
	
	public void requestGetByPhieuDatMonID(String phieuDatMonID) {
		try {

			dos.writeUTF("Combo.getByPhieuDatMonID");
			dos.writeUTF(phieuDatMonID);
			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
