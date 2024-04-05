package gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Insets;

public class SanPhamGUI extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblGia;
	private JLabel lblAnh;
	private JLabel lblTen;
	private JLabel lblSoLuong;

	/**
	 * Create the panel.
	 */
	public SanPhamGUI() {
		setBorder(null);
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setBorder(null);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setVgap(0);
		flowLayout.setHgap(10);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 828, 100);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setPreferredSize(new Dimension(265, 100));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		lblAnh = new JLabel("");
		lblAnh.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/drink_1.png"));
		lblAnh.setPreferredSize(new Dimension(100, 0));
		panel_2.add(lblAnh, BorderLayout.WEST);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(202, 255, 255));
		panel_2.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		lblTen = new JLabel("ĐỒ UỐNG 1");
		lblTen.setHorizontalAlignment(SwingConstants.CENTER);
		lblTen.setFont(new Font("Arial", Font.BOLD, 16));
		lblTen.setBounds(0, 10, 165, 22);
		panel_3.add(lblTen);
		
		lblGia = new JLabel("99.000");
		lblGia.setForeground(new Color(255, 0, 0));
		lblGia.setHorizontalAlignment(SwingConstants.CENTER);
		lblGia.setFont(new Font("Arial", Font.BOLD, 20));
		lblGia.setBounds(0, 42, 165, 22);
		panel_3.add(lblGia);
		
		JButton btnGiam = new JButton("-");
		btnGiam.setFont(new Font("Arial", Font.BOLD, 14));
		btnGiam.setMargin(new Insets(2, 0, 2, 0));
		btnGiam.setBounds(10, 74, 33, 21);
		panel_3.add(btnGiam);
		
		JButton btnTang = new JButton("+");
		btnTang.setMargin(new Insets(2, 0, 2, 0));
		btnTang.setFont(new Font("Arial", Font.BOLD, 14));
		btnTang.setBounds(122, 74, 33, 21);
		panel_3.add(btnTang);
		
		lblSoLuong = new JLabel("0");
		lblSoLuong.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoLuong.setFont(new Font("Arial", Font.BOLD, 16));
		lblSoLuong.setBounds(53, 74, 45, 13);
		panel_3.add(lblSoLuong);
		scrollPane.setBounds(0, 0, 830, 533);
		add(scrollPane);

	}
}
