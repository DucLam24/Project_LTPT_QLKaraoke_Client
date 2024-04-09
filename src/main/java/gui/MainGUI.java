package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

import entity.ChiTietDatCombo;
import entity.ChiTietDatMon;
import entity.Combo;
import entity.HoaDon;
import entity.KhachHang;
import entity.MonAn;
import entity.NhanVien;
import entity.PhieuDatPhong;
import entity.Phong;
import reponse.ResponseChiTietDatCombo;
import reponse.ResponseChiTietDatMon;
import reponse.ResponseCombo;
import reponse.ResponseHoaDon;
import reponse.ResponseMonAn;
import reponse.ResponsePhieuDatPhong;
import reponse.ResponsePhong;
import request.RequestChiTietDatCombo;
import request.RequestChiTietDatMon;
import request.RequestCombo;
import request.RequestHoaDon;
import request.RequestMonAn;
import request.RequestPhieuDatPhong;
import request.RequestPhong;
import service.FormatDateTime;
import service.MapMonAn;
import service.Service;

public class MainGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSearch;
	private JButton btnMonAn;
	private JButton btnPhongHat;
	private JButton btnPhongTrong;
	private JButton btnDatTruoc;
	private JButton btnDangSuDung;
	private JScrollPane scrollPane;
	private JPanel jpPhong1;
	private JPanel panel_15;
	private JPanel jpTrangThaiPhong;
	private JLabel lblTrangThaiPhong;
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
	private ButtonGroup groupGioiTinh;
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
	private JPanel jpMonAn;
	private JTextField textField;
	private JScrollPane scrollPane1;

	private RequestPhong requestPhong = new RequestPhong(Service.getInstance().getSocket());
	private ResponsePhong responsePhong = new ResponsePhong(Service.getInstance().getSocket());
	private JButton btnTamNgung;
	private JCheckBox chckVIP;
	private List<Phong> listPhongDatTruoc = new ArrayList<>();
	private List<Phong> listPhongTrong = new ArrayList<>();
	private List<Phong> listPhongDangSuDung = new ArrayList<>();
	private List<Phong> listPhongTamNgung = new ArrayList<>();
	private JLabel lblPhong;
	private JDateChooser date;
	private JButton btnThemMon;

	private RequestPhieuDatPhong requestPhieuDatPhong = new RequestPhieuDatPhong(Service.getInstance().getSocket());
	private ResponsePhieuDatPhong responsePhieuDatPhong = new ResponsePhieuDatPhong(Service.getInstance().getSocket());
	private RequestMonAn requestMonAn = new RequestMonAn(Service.getInstance().getSocket());
	private ResponseMonAn responseMonAn = new ResponseMonAn(Service.getInstance().getSocket());
	private RequestCombo requestCombo = new RequestCombo(Service.getInstance().getSocket());
	private ResponseCombo responseCombo = new ResponseCombo(Service.getInstance().getSocket());
	private List<PhieuDatPhong> listPDP;
	private PhieuDatPhong pdp;

	private List<Combo> listCombo = new ArrayList<>();
	private List<MonAn> listSnack = new ArrayList<>();
	private List<MonAn> listDrink = new ArrayList<>();
	private List<MonAn> listFruit = new ArrayList<>();
	private JPanel jpMonAn_1;
	private JButton btnSearchMA;
	private JButton btnTraiCay;
	private JButton btnSnack;
	private JButton btnDoUong;
	private JButton btnComBo;

	private Map<Object, Integer> mapMonAn = MapMonAn.getInstance().getMapMonAn();
	private RequestHoaDon requestHoaDon = new RequestHoaDon(Service.getInstance().getSocket());
	private ResponseHoaDon responseHoaDon = new ResponseHoaDon(Service.getInstance().getSocket());

	private RequestChiTietDatCombo requestChiTietDatCombo = new RequestChiTietDatCombo(
			Service.getInstance().getSocket());
	private ResponseChiTietDatCombo responseChiTietDatCombo = new ResponseChiTietDatCombo(
			Service.getInstance().getSocket());
	private RequestChiTietDatMon requestChiTietDatMon = new RequestChiTietDatMon(Service.getInstance().getSocket());
	private ResponseChiTietDatMon responseChiTietDatMon = new ResponseChiTietDatMon(Service.getInstance().getSocket());
	private HoaDon hd;
	private PhieuDatPhong pdp1;
	private HoaDon hd1;

	private Map<Object, Integer> mapMonAnFirst = new LinkedHashMap<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI(null);
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
	public MainGUI(NhanVien nv) {
		requestPhong.requestGetPhongByTinhTrang("Phòng trống");
		listPhongTrong = responsePhong.getRespaonseGetPhongByTinhTrang();
		initComponents(nv, listPhongTrong);

		requestPhong.requestGetPhongByTinhTrang(btnDatTruoc.getText());
		listPhongDatTruoc = responsePhong.getRespaonseGetPhongByTinhTrang();

		requestPhong.requestGetPhongByTinhTrang(btnDangSuDung.getText());
		listPhongDangSuDung = responsePhong.getRespaonseGetPhongByTinhTrang();

		requestPhong.requestGetPhongByTinhTrang(btnTamNgung.getText());
		listPhongTamNgung = responsePhong.getRespaonseGetPhongByTinhTrang();

		requestCombo.requestGetAllCombo();
		listCombo = responseCombo.getReponseGetAllCombo();

		requestMonAn.requestFindMonAnByLoai("Snack");
		listSnack = responseMonAn.getReponseFindMonAnByLoai();

		requestMonAn.requestFindMonAnByLoai("Đồ uống");
		listDrink = responseMonAn.getReponseFindMonAnByLoai();

		requestMonAn.requestFindMonAnByLoai("Trái cây");
		listFruit = responseMonAn.getReponseFindMonAnByLoai();

	}

	private void initComponents(NhanVien nv, List<Phong> listPhong) {

//		listPhong=new ArrayList<>();
//		Phong phong=new Phong("PT0001", "T1", LoaiPhong.phongThuong	,10, 20000,0);
//		listPhong.add(phong);

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
		// btnPhongTrong.setSelected(true);
		btnPhongTrong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSelectedButton(btnPhongTrong);
				setColorLoaiPhong(btnPhongTrong);
				jpPhong1.removeAll();
				if (!listPhongTrong.isEmpty()) {
					paintComPhong(listPhongTrong);
					jpPhong1.repaint();
					jpPhong1.revalidate();
				} else {
					jpPhong1.repaint();
					jpPhong1.revalidate();
				}
				btnGopPhong.setEnabled(false);
				btnDoiPhong.setEnabled(false);
				btnHuyDatPhong.setEnabled(false);
				btnNhanPhong.setEnabled(true);
				btnDatPhong.setEnabled(true);
				btnTraPhong.setEnabled(false);

			}
		});
		btnPhongTrong.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		// btnNewButton.setShape(new RoundRectangle2D.Double(0, 0, 100, 50, 10, 10));
		btnPhongTrong.setForeground(new Color(255, 255, 255));
		btnPhongTrong.setBackground(new Color(33, 156, 144));
		btnPhongTrong.setFont(new Font("Arial", Font.BOLD, 14));
		btnPhongTrong.setBounds(48, 58, 135, 30);
		jpPhongHat.add(btnPhongTrong);

		btnDatTruoc = new JButton("Đặt trước");
		btnDatTruoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Đặt trước");
				setSelectedButton(btnDatTruoc);
				setColorLoaiPhong(btnDatTruoc);
				jpPhong1.removeAll();
				if (!listPhongDatTruoc.isEmpty()) {
					paintComPhong(listPhongDatTruoc);
					jpPhong1.repaint();
					jpPhong1.revalidate();
				} else {
					jpPhong1.repaint();
					jpPhong1.revalidate();
				}
				btnGopPhong.setEnabled(false);
				btnDoiPhong.setEnabled(false);
				btnHuyDatPhong.setEnabled(true);
				btnNhanPhong.setEnabled(true);
				btnDatPhong.setEnabled(false);
				btnTraPhong.setEnabled(false);
			}
		});
		btnDatTruoc.setForeground(Color.WHITE);
		btnDatTruoc.setFont(new Font("Arial", Font.BOLD, 14));
		btnDatTruoc.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnDatTruoc.setBackground(new Color(33, 156, 144));
		btnDatTruoc.setBounds(246, 58, 135, 30);
		jpPhongHat.add(btnDatTruoc);

		btnDangSuDung = new JButton("Đang sử dụng");
		btnDangSuDung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSelectedButton(btnDangSuDung);
				setColorLoaiPhong(btnDangSuDung);
				jpPhong1.removeAll();
				if (!listPhongDangSuDung.isEmpty()) {
					paintComPhong(listPhongDangSuDung);
					jpPhong1.repaint();
					jpPhong1.revalidate();
				} else {
					jpPhong1.repaint();
					jpPhong1.revalidate();
				}
				btnGopPhong.setEnabled(true);
				btnDoiPhong.setEnabled(true);
				btnHuyDatPhong.setEnabled(false);
				btnNhanPhong.setEnabled(false);
				btnDatPhong.setEnabled(false);
				btnTraPhong.setEnabled(true);
			}
		});
		btnDangSuDung.setForeground(Color.WHITE);
		btnDangSuDung.setFont(new Font("Arial", Font.BOLD, 14));
		btnDangSuDung.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnDangSuDung.setBackground(new Color(33, 156, 144));
		btnDangSuDung.setBounds(459, 58, 135, 30);
		jpPhongHat.add(btnDangSuDung);

		btnTamNgung = new JButton("Tạm ngưng");
		btnTamNgung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setSelectedButton(btnTamNgung);
				setColorLoaiPhong(btnTamNgung);
				jpPhong1.removeAll();
				if (!listPhongTamNgung.isEmpty()) {
					paintComPhong(listPhongTamNgung);
					jpPhong1.repaint();
					jpPhong1.revalidate();
				}
				btnGopPhong.setEnabled(false);
				btnDoiPhong.setEnabled(false);
				btnHuyDatPhong.setEnabled(false);
				btnNhanPhong.setEnabled(false);
				btnDatPhong.setEnabled(false);
				btnTraPhong.setEnabled(false);
			}
		});
		btnTamNgung.setForeground(Color.WHITE);
		btnTamNgung.setFont(new Font("Arial", Font.BOLD, 14));
		btnTamNgung.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		btnTamNgung.setBackground(new Color(33, 156, 144));
		btnTamNgung.setBounds(661, 58, 135, 30);
		jpPhongHat.add(btnTamNgung);

		btnPhongTrong.setSelected(true);

		chckVIP = new JCheckBox("VIP");
		chckVIP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Phong> listPhong = new ArrayList<>();
				List<Phong> listPhongVIP = new ArrayList<>();
				if (btnPhongTrong.isSelected()) {
					listPhong = listPhongTrong;
				}
				if (btnDatTruoc.isSelected()) {
					listPhong = listPhongDatTruoc;
				}
				if (btnDangSuDung.isSelected()) {
					listPhong = listPhongDangSuDung;
				}
				if (btnTamNgung.isSelected()) {
					listPhong = listPhongTamNgung;
				}
				if (chckVIP.isSelected()) {
					listPhongVIP = new ArrayList<>();
					for (Phong phong : listPhong) {
						if (phong.getLoaiPhong().toString().equals("Phòng VIP")) {
							listPhongVIP.add(phong);
						}
					}
					if (listPhongVIP.isEmpty()) {
						jpPhong1.removeAll();
						jpPhong1.repaint();
						jpPhong1.revalidate();

					} else {
						jpPhong1.removeAll();
						paintComPhong(listPhongVIP);
						jpPhong1.repaint();
						jpPhong1.revalidate();
					}

				} else {
					if (btnPhongTrong.isSelected()) {
						jpPhong1.removeAll();
						paintComPhong(listPhongTrong);
						jpPhong1.repaint();
						jpPhong1.revalidate();
					}
					if (btnDatTruoc.isSelected()) {
						jpPhong1.removeAll();
						paintComPhong(listPhongDatTruoc);
						jpPhong1.repaint();
						jpPhong1.revalidate();
					}
					if (btnDangSuDung.isSelected()) {
						jpPhong1.removeAll();
						paintComPhong(listPhongDangSuDung);
						jpPhong1.repaint();
						jpPhong1.revalidate();
					}
					if (btnTamNgung.isSelected()) {
						jpPhong1.removeAll();
						paintComPhong(listPhongTamNgung);
						jpPhong1.repaint();
						jpPhong1.revalidate();
					}
				}
			}
		});

		chckVIP.setBackground(new Color(255, 255, 255));
		chckVIP.setFont(new Font("Arial", Font.BOLD, 14));
		chckVIP.setBounds(16, 103, 93, 21);
		jpPhongHat.add(chckVIP);

		jpPhong1 = new JPanel();
		jpPhong1.setBackground(new Color(255, 255, 255));
		scrollPane = new JScrollPane(jpPhong1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jpPhong1.setLayout(null);
		System.out.println(listPhong);

		scrollPane.setBorder(null);
		scrollPane.setBounds(5, 140, 840, 610);
		jpPhongHat.add(scrollPane);

		btnPhongHat = new JButton("Phòng hát");
		btnPhongHat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jpPhongHat.setVisible(true);
				jpMonAn.setVisible(false);
				setColor(btnPhongHat);

			}

		});
		btnPhongHat.setBorder(null);
		btnPhongHat.setBackground(new Color(255, 255, 255));
		btnPhongHat.setForeground(new Color(33, 156, 144));
		btnPhongHat.setFont(new Font("Arial", Font.BOLD, 14));
		btnPhongHat.setBounds(10, 40, 150, 35);
		contentPane.add(btnPhongHat);

		btnMonAn = new JButton("Món ăn");
		btnMonAn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				for (Map.Entry<Object, Integer> entry : mapMonAn.entrySet()) {
//					System.out.println(entry.getKey() + " " + entry.getValue());
//				}
				if (mapMonAn.isEmpty()) {
					btnThemMon.setText("Thêm món");
				} else {
					btnThemMon.setText("Cập nhật");
				}
				setColor(btnMonAn);
				jpPhongHat.setVisible(false);
				jpMonAn.setVisible(true);

				jpMonAn_1.removeAll();
				List<Object> list = new ArrayList<>();
				list.addAll(listCombo);
				paintComMonAn(list);
				jpMonAn_1.repaint();
				jpMonAn_1.revalidate();
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
		jpTrangThaiPhong.setVisible(false);

		lblPhong = new JLabel("Phòng 101");
		lblPhong.setFont(new Font("Arial", Font.BOLD, 20));
		lblPhong.setBounds(224, 10, 120, 30);
		panel_15.add(lblPhong);
		lblPhong.setVisible(false);

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
		panel_2.setBorder(new TitledBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)),
				"KH\u00C1CH H\u00C0NG", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 128, 128)));
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

		groupGioiTinh = new ButtonGroup();
		groupGioiTinh.add(rdbtnNam);
		groupGioiTinh.add(rdbtnNu);

		lblNewLabel_21 = new JLabel("Ngày sinh:");
		lblNewLabel_21.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_21.setBounds(21, 120, 109, 17);
		date = new JDateChooser();
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
		panel_4.setBorder(new TitledBorder(new MatteBorder(1, 0, 0, 0, (Color) new Color(0, 0, 0)), "M\u00D3N \u0102N",
				TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 128, 128)));
		panel_4.setBackground(new Color(255, 255, 255));
		panel_4.setBounds(10, 419, 639, 197);
		panel.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBackground(new Color(255, 255, 255));
		panel_4.add(scrollPane_1, BorderLayout.CENTER);

		String[] header = { "Mã món ăn", "Tên món ăn", "Số lượng", "Đơn giá", "Thành tiền" };
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
				ThanhToanGUI thanhToan = new ThanhToanGUI();
				thanhToan.setVisible(true);
			}
		});
		btnTraPhong.setForeground(Color.WHITE);
		btnTraPhong.setFont(new Font("Arial", Font.BOLD, 14));
		btnTraPhong.setBackground(new Color(33, 156, 144));
		btnTraPhong.setBounds(456, 677, 170, 30);
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
				DoiPhongGUI doiPhong = new DoiPhongGUI();
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
		btnHuyDatPhong.setBounds(456, 637, 170, 30);
		panel.add(btnHuyDatPhong);

		String ten = null;
		if (nv != null)
			ten = nv.getHoTen();
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
				DangNhapGUI dangNhap = new DangNhapGUI();
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

		jpMonAn = new JPanel();
		jpMonAn.setBounds(10, 75, 850, 756);
		contentPane.add(jpMonAn);
		jpMonAn.setLayout(null);

		jpMonAn.setBackground(new Color(255, 255, 255));

		textField = new JTextField();
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 0)));
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setBounds(80, 10, 604, 25);
		jpMonAn.add(textField);
		textField.setColumns(10);

		btnSearchMA = new JButton("Search");
		btnSearchMA.setForeground(new Color(255, 255, 255));
		btnSearchMA.setBackground(new Color(33, 156, 144));
		btnSearchMA.setFont(new Font("Arial", Font.PLAIN, 14));
		btnSearchMA.setBounds(683, 12, 85, 25);
		jpMonAn.add(btnSearchMA);
