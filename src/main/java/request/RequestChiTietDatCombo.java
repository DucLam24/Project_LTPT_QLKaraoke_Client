package request;

import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import entity.ChiTietDatCombo;
import service.OutputDOS;
import service.OutputOOS;

public class RequestChiTietDatCombo {
	private Socket socket;
	private DataOutputStream dos;
	private ObjectOutputStream oos;

	public RequestChiTietDatCombo(Socket socket) {
		this.socket = socket;
		dos = OutputDOS.getInstance().getDos();
		oos= OutputOOS.getInstance().getOos();
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
	
	public void requestUpdateSoLuong(ChiTietDatCombo chiTietDatCombo) {
		try {
			dos.writeUTF("ChiTietDatCombo.updateSoLuong");
			oos.writeObject(chiTietDatCombo);
			dos.flush();
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void requestAddCombo(ChiTietDatCombo chiTietDatCombo) {
		try {
			dos.writeUTF("ChiTietDatCombo.addCombo");
			oos.writeObject(chiTietDatCombo);
			dos.flush();
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
