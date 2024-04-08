package reponse;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

import entity.Combo;
import service.InputOIS;

public class ResponseCombo {
	private Socket socket;
	public ObjectInputStream ois;
	public DataInputStream dis;

	public ResponseCombo(Socket socket) {
		this.socket = socket;
		ois = InputOIS.getInstance().getOis();

	}
	
	public List<Combo> getReponseGetAllCombo() {
		try {
			List<Combo> combo = (List<Combo>) ois.readObject();
			return combo;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
