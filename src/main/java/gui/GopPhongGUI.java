package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class GopPhongGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	private JTable table;
	private JLabel lblNewLabel_2;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GopPhongGUI frame = new GopPhongGUI();
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
	
	public GopPhongGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 790, 545);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GỘP PHÒNG");
		lblNewLabel.setForeground(new Color(33, 156, 144));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(271, 10, 176, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chọn phòng cần gộp:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setBounds(38, 50, 176, 21);
		contentPane.add(lblNewLabel_1);
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(38, 81, 707, 237);
		contentPane.add(scrollPane);
		
		String[] header = {"", "Phòng", "Loại phòng", "Giá tiền", "Giờ vào", "Ghi chú"};
		model=new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"", "Phòng", "Loại phòng", "Giá tiền", "Giờ vào", "Ghi chú"
				}
			) {
				Class[] columnTypes = new Class[] {
					Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class
				};
				public Class getColumnClass(int columnIndex) {
					return columnTypes[columnIndex];
				}
			};
		table = new JTable() ;
		table.setRowHeight(20);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"", "Ph\u00F2ng", "Lo\u1EA1i ph\u00F2ng", "Gi\u00E1 ti\u1EC1n", "Gi\u1EDD v\u00E0o", "Ghi ch\u00FA"
			}
		) {
			Class[] columnTypes = new Class[] {
				Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(30);
		table.setFont(new Font("Arial", Font.PLAIN, 14));
		//add checkbox vào column
		
		table.setFillsViewportHeight(true);
		scrollPane.setViewportView(table);
		
		lblNewLabel_2 = new JLabel("Chọn phòng mới:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_2.setBounds(38, 366, 132, 21);
		contentPane.add(lblNewLabel_2);
		
		comboBox = new JComboBox();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setEditable(true);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox.setBounds(170, 360, 509, 35);
		contentPane.add(comboBox);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("VIP\r\n");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("Arial", Font.BOLD, 14));
		chckbxNewCheckBox.setBounds(695, 367, 58, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("GỘP PHÒNG");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(33, 156, 144));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(271, 435, 169, 35);
		contentPane.add(btnNewButton);
	}
}
