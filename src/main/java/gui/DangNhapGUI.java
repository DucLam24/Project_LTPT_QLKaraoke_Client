package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import entity.NhanVien;
import entity.Phong;
import entity.Quyen;
import reponse.ResponseLogin;
import reponse.ResponseNhanVien;
import reponse.ResponsePhong;
import request.RequestLogin;
import request.RequestNhanVien;
import request.RequestPhong;
import service.Service;

public class DangNhapGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPassword;
	private JButton btnDangNhap;
	
	private RequestLogin requestLogin=new RequestLogin(Service.getInstance().getSocket());
	private ResponseLogin responseLogin=new ResponseLogin(Service.getInstance().getSocket());
	
	private RequestNhanVien requestNhanVien = new RequestNhanVien(Service.getInstance().getSocket());	
	private ResponseNhanVien responseNhanVien = new ResponseNhanVien(Service.getInstance().getSocket());
	
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DangNhapGUI frame = new DangNhapGUI();
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
	public DangNhapGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(33, 156, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel imgMicro = new JLabel("");
		
		imgMicro.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/micro.png"));
		imgMicro.setBounds(62, 10, 188, 343);
		contentPane.add(imgMicro);
		
		JLabel imgSafary = new JLabel("");
		imgSafary.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/safary.png"));
		imgSafary.setBounds(352, 46, 224, 105);
		contentPane.add(imgSafary);
		
		JLabel imgProfile = new JLabel("");
		imgProfile.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/profile.png"));
		imgProfile.setBounds(231, 162, 52, 46);
		contentPane.add(imgProfile);
		
		JLabel imgKey = new JLabel("");
		imgKey.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/key.png"));
		imgKey.setBounds(231, 237, 67, 29);
		contentPane.add(imgKey);
		
		txtUser = new JTextField();
		txtUser.setForeground(new Color(255, 255, 255));
		txtUser.setBackground(new Color(33, 156, 144));
		txtUser.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtUser.setPreferredSize(new Dimension(100, 30));
		txtUser.setFont(new Font("Arial", Font.PLAIN, 14));
		txtUser.setBounds(314, 165, 298, 40);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setForeground(new Color(255, 255, 255));
		txtPassword.setBackground(new Color(33, 156, 144));
		txtPassword.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)));
		txtPassword.setFont(new Font("Arial", Font.PLAIN, 14));
		txtPassword.setPreferredSize(new Dimension(100, 30));
		txtPassword.setBounds(314, 226, 298, 40);
		contentPane.add(txtPassword);
		
		btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String user = txtUser.getText();
				String password = txtPassword.getText();
//				String user = "NV240002";
//				String password ="12345678";
				if(user.equals("")){
					JOptionPane.showMessageDialog(null, "Vui lòng nhập tên đăng nhập");
                }
                else if(password.equals("")){
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mật khẩu");
                }
                else{
                    requestLogin.requestLogin(user, password);
                    Quyen quyen = responseLogin.getResponseLogin();
                    if(quyen !=null) {
						if (quyen.toString().equals("Quản lý")) {
							QuanLyGUI quanLyGUI = new QuanLyGUI();
							quanLyGUI.setVisible(true);
							dispose();
						} else if (quyen.toString().equals("Nhân viên")) {
							requestNhanVien.requestGetNhanVienById(user);
							NhanVien nhanVien = responseNhanVien.getReponseGetNhanVienById();
//							requestPhong.requestGetPhongByTinhTrang("Phòng trống");
//							List<Phong> listPhong = responsePhong.getRespaonseGetPhongByTinhTrang();
							MainGUI mainGUI = new MainGUI(nhanVien);
							mainGUI.setVisible(true);
							dispose();
						}
                    }
                    
				}
			}
				
		});

		btnDangNhap.setForeground(new Color(255, 255, 255));
		btnDangNhap.setBackground(new Color(255, 162, 78));
		btnDangNhap.setFont(new Font("Arial", Font.BOLD, 14));
		
		btnDangNhap.setBounds(392, 292, 150, 35);
		contentPane.add(btnDangNhap);
	}
}
