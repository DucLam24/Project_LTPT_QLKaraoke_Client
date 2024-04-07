package reponse;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

import entity.Phong;
import service.InputDIS;
import service.InputOIS;

public class ResponsePhong {
	private Socket socket;
	public ObjectInputStream ois;
	public DataInputStream dis;

	public ResponsePhong(Socket socket) {
		this.socket = socket;
		ois = InputOIS.getInstance().getOis();
		dis = InputDIS.getInstance().getDis();
	}
	public List<Phong> getResponseGetAllPhong() {
		try {
			List<Phong> listPhong = (List<Phong>) ois.readObject();
			return listPhong;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<Phong> getRespaonseGetPhongByTinhTrang() {
		try {
			List<Phong> listPhong = (List<Phong>) ois.readObject();
			return listPhong;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}	
}
