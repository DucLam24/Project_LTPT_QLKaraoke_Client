package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Insets;

public class ComMonAn extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public ComMonAn() {
		setBackground(new Color(142, 255, 255));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ComMonAn.class.getResource("/img/combo_1.png")));
		lblNewLabel.setBounds(0, 0, 100, 100);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("COMBO 1");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_1.setBounds(110, 10, 130, 19);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("99.000");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setBounds(110, 39, 130, 19);
		add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(110, 69, 37, 21);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setMargin(new Insets(2, 10, 2, 10));
		btnNewButton_1.setBounds(203, 69, 37, 21);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_3 = new JLabel("0");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3.setBounds(150, 73, 45, 13);
		add(lblNewLabel_3);

	}

}
