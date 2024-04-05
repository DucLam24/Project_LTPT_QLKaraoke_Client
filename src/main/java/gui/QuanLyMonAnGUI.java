package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuanLyMonAnGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnQLMonAn;
	private JButton btnQLnhanVien;
	private JButton btnThongKe;
	private JTextField txtMaCombo;
	private JTextField txtTenCombo;
	private JTextField txtMoTa;
	private JTextField txtGiaTien;
	private JComboBox comboBoxTinhTrang;
	private JTextField txtSL1;
	private JTextField txtSL2;
	private JTextField txtSL3;
	private JTextField txtSL4;
	private JTextField txtSL5;
	private JTable table;
	private JTextField textField;
	private DefaultTableModel model;
	private JTextField txtMaMonAn;
	private JTextField txtTenMonAn;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtSoLuongTon;
	private JTextField txtHinhAnh;
	private JTextField textField_3;
	private JPanel txtHinhAnhMonAn;
	private JTextField txtSearcMA;
	private JButton btnLayMaMA;
	private JTable table_1;
	private DefaultTableModel model_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyMonAnGUI frame = new QuanLyMonAnGUI();
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
	public QuanLyMonAnGUI() {
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
		panel.setBounds(10, 60, 1516, 782);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(255, 255, 255));
		tabbedPane.setBounds(0, 0, 1516, 782);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		panel_1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Combo", null, panel_1, null);
		tabbedPane.setEnabledAt(0, true);
		tabbedPane.setBackgroundAt(0, new Color(255, 255, 255));
		tabbedPane.setForegroundAt(0, new Color(33, 156, 144));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("THÔNG TIN COMBO");
		lblNewLabel.setForeground(new Color(33, 156, 144));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(603, 10, 251, 37);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã combo:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(69, 48, 93, 20);
		panel_1.add(lblNewLabel_1);
		
		txtMaCombo = new JTextField();
		txtMaCombo.setBounds(186, 47, 527, 25);
		panel_1.add(txtMaCombo);
		txtMaCombo.setColumns(10);
		
		JButton btnNewButton = new JButton("Lấy mã");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(33, 156, 144));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(723, 48, 85, 25);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên combo:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(69, 85, 93, 20);
		panel_1.add(lblNewLabel_1_1);
		
		txtTenCombo = new JTextField();
		txtTenCombo.setColumns(10);
		txtTenCombo.setBounds(187, 84, 622, 25);
		panel_1.add(txtTenCombo);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mô tả:");
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(69, 119, 93, 20);
		panel_1.add(lblNewLabel_1_1_1);
		
		txtMoTa = new JTextField();
		txtMoTa.setColumns(10);
		txtMoTa.setBounds(186, 118, 622, 25);
		panel_1.add(txtMoTa);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Giá tiền:");
		lblNewLabel_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(69, 154, 93, 20);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		txtGiaTien = new JTextField();
		txtGiaTien.setColumns(10);
		txtGiaTien.setBounds(186, 153, 622, 25);
		panel_1.add(txtGiaTien);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Tình trạng:");
		lblNewLabel_1_1_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2.setBounds(69, 266, 93, 20);
		panel_1.add(lblNewLabel_1_1_1_2);
		
		comboBoxTinhTrang = new JComboBox();
		comboBoxTinhTrang.setBackground(new Color(255, 255, 255));
		comboBoxTinhTrang.setModel(new DefaultComboBoxModel(new String[] {"Đang phục vụ", "Tạm ngưng"}));
		comboBoxTinhTrang.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBoxTinhTrang.setBounds(186, 263, 622, 25);
		panel_1.add(comboBoxTinhTrang);
		
		JLabel lblNewLabel_1_1_1_2_1 = new JLabel("Các món trong combo:");
		lblNewLabel_1_1_1_2_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1_1_1_2_1.setBounds(864, 37, 239, 25);
		panel_1.add(lblNewLabel_1_1_1_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(null);
		scrollPane.setBounds(874, 72, 555, 195);
		panel_1.add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		scrollPane.setViewportView(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_1_1_2_2 = new JLabel("Món 1:");
		lblNewLabel_1_1_1_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_2.setBounds(10, 10, 60, 20);
		panel_2.add(lblNewLabel_1_1_1_2_2);
		
		JComboBox comboMon1 = new JComboBox();
		comboMon1.setBounds(80, 8, 251, 25);
		panel_2.add(comboMon1);
		comboMon1.setFont(new Font("Arial", Font.PLAIN, 14));
		comboMon1.setBackground(Color.WHITE);
		
		JLabel lblNewLabel_1_1_1_2_2_1 = new JLabel("Số lượng:");
		lblNewLabel_1_1_1_2_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_2_1.setBounds(341, 10, 80, 20);
		panel_2.add(lblNewLabel_1_1_1_2_2_1);
		
		txtSL1 = new JTextField();
		txtSL1.setBounds(425, 9, 118, 25);
		panel_2.add(txtSL1);
		txtSL1.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_2_2_2 = new JLabel("Món 2:");
		lblNewLabel_1_1_1_2_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_2_2.setBounds(10, 42, 60, 20);
		panel_2.add(lblNewLabel_1_1_1_2_2_2);
		
		JComboBox comboMon2 = new JComboBox();
		comboMon2.setFont(new Font("Arial", Font.PLAIN, 14));
		comboMon2.setBackground(Color.WHITE);
		comboMon2.setBounds(80, 40, 251, 25);
		panel_2.add(comboMon2);
		
		JLabel lblNewLabel_1_1_1_2_2_1_1 = new JLabel("Số lượng:");
		lblNewLabel_1_1_1_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_2_1_1.setBounds(341, 42, 80, 20);
		panel_2.add(lblNewLabel_1_1_1_2_2_1_1);
		
		txtSL2 = new JTextField();
		txtSL2.setColumns(10);
		txtSL2.setBounds(425, 41, 118, 25);
		panel_2.add(txtSL2);
		
		JLabel lblNewLabel_1_1_1_2_2_2_1 = new JLabel("Món 3:");
		lblNewLabel_1_1_1_2_2_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_2_2_1.setBounds(10, 77, 60, 20);
		panel_2.add(lblNewLabel_1_1_1_2_2_2_1);
		
		JComboBox comboMon3 = new JComboBox();
		comboMon3.setFont(new Font("Arial", Font.PLAIN, 14));
		comboMon3.setBackground(Color.WHITE);
		comboMon3.setBounds(80, 75, 251, 25);
		panel_2.add(comboMon3);
		
		JLabel lblNewLabel_1_1_1_2_2_1_1_1 = new JLabel("Số lượng:");
		lblNewLabel_1_1_1_2_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_2_1_1_1.setBounds(341, 77, 80, 20);
		panel_2.add(lblNewLabel_1_1_1_2_2_1_1_1);
		
		txtSL3 = new JTextField();
		txtSL3.setColumns(10);
		txtSL3.setBounds(425, 76, 118, 25);
		panel_2.add(txtSL3);
		
		JLabel lblNewLabel_1_1_1_2_2_2_1_1 = new JLabel("Món 4:");
		lblNewLabel_1_1_1_2_2_2_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_2_2_1_1.setBounds(10, 112, 60, 20);
		panel_2.add(lblNewLabel_1_1_1_2_2_2_1_1);
		
		JComboBox comboMon4 = new JComboBox();
		comboMon4.setFont(new Font("Arial", Font.PLAIN, 14));
		comboMon4.setBackground(Color.WHITE);
		comboMon4.setBounds(80, 110, 251, 25);
		panel_2.add(comboMon4);
		
		JLabel lblNewLabel_1_1_1_2_2_1_1_1_1 = new JLabel("Số lượng:");
		lblNewLabel_1_1_1_2_2_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_2_1_1_1_1.setBounds(341, 112, 80, 20);
		panel_2.add(lblNewLabel_1_1_1_2_2_1_1_1_1);
		
		txtSL4 = new JTextField();
		txtSL4.setColumns(10);
		txtSL4.setBounds(425, 111, 118, 25);
		panel_2.add(txtSL4);
		
		JLabel lblNewLabel_1_1_1_2_2_2_1_1_1 = new JLabel("Món 5:");
		lblNewLabel_1_1_1_2_2_2_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_2_2_1_1_1.setBounds(10, 151, 60, 20);
		panel_2.add(lblNewLabel_1_1_1_2_2_2_1_1_1);
		
		JComboBox comboMon5 = new JComboBox();
		comboMon5.setFont(new Font("Arial", Font.PLAIN, 14));
		comboMon5.setBackground(Color.WHITE);
		comboMon5.setBounds(80, 149, 251, 25);
		panel_2.add(comboMon5);
		
		JLabel lblNewLabel_1_1_1_2_2_1_1_1_1_1 = new JLabel("Số lượng:");
		lblNewLabel_1_1_1_2_2_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_2_2_1_1_1_1_1.setBounds(341, 151, 80, 20);
		panel_2.add(lblNewLabel_1_1_1_2_2_1_1_1_1_1);
		
		txtSL5 = new JTextField();
		txtSL5.setColumns(10);
		txtSL5.setBounds(425, 150, 118, 25);
		panel_2.add(txtSL5);
		
		JButton btnThmMn = new JButton("Thêm món");
		btnThmMn.setForeground(new Color(255, 255, 255));
		btnThmMn.setFont(new Font("Arial", Font.BOLD, 14));
		btnThmMn.setBackground(new Color(33, 156, 144));
		btnThmMn.setBounds(1072, 273, 114, 25);
		panel_1.add(btnThmMn);
		
		JButton btnToCombo = new JButton("TẠO COMBO");
		btnToCombo.setForeground(Color.WHITE);
		btnToCombo.setFont(new Font("Arial", Font.BOLD, 14));
		btnToCombo.setBackground(new Color(33, 156, 144));
		btnToCombo.setBounds(119, 298, 184, 30);
		panel_1.add(btnToCombo);
		
		JButton btnChnhSa = new JButton("CHỈNH SỬA");
		btnChnhSa.setForeground(Color.WHITE);
		btnChnhSa.setFont(new Font("Arial", Font.BOLD, 14));
		btnChnhSa.setBackground(new Color(33, 156, 144));
		btnChnhSa.setBounds(344, 298, 184, 30);
		panel_1.add(btnChnhSa);
		
		JButton btnXa = new JButton("XÓA");
		btnXa.setForeground(Color.WHITE);
		btnXa.setFont(new Font("Arial", Font.BOLD, 14));
		btnXa.setBackground(new Color(33, 156, 144));
		btnXa.setBounds(566, 298, 184, 30);
		panel_1.add(btnXa);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(119, 392, 1243, 299);
		panel_1.add(scrollPane_1);
		
		String[] columnNames = {"Mã combo", "Tên combo", "Mô tả", "Giá tiền", "Tình trạng"};
		model = new DefaultTableModel(columnNames, 0);
		table = new JTable(model);
		table.setEnabled(false);
		table.setFillsViewportHeight(true);
		table.setBackground(new Color(255, 255, 255));
		scrollPane_1.setViewportView(table);
		
		JButton btnXemTtC = new JButton("Xem tất cả");
		btnXemTtC.setForeground(Color.WHITE);
		btnXemTtC.setFont(new Font("Arial", Font.BOLD, 14));
		btnXemTtC.setBackground(new Color(33, 156, 144));
		btnXemTtC.setBounds(118, 364, 154, 25);
		panel_1.add(btnXemTtC);
		
		textField = new JTextField();
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setColumns(10);
		textField.setBounds(624, 352, 622, 25);
		panel_1.add(textField);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setForeground(Color.WHITE);
		btnSearch.setFont(new Font("Arial", Font.BOLD, 14));
		btnSearch.setBackground(new Color(33, 156, 144));
		btnSearch.setBounds(1256, 352, 103, 25);
		panel_1.add(btnSearch);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Số lượng tồn:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1.setBounds(69, 189, 107, 20);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		txtSoLuongTon = new JTextField();
		txtSoLuongTon.setColumns(10);
		txtSoLuongTon.setBounds(186, 188, 622, 25);
		panel_1.add(txtSoLuongTon);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Hình ảnh");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1_1_1_1_1_1.setBounds(69, 230, 107, 20);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		txtHinhAnh = new JTextField();
		txtHinhAnh.setColumns(10);
		txtHinhAnh.setBounds(186, 225, 622, 25);
		panel_1.add(txtHinhAnh);
		
		txtHinhAnhMonAn = new JPanel();
		txtHinhAnhMonAn.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Món ăn", null, txtHinhAnhMonAn, null);
		tabbedPane.setBackgroundAt(1, new Color(255, 255, 255));
		tabbedPane.setForegroundAt(1, new Color(33, 156, 144));
		txtHinhAnhMonAn.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("THÔNG TIN MÓN ĂN");
		lblNewLabel_2.setForeground(new Color(33, 156, 144));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_2.setBounds(642, 10, 256, 40);
		txtHinhAnhMonAn.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mã món ăn:");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3.setBounds(99, 60, 110, 23);
		txtHinhAnhMonAn.add(lblNewLabel_3);
		
		txtMaMonAn = new JTextField();
		txtMaMonAn.setFont(new Font("Arial", Font.PLAIN, 14));
		txtMaMonAn.setBounds(219, 60, 389, 25);
		txtHinhAnhMonAn.add(txtMaMonAn);
		txtMaMonAn.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Loại món ăn:");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(99, 93, 110, 23);
		txtHinhAnhMonAn.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Tên món ăn:");
		lblNewLabel_3_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_2.setBounds(99, 129, 110, 23);
		txtHinhAnhMonAn.add(lblNewLabel_3_2);
		
		txtTenMonAn = new JTextField();
		txtTenMonAn.setFont(new Font("Arial", Font.PLAIN, 14));
		txtTenMonAn.setColumns(10);
		txtTenMonAn.setBounds(219, 129, 479, 25);
		txtHinhAnhMonAn.add(txtTenMonAn);
		
		JComboBox comboBoxLoaiMonAn = new JComboBox();
		comboBoxLoaiMonAn.setBackground(new Color(255, 255, 255));
		comboBoxLoaiMonAn.setModel(new DefaultComboBoxModel(new String[] {"Snack", "Đồ uống", "Trái cây"}));
		comboBoxLoaiMonAn.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBoxLoaiMonAn.setBounds(217, 95, 481, 25);
		txtHinhAnhMonAn.add(comboBoxLoaiMonAn);
		
		btnLayMaMA = new JButton("Lấy mã");
		btnLayMaMA.setForeground(new Color(255, 255, 255));
		btnLayMaMA.setBackground(new Color(33, 156, 144));
		btnLayMaMA.setFont(new Font("Arial", Font.BOLD, 14));
		btnLayMaMA.setBounds(613, 62, 85, 25);
		txtHinhAnhMonAn.add(btnLayMaMA);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Giá tiền:");
		lblNewLabel_3_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_2_1.setBounds(774, 58, 110, 23);
		txtHinhAnhMonAn.add(lblNewLabel_3_2_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(894, 58, 479, 25);
		txtHinhAnhMonAn.add(textField_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("Số lượng tồn:");
		lblNewLabel_3_2_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_2_2.setBounds(774, 95, 110, 23);
		txtHinhAnhMonAn.add(lblNewLabel_3_2_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(894, 95, 479, 25);
		txtHinhAnhMonAn.add(textField_2);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("Tình trạng");
		lblNewLabel_3_2_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_2_3.setBounds(774, 127, 110, 23);
		txtHinhAnhMonAn.add(lblNewLabel_3_2_3);
		
		JComboBox comboBoxLoaiMonAn_1 = new JComboBox();
		comboBoxLoaiMonAn_1.setModel(new DefaultComboBoxModel(new String[] {"Đang phục vụ", "Tạm ngưng"}));
		comboBoxLoaiMonAn_1.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBoxLoaiMonAn_1.setBackground(Color.WHITE);
		comboBoxLoaiMonAn_1.setBounds(894, 131, 481, 25);
		txtHinhAnhMonAn.add(comboBoxLoaiMonAn_1);
		
		JLabel lblNewLabel_3_2_4 = new JLabel("Hình ảnh:");
		lblNewLabel_3_2_4.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_2_4.setBounds(99, 162, 110, 23);
		txtHinhAnhMonAn.add(lblNewLabel_3_2_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(219, 162, 479, 25);
		txtHinhAnhMonAn.add(textField_3);
		
		JButton btnThem = new JButton("THÊM");
		btnThem.setForeground(Color.WHITE);
		btnThem.setFont(new Font("Arial", Font.BOLD, 14));
		btnThem.setBackground(new Color(33, 156, 144));
		btnThem.setBounds(413, 211, 150, 30);
		txtHinhAnhMonAn.add(btnThem);
		
		JButton btnChinhSua = new JButton("CHỈNH SỮA");
		btnChinhSua.setForeground(Color.WHITE);
		btnChinhSua.setFont(new Font("Arial", Font.BOLD, 14));
		btnChinhSua.setBackground(new Color(33, 156, 144));
		btnChinhSua.setBounds(676, 211, 150, 30);
		txtHinhAnhMonAn.add(btnChinhSua);
		
		JButton btnXoa = new JButton("XÓA");
		btnXoa.setForeground(Color.WHITE);
		btnXoa.setFont(new Font("Arial", Font.BOLD, 14));
		btnXoa.setBackground(new Color(33, 156, 144));
		btnXoa.setBounds(954, 211, 150, 30);
		txtHinhAnhMonAn.add(btnXoa);
		
		txtSearcMA = new JTextField();
		txtSearcMA.setFont(new Font("Arial", Font.PLAIN, 14));
		txtSearcMA.setColumns(10);
		txtSearcMA.setBounds(259, 269, 915, 25);
		txtHinhAnhMonAn.add(txtSearcMA);
		
		JButton btnSearchMA = new JButton("Search");
		btnSearchMA.setForeground(Color.WHITE);
		btnSearchMA.setFont(new Font("Arial", Font.BOLD, 14));
		btnSearchMA.setBackground(new Color(33, 156, 144));
		btnSearchMA.setBounds(1184, 269, 85, 25);
		txtHinhAnhMonAn.add(btnSearchMA);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Loại món ăn:");
		lblNewLabel_3_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(470, 315, 110, 23);
		txtHinhAnhMonAn.add(lblNewLabel_3_1_1);
		
		JComboBox comboBoxLoaiMonAn_2 = new JComboBox();
		comboBoxLoaiMonAn_2.setModel(new DefaultComboBoxModel(new String[] {"Tất cả", "Snack", "Đồ uống", "Trái cây"}));
		comboBoxLoaiMonAn_2.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBoxLoaiMonAn_2.setBackground(Color.WHITE);
		comboBoxLoaiMonAn_2.setBounds(588, 314, 481, 25);
		txtHinhAnhMonAn.add(comboBoxLoaiMonAn_2);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(99, 352, 1274, 321);
		txtHinhAnhMonAn.add(scrollPane_2);
		
		String[] columnNames_1 = {"Mã món ăn", "Loại món ăn", "Tên món ăn", "Giá tiền", "Số lượng tồn", "Tình trạng"};
		model_1 = new DefaultTableModel(columnNames_1, 0);
		table_1 = new JTable(model_1);
		table_1.setFillsViewportHeight(true);
		table_1.setBackground(new Color(255, 255, 255));
		scrollPane_2.setViewportView(table_1);
		
		btnQLnhanVien = new JButton("Quản lý nhân viên");
		btnQLnhanVien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyNhanVienGUI qlnv = new QuanLyNhanVienGUI();
				qlnv.setVisible(true);
				dispose();
			}
		});
		btnQLnhanVien.setBorder(null);
		btnQLnhanVien.setForeground(new Color(255, 255, 255));
		btnQLnhanVien.setBackground(new Color(255, 162, 78));
		btnQLnhanVien.setFont(new Font("Arial", Font.BOLD, 20));
		btnQLnhanVien.setBounds(10, 10, 214, 50);
		contentPane.add(btnQLnhanVien);
		
		btnQLMonAn = new JButton("Quản lý món ăn");
		btnQLMonAn.setBorder(null);
		btnQLMonAn.setBackground(new Color(255, 255, 255));
		btnQLMonAn.setForeground(new Color(33, 156, 144));
		btnQLMonAn.setFont(new Font("Arial", Font.BOLD, 20));
		btnQLMonAn.setBounds(234, 10, 214, 50);
		contentPane.add(btnQLMonAn);
		
		btnThongKe = new JButton("Thống kê");
		btnThongKe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThongKeGUI tk = new ThongKeGUI();
				tk.setVisible(true);
				dispose();
			}
		});
		btnThongKe.setBorder(null);
		btnThongKe.setForeground(new Color(255, 255, 255));
		btnThongKe.setBackground(new Color(255, 162, 78));
		btnThongKe.setFont(new Font("Arial", Font.BOLD, 20));
		btnThongKe.setBounds(458, 10, 214, 50);
		contentPane.add(btnThongKe);
	}
}
