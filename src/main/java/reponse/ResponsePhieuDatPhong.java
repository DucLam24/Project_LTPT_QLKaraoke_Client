package reponse;

import java.io.DataInputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.List;

import entity.PhieuDatPhong;
import service.InputOIS;

public class ResponsePhieuDatPhong {
	private Socket socket;
	public ObjectInputStream ois;
	public DataInputStream dis;

	public ResponsePhieuDatPhong(Socket socket) {
		this.socket = socket;
		ois = InputOIS.getInstance().getOis();

	}
	
	public List<PhieuDatPhong> getResponseGetPDPByPhongIDAndTinhTrang() {
		try {
            List<PhieuDatPhong> listPhieuDatPhong = (List<PhieuDatPhong>) ois.readObject();
            return listPhieuDatPhong;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
	
}
