package reponse;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

import entity.MonAn;
import service.InputOIS;

public class ResponseMonAn {
	private Socket socket;
	public ObjectInputStream ois;
	public DataInputStream dis;

	public ResponseMonAn(Socket socket) {
		this.socket = socket;
		ois = InputOIS.getInstance().getOis();

	}
	
	public List<MonAn> getReponseFindMonAnByLoai() {
		try {
			List<MonAn> monAn = (List<MonAn>) ois.readObject();
			return monAn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
