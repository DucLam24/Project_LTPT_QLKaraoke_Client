package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import entity.NhanVien;
import entity.Phong;



public class PhongHatGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSearch;
	private JButton btnMonAn;
	private JButton btnPhongHat;
	private JButton btnPhongTrong;
	private JButton btnDatTruoc;
	private JButton btnDangSuDung;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JPanel jpPhong;
	private JPanel jpPhongTrong;
	private JPanel jpPhongDatTruoc;
	private JPanel jpPhongDangSuDung;
	private JPanel jpPhongTamNgung;
	private JPanel panel_7;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPanel jp;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JPanel panel_9;
	private JLabel lblNewLabel_5;
	private JPanel panel_10;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JPanel panel_11;
	private JLabel lblNewLabel_9;
	private JPanel panel_12;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JPanel panel_13;
	private JLabel lblNewLabel_13;
	private JPanel panel_14;
	private JLabel lblNewLabel_14;
	private JPanel panel_15;
	private JPanel jpTrangThaiPhong;
	private JLabel lblTrangThaiPhong;
	private JLabel lblPhong;
	private JLabel lblTongGio;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblKQMaPhong;
	private JLabel lblKQTenPhong;
	private JLabel lblKQLoaiPhong;
	private JLabel lblKetQuaSoNguoi;
	private JLabel lblKQGiaTien;
	private JLabel lblKQGioVao;
	private JPanel panel_2;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	private JRadioButton rdbtnNu;
	private JRadioButton rdbtnNam;
	private ButtonGroup group;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JTextField txtHoTen;
	private JTextField txtSDT;
	private JTextField txtEmail;
	private DefaultTableModel model;
	private JScrollPane scrollPane_1;
	private JTable tableMonAn;
	private JButton btnNhanPhong;
	private JButton btnDatPhong;
	private JButton btnTraPhong;
	private JButton btnGopPhong;
	private JButton btnDoiPhong;
	private JButton btnHuyDatPhong;
	private JButton btnSearchSDT;
	private JButton btnUser;
	private JButton btnLogout;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhongHatGUI frame = new PhongHatGUI(null,null);
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
	public PhongHatGUI(NhanVien nv,List<Phong> listPhong) {
		initComponents(nv,listPhong);
	}

	
	private void initComponents(NhanVien nv,List<Phong> listPhong) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(33, 156, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpPhongHat = new JPanel();
		jpPhongHat.setBackground(new Color(255, 255, 255));
		jpPhongHat.setBounds(10, 75, 850, 760);
		contentPane.add(jpPhongHat);
		jpPhongHat.setLayout(null);
		
		txtSearch = new JTextField();
		txtSearch.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		txtSearch.setFont(new Font("Arial", Font.PLAIN, 14));
		txtSearch.setBounds(48, 10, 700, 30);
		jpPhongHat.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("");
		btnSearch.setBackground(new Color(255, 255, 255));
		btnSearch.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		btnSearch.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/search.png"));
		btnSearch.setBounds(746, 10, 50, 30);
		jpPhongHat.add(btnSearch);
		
		btnPhongTrong = new JButton("Phòng trống");
		btnPhongTrong.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		//btnNewButton.setShape(new RoundRectangle2D.Double(0, 0, 100, 50, 10, 10));
		btnPhongTrong.setForeground(new Color(255, 255, 255));
		btnPhongTrong.setBackground(new Color(0, 255, 0));
		btnPhongTrong.setFont(new Font("Arial", Font.BOLD, 14));
		btnPhongTrong.setBounds(48, 58, 135, 30);
		jpPhongHat.add(btnPhongTrong);
		
		btnDatTruoc = new JButton("Đặt trước");
		btnDatTruoc.setForeground(Color.WHITE);
		btnDatTruoc.setFont(new Font("Arial", Font.BOLD, 14));
		btnDatTruoc.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnDatTruoc.setBackground(new Color(255, 199, 0));
		btnDatTruoc.setBounds(246, 58, 135, 30);
		jpPhongHat.add(btnDatTruoc);
		
		btnDangSuDung = new JButton("Đang sử dụng");
		btnDangSuDung.setForeground(Color.WHITE);
		btnDangSuDung.setFont(new Font("Arial", Font.BOLD, 14));
		btnDangSuDung.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnDangSuDung.setBackground(new Color(235, 100, 64));
		btnDangSuDung.setBounds(459, 58, 135, 30);
		jpPhongHat.add(btnDangSuDung);
		
		JButton btnTamNgung = new JButton("Tạm ngưng");
		btnTamNgung.setForeground(Color.WHITE);
		btnTamNgung.setFont(new Font("Arial", Font.BOLD, 14));
		btnTamNgung.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnTamNgung.setBackground(new Color(0, 0, 0));
		btnTamNgung.setBounds(661, 58, 135, 30);
		jpPhongHat.add(btnTamNgung);
		
		JCheckBox chckVIP = new JCheckBox("VIP");
		chckVIP.setBackground(new Color(255, 255, 255));
		chckVIP.setFont(new Font("Arial", Font.BOLD, 14));
		chckVIP.setBounds(16, 103, 93, 21);
		jpPhongHat.add(chckVIP);
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		scrollPane = new JScrollPane(panel_1 , ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_1.setLayout(null);
		
		jpPhong = new JPanel();
		jpPhong.setBounds(0, 0, 840, 100);
		FlowLayout fl_jpPhong = (FlowLayout) jpPhong.getLayout();
		fl_jpPhong.setAlignment(FlowLayout.LEFT);
		fl_jpPhong.setVgap(0);
		fl_jpPhong.setHgap(10);
		jpPhong.setBorder(null);
		jpPhong.setBackground(new Color(255, 255, 255));
		jpPhong.setPreferredSize(new Dimension(840, 100));
		panel_1.add(jpPhong);
		
		jpPhongTrong = new JPanel();
		jpPhongTrong.setBackground(new Color(216, 233, 168));
		jpPhongTrong.setPreferredSize(new Dimension(265, 100));
		jpPhong.add(jpPhongTrong);
		jpPhongTrong.setLayout(new BorderLayout(0, 0));
		
		panel_7 = new JPanel();
		panel_7.setBackground(new Color(50, 240, 19));
		panel_7.setPreferredSize(new Dimension(70, 10));
		jpPhongTrong.add(panel_7, BorderLayout.WEST);
		panel_7.setLayout(null);
		
		lblNewLabel_1 = new JLabel("P101");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 43, 50, 24);
		panel_7.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("VIP");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setBounds(20, 66, 33, 24);
		panel_7.add(lblNewLabel_2);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(15, 0, 45, 47);
		panel_7.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/star.png"));
		
		jp = new JPanel();
		jp.setBackground(new Color(216, 233, 168));
		jpPhongTrong.add(jp, BorderLayout.CENTER);
		jp.setLayout(null);
		
		lblNewLabel_3 = new JLabel("TRỐNG");
		lblNewLabel_3.setForeground(new Color(0, 128, 0));
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_3.setBounds(41, 38, 86, 24);
		jp.add(lblNewLabel_3);
		
		jpPhongDatTruoc = new JPanel();
		jpPhongDatTruoc.setPreferredSize(new Dimension(265, 100));
		jpPhong.add(jpPhongDatTruoc);
		jpPhongDatTruoc.setLayout(new BorderLayout(0, 0));
		
		panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setPreferredSize(new Dimension(70, 10));
		panel_9.setBackground(new Color(255, 199, 0));
		jpPhongDatTruoc.add(panel_9, BorderLayout.WEST);
		
		lblNewLabel_5 = new JLabel("P101");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 38, 50, 24);
		panel_9.add(lblNewLabel_5);
		
		panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 239, 183));
		jpPhongDatTruoc.add(panel_10, BorderLayout.CENTER);
		panel_10.setLayout(null);
		
		lblNewLabel_6 = new JLabel("30/03/2021  17:00:00");
		lblNewLabel_6.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_6.setBounds(24, 10, 161, 13);
		panel_10.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Xuân Thanh");
		lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel_7.setBounds(24, 33, 161, 25);
		panel_10.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("00:00:00");
		lblNewLabel_8.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_8.setBounds(59, 68, 87, 22);
		panel_10.add(lblNewLabel_8);
		
		jpPhongDangSuDung = new JPanel();
		jpPhongDangSuDung.setPreferredSize(new Dimension(265, 100));
		jpPhong.add(jpPhongDangSuDung);
		jpPhongDangSuDung.setLayout(new BorderLayout(0, 0));
		
		panel_11 = new JPanel();
		panel_11.setLayout(null);
		panel_11.setPreferredSize(new Dimension(70, 10));
		panel_11.setBackground(new Color(235, 100, 64));
		jpPhongDangSuDung.add(panel_11, BorderLayout.WEST);
		
		lblNewLabel_9 = new JLabel("P101");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_9.setBounds(10, 38, 50, 24);
		panel_11.add(lblNewLabel_9);
		
		panel_12 = new JPanel();
		panel_12.setBackground(new Color(245, 179, 161));
		jpPhongDangSuDung.add(panel_12, BorderLayout.CENTER);
		
		lblNewLabel_10 = new JLabel("30/03/2021  17:00:00");
		lblNewLabel_10.setFont(new Font("Arial", Font.BOLD, 14));
		panel_12.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Xuân Thanh");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 25));
		panel_12.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("00:00:00");
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 20));
		panel_12.add(lblNewLabel_12);
		
		jpPhongTamNgung = new JPanel();
		jpPhongTamNgung.setBounds(10, 117, 265, 100);
		jpPhongTamNgung.setPreferredSize(new Dimension(265, 100));
		panel_1.add(jpPhongTamNgung);
		jpPhongTamNgung.setLayout(new BorderLayout(0, 0));
		
		panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setPreferredSize(new Dimension(70, 10));
		panel_13.setBackground(new Color(0, 0, 0));
		jpPhongTamNgung.add(panel_13, BorderLayout.WEST);
		
		lblNewLabel_13 = new JLabel("P101");
		lblNewLabel_13.setForeground(Color.WHITE);
		lblNewLabel_13.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_13.setBounds(10, 38, 50, 24);
		panel_13.add(lblNewLabel_13);
		
		panel_14 = new JPanel();
		panel_14.setBackground(new Color(217, 217, 217));
		jpPhongTamNgung.add(panel_14, BorderLayout.CENTER);
		panel_14.setLayout(null);
		
		lblNewLabel_14 = new JLabel("TẠM NGƯNG");
		lblNewLabel_14.setBounds(10, 34, 163, 30);
		lblNewLabel_14.setFont(new Font("Arial", Font.BOLD, 25));
		panel_14.add(lblNewLabel_14);
		scrollPane.setBorder(null);
		scrollPane.setBounds(5, 140, 840, 610);
		jpPhongHat.add(scrollPane);
		
		
		
		
		btnPhongHat = new JButton("Phòng hát");
		btnPhongHat.setBorder(null);
		btnPhongHat.setBackground(new Color(255, 255, 255));
		btnPhongHat.setForeground(new Color(33, 156, 144));
		btnPhongHat.setFont(new Font("Arial", Font.BOLD, 14));
		btnPhongHat.setBounds(10, 40, 150, 35);
		contentPane.add(btnPhongHat);
		
		btnMonAn = new JButton("Món ăn");
		btnMonAn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainGUI main = new MainGUI();
				main.setVisible(true);
				dispose();
			}
		});
		btnMonAn.setForeground(new Color(255, 255, 255));
		btnMonAn.setFont(new Font("Arial", Font.BOLD, 14));
		btnMonAn.setBorder(null);
		btnMonAn.setBackground(new Color(255, 162, 78));
		btnMonAn.setBounds(170, 40, 150, 35);
		contentPane.add(btnMonAn);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(867, 75, 659, 760);
		contentPane.add(panel);
		panel.setLayout(null);
		
		panel_15 = new JPanel();
		panel_15.setBackground(new Color(255, 255, 255));
		panel_15.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		panel_15.setBounds(10, 10, 639, 43);
		panel.add(panel_15);
		panel_15.setLayout(null);
		
		jpTrangThaiPhong = new JPanel();
		jpTrangThaiPhong.setBackground(new Color(50, 240, 19));
		jpTrangThaiPhong.setBounds(0, 10, 160, 30);
		jpTrangThaiPhong.setPreferredSize(new Dimension(150, 30));
		panel_15.add(jpTrangThaiPhong);
		jpTrangThaiPhong.setLayout(null);
		
		lblTrangThaiPhong = new JLabel("Phòng trống");
		lblTrangThaiPhong.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrangThaiPhong.setForeground(new Color(255, 255, 255));
		lblTrangThaiPhong.setFont(new Font("Arial", Font.BOLD, 14));
		lblTrangThaiPhong.setBounds(0, 0, 160, 25);
		jpTrangThaiPhong.add(lblTrangThaiPhong);
		
		lblPhong = new JLabel("Phòng 101");
		lblPhong.setFont(new Font("Arial", Font.BOLD, 20));
		lblPhong.setBounds(224, 10, 120, 30);
		panel_15.add(lblPhong);
		
		lblTongGio = new JLabel("00:00:00");
		lblTongGio.setFont(new Font("Arial", Font.BOLD, 20));
		lblTongGio.setBounds(428, 10, 120, 30);
		panel_15.add(lblTongGio);
		
		lblNewLabel_15 = new JLabel("Mã phòng:");
		lblNewLabel_15.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_15.setBounds(32, 63, 79, 17);
		panel.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("Tên phòng:");
		lblNewLabel_16.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_16.setBounds(32, 90, 95, 17);
		panel.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("Loạiphòng:");
		lblNewLabel_17.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_17.setBounds(32, 118, 95, 17);
		panel.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("Số người:");
		lblNewLabel_18.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_18.setBounds(32, 145, 95, 17);
		panel.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("Giá tiền:");
		lblNewLabel_19.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_19.setBounds(32, 172, 95, 17);
		panel.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("Giờ vào:");
		lblNewLabel_20.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_20.setBounds(32, 199, 95, 17);
		panel.add(lblNewLabel_20);
		
		lblKQMaPhong = new JLabel("...");
		lblKQMaPhong.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQMaPhong.setBounds(161, 63, 465, 17);
		panel.add(lblKQMaPhong);
		
		lblKQTenPhong = new JLabel("...");
		lblKQTenPhong.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQTenPhong.setBounds(161, 90, 465, 17);
		panel.add(lblKQTenPhong);
		
		lblKQLoaiPhong = new JLabel("...");
		lblKQLoaiPhong.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQLoaiPhong.setBounds(161, 118, 465, 17);
		panel.add(lblKQLoaiPhong);
		
		lblKetQuaSoNguoi = new JLabel("...");
		lblKetQuaSoNguoi.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKetQuaSoNguoi.setBounds(161, 145, 465, 17);
		panel.add(lblKetQuaSoNguoi);
		
		lblKQGiaTien = new JLabel("...");
		lblKQGiaTien.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQGiaTien.setBounds(161, 172, 465, 17);
		panel.add(lblKQGiaTien);
		
		lblKQGioVao = new JLabel("...");
		lblKQGioVao.setFont(new Font("Arial", Font.PLAIN, 14));
		lblKQGioVao.setBounds(161, 199, 465, 17);
		panel.add(lblKQGioVao);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)), "KH\u00C1CH H\u00C0NG", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(10, 226, 639, 191);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_27 = new JLabel("Họ tên:");
		lblNewLabel_27.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_27.setBounds(21, 30, 95, 17);
		panel_2.add(lblNewLabel_27);
		
		lblNewLabel_28 = new JLabel("Số điện thoại:");
		lblNewLabel_28.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_28.setBounds(21, 60, 109, 17);
		panel_2.add(lblNewLabel_28);
		
		lblNewLabel_29 = new JLabel("Giới tính:");
		lblNewLabel_29.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_29.setBounds(21, 93, 109, 17);
		panel_2.add(lblNewLabel_29);
		
		rdbtnNam = new JRadioButton("Nam");
		rdbtnNam.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNam.setBackground(new Color(255, 255, 255));
		rdbtnNam.setBounds(153, 89, 79, 21);
		panel_2.add(rdbtnNam);
		
		rdbtnNu = new JRadioButton("Nữ");
		rdbtnNu.setFont(new Font("Arial", Font.PLAIN, 14));
		rdbtnNu.setBackground(Color.WHITE);
		rdbtnNu.setBounds(259, 89, 79, 21);
		panel_2.add(rdbtnNu);
		
		group = new ButtonGroup();
		group.add(rdbtnNam);
		group.add(rdbtnNu);
		
		lblNewLabel_21 = new JLabel("Ngày sinh:");
		lblNewLabel_21.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_21.setBounds(21, 120, 109, 17);
		JDateChooser date=new JDateChooser();
		date.setFont(new Font("Arial", Font.PLAIN, 14));
		date.setBounds(150, 120, 457, 25);
		date.setDateFormatString("dd/MM/yyyy");
		date.setDate(new Date());
		panel_2.add(lblNewLabel_21);
		panel_2.add(date);
		
		lblNewLabel_22 = new JLabel("Email:");
		lblNewLabel_22.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_22.setBounds(21, 158, 109, 17);
		panel_2.add(lblNewLabel_22);
		
		txtHoTen = new JTextField();
		txtHoTen.setFont(new Font("Arial", Font.PLAIN, 14));
		txtHoTen.setBounds(153, 25, 454, 25);
		panel_2.add(txtHoTen);
		txtHoTen.setColumns(10);
		
		txtSDT = new JTextField();
		txtSDT.setFont(new Font("Arial", Font.PLAIN, 14));
		txtSDT.setColumns(10);
		txtSDT.setBounds(153, 55, 349, 25);
		panel_2.add(txtSDT);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 14));
		txtEmail.setColumns(10);
		txtEmail.setBounds(153, 151, 454, 25);
		panel_2.add(txtEmail);
		
		btnSearchSDT = new JButton("Search");
		btnSearchSDT.setBackground(new Color(0, 128, 128));
		btnSearchSDT.setForeground(new Color(255, 255, 255));
		btnSearchSDT.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSearchSDT.setBounds(512, 55, 96, 25);
		panel_2.add(btnSearchSDT);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)), "M\u00D3N \u0102N", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(10, 419, 639, 197);
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(new Color(255, 255, 255));
		panel_4.add(scrollPane_1, BorderLayout.CENTER);
		
		String[] header = {"Mã món ăn", "Tên món ăn", "Số lượng", "Đơn giá", "Thành tiền"};
		model = new DefaultTableModel(header, 0);
		tableMonAn = new JTable(model);
		tableMonAn.setFont(new Font("Arial", Font.PLAIN, 14));
		tableMonAn.setBackground(new Color(255, 255, 255));
		scrollPane_1.setViewportView(tableMonAn);
		
		btnNhanPhong = new JButton("NHẬN PHÒNG");
		btnNhanPhong.setForeground(new Color(255, 255, 255));
		btnNhanPhong.setBackground(new Color(33, 156, 144));
		btnNhanPhong.setFont(new Font("Arial", Font.BOLD, 14));
		btnNhanPhong.setBounds(32, 637, 170, 30);
		panel.add(btnNhanPhong);
		
		btnDatPhong = new JButton("ĐẶT PHÒNG");
		btnDatPhong.setForeground(Color.WHITE);
		btnDatPhong.setFont(new Font("Arial", Font.BOLD, 14));
		btnDatPhong.setBackground(new Color(33, 156, 144));
		btnDatPhong.setBounds(251, 637, 170, 30);
		panel.add(btnDatPhong);
		
		btnTraPhong = new JButton("TRẢ PHÒNG");
		btnTraPhong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThanhToanGUI thanhToan=new ThanhToanGUI();
				thanhToan.setVisible(true);
			}
		});
		btnTraPhong.setForeground(Color.WHITE);
		btnTraPhong.setFont(new Font("Arial", Font.BOLD, 14));
		btnTraPhong.setBackground(new Color(33, 156, 144));
		btnTraPhong.setBounds(456, 637, 170, 30);
		panel.add(btnTraPhong);
		
		btnGopPhong = new JButton("GỘP PHÒNG");
		btnGopPhong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GopPhongGUI gopPhongGUI = new GopPhongGUI();
				gopPhongGUI.setVisible(true);
			}
		});
		btnGopPhong.setForeground(Color.WHITE);
		btnGopPhong.setFont(new Font("Arial", Font.BOLD, 14));
		btnGopPhong.setBackground(new Color(33, 156, 144));
		btnGopPhong.setBounds(32, 677, 170, 30);
		panel.add(btnGopPhong);
		
		btnDoiPhong = new JButton("ĐỔI PHÒNG");
		btnDoiPhong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoiPhongGUI doiPhong=new DoiPhongGUI();
				doiPhong.setVisible(true);
				
			}
		});
		btnDoiPhong.setForeground(Color.WHITE);
		btnDoiPhong.setFont(new Font("Arial", Font.BOLD, 14));
		btnDoiPhong.setBackground(new Color(33, 156, 144));
		btnDoiPhong.setBounds(251, 677, 170, 30);
		panel.add(btnDoiPhong);
		
		btnHuyDatPhong = new JButton("HỦY ĐẶT PHÒNG");
		btnHuyDatPhong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnHuyDatPhong.setForeground(Color.WHITE);
		btnHuyDatPhong.setFont(new Font("Arial", Font.BOLD, 14));
		btnHuyDatPhong.setBackground(new Color(33, 156, 144));
		btnHuyDatPhong.setBounds(456, 677, 170, 30);
		panel.add(btnHuyDatPhong);
		
		
		String ten=null;
		if(nv!=null)
			ten=nv.getHoTen();
		btnUser = new JButton();
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUser.setText(ten);
		btnUser.setBorder(null);
		btnUser.setBackground(new Color(33, 156, 144));
		btnUser.setForeground(new Color(255, 255, 255));
		btnUser.setFont(new Font("Arial", Font.BOLD, 14));
		btnUser.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/user_1.png"));
		btnUser.setBounds(1273, 33, 173, 32);
		contentPane.add(btnUser);
		
		btnLogout = new JButton("");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DangNhapGUI dangNhap=new DangNhapGUI();
				dangNhap.setVisible(true);
				dispose();
			}
		});
		btnLogout.setForeground(new Color(255, 255, 255));
		btnLogout.setBackground(new Color(33, 156, 144));
		btnLogout.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/logout.png"));
		btnLogout.setBorder(null);
		btnLogout.setBounds(1456, 29, 70, 46);
		contentPane.add(btnLogout);
		
	}
}
