package reponse;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

import entity.ChiTietDatCombo;
import service.InputOIS;

public class ResponseChiTietDatCombo {
	private Socket socket;
	public ObjectInputStream ois;
	public DataInputStream dis;

	public ResponseChiTietDatCombo(Socket socket) {
		this.socket = socket;
		ois = InputOIS.getInstance().getOis();

	}
	
	public List<ChiTietDatCombo> getReponseGetByPhieuDatMonID() {
		try {
			List<ChiTietDatCombo> chiTietDatCombo = (List<ChiTietDatCombo>) ois.readObject();
			return chiTietDatCombo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
