package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import entity.Phong;

public class ComPhong extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private JLabel lblNgayGioVao;
	private JLabel lblKhachHang;
	private JLabel lblGioHat;
	private JPanel jpLeft;
	private JLabel lblNewLabel;
	private JLabel lblTenPhong;
	private JLabel lblVIP;

	/**
	 * Create the panel.
	 */
	public ComPhong(Phong phong) {
		setLayout(null);
//		jpLeft.setBackground(new Color(255, 162, 78));
		
		
		panel = new JPanel();
		panel.setBounds(0, 0, 265, 100);
		add(panel);
		panel.setLayout(null);
		
		lblNgayGioVao = new JLabel("30/03/2024  17:00:00");
		lblNgayGioVao.setHorizontalAlignment(SwingConstants.CENTER);
		lblNgayGioVao.setFont(new Font("Arial", Font.BOLD, 14));
		lblNgayGioVao.setBounds(80, 10, 175, 20);
		panel.add(lblNgayGioVao);
		
		lblKhachHang = new JLabel("XUÂN THANH");
		lblKhachHang.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang.setFont(new Font("Arial", Font.BOLD, 20));
		lblKhachHang.setBounds(80, 36, 175, 25);
		panel.add(lblKhachHang);
		
		lblGioHat = new JLabel("00:00:00");
		lblGioHat.setHorizontalAlignment(SwingConstants.CENTER);
		lblGioHat.setFont(new Font("Arial", Font.BOLD, 20));
		lblGioHat.setBounds(80, 70, 175, 20);
		panel.add(lblGioHat);
		
		jpLeft = new JPanel();
		jpLeft.setLayout(null);
		jpLeft.setBounds(0, 0, 70, 100);
		panel.add(jpLeft);
		
		lblNewLabel = new JLabel("PHÒNG");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 10, 70, 23);
		jpLeft.add(lblNewLabel);
		
		lblTenPhong = new JLabel(phong.getTenPhong());
		lblTenPhong.setForeground(new Color(255, 255, 255));
		lblTenPhong.setHorizontalAlignment(SwingConstants.CENTER);
		lblTenPhong.setFont(new Font("Arial", Font.BOLD, 14));
		lblTenPhong.setBounds(0, 36, 70, 23);
		jpLeft.add(lblTenPhong);
		
		lblVIP = new JLabel("");
		lblVIP.setIcon(new ImageIcon(ComPhong.class.getResource("/img/star.png")));
		lblVIP.setBounds(12, 57, 47, 38);
		jpLeft.add(lblVIP);

		if (phong.getLoaiPhong().toString().equals("Phòng thường"))
			lblVIP.setVisible(false);
		else {
			lblVIP.setVisible(true);
		}

		if (phong.getTinhTrang() == 0) {
			jpLeft.setBackground(new Color(0, 255, 0));
			panel.setBackground(new Color(221, 255, 221));
			lblNgayGioVao.setText("");
			lblKhachHang.setText("PHÒNG TRỐNG");
			lblGioHat.setText("");
		} else if (phong.getTinhTrang() == 1) {
			jpLeft.setBackground(new Color(255, 199, 0));
			panel.setBackground(new Color(255, 221, 187));
		} else if (phong.getTinhTrang() == 2) {
			jpLeft.setBackground(new Color(235, 100, 64));
			panel.setBackground(new Color(255, 215, 215));
		} else {
			jpLeft.setBackground(new Color(0, 0, 0));
			panel.setBackground(new Color(225, 225, 225));
			lblNgayGioVao.setText("");
			lblKhachHang.setText("TẠM NGƯNG");
			lblGioHat.setText("");
		}

	}

}
