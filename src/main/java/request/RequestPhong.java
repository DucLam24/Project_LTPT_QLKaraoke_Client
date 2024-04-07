package request;

import java.io.DataOutputStream;
import java.net.Socket;

import service.OutputDOS;

public class RequestPhong {
	private Socket socket;
	private DataOutputStream dos;

	public RequestPhong(Socket socket) {
		this.socket = socket;
		dos = OutputDOS.getInstance().getDos();
	}

	public void requestGetAllPhong() {
		try {

			dos.writeUTF("getAllPhong");
			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void requestGetPhongByTinhTrang(String tinhTrang) {
		try {

			dos.writeUTF("getPhongByTinhTrang");
			int tt = -1;
			if (tinhTrang.equals("Phòng trống")) {
				tt = 0;
			} else if (tinhTrang.equals("Đặt trước")) {
				tt = 1;
			} else if (tinhTrang.equals("Đang sử dụng")) {
				tt = 2;
			} else if (tinhTrang.equals("Tạm ngưng")) {
				tt = 3;
			}

			dos.writeInt(tt);
			dos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
