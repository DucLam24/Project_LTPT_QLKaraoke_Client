package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import service.MapMonAn;

public class ComMonAn extends JPanel {
	private JPanel jp;
	private JButton btnTru;
	private  JLabel lblSoLuong;
	private JButton btnCong;
	private Map<Object, Integer> mapMonAn = MapMonAn.getInstance().getMapMonAn();
	private int soLuong;

	
	
	
	/**
	 * Create the panel.
	 */
	public ComMonAn(Object object) {
		
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		jp = new JPanel();
		jp.setBackground(new Color(255, 215, 174));
		jp.setBounds(0, 0, 267, 100);
		add(jp);
		jp.setLayout(null);
		
		JLabel lblHinhAnh = new JLabel("");
		lblHinhAnh.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/combo_1.png"));
		lblHinhAnh.setBounds(0, 0, 100, 100);
		jp.add(lblHinhAnh);
		
		JLabel lblTenMonAn = new JLabel("COMBO 1");
		lblTenMonAn.setHorizontalAlignment(SwingConstants.CENTER);
		lblTenMonAn.setFont(new Font("Arial", Font.BOLD, 16));
		lblTenMonAn.setBounds(110, 10, 130, 19);
		jp.add(lblTenMonAn);
		
		JLabel lblGia = new JLabel("99.000");
		lblGia.setHorizontalAlignment(SwingConstants.CENTER);
		lblGia.setForeground(Color.RED);
		lblGia.setFont(new Font("Arial", Font.BOLD, 20));
		lblGia.setBounds(110, 36, 130, 19);
		jp.add(lblGia);
		
		System.out.println(soLuong);
		
		btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				if (soLuong > 0) {
					soLuong--;
//					lblSoLuong.setText(String.valueOf(soLuong));
					setSoLuong(soLuong);
					btnCong.setEnabled(true);
					updateMap(object);
//					System.out.println(soLuong);
				} else {
					btnTru.setEnabled(false);
				}
			}

			
		});
		btnTru.setMargin(new Insets(2, 10, 2, 10));
		btnTru.setBackground(Color.WHITE);
		btnTru.setBounds(107, 65, 37, 21);
		jp.add(btnTru);
		
		btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int soLuongTon = getSoLuongTon(object);
				if (soLuong < soLuongTon) {
					soLuong++;
//					lblSoLuong.setText(String.valueOf(soLuong));
					setSoLuong(soLuong);
					btnTru.setEnabled(true);
					updateMap(object);
//					System.out.println(soLuong);
				} else {
					btnCong.setEnabled(false);
				}
			}
		});
		btnCong.setMargin(new Insets(2, 10, 2, 10));
		btnCong.setBackground(Color.WHITE);
		btnCong.setBounds(203, 65, 37, 21);
		jp.add(btnCong);
		
		lblSoLuong = new JLabel("0");
		lblSoLuong.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoLuong.setFont(new Font("Arial", Font.BOLD, 14));
		lblSoLuong.setBounds(148, 68, 45, 13);
		jp.add(lblSoLuong);
		
		if(mapMonAn.isEmpty()) {
			soLuong = 0;
		} else {
			for (Map.Entry<Object, Integer> entry : mapMonAn.entrySet()) {
				if (entry.getKey().equals(object)) {
					soLuong = entry.getValue();
					break;
				} else {
					soLuong = 0;
				}
			}
		}
		
		if (object instanceof entity.Combo) {
			entity.Combo combo = (entity.Combo) object;
			lblTenMonAn.setText(combo.getTenCombo());
			lblGia.setText(String.valueOf(combo.getGiaTien()));
			lblHinhAnh.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/combo_1.png"));
			jp.setBackground(new Color(200, 255, 255));
			//setBackground(new Color(255, 255, 142));
		}
		if (object instanceof entity.MonAn) {
			entity.MonAn monAn = (entity.MonAn) object;
			lblTenMonAn.setText(monAn.getTenMonAn());
			lblGia.setText(String.valueOf(monAn.getDonGia()));
			if(monAn.getLoaiMonAn().toString().equals("Đồ uống")) {
				lblHinhAnh.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/drink_1.png"));
				jp.setBackground(new Color(200, 255, 255));
				//setBackground(new Color(255, 255, 142));
			}
			if (monAn.getLoaiMonAn().toString().equals("Snack")) {
				lblHinhAnh.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/snack_1.png"));
				jp.setBackground(new Color(255, 215, 174));
				//setBackground(new Color(225, 254, 193));
			}
			if (monAn.getLoaiMonAn().toString().equals("Trái cây")) {
				lblHinhAnh.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/fruit_1.png"));
				jp.setBackground(new Color(225, 224, 193));
				//setBackground(new Color(225, 224, 193));
			}
			
		}

	}

	public int getSoLuongTon(Object object) {
		if (object instanceof entity.Combo) {
			entity.Combo combo = (entity.Combo) object;
			return combo.getSoLuongTon();
		}
		if (object instanceof entity.MonAn) {
			entity.MonAn monAn = (entity.MonAn) object;
			return monAn.getSoLuongTon();
		}
		return 0;
		
	}

//	public static int getSoLuong() {
//		return soLuong;
//	}


	public void updateMap(Object object) {
//		List<Object> list=Arrays.asList(object);
		if (mapMonAn.containsKey(object)) {
			if (soLuong == 0) {
				mapMonAn.remove(object);
			} else {
				mapMonAn.replace(object, soLuong);
			}
		} else {
			mapMonAn.put(object, soLuong);
			System.out.println("Sai o day");
			
			
	
		}
	}
	
	
	public void setSoLuong(int soLuong) {
		lblSoLuong.setText(String.valueOf(soLuong));
		
	}


	

}
