package reponse;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

import entity.ChiTietDatMon;
import service.InputOIS;

public class ResponseChiTietDatMon {
	private Socket socket;
	public ObjectInputStream ois;
	public DataInputStream dis;

	public ResponseChiTietDatMon(Socket socket) {
		this.socket = socket;
		ois = InputOIS.getInstance().getOis();

	}
	
	public List<ChiTietDatMon> getReponseGetByPhieuDatMonID() {
		try {
			List<ChiTietDatMon> chiTietDatMon = (List<ChiTietDatMon>) ois.readObject();
			return chiTietDatMon;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
