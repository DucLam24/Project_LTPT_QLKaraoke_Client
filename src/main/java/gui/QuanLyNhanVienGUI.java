package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuanLyNhanVienGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton_1;
	private JTextField txtMaNhanVien;
	private JTextField txtHoTen;
	private JTextField textField_3;
	private JTextField txtSoDienThoai;
	private JButton btnLayMa;
	private JRadioButton rdbtnNam;
	private JRadioButton rdbtnNu;
	private ButtonGroup group;
	private JDateChooser date;
	private JTextField txtEmail;
	private JTextField txtSearch;
	private JComboBox comboBoxTinhTrang;
	private JTextField txtViTri;
	private JTable table;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	private JLabel lblKQTamNghi;
	private JLabel lblKQDangLamViec;
	private JTextField txtNamSinh;
	private JTextField txtViTriLoc;
	private JButton btnQuanLyMonAn;
	private JButton btnQLNhanVien;
	private JButton btnThongKe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyNhanVienGUI frame = new QuanLyNhanVienGUI();
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
	public QuanLyNhanVienGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setBounds(100, 100, 1550, 879);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(33, 156, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 57, 1516, 775);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THÔNG TIN NHÂN VIÊN");
		lblNewLabel.setForeground(new Color(33, 156, 144));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(633, 10, 294, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã nhân viên:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(127, 60, 115, 20);
		panel.add(lblNewLabel_1);
		
		txtMaNhanVien = new JTextField();
		txtMaNhanVien.setFont(new Font("Arial", Font.PLAIN, 14));
		txtMaNhanVien.setBounds(269, 60, 626, 25);
		panel.add(txtMaNhanVien);
		txtMaNhanVien.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Họ tên:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(127, 95, 115, 20);
		panel.add(lblNewLabel_1_1);
		
		txtHoTen = new JTextField();
		txtHoTen.setFont(new Font("Arial", Font.PLAIN, 14));
		txtHoTen.setColumns(10);
		txtHoTen.setBounds(269, 95, 764, 25);
		panel.add(txtHoTen);
		
		JLabel lblNewLabel_1_2 = new JLabel("Giới tính:");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(127, 132, 115, 20);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Ngày sinh:");
		lblNewLabel_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(127, 167, 115, 20);
		panel.add(lblNewLabel_1_3);
		
//		textField_3 = new JTextField();
//		textField_3.setFont(new Font("Arial", Font.PLAIN, 14));
//		textField_3.setColumns(10);
//		textField_3.setBounds(269, 167, 764, 25);
//		panel.add(textField_3);
		
		date =new JDateChooser();
		date.setBounds(269, 167, 764, 25);
		date.setDateFormatString("dd/MM/yyyy");
		date.setFont(new Font("Arial", Font.PLAIN, 14));
		date.setDate(new Date());
		panel.add(date);
		
		JLabel lblNewLabel_1_4 = new JLabel("Số điện thoại:");
		lblNewLabel_1_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(127, 202, 115, 20);
		panel.add(lblNewLabel_1_4);
		
		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setFont(new Font("Arial", Font.PLAIN, 14));
		txtSoDienThoai.setColumns(10);
		txtSoDienThoai.setBounds(269, 202, 764, 25);
		panel.add(txtSoDienThoai);
		
		btnLayMa = new JButton("Lấy mã");
		btnLayMa.setForeground(new Color(255, 255, 255));
		btnLayMa.setBackground(new Color(33, 156, 144));
		btnLayMa.setFont(new Font("Arial", Font.BOLD, 14));
		btnLayMa.setBounds(905, 60, 128, 25);
		panel.add(btnLayMa);
		
		rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNam.setBackground(new Color(255, 255, 255));
		rdbtnNam.setBounds(269, 133, 103, 21);
		panel.add(rdbtnNam);
		
		rdbtnNu = new JRadioButton("Nữ");
		rdbtnNu.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNu.setBackground(Color.WHITE);
		rdbtnNu.setBounds(397, 133, 103, 21);
		panel.add(rdbtnNu);
		
		group = new ButtonGroup();
		group.add(rdbtnNam);
		group.add(rdbtnNu);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("Email:");
		lblNewLabel_1_4_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_4_1.setBounds(127, 242, 115, 20);
		panel.add(lblNewLabel_1_4_1);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		txtEmail.setColumns(10);
		txtEmail.setBounds(269, 242, 764, 25);
		panel.add(txtEmail);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("Tình trạng:");
		lblNewLabel_1_4_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_4_1_1.setBounds(127, 312, 115, 20);
		panel.add(lblNewLabel_1_4_1_1);
		
		comboBoxTinhTrang = new JComboBox();
		comboBoxTinhTrang.setBackground(new Color(255, 255, 255));
		comboBoxTinhTrang.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBoxTinhTrang.setModel(new DefaultComboBoxModel(new String[] {"Đang làm việc", "Tạm ngưng"}));
		comboBoxTinhTrang.setBounds(269, 313, 764, 25);
		panel.add(comboBoxTinhTrang);
		
		JButton btnNewButton_3 = new JButton("THÊM");
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(33, 156, 144));
		btnNewButton_3.setIcon(new ImageIcon(QuanLyNhanVienGUI.class.getResource("/img/plus.png")));
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3.setBounds(1150, 109, 195, 40);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("CHỈNH SỬA");
		btnNewButton_3_1.setForeground(new Color(255, 255, 255));
		btnNewButton_3_1.setIcon(new ImageIcon(QuanLyNhanVienGUI.class.getResource("/img/update.png")));
		btnNewButton_3_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3_1.setBackground(new Color(33, 156, 144));
		btnNewButton_3_1.setBounds(1150, 165, 195, 40);
		panel.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("XÓA");
		btnNewButton_3_2.setForeground(new Color(255, 255, 255));
		btnNewButton_3_2.setIcon(new ImageIcon(QuanLyNhanVienGUI.class.getResource("/img/delete.png")));
		btnNewButton_3_2.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_3_2.setBackground(new Color(33, 156, 144));
		btnNewButton_3_2.setBounds(1150, 222, 195, 40);
		panel.add(btnNewButton_3_2);
		
		txtSearch = new JTextField();
		txtSearch.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtSearch.setFont(new Font("Arial", Font.PLAIN, 14));
		txtSearch.setBounds(172, 357, 719, 30);
		panel.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("Arial", Font.BOLD, 14));
		btnSearch.setBackground(new Color(33, 156, 144));
		btnSearch.setBounds(901, 356, 96, 30);
		panel.add(btnSearch);
		
		JLabel lblNewLabel_1_4_1_2 = new JLabel("Vị trí:");
		lblNewLabel_1_4_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_4_1_2.setBounds(127, 277, 115, 20);
		panel.add(lblNewLabel_1_4_1_2);
		
		txtViTri = new JTextField();
		txtViTri.setFont(new Font("Arial", Font.PLAIN, 14));
		txtViTri.setColumns(10);
		txtViTri.setBounds(269, 277, 764, 25);
		panel.add(txtViTri);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(67, 437, 966, 293);
		panel.add(scrollPane);
		
		String[] header = {"Mã nhân viên", "Họ tên", "Giới tính", "Ngày sinh", "Số điện thoại", "Email", "Vị trí", "Tình trạng"};
		model = new DefaultTableModel(header, 0);
		table = new JTable(model);
		table.setRowHeight(20);
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		table.setFillsViewportHeight(true);
		table.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1_4_1_1_1 = new JLabel("Đang làm việc:");
		lblNewLabel_1_4_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_4_1_1_1.setBounds(600, 407, 115, 20);
		panel.add(lblNewLabel_1_4_1_1_1);
		
		JLabel lblNewLabel_1_4_1_1_1_1 = new JLabel("Tạm nghỉ:");
		lblNewLabel_1_4_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_4_1_1_1_1.setBounds(818, 407, 83, 20);
		panel.add(lblNewLabel_1_4_1_1_1_1);
		
		lblKQDangLamViec = new JLabel("...");
		lblKQDangLamViec.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQDangLamViec.setBounds(717, 407, 83, 20);
		panel.add(lblKQDangLamViec);
		
		lblKQTamNghi = new JLabel("...");
		lblKQTamNghi.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQTamNghi.setBounds(914, 407, 83, 20);
		panel.add(lblKQTamNghi);
		
		JButton btnXemTtC = new JButton("Xem tất cả");
		btnXemTtC.setForeground(Color.WHITE);
		btnXemTtC.setFont(new Font("Arial", Font.BOLD, 14));
		btnXemTtC.setBackground(new Color(33, 156, 144));
		btnXemTtC.setBounds(1112, 434, 321, 30);
		panel.add(btnXemTtC);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(33, 156, 144)), "L\u1ECCC", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(33, 156, 144)));
		panel_1.setBounds(1043, 474, 463, 256);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Giới tính:");
		lblNewLabel_1_2_1.setBounds(10, 22, 115, 20);
		panel_1.add(lblNewLabel_1_2_1);
		lblNewLabel_1_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		
		JRadioButton rdbtnNam_1 = new JRadioButton("Nam");
		rdbtnNam_1.setBounds(118, 22, 103, 21);
		panel_1.add(rdbtnNam_1);
		rdbtnNam_1.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNam_1.setBackground(Color.WHITE);
		
		JRadioButton rdbtnNu_1 = new JRadioButton("Nữ");
		rdbtnNu_1.setBounds(246, 22, 103, 21);
		panel_1.add(rdbtnNu_1);
		rdbtnNu_1.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNu_1.setBackground(Color.WHITE);
		
		ButtonGroup group_1 = new ButtonGroup();
		group_1.add(rdbtnNam_1);
		group_1.add(rdbtnNu_1);
		
		JLabel lblNewLabel_1_4_1_1_2 = new JLabel("Năm sinh:");
		lblNewLabel_1_4_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_4_1_1_2.setBounds(10, 51, 115, 20);
		panel_1.add(lblNewLabel_1_4_1_1_2);
		
		txtNamSinh = new JTextField();
		txtNamSinh.setBounds(118, 49, 335, 25);
		panel_1.add(txtNamSinh);
		txtNamSinh.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNamSinh.setColumns(10);
		
		JLabel lblNewLabel_1_4_1_1_2_1 = new JLabel("Vị trí:");
		lblNewLabel_1_4_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_4_1_1_2_1.setBounds(10, 83, 115, 20);
		panel_1.add(lblNewLabel_1_4_1_1_2_1);
		
		txtViTriLoc = new JTextField();
		txtViTriLoc.setFont(new Font("Arial", Font.PLAIN, 14));
		txtViTriLoc.setColumns(10);
		txtViTriLoc.setBounds(118, 81, 335, 25);
		panel_1.add(txtViTriLoc);
		
		JLabel lblNewLabel_1_4_1_1_3 = new JLabel("Tình trạng:");
		lblNewLabel_1_4_1_1_3.setBounds(10, 113, 115, 20);
		panel_1.add(lblNewLabel_1_4_1_1_3);
		lblNewLabel_1_4_1_1_3.setFont(new Font("Arial", Font.BOLD, 14));
		
		JComboBox comboBoxTinhTrang_1 = new JComboBox();
		comboBoxTinhTrang_1.setModel(new DefaultComboBoxModel(new String[] {"Đang làm việc", "Tạm ngưng"}));
		comboBoxTinhTrang_1.setBounds(118, 117, 335, 25);
		panel_1.add(comboBoxTinhTrang_1);
		comboBoxTinhTrang_1.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBoxTinhTrang_1.setBackground(Color.WHITE);
		
		JButton btnLc = new JButton("Lọc");
		btnLc.setForeground(Color.WHITE);
		btnLc.setFont(new Font("Arial", Font.BOLD, 14));
		btnLc.setBackground(new Color(33, 156, 144));
		btnLc.setBounds(143, 167, 192, 30);
		panel_1.add(btnLc);
		
		btnQLNhanVien = new JButton("Quản lý nhân viên");
		btnQLNhanVien.setBorder(null);
		btnQLNhanVien.setBackground(new Color(255, 255, 255));
		btnQLNhanVien.setForeground(new Color(33, 156, 144));
		btnQLNhanVien.setFont(new Font("Arial", Font.BOLD, 20));
		btnQLNhanVien.setBounds(10, 10, 214, 50);
		contentPane.add(btnQLNhanVien);
		
		btnQuanLyMonAn = new JButton("Quản lý món ăn");
		btnQuanLyMonAn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyMonAnGUI qlma = new QuanLyMonAnGUI();
				qlma.setVisible(true);
				dispose();
			}
		});
		btnQuanLyMonAn.setBorder(null);
		btnQuanLyMonAn.setBackground(new Color(255, 162, 78));
		btnQuanLyMonAn.setForeground(new Color(255, 255, 255));
		btnQuanLyMonAn.setFont(new Font("Arial", Font.BOLD, 20));
		btnQuanLyMonAn.setBounds(232, 10, 214, 50);
		contentPane.add(btnQuanLyMonAn);
		
		btnThongKe = new JButton("Thống kê");
		btnThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThongKeGUI thongKe = new ThongKeGUI();
				thongKe.setVisible(true);
				dispose();
			}
		});
		btnThongKe.setBorder(null);
		btnThongKe.setBackground(new Color(255, 162, 78));
		btnThongKe.setForeground(new Color(255, 255, 255));
		btnThongKe.setFont(new Font("Arial", Font.BOLD, 20));
		btnThongKe.setBounds(456, 10, 214, 50);
		contentPane.add(btnThongKe);
		
		btnNewButton_1 = new JButton("Nguyễn Văn A");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(33, 156, 144));
		btnNewButton_1.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/user_1.png"));
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(1262, 10, 203, 37);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DangNhapGUI dangNhapGUI = new DangNhapGUI();
				dangNhapGUI.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(33, 156, 144));
		btnNewButton_2.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/logout.png"));
		btnNewButton_2.setBounds(1475, 10, 51, 37);
		contentPane.add(btnNewButton_2);
	}
}
