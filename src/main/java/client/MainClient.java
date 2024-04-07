package client;

import gui.DangNhapGUI;
import service.InputDIS;
import service.InputOIS;
import service.OutputDOS;
import service.OutputOOS;
import service.Service;

public class MainClient {
	public static void main(String[] args) {
		Service.getInstance().start();
		//InputOutput.getInstance().start(Service.getInstance().getSocket());
		OutputDOS.getInstance().start(Service.getInstance().getSocket());
		InputOIS.getInstance().start(Service.getInstance().getSocket());
		DangNhapGUI dangNhapGUI = new DangNhapGUI();
		dangNhapGUI.setVisible(true);
		
//		OutputOOS.getInstance().start(Service.getInstance().getSocket());
//		
//		InputDIS.getInstance().start(Service.getInstance().getSocket());
		
	}
}
