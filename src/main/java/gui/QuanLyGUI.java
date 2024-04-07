package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuanLyGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLyGUI frame = new QuanLyGUI();
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
	public QuanLyGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPhong = new JButton("PHÒNG HÁT");
		btnPhong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhongHatGUI phongHatGUI=new PhongHatGUI(null, null);
				phongHatGUI.setVisible(true);
				dispose();
			}
		});
		btnPhong.setForeground(new Color(255, 255, 255));
		btnPhong.setBackground(new Color(33, 156, 144));
		btnPhong.setFont(new Font("Arial", Font.BOLD, 20));
		btnPhong.setBounds(441, 179, 251, 39);
		contentPane.add(btnPhong);
		
		JButton btnQuanLy = new JButton("QUẢN LÝ");
		btnQuanLy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuanLyNhanVienGUI qlnvGUI=new QuanLyNhanVienGUI();
				qlnvGUI.setVisible(true);
				dispose();
			}
		});
		btnQuanLy.setForeground(new Color(255, 255, 255));
		btnQuanLy.setFont(new Font("Arial", Font.BOLD, 20));
		btnQuanLy.setBackground(new Color(33, 156, 144));
		btnQuanLy.setBounds(441, 263, 251, 39);
		contentPane.add(btnQuanLy);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(System.getProperty("user.dir") + "/src/main/java/img/bckground.png"));
		lblNewLabel.setBounds(20, 10, 411, 543);
		contentPane.add(lblNewLabel);
	}
}
