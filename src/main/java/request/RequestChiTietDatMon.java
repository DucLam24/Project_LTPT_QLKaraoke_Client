package request;

import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import entity.ChiTietDatMon;
import service.OutputDOS;
import service.OutputOOS;

public class RequestChiTietDatMon {
	private Socket socket;
	private DataOutputStream dos;
	private ObjectOutputStream oos;

	public RequestChiTietDatMon(Socket socket) {
		this.socket = socket;
		dos = OutputDOS.getInstance().getDos();
		oos= OutputOOS.getInstance().getOos();
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

	public void requestUpdateSoLuong(ChiTietDatMon chiTietDatMon) {
		try {
			dos.writeUTF("ChiTietDatMon.updateSoLuong");
			oos.writeObject(chiTietDatMon);
			dos.flush();
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void requestAddMonAn(ChiTietDatMon chiTietDatMon) {
		try {
			dos.writeUTF("ChiTietDatMon.addMonAn");
			oos.writeObject(chiTietDatMon);
			dos.flush();
			oos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