// Xử lý món ăn --------------------------------------------------------------------------------------

		btnComBo = new JButton("COMBO");
		btnComBo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColorMonAn(btnComBo);
				jpMonAn_1.removeAll();
				List<Object> list = new ArrayList<>();
				list.addAll(listCombo);
				paintComMonAn(list);
				jpMonAn_1.repaint();
				jpMonAn_1.revalidate();
			}
		});
		btnComBo.setBackground(new Color(255, 162, 78));
		btnComBo.setForeground(new Color(255, 255, 255));
		btnComBo.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/combo.png"));
		btnComBo.setFont(new Font("Arial", Font.BOLD, 14));
		btnComBo.setBounds(47, 57, 160, 40);
		jpMonAn.add(btnComBo);

		btnDoUong = new JButton("ĐỒ UỐNG");
		btnDoUong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColorMonAn(btnDoUong);
				jpMonAn_1.removeAll();
				List<Object> list = new ArrayList<>();
				list.addAll(listDrink);
				paintComMonAn(list);
				jpMonAn_1.repaint();
				jpMonAn_1.revalidate();
			}
		});
		btnDoUong.setBackground(new Color(33, 156, 144));
		btnDoUong.setForeground(new Color(255, 255, 255));
		btnDoUong.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/drink.png"));
		btnDoUong.setFont(new Font("Arial", Font.BOLD, 14));
		btnDoUong.setBounds(249, 57, 160, 40);
		jpMonAn.add(btnDoUong);

		btnSnack = new JButton("SNACK");
		btnSnack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColorMonAn(btnSnack);
				jpMonAn_1.removeAll();
				List<Object> list = new ArrayList<>();
				list.addAll(listSnack);
				paintComMonAn(list);
				jpMonAn_1.repaint();
				jpMonAn_1.revalidate();
			}
		});
		btnSnack.setBackground(new Color(33, 156, 144));
		btnSnack.setForeground(new Color(255, 255, 255));
		btnSnack.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/snack.png"));
		btnSnack.setFont(new Font("Arial", Font.BOLD, 14));
		btnSnack.setBounds(445, 57, 160, 40);
		jpMonAn.add(btnSnack);

		btnTraiCay = new JButton("TRÁI CÂY");
		btnTraiCay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setColorMonAn(btnTraiCay);
				jpMonAn_1.removeAll();
				List<Object> list = new ArrayList<>();
				list.addAll(listFruit);
				paintComMonAn(list);
				jpMonAn_1.repaint();
				jpMonAn_1.revalidate();
			}
		});
		btnTraiCay.setBackground(new Color(33, 156, 144));
		btnTraiCay.setForeground(new Color(255, 255, 255));
		btnTraiCay.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/fruit.png"));
		btnTraiCay.setFont(new Font("Arial", Font.BOLD, 14));
		btnTraiCay.setBounds(641, 57, 160, 40);
		jpMonAn.add(btnTraiCay);

		jpMonAn_1 = new JPanel();
		jpMonAn_1.setBackground(new Color(255, 255, 255));

		scrollPane1 = new JScrollPane(jpMonAn_1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane1.setBounds(10, 129, 830, 538);
		scrollPane1.setBorder(null);
		jpMonAn.add(scrollPane1);
		jpMonAn_1.setLayout(null);

		btnThemMon = new JButton("Thêm món");
		btnThemMon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.setRowCount(0);
				//Thêm vào model để hiển thị
				for (Map.Entry<Object, Integer> entry : mapMonAn.entrySet()) {
					Object key = entry.getKey();
					Integer value = entry.getValue();
					System.out.println(key + " " + value);
					if (key instanceof Combo) {
						Combo combo = (Combo) key;
						model.addRow(new Object[] { combo.getComboID(), combo.getTenCombo(), value,
								combo.getGiaTien(), combo.getGiaTien() * value });
					}
					if (key instanceof MonAn) {
						MonAn monAn = (MonAn) key;
						model.addRow(new Object[] { monAn.getMonAnID(), monAn.getTenMonAn(),
								value + " " + monAn.getDonViTinh(), monAn.getDonGia(), monAn.getDonGia() * value });
					}
				}
				if(btnThemMon.getText().equals("Cập nhật")) {
					//Thêm vào database
					String maPhong = lblKQMaPhong.getText();
					requestHoaDon.requestGetHoaDonByPhongIDAndTinhTrang(maPhong, false);
					List<HoaDon> hd = responseHoaDon.getReponseGetHoaDonByPhongIDAndTinhTrang();
					HoaDon hd1 = hd.get(0);
					requestChiTietDatCombo.requestGetByPhieuDatMonID(hd1.getPhieuDatMon().getPhieuDatMonID());
					List<ChiTietDatCombo> ctCombo = responseChiTietDatCombo.getReponseGetByPhieuDatMonID();
					requestChiTietDatMon.requestGetByPhieuDatMonID(hd1.getPhieuDatMon().getPhieuDatMonID());
					List<ChiTietDatMon> ctMon = responseChiTietDatMon.getReponseGetByPhieuDatMonID();
					int tmp = 0;
					for (Map.Entry<Object, Integer> entry : mapMonAn.entrySet()) {
						if (entry.getKey() instanceof Combo) {
							Combo combo = (Combo) entry.getKey();
							ChiTietDatCombo ct = new ChiTietDatCombo();
							ct.setCombo(combo);
							ct.setSoLuong(entry.getValue());
							ct.setPhieuDatMon(hd1.getPhieuDatMon());
							if (ctCombo.size() == 0) {
								requestChiTietDatCombo.requestAddCombo(ct);
								responseChiTietDatCombo.getReponseAddCombo();
							} else {
								for (ChiTietDatCombo c : ctCombo) {
									if (c.getCombo().getComboID() == combo.getComboID()) {
										requestChiTietDatCombo.requestUpdateSoLuong(ct);
										responseChiTietDatCombo.getReponseUpdateSoLuong();
									} else {
										requestChiTietDatCombo.requestAddCombo(ct);
										responseChiTietDatCombo.getReponseAddCombo();
									}
								}
							}
						} else if (entry.getKey() instanceof MonAn) {
							MonAn monAn = (MonAn) entry.getKey();
							ChiTietDatMon ct = new ChiTietDatMon();
							ct.setMonAn(monAn);
							ct.setSoLuong(entry.getValue());
							ct.setPhieuDatMon(hd1.getPhieuDatMon());
							if (ctMon.size() == 0) {
								requestChiTietDatMon.requestAddMonAn(ct);
								responseChiTietDatMon.getReponseAddMonAn();
							} else {
								for (ChiTietDatMon c : ctMon) {
									if (c.getMonAn().getMonAnID() == monAn.getMonAnID()) {
										requestChiTietDatMon.requestUpdateSoLuong(ct);
										responseChiTietDatMon.getReponseUpdateSoLuong();
									} else {
										requestChiTietDatMon.requestAddMonAn(ct);
										responseChiTietDatMon.getReponseAddMonAn();
									}
								}
							}
						}
					}
					
					
					
				}
				
			}
		});
		btnThemMon.setForeground(Color.WHITE);
		btnThemMon.setFont(new Font("Arial", Font.BOLD, 14));
		btnThemMon.setBackground(new Color(33, 156, 144));
		btnThemMon.setBounds(210, 677, 170, 30);
		jpMonAn.add(btnThemMon);

		jpPhongHat.setVisible(true);
		jpMonAn.setVisible(false);

		setSelectedButton(btnPhongTrong);
		setColorLoaiPhong(btnPhongTrong);
		paintComPhong(listPhongTrong);

		btnGopPhong.setEnabled(false);
		btnDoiPhong.setEnabled(false);
		btnHuyDatPhong.setEnabled(false);
		btnNhanPhong.setEnabled(true);
		btnDatPhong.setEnabled(true);
		btnTraPhong.setEnabled(false);

	}

	protected void setColorMonAn(JButton btnComBo2) {
		setDefaultColorMonAn();
		btnComBo2.setBackground(new Color(255, 162, 78));
	}

	private void setDefaultColorMonAn() {
		// TODO Auto-generated method stub
		btnComBo.setBackground(new Color(33, 156, 144));
		btnDoUong.setBackground(new Color(33, 156, 144));
		btnSnack.setBackground(new Color(33, 156, 144));
		btnTraiCay.setBackground(new Color(33, 156, 144));

	}

	protected void setSelectedButton(JButton btn) {
		// TODO Auto-generated method stub
		setDefaultSelectedButton();
		btn.setSelected(true);

	}

	private void setDefaultSelectedButton() {
		// TODO Auto-generated method stub
		btnDangSuDung.setSelected(false);
		btnDatPhong.setSelected(false);
		btnDatTruoc.setSelected(false);
		btnDoiPhong.setSelected(false);
		btnGopPhong.setSelected(false);
		btnHuyDatPhong.setSelected(false);
		btnLogout.setSelected(false);
		btnMonAn.setSelected(false);
		btnNhanPhong.setSelected(false);
		btnPhongHat.setSelected(false);
		btnPhongTrong.setSelected(false);
		btnSearchSDT.setSelected(false);
		btnTamNgung.setSelected(false);
		btnTraPhong.setSelected(false);
		btnUser.setSelected(false);

	}

	protected void setColorLoaiPhong(JButton btn) {
		setDefaultColorLoaiPhong();
		btn.setBackground(new Color(255, 162, 78));

	}

	private void setDefaultColorLoaiPhong() {
		btnPhongTrong.setBackground(new Color(33, 156, 144));
		btnDatTruoc.setBackground(new Color(33, 156, 144));
		btnDangSuDung.setBackground(new Color(33, 156, 144));
		btnTamNgung.setBackground(new Color(33, 156, 144));

	}

	private void setColor(JButton btnPhongHat) {
		setDefaultColor();
		btnPhongHat.setBackground(new Color(255, 255, 255));
		btnPhongHat.setForeground(new Color(33, 156, 144));
	}

	private void setDefaultColor() {
		btnPhongHat.setBackground(new Color(255, 162, 78));
		btnPhongHat.setForeground(new Color(255, 255, 255));
		btnMonAn.setBackground(new Color(255, 162, 78));
		btnMonAn.setForeground(new Color(255, 255, 255));
	}

	private void paintComPhong(List<Phong> listPhong) {
		if (listPhong != null) {
//			JPanel jpPhong = new JPanel();
//			jpPhong.setBounds(0, 0, 840, 100);
//			jpPhong.setLayout(new FlowLayout(FlowLayout.LEFT));
			int x = 10;
			int y = 10;
			for (Phong p : listPhong) {

				ComPhong comPhong = new ComPhong(p);
				if (p.getTinhTrang() == 1) {
					requestPhieuDatPhong.requestGetPDPByPhongIDAndTinhTrang(p.getPhongID(), 0);
					listPDP = responsePhieuDatPhong.getResponseGetPDPByPhongIDAndTinhTrang();
					if (listPDP.size() > 0) {
						pdp = listPDP.get(0);
						comPhong.setPhongDatTruoc(pdp);
					}
				} else if (p.getTinhTrang() == 2) {
					System.out.println("Phong dang su dung");
					requestHoaDon.requestGetHoaDonByPhongIDAndTinhTrang(p.getPhongID(), false);
					List<HoaDon> listHD = responseHoaDon.getReponseGetHoaDonByPhongIDAndTinhTrang();

					// System.out.println(listHD.size());
					if (listHD.size() > 0) {
						try {
							hd = listHD.get(0);
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
						comPhong.setPhongDangSuDung(hd);
						// System.out.println(hd.getPhieuDatMon().getPhieuDatMonID());

					}
				}
				comPhong.addMouseListener(new MouseAdapter() {

					@Override
					public void mouseClicked(MouseEvent e) {
						lblKQMaPhong.setText(p.getPhongID());
						lblKQTenPhong.setText(p.getTenPhong());
						lblKQLoaiPhong.setText(p.getLoaiPhong().toString());
						lblKetQuaSoNguoi.setText(String.valueOf(p.getSoNguoi()));
						lblKQGiaTien.setText(String.valueOf(p.getGiaTien()));
						lblPhong.setText(p.getTenPhong());
						lblPhong.setVisible(true);
						jpTrangThaiPhong.setVisible(true);
						// Phòng trống---------------------------------
						if (p.getTinhTrang() == 0) {
							lblKQGioVao.setText("");
							jpTrangThaiPhong.setBackground(new Color(50, 240, 19));
							lblTrangThaiPhong.setText("Phòng trống");
							lblTongGio.setText("00:00:00");
							resetKhachHang();
							resetMonAn();

						}
						// Phòng đặt trước---------------------------------
						if (p.getTinhTrang() == 1) {
//							lblKQGioVao.setText(p.getGioVao().toString());
							requestPhieuDatPhong.requestGetPDPByPhongIDAndTinhTrang(p.getPhongID(), 0);
							listPDP = responsePhieuDatPhong.getResponseGetPDPByPhongIDAndTinhTrang();
							if (listPDP.size() > 0) {
								pdp1 = listPDP.get(0);
								comPhong.setPhongDatTruoc(pdp);
							}
							jpTrangThaiPhong.setBackground(new Color(255, 199, 0));
							lblTrangThaiPhong.setText("Phòng đặt trước");
							lblKQGioVao.setText(pdp1.getGioVao().toString());
							setKhachHang(pdp.getKhachHang());
							lblTongGio.setText(FormatDateTime.tinhKhoanThoiGian(pdp1.getGioVao(), LocalDateTime.now()));
							lblKQGioVao.setText(FormatDateTime.formatLayGio(pdp1.getGioVao()));
							resetMonAn();
//							System.out.println(listPDP);
						}
						// Phòng đang sử dụng---------------------------------
						if (p.getTinhTrang() == 2) {
							mapMonAn.clear();
							model.setRowCount(0);
							jpTrangThaiPhong.setBackground(new Color(235, 100, 64));
							lblTrangThaiPhong.setText("Phòng đang sử dụng");
							
//							setMonAn(mapMonAn);
							
							requestHoaDon.requestGetHoaDonByPhongIDAndTinhTrang(p.getPhongID(), false);
							List<HoaDon> listHD = responseHoaDon.getReponseGetHoaDonByPhongIDAndTinhTrang();
							hd1 = listHD.get(0);
							setKhachHang(hd1.getKhachHang());
//								model.setRowCount(0);
							lblKQGioVao.setText(FormatDateTime.formatLayGio(hd1.getGioVao()));
							lblTongGio.setText(FormatDateTime.tinhKhoanThoiGian(hd1.getGioVao(), LocalDateTime.now()));

							requestChiTietDatCombo.requestGetByPhieuDatMonID(hd1.getPhieuDatMon().getPhieuDatMonID());
							List<ChiTietDatCombo> listCTDC = responseChiTietDatCombo.getReponseGetByPhieuDatMonID();

							requestChiTietDatMon.requestGetByPhieuDatMonID(hd1.getPhieuDatMon().getPhieuDatMonID());
							List<ChiTietDatMon> listCTDM = responseChiTietDatMon.getReponseGetByPhieuDatMonID();

							for (ChiTietDatCombo ctdc : listCTDC) {
								if (mapMonAn.containsKey(ctdc.getCombo())) {
									mapMonAn.replace(ctdc.getCombo(), ctdc.getSoLuong());
								} else {
									mapMonAn.put(ctdc.getCombo(), ctdc.getSoLuong());
								}
//									mapMonAn.put(ctdc.getCombo(), ctdc.getSoLuong());
							}
							for (ChiTietDatMon ctdm : listCTDM) {
								if (mapMonAn.containsKey(ctdm.getMonAn())) {
									mapMonAn.replace(ctdm.getMonAn(), ctdm.getSoLuong());
								} else {
									mapMonAn.put(ctdm.getMonAn(), ctdm.getSoLuong());

								}
//									mapMonAn.put(ctdm.getMonAn(), ctdm.getSoLuong());

							}

							setMonAn(mapMonAn);
							mapMonAnFirst.putAll(mapMonAn);
							System.out.println("Map click");
							for (Map.Entry<Object, Integer> entry : mapMonAn.entrySet()) {
								System.out.println(entry.getKey() + " " + entry.getValue());
							}
						}
						// Phòng tạm ngưng---------------------------------
						if (p.getTinhTrang() == 3) {
							lblKQGioVao.setText("");
							jpTrangThaiPhong.setBackground(new Color(0, 0, 0));
							lblTrangThaiPhong.setText("Phòng tạm ngưng");
							lblTongGio.setText("00:00:00");
							resetKhachHang();
							resetMonAn();
						}
					}
				});
				comPhong.setBounds(x, y, 265, 100);
				jpPhong1.add(comPhong);
				x += 275;
				if (x > 800) {
					x = 10;
					y += 110;
				}
			}

		}
	}

	public void paintComMonAn(List<Object> listObject) {
		if (listObject != null) {
			int x = 10;
			int y = 10;
			for (Object o : listObject) {
				ComMonAn comMonAn = new ComMonAn(o);
				comMonAn.setBounds(x, y, 265, 100);
				jpMonAn_1.add(comMonAn);
				x += 275;
				if (x > 800) {
					x = 10;
					y += 110;
				}
//				System.out.println("paintComMonAn");
//				for (Map.Entry<Object, Integer> entry : mapMonAn.entrySet()) {
////					System.out.println(entry.getKey());
////					System.out.println(o);
////					System.out.println(entry.getKey().equals(o));
//					if (entry.getKey().equals(o)) {
//						comMonAn.setSoLuong(entry.getValue());
//					}
//					
//					System.out.println(entry.getKey() + " " + entry.getValue());
//				}
//				List<Object> list = Arrays.asList(o);
				if (mapMonAn.containsKey(o)) {
					comMonAn.setSoLuong(mapMonAn.get(o));
				}
			}

		}
	}

	public void capNhatMapCong(Object o) {
		for (Map.Entry<Object, Integer> entry : mapMonAn.entrySet()) {
			if (entry.getKey().equals(o)) {
				entry.setValue(entry.getValue() + 1);
			}
		}

	}

	public void resetKhachHang() {
		txtHoTen.setText("");
		txtSDT.setText("");
		txtEmail.setText("");
		groupGioiTinh.clearSelection();
		date.setDate(null);

	}

	public void resetMonAn() {
		model.setRowCount(0);
	}

	public void resetPhong() {
		lblKetQuaSoNguoi.setText("");
		lblKQGiaTien.setText("");
		lblKQGioVao.setText("");
		lblKQLoaiPhong.setText("");
		lblKQMaPhong.setText("");
		lblKQTenPhong.setText("");

	}

	public void reset() {
		resetKhachHang();
		resetPhong();
		resetMonAn();
	}

	public void setKhachHang(KhachHang kh) {
		txtHoTen.setText(kh.getHoTen());
		txtSDT.setText(kh.getSoDienThoai());
		txtEmail.setText(kh.getEmail());
		if (kh.isGioiTinh()) {
			rdbtnNam.setSelected(true);
		} else {
			rdbtnNu.setSelected(true);
		}
		Date date1 = java.sql.Date.valueOf(kh.getNgaySinh());
		date.setDate(date1);

	}

	public void setMonAn(Map<Object, Integer> map) {
		for (Map.Entry<Object, Integer> entry : map.entrySet()) {
			Object key = entry.getKey();
			Integer value = entry.getValue();
			if (key instanceof Combo) {
				Combo combo = (Combo) key;
				model.addRow(new Object[] { combo.getComboID(), combo.getTenCombo(), value, combo.getGiaTien(),
						combo.getGiaTien() * value });
			}
			if (key instanceof MonAn) {
				MonAn monAn = (MonAn) key;
				model.addRow(new Object[] { monAn.getMonAnID(), monAn.getTenMonAn(), value + " " + monAn.getDonViTinh(),
						monAn.getDonGia(), monAn.getDonGia() * value });
			}
		}

	}

}
