package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class ThanhToanGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblPhong;
	private JTable tablePhong;
	private DefaultTableModel modelPhong;
	private JTable tableMonAn;
	private DefaultTableModel modelMonAn;
	private JLabel lblKQKhachHang;
	private JLabel lblKQSDT;
	private JLabel lblKQGhiChu;
	private JLabel lblKQPhuThu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThanhToanGUI frame = new ThanhToanGUI();
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
	public ThanhToanGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THANH TOÁN");
		lblNewLabel.setForeground(new Color(33, 156, 144));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(414, 10, 184, 32);
		contentPane.add(lblNewLabel);
		
		lblPhong = new JLabel("PHÒNG 101");
		lblPhong.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhong.setFont(new Font("Arial", Font.BOLD, 20));
		lblPhong.setForeground(new Color(0, 0, 0));
		lblPhong.setBounds(434, 39, 125, 32);
		contentPane.add(lblPhong);
		
		JLabel lblNewLabel_1 = new JLabel("Khách hàng:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(68, 68, 103, 23);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Số điện thoại:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(68, 101, 103, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(68, 134, 846, 166);
		contentPane.add(scrollPane);
		
		String[] headerPhong= {"STT", "Phòng", "Loại phòng", "Giá tiền", "Giờ vào", "Giờ ra", "Ghi chú"};
		modelPhong = new DefaultTableModel(headerPhong, 0);
		tablePhong = new JTable(modelPhong);
		tablePhong.setRowHeight(20);
		tablePhong.setFillsViewportHeight(true);
		tablePhong.setFont(new Font("Arial", Font.PLAIN, 14));
		//Set độ rộng cột
		tablePhong.getColumnModel().getColumn(0).setPreferredWidth(30);
		scrollPane.setViewportView(tablePhong);
		
		JLabel lblNewLabel_1_2 = new JLabel("TỔNG TIỀN:");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(663, 310, 103, 23);
		contentPane.add(lblNewLabel_1_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(68, 343, 849, 200);
		contentPane.add(scrollPane_1);
		
		String[] headerMonAn= {"STT", "Món ăn","Đon giá", "Số lượng", "Thành tiền"};
		modelMonAn = new DefaultTableModel(headerMonAn, 0);
		tableMonAn = new JTable(modelMonAn);
		tableMonAn.setRowHeight(20);
		tableMonAn.setFont(new Font("Arial", Font.PLAIN, 14));
		tableMonAn.setFillsViewportHeight(true);
		tableMonAn.getColumnModel().getColumn(0).setPreferredWidth(20);
		scrollPane_1.setViewportView(tableMonAn);
		
		JLabel lblTongTienMonAn = new JLabel("TỔNG TIỀN:");
		lblTongTienMonAn.setFont(new Font("Arial", Font.BOLD, 14));
		lblTongTienMonAn.setBounds(663, 553, 103, 23);
		contentPane.add(lblTongTienMonAn);
		
		JLabel lblKQTongTienPhong = new JLabel("...");
		lblKQTongTienPhong.setFont(new Font("Arial", Font.BOLD, 14));
		lblKQTongTienPhong.setBounds(776, 310, 103, 23);
		contentPane.add(lblKQTongTienPhong);
		
		JLabel lblKQTongTienMonAn = new JLabel("...");
		lblKQTongTienMonAn.setFont(new Font("Arial", Font.BOLD, 14));
		lblKQTongTienMonAn.setBounds(776, 553, 103, 23);
		contentPane.add(lblKQTongTienMonAn);
		
		JLabel lblTngThanhTon = new JLabel("TỔNG THANH TOÁN:");
		lblTngThanhTon.setFont(new Font("Arial", Font.BOLD, 14));
		lblTngThanhTon.setBounds(308, 661, 146, 23);
		contentPane.add(lblTngThanhTon);
		
		JLabel lblKQTongThanhToan = new JLabel("...");
		lblKQTongThanhToan.setFont(new Font("Arial", Font.BOLD, 14));
		lblKQTongThanhToan.setBounds(464, 661, 103, 23);
		contentPane.add(lblKQTongThanhToan);
		
		JButton btnNewButton = new JButton("THANH TOÁN");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(33, 156, 144));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(318, 694, 239, 32);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phụ thu:");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(68, 580, 103, 23);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Ghi chú:");
		lblNewLabel_1_3_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_3_1.setBounds(68, 613, 103, 23);
		contentPane.add(lblNewLabel_1_3_1);
		
		lblKQKhachHang = new JLabel("....");
		lblKQKhachHang.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQKhachHang.setBounds(181, 68, 103, 23);
		contentPane.add(lblKQKhachHang);
		
		lblKQSDT = new JLabel("....");
		lblKQSDT.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQSDT.setBounds(181, 101, 103, 23);
		contentPane.add(lblKQSDT);
		
		lblKQPhuThu = new JLabel("....");
		lblKQPhuThu.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQPhuThu.setBounds(172, 580, 239, 23);
		contentPane.add(lblKQPhuThu);
		
		lblKQGhiChu = new JLabel("....");
		lblKQGhiChu.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQGhiChu.setBounds(172, 613, 418, 23);
		contentPane.add(lblKQGhiChu);
	}
}
