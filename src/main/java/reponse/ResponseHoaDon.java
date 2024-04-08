package reponse;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

import entity.HoaDon;
import service.InputOIS;

public class ResponseHoaDon {
	private Socket socket;
	public ObjectInputStream ois;
	public DataInputStream dis;

	public ResponseHoaDon(Socket socket) {
		this.socket = socket;
		ois = InputOIS.getInstance().getOis();

	}
	
	public List<HoaDon> getReponseGetHoaDonByPhongIDAndTinhTrang() {
		try {
			List<HoaDon> hoaDon = (List<HoaDon>) ois.readObject();
			return hoaDon;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
