package reponse;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

import entity.Quyen;
import service.InputOIS;

public class ResponseLogin {
	private Socket socket;
	public ObjectInputStream ois;
	public DataInputStream dis;

	public ResponseLogin(Socket socket) {
		this.socket = socket;
		ois = InputOIS.getInstance().getOis();

	}

	public Quyen getResponseLogin() {

		try {
			Quyen quyen = (Quyen) ois.readObject();
			System.out.println(quyen);
			return quyen;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
