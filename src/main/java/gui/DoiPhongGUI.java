package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class DoiPhongGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblKQPhongDangSuDung;
	private JLabel lblKQLoaiPhong;
	private JLabel lblKQSoNguoi;
	private JLabel lblKetQuaGiaTien;
	private JTextField txtSearch;
	private JTable table;
	private DefaultTableModel model;
	private JButton btnHonThnh;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoiPhongGUI frame = new DoiPhongGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DoiPhongGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 790, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ĐỔI PHÒNG");
		lblNewLabel.setForeground(new Color(33, 156, 144));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(259, 10, 179, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phòng đang sử dụng:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(35, 71, 164, 25);
		contentPane.add(lblNewLabel_1);
		
		lblKQPhongDangSuDung = new JLabel("...");
		lblKQPhongDangSuDung.setFont(new Font("Arial", Font.BOLD, 14));
		lblKQPhongDangSuDung.setBounds(208, 71, 164, 25);
		contentPane.add(lblKQPhongDangSuDung);
		
		JLabel lblNewLabel_1_1 = new JLabel("Loại phòng:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(72, 106, 100, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Số người:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(72, 141, 100, 25);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Giá tiền:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(72, 176, 100, 25);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Giờ vào:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBounds(72, 211, 100, 25);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		lblKQLoaiPhong = new JLabel("...");
		lblKQLoaiPhong.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQLoaiPhong.setBounds(182, 106, 210, 25);
		contentPane.add(lblKQLoaiPhong);
		
		lblKQSoNguoi = new JLabel("...");
		lblKQSoNguoi.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQSoNguoi.setBounds(182, 141, 190, 25);
		contentPane.add(lblKQSoNguoi);
		
		lblKetQuaGiaTien = new JLabel("...");
		lblKetQuaGiaTien.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKetQuaGiaTien.setBounds(182, 176, 190, 25);
		contentPane.add(lblKetQuaGiaTien);
		
		JLabel lblKQGioVao = new JLabel("...");
		lblKQGioVao.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQGioVao.setBounds(182, 211, 190, 25);
		contentPane.add(lblKQGioVao);
		
		JLabel lblNewLabel_1_2 = new JLabel("Chọn phòng mới:");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(35, 245, 164, 25);
		contentPane.add(lblNewLabel_1_2);
		
		JCheckBox chckVIP = new JCheckBox("VIP");
		chckVIP.setBackground(new Color(255, 255, 255));
		chckVIP.setFont(new Font("Arial", Font.BOLD, 14));
		chckVIP.setBounds(35, 279, 62, 21);
		contentPane.add(chckVIP);
		
		txtSearch = new JTextField();
		txtSearch.setFont(new Font("Arial", Font.PLAIN, 14));
		txtSearch.setBounds(103, 275, 483, 30);
		contentPane.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(33, 156, 144));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(599, 274, 85, 30);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 318, 704, 180);
		contentPane.add(scrollPane);
		
		String[] header = {"Phòng", "Loại phòng", "Giá tiền", "Giờ vào", "Ghi chú"};
		model=new DefaultTableModel(header, 0);
		table = new JTable(model);
		table.setRowHeight(20);
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		btnHonThnh = new JButton("HOÀN THÀNH");
		btnHonThnh.setForeground(Color.WHITE);
		btnHonThnh.setFont(new Font("Arial", Font.BOLD, 14));
		btnHonThnh.setBackground(new Color(33, 156, 144));
		btnHonThnh.setBounds(259, 508, 219, 30);
		contentPane.add(btnHonThnh);
	}
}
