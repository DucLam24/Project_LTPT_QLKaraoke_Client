package gui;

import javax.swing.JFrame;

import entity.LoaiPhong;
import entity.Phong;

public class TestComPhong extends JFrame{
	public TestComPhong() {
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		Phong phong = new Phong("PT0001","T1",LoaiPhong.phongThuong,5,200000,0);
		ComPhong comPhong = new ComPhong(phong);
		add(comPhong);
		
	}

	public static void main(String[] args) {
		new TestComPhong();
	}
	
}
