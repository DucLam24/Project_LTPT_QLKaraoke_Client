package reponse;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

import entity.NhanVien;
import service.InputOIS;

public class ResponseNhanVien {
	private Socket socket;
	public ObjectInputStream ois;
	public DataInputStream dis;

	public ResponseNhanVien(Socket socket) {
		this.socket = socket;
		ois = InputOIS.getInstance().getOis();

	}
	
	public NhanVien getReponseGetNhanVienById() {
		try {
            NhanVien nhanVien = (NhanVien) ois.readObject();
            return nhanVien;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
}
