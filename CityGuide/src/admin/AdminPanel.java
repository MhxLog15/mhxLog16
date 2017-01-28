package admin;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanel extends JFrame {

	private JPanel contentPane;
	private AdminMapPanel am;

	public String action = "";

	public JPanel panel(JButton back) {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);

		JButton btnDelete = new JButton(
				"\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action = "del";
				back.doClick();
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnDelete.setBounds(501, 474, 316, 124);
		contentPane.add(btnDelete);

		JButton btnEdit = new JButton(
				"\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action = "edi";
				back.doClick();
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnEdit.setBounds(501, 339, 316, 124);
		contentPane.add(btnEdit);

		JButton btnAdd = new JButton(
				"\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				action = "add";
				back.doClick();
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnAdd.setBounds(501, 200, 316, 124);
		contentPane.add(btnAdd);

		JLabel lblBackround = new JLabel("just backround");
	//	lblBackround.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/Images/point.png")).getImage()));
	//	JLabel lblBackround = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Images/point.png")));

		lblBackround.setBounds(0, 0, 1370, 750);
		contentPane.add(lblBackround);

		return contentPane;
	}
}
