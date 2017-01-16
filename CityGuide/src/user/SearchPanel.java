package user;
import java.awt.Font;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchPanel {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	JComboBox comboBox_1 = new JComboBox();
	JComboBox comboBox_2 = new JComboBox();
	JComboBox comboBox_3 = new JComboBox();
	JComboBox comboBox_4 = new JComboBox();

	public JPanel panel(JButton back) {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back.doClick();
			}
		});

		btnNewButton.setOpaque(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setBounds(582, 507, 219, 65);
		contentPane.add(btnNewButton);

		comboBox_4.setModel(new DefaultComboBoxModel(new String[] { "",
				"\u03A3\u03C4\u03AC\u03B4\u03B9\u03B1 \u03C0\u03BF\u03B4\u03BF\u03C3\u03C6\u03B1\u03AF\u03C1\u03BF\u03C5",
				"\u039A\u03BB\u03B5\u03B9\u03C3\u03C4\u03AC \u03B3\u03AE\u03C0\u03B5\u03B4\u03B1",
				"\u03A0\u03C1\u03BF\u03C0\u03BF\u03BD\u03B7\u03C4\u03B9\u03BA\u03AC \u03BA\u03AD\u03BD\u03C4\u03C1\u03B1" }));
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox_4.setBounds(1141, 291, 219, 59);
		contentPane.add(comboBox_4);

		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] { "",
				"\u0391\u03BE\u03B9\u03BF\u03B8\u03AD\u03B1\u03C4\u03B1", "\u0398\u03AD\u03B1\u03C4\u03C1\u03B1",
				"\u039C\u03BF\u03C5\u03C3\u03B5\u03AF\u03B1", "\u03A3\u03B9\u03BD\u03B5\u03BC\u03AC" }));
		comboBox_3.setBounds(867, 291, 219, 59);
		contentPane.add(comboBox_3);

		comboBox_2.setModel(new DefaultComboBoxModel(new String[] { "",
				"\u039A\u03AD\u03BD\u03C4\u03C1\u03B1 \u03B4\u03B9\u03B1\u03C3\u03BA\u03AD\u03B4\u03B1\u03C3\u03B7\u03C2",
				"\u0395\u03C3\u03C4\u03B9\u03B1\u03C4\u03CC\u03C1\u03B9\u03B1",
				"\u039A\u03B1\u03C6\u03B5\u03C4\u03AD\u03C1\u03B9\u03B5\u03C2" }));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox_2.setBounds(582, 291, 219, 59);
		contentPane.add(comboBox_2);

		comboBox_1.setModel(new DefaultComboBoxModel(
				new String[] { "", "\u039E\u03B5\u03BD\u03BF\u03B4\u03BF\u03C7\u03B5\u03AF\u03B1" }));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox_1.setBounds(296, 291, 219, 59);
		contentPane.add(comboBox_1);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "", "\u0391\u03B5\u03C1\u03BF\u03B4\u03C1\u03CC\u03BC\u03B9\u03BF",
						"\u039B\u03B9\u03BC\u03AC\u03BD\u03B9", "\u039C\u03B5\u03C4\u03C1\u03CC ",
						"\u03A4\u03C1\u03AC\u03BC", "\u039B\u03B5\u03C9\u03C6\u03BF\u03C1\u03B5\u03AF\u03B1" }));
		comboBox.setBounds(10, 291, 219, 59);
		contentPane.add(comboBox);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setText("\u0391\u03B8\u03BB\u03B7\u03C4\u03B9\u03C3\u03BC\u03CC\u03C2");
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField_5.setColumns(10);
		textField_5.setBounds(1141, 215, 219, 65);
		contentPane.add(textField_5);

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField_4.setText("\u03A0\u03BF\u03BB\u03B9\u03C4\u03B9\u03C3\u03BC\u03CC\u03C2");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(867, 215, 219, 65);
		contentPane.add(textField_4);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField.setText("\u039C\u03AD\u03C3\u03B1 \u03BC\u03B5\u03C4\u03B1\u03C6\u03BF\u03C1\u03AC\u03C2");
		textField.setBounds(10, 215, 219, 65);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("\u0394\u03B9\u03B1\u03BC\u03CC\u03BD\u03B7");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField_1.setColumns(10);
		textField_1.setBounds(296, 215, 219, 65);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setText("\u0394\u03B9\u03B1\u03C3\u03BA\u03AD\u03B4\u03B1\u03C3\u03B7");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField_2.setColumns(10);
		textField_2.setBounds(582, 215, 219, 65);
		contentPane.add(textField_2);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mili\\Desktop\\dusk-city-wallpaper-wallpaper-3.jpg"));
		lblNewLabel.setBounds(0, 0, 1370, 750);
		contentPane.add(lblNewLabel);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(938, 215, 256, 65);
		contentPane.add(textField_3);

	//	comboEnable(comboBox_4);
	//	comboEnable(comboBox_3);
	//	comboEnable(comboBox_2);
	//	comboEnable(comboBox_1);
		
		return contentPane;
	}

	void comboEnable(JComboBox jc) {
		if (jc.getName().equals("comboBox_4")) {
			jc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboDisable(comboBox_3);
					comboDisable(comboBox_2);
					comboDisable(comboBox_1);
					comboBox_3.setSelectedIndex(0);
					comboBox_2.setSelectedIndex(0);
					comboBox_1.setSelectedIndex(0);
				}
			});
		} else if (jc.getName().equals("comboBox_3")) {
			comboBox_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboDisable(comboBox_4);
					comboDisable(comboBox_2);
					comboDisable(comboBox_1);
					comboBox_4.setSelectedIndex(0);
					comboBox_2.setSelectedIndex(0);
					comboBox_1.setSelectedIndex(0);
				}
			});
		} else if (jc.getName().equals("comboBox_2")) {
			comboBox_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboDisable(comboBox_4);
					comboDisable(comboBox_3);
					comboDisable(comboBox_1);
					comboBox_4.setSelectedIndex(0);
					comboBox_3.setSelectedIndex(0);
					comboBox_1.setSelectedIndex(0);
				}
			});
		} else {
			comboBox_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboDisable(comboBox_4);
					comboDisable(comboBox_3);
					comboDisable(comboBox_2);
					comboBox_4.setSelectedIndex(0);
					comboBox_3.setSelectedIndex(0);
					comboBox_2.setSelectedIndex(0);
				}
			});
		}

	}

	void comboDisable(JComboBox jc) {
		if (jc.getName().equals("comboBox_4")) {
			jc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
		} else if (jc.getName().equals("comboBox_3")) {
			comboBox_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
		} else if (jc.getName().equals("comboBox_2")) {
			comboBox_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
		} else {
			comboBox_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
		}

	}
}
