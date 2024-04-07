package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThongKeGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton_1;
	private  JDateChooser dateNgayBatDau;
	private JDateChooser dateNgayKetThuc;
	private JTextField textField;
	private JTable table;
	private DefaultTableModel model;
	private JButton btnXemBieuDo;
	private JButton btnXemFileExcel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKeGUI frame = new ThongKeGUI();
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
	public ThongKeGUI() {
		setBackground(new Color(33, 156, 144));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 1550, 880);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(33, 156, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 60, 1516, 773);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Từ ngày:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(29, 22, 78, 20);
		panel.add(lblNewLabel);
		
		dateNgayBatDau = new JDateChooser();
		dateNgayBatDau.setBounds(117, 22, 150, 25);
		dateNgayBatDau.setDateFormatString("dd/MM/yyyy");
		dateNgayBatDau.setFont(new Font("Arial", Font.PLAIN, 14));
		panel.add(dateNgayBatDau);
		
		dateNgayKetThuc = new JDateChooser();
		dateNgayKetThuc.setBounds(415, 22, 150, 25);
		dateNgayKetThuc.setDateFormatString("dd/MM/yyyy");
		dateNgayKetThuc.setFont(new Font("Arial", Font.PLAIN, 14));
		panel.add(dateNgayKetThuc);
		
		JLabel lblNewLabel_1 = new JLabel("Từ ngày:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(327, 22, 78, 20);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(216, 75, 925, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Search");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(33, 156, 144));
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_3.setBounds(1151, 75, 85, 25);
		panel.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 122, 1452, 362);
		panel.add(scrollPane);
		
		String[] columnNames = {"Mã hóa đơn", "Phòng", "Loại phòng","Đơn giá","Nhân viên","Khách hàng","Số điện thoại","Ngày lập","Giờ vào","Giờ ra",
							"Tiền phòng","Tiền món ăn","Phụ thu","Giảm giá",
						"Tổng tiền"};
		model = new DefaultTableModel(columnNames, 0);
		table = new JTable(model);
		table.setFillsViewportHeight(true);
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		
		JLabel lblTngSHa = new JLabel("Tổng số hóa đơn:");
		lblTngSHa.setFont(new Font("Arial", Font.BOLD, 14));
		lblTngSHa.setBounds(29, 505, 140, 20);
		panel.add(lblTngSHa);
		
		JLabel lblTngTinPhng = new JLabel("Tổng tiền phòng:");
		lblTngTinPhng.setFont(new Font("Arial", Font.BOLD, 14));
		lblTngTinPhng.setBounds(29, 539, 140, 20);
		panel.add(lblTngTinPhng);
		
		JLabel lblTngTinMn = new JLabel("Tổng tiền món ăn:");
		lblTngTinMn.setFont(new Font("Arial", Font.BOLD, 14));
		lblTngTinMn.setBounds(29, 569, 140, 20);
		panel.add(lblTngTinMn);
		
		JLabel lblTngTinPh = new JLabel("Tổng tiền phụ thu:");
		lblTngTinPh.setFont(new Font("Arial", Font.BOLD, 14));
		lblTngTinPh.setBounds(29, 599, 140, 20);
		panel.add(lblTngTinPh);
		
		JLabel lblTngDoanhThu = new JLabel("Tổng doanh thu:");
		lblTngDoanhThu.setFont(new Font("Arial", Font.BOLD, 14));
		lblTngDoanhThu.setBounds(29, 629, 140, 20);
		panel.add(lblTngDoanhThu);
		
		btnXemBieuDo = new JButton("Xem biểu đồ");
		btnXemBieuDo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThongKeBieuDoGUI thongKeBieuDo = new ThongKeBieuDoGUI();
				thongKeBieuDo.setVisible(true);
			}
		});
		btnXemBieuDo.setForeground(Color.WHITE);
		btnXemBieuDo.setFont(new Font("Arial", Font.BOLD, 14));
		btnXemBieuDo.setBackground(new Color(33, 156, 144));
		btnXemBieuDo.setBounds(993, 528, 219, 30);
		panel.add(btnXemBieuDo);
		
		btnXemFileExcel = new JButton("Xuất file Excel");
		btnXemFileExcel.setForeground(Color.WHITE);
		btnXemFileExcel.setFont(new Font("Arial", Font.BOLD, 14));
		btnXemFileExcel.setBackground(new Color(33, 156, 144));
		btnXemFileExcel.setBounds(993, 577, 219, 30);
		panel.add(btnXemFileExcel);
		
		JButton btnNewButton = new JButton("Quản lý nhân viên");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyNhanVienGUI qlnv = new QuanLyNhanVienGUI();
				qlnv.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 162, 78));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(10, 10, 214, 50);
		contentPane.add(btnNewButton);
		
		JButton btnQunLMn = new JButton("Quản lý món ăn");
		btnQunLMn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyMonAnGUI qlma = new QuanLyMonAnGUI();
				qlma.setVisible(true);
				dispose();
			}
		});
		btnQunLMn.setBorder(null);
		btnQunLMn.setForeground(new Color(255, 255, 255));
		btnQunLMn.setBackground(new Color(255, 162, 78));
		btnQunLMn.setFont(new Font("Arial", Font.BOLD, 20));
		btnQunLMn.setBounds(234, 10, 214, 50);
		contentPane.add(btnQunLMn);
		
		JButton btnThngK = new JButton("Thống kê");
		btnThngK.setBackground(new Color(255, 255, 255));
		btnThngK.setBorder(null);
		btnThngK.setForeground(new Color(33, 156, 144));
		btnThngK.setFont(new Font("Arial", Font.BOLD, 20));
		btnThngK.setBounds(458, 10, 214, 50);
		contentPane.add(btnThngK);
		
		btnNewButton_1 = new JButton("Nguyễn Văn A");
		btnNewButton_1.setIcon(new ImageIcon(ThongKeGUI.class.getResource("/img/user_1.png")));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(33, 156, 144));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(1247, 11, 214, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DangNhapGUI login = new DangNhapGUI();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(33, 156, 144));
		btnNewButton_2.setIcon(new ImageIcon(ThongKeGUI.class.getResource("/img/logout.png")));
		btnNewButton_2.setBounds(1457, 10, 69, 40);
		contentPane.add(btnNewButton_2);
	}

}
