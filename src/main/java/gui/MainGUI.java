package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class MainGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSearch;
	private JButton btnMonAn;
	private JButton btnPhongHat;
	private JButton btnCombo;
	private JButton btnDoUong;
	private JButton btnSnack;
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
	private JButton btnTraiCay;
	private JButton btnThemMon;
	private JButton btnCapNhat;
	private JDateChooser date;
	private JButton btnUser;
	private JButton btnLogout;
	private JPanel jpComboMain;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
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
		
		btnCombo = new JButton("COMBO");
		btnCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jpComboMain.removeAll();
				setButtonColor(btnCombo);
				SanPhamGUI jpCombo = new SanPhamGUI();
				jpCombo.setBounds(0, 0, 830, 533);
				jpCombo.setVisible(true);
				jpComboMain.add(jpCombo);
				jpComboMain.revalidate();
				jpComboMain.repaint();
			}
		});
		btnCombo.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/combo.png"));
		btnCombo.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		//btnNewButton.setShape(new RoundRectangle2D.Double(0, 0, 100, 50, 10, 10));
		btnCombo.setForeground(new Color(255, 255, 255));
		btnCombo.setBackground(new Color(255, 199, 0));
		btnCombo.setFont(new Font("Arial", Font.BOLD, 14));
		btnCombo.setBounds(48, 58, 135, 50);
		jpPhongHat.add(btnCombo);
		
		btnDoUong = new JButton("ĐỒ UỐNG");
		btnDoUong.addActionListener(new ActionListener() {
			private SanPhamGUI jpDoUong;

			public void actionPerformed(ActionEvent e) {
				jpComboMain.removeAll();
				jpDoUong = new SanPhamGUI();
				jpDoUong.setBounds(0, 0, 830, 533);
				jpDoUong.setVisible(true);
				setButtonColor(btnDoUong);
				jpComboMain.add(jpDoUong);
				jpComboMain.revalidate();
				jpComboMain.repaint();
				
			}

			
		});
		btnDoUong.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/drink.png"));
		btnDoUong.setForeground(Color.WHITE);
		btnDoUong.setFont(new Font("Arial", Font.BOLD, 14));
		btnDoUong.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnDoUong.setBackground(new Color(33, 156, 144));
		btnDoUong.setBounds(246, 58, 135, 50);
		jpPhongHat.add(btnDoUong);
		
		btnSnack = new JButton("SNACK");
		btnSnack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jpComboMain.removeAll();
				setButtonColor(btnSnack);
				SanPhamGUI jpSnack = new SanPhamGUI();
				jpSnack.setBounds(0, 0, 830, 533);
				jpSnack.setVisible(true);
				jpComboMain.add(jpSnack);
				jpComboMain.revalidate();
				jpComboMain.repaint();
			}
		});
		btnSnack.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/snack.png"));
		btnSnack.setForeground(Color.WHITE);
		btnSnack.setFont(new Font("Arial", Font.BOLD, 14));
		btnSnack.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnSnack.setBackground(new Color(33, 156, 144));
		btnSnack.setBounds(459, 58, 135, 50);
		jpPhongHat.add(btnSnack);
		
		btnTraiCay = new JButton("TRÁI CÂY");
		btnTraiCay.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/fruit.png"));
		btnTraiCay.setForeground(Color.WHITE);
		btnTraiCay.setFont(new Font("Arial", Font.BOLD, 14));
		btnTraiCay.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnTraiCay.setBackground(new Color(33, 156, 144));
		btnTraiCay.setBounds(661, 58, 135, 50);
		jpPhongHat.add(btnTraiCay);
		
		btnThemMon = new JButton("THÊM MÓN");
		btnThemMon.setForeground(Color.WHITE);
		btnThemMon.setFont(new Font("Arial", Font.BOLD, 14));
		btnThemMon.setBackground(new Color(33, 156, 144));
		btnThemMon.setBounds(242, 662, 150, 30);
		jpPhongHat.add(btnThemMon);
		
		btnCapNhat = new JButton("CẬP NHẬT");
		btnCapNhat.setForeground(Color.WHITE);
		btnCapNhat.setFont(new Font("Arial", Font.BOLD, 14));
		btnCapNhat.setBackground(new Color(33, 156, 144));
		btnCapNhat.setBounds(444, 662, 150, 30);
		jpPhongHat.add(btnCapNhat);
		
		jpComboMain = new JPanel();
		jpComboMain.setBackground(new Color(255, 255, 255));
		jpComboMain.setBounds(10, 118, 830, 533);
		jpComboMain.removeAll();
		SanPhamGUI jpCombo = new SanPhamGUI();
		jpCombo.setBounds(0, 0, 830, 533);
		jpCombo.setVisible(true);
		jpComboMain.add(jpCombo);
		jpComboMain.revalidate();
		jpComboMain.repaint();
		jpPhongHat.add(jpComboMain);
		jpComboMain.setLayout(null);
		
		
		
		
		btnPhongHat = new JButton("Phòng hát");
		btnPhongHat.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent e) {
				PhongHatGUI phongHatGUI=new PhongHatGUI(null, null);
				phongHatGUI.setVisible(true);
			}
		});
		btnPhongHat.setBorder(null);
		btnPhongHat.setBackground(new Color(255, 199, 0));
		btnPhongHat.setForeground(new Color(255, 255, 255));
		btnPhongHat.setFont(new Font("Arial", Font.BOLD, 14));
		btnPhongHat.setBounds(10, 40, 150, 35);
		contentPane.add(btnPhongHat);
		
		btnMonAn = new JButton("Món ăn");
		btnMonAn.setForeground(new Color(33, 156, 144));
		btnMonAn.setFont(new Font("Arial", Font.BOLD, 14));
		btnMonAn.setBorder(null);
		btnMonAn.setBackground(new Color(255, 255, 255));
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
		date=new JDateChooser();//Cái này là tạo cuốn lịch
		date.setFont(new Font("Arial", Font.PLAIN, 14));
		date.setBounds(153, 120, 454, 25);// set vị trí chỗ này
		date.setDateFormatString("dd/MM/yyyy");// Định dạng ngày tháng
		date.setDate(new Date());// Set ngayf mặc định là ngày hiện tại - không có cũng hông sao
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
		
		JButton btnSearchSDT = new JButton("Search");
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
		btnDatPhong.setBounds(248, 637, 170, 30);
		panel.add(btnDatPhong);
		
		btnTraPhong = new JButton("TRẢ PHÒNG");
		btnTraPhong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThanhToanGUI thanhToanGUI=new ThanhToanGUI();
				thanhToanGUI.setVisible(true);
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
				DoiPhongGUI doiPhongGUI = new DoiPhongGUI();
				doiPhongGUI.setVisible(true);
			}
		});
		btnDoiPhong.setForeground(Color.WHITE);
		btnDoiPhong.setFont(new Font("Arial", Font.BOLD, 14));
		btnDoiPhong.setBackground(new Color(33, 156, 144));
		btnDoiPhong.setBounds(248, 677, 170, 30);
		panel.add(btnDoiPhong);
		
		btnHuyDatPhong = new JButton("HỦY ĐẶT PHÒNG");
		btnHuyDatPhong.setForeground(Color.WHITE);
		btnHuyDatPhong.setFont(new Font("Arial", Font.BOLD, 14));
		btnHuyDatPhong.setBackground(new Color(33, 156, 144));
		btnHuyDatPhong.setBounds(456, 677, 170, 30);
		panel.add(btnHuyDatPhong);
		
		btnUser = new JButton("Nguyễn Văn A");
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
	private void setButtonColor(JButton btn) {
		setDefaultColor();
		if(btn == btnCombo) {
            btn.setBackground(new Color(255, 199, 0));
		}
		else if (btn == btnDoUong) {
			btn.setBackground(new Color(255, 199, 0));
		} else if (btn == btnSnack) {
			btn.setBackground(new Color(255, 199, 0));
		} else if (btn == btnTraiCay) {
			btn.setBackground(new Color(255, 199, 0));
		}
		
	}

	private void setDefaultColor() {
		btnCombo.setBackground(new Color(33, 156, 144));
		btnDoUong.setBackground(new Color(33, 156, 144));
		btnSnack.setBackground(new Color(33, 156, 144));
		btnTraiCay.setBackground(new Color(33, 156, 144));
		
		
	}
}
