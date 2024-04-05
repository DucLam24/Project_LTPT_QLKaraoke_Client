package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class ThongKeBieuDoGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JDateChooser dateNgayBatDau;
	private JDateChooser dateNgayKetThuc;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblKQTongTienPhong;
	private JLabel lblKQTongTienMonAn;
	private JLabel lblKQTongPhuThu;
	private JLabel lblKQTongDoanhThu;
	private JTable table;
	private JScrollPane scrollPane;
	private DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKeBieuDoGUI frame = new ThongKeBieuDoGUI();
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
	public ThongKeBieuDoGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THỐNG KÊ");
		lblNewLabel.setForeground(new Color(33, 156, 144));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(414, 10, 154, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Từ ngày:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(25, 45, 74, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Đến ngày:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(283, 50, 74, 20);
		contentPane.add(lblNewLabel_1_1);
		
		dateNgayBatDau = new JDateChooser();
		dateNgayBatDau.setBounds(109, 45, 150, 30);
		dateNgayBatDau.setDateFormatString("dd/MM/yyyy");
		dateNgayBatDau.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(dateNgayBatDau);
		
		dateNgayKetThuc = new JDateChooser();
		dateNgayKetThuc.setBounds(367, 45, 150, 30);
		dateNgayKetThuc.setDateFormatString("dd/MM/yyyy");
		dateNgayKetThuc.setFont(new Font("Arial", Font.PLAIN, 14));
		contentPane.add(dateNgayKetThuc);
		
		lblNewLabel_2 = new JLabel("Tổng tiền phòng hát:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(25, 108, 154, 20);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Tổng tiền món ăn:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3.setBounds(25, 138, 154, 20);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Tổng phụ thu:");
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_4.setBounds(25, 168, 154, 20);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Tổng doanh thu:");
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_5.setBounds(25, 198, 154, 20);
		contentPane.add(lblNewLabel_5);
		
		lblKQTongTienPhong = new JLabel("...");
		lblKQTongTienPhong.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQTongTienPhong.setBounds(189, 108, 154, 20);
		contentPane.add(lblKQTongTienPhong);
		
		lblKQTongTienMonAn = new JLabel("...");
		lblKQTongTienMonAn.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQTongTienMonAn.setBounds(189, 138, 154, 20);
		contentPane.add(lblKQTongTienMonAn);
		
		lblKQTongPhuThu = new JLabel("...");
		lblKQTongPhuThu.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQTongPhuThu.setBounds(189, 168, 154, 20);
		contentPane.add(lblKQTongPhuThu);
		
		lblKQTongDoanhThu = new JLabel("...");
		lblKQTongDoanhThu.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQTongDoanhThu.setBounds(189, 198, 154, 20);
		contentPane.add(lblKQTongDoanhThu);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(384, 112, 580, 198);
		contentPane.add(scrollPane);
		
		String[] header= {"Ngày","Tổng tiền phòng","Tổng tiền món ăn","Tổng phụ thu","Tổng doanh thu"};
		model= new DefaultTableModel(header, 0);
		table = new JTable(model);
		table.setRowHeight(20);
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
	}

}
