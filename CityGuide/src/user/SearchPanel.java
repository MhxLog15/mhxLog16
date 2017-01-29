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
	private JTextField textField_mesa;
	private JTextField textField_diamoni;
	private JTextField textField_diaskedasi;
	private JTextField textField_politismos;
	private JTextField textField_athlitismos;

	JComboBox comboBox_diamoni = new JComboBox();
	JComboBox comboBox_mesa = new JComboBox();
	JComboBox comboBox_politismos = new JComboBox();
	JComboBox comboBox_athlitismos = new JComboBox();

	public JPanel panel(JButton back) {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);

		JButton search = new JButton("\u0391\u03BD\u03B1\u03B6\u03AE\u03C4\u03B7\u03C3\u03B7");
		search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back.doClick();
			}
		});

		search.setOpaque(false);
		search.setForeground(new Color(255, 255, 255));
		search.setFont(new Font("Tahoma", Font.PLAIN, 28));
		search.setBackground(new Color(50, 205, 50));
		search.setBounds(582, 507, 219, 65);
		contentPane.add(search);

		comboBox_athlitismos.setModel(new DefaultComboBoxModel(new String[] { "",
				"\u03A3\u03C4\u03AC\u03B4\u03B9\u03B1 \u03C0\u03BF\u03B4\u03BF\u03C3\u03C6\u03B1\u03AF\u03C1\u03BF\u03C5",
				"\u039A\u03BB\u03B5\u03B9\u03C3\u03C4\u03AC \u03B3\u03AE\u03C0\u03B5\u03B4\u03B1",
				"\u03A0\u03C1\u03BF\u03C0\u03BF\u03BD\u03B7\u03C4\u03B9\u03BA\u03AC \u03BA\u03AD\u03BD\u03C4\u03C1\u03B1" }));
		comboBox_athlitismos.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox_athlitismos.setBounds(1141, 291, 219, 59);
		contentPane.add(comboBox_athlitismos);

		comboBox_politismos.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox_politismos.setModel(new DefaultComboBoxModel(new String[] { "",
				"\u0391\u03BE\u03B9\u03BF\u03B8\u03AD\u03B1\u03C4\u03B1", "\u0398\u03AD\u03B1\u03C4\u03C1\u03B1",
				"\u039C\u03BF\u03C5\u03C3\u03B5\u03AF\u03B1", "\u03A3\u03B9\u03BD\u03B5\u03BC\u03AC" }));
		comboBox_politismos.setBounds(867, 291, 219, 59);
		contentPane.add(comboBox_politismos);

		comboBox_mesa.setModel(new DefaultComboBoxModel(new String[] { "",
				"\u039A\u03AD\u03BD\u03C4\u03C1\u03B1 \u03B4\u03B9\u03B1\u03C3\u03BA\u03AD\u03B4\u03B1\u03C3\u03B7\u03C2",
				"\u0395\u03C3\u03C4\u03B9\u03B1\u03C4\u03CC\u03C1\u03B9\u03B1",
				"\u039A\u03B1\u03C6\u03B5\u03C4\u03AD\u03C1\u03B9\u03B5\u03C2" }));
		comboBox_mesa.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox_mesa.setBounds(582, 291, 219, 59);
		contentPane.add(comboBox_mesa);

		comboBox_diamoni.setModel(new DefaultComboBoxModel(
				new String[] { "", "\u039E\u03B5\u03BD\u03BF\u03B4\u03BF\u03C7\u03B5\u03AF\u03B1" }));
		comboBox_diamoni.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox_diamoni.setBounds(296, 291, 219, 59);
		contentPane.add(comboBox_diamoni);

		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 22));
		comboBox.setModel(new DefaultComboBoxModel(
				new String[] { "", "\u0391\u03B5\u03C1\u03BF\u03B4\u03C1\u03CC\u03BC\u03B9\u03BF",
						"\u039B\u03B9\u03BC\u03AC\u03BD\u03B9", "\u039C\u03B5\u03C4\u03C1\u03CC ",
						"\u03A4\u03C1\u03AC\u03BC", "\u039B\u03B5\u03C9\u03C6\u03BF\u03C1\u03B5\u03AF\u03B1" }));
		comboBox.setBounds(10, 291, 219, 59);
		contentPane.add(comboBox);

		textField_athlitismos = new JTextField();
		textField_athlitismos.setEditable(false);
		textField_athlitismos.setHorizontalAlignment(SwingConstants.CENTER);
		textField_athlitismos.setText("\u0391\u03B8\u03BB\u03B7\u03C4\u03B9\u03C3\u03BC\u03CC\u03C2");
		textField_athlitismos.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField_athlitismos.setColumns(10);
		textField_athlitismos.setBounds(1141, 215, 219, 65);
		contentPane.add(textField_athlitismos);

		textField_politismos = new JTextField();
		textField_politismos.setEditable(false);
		textField_politismos.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField_politismos.setText("\u03A0\u03BF\u03BB\u03B9\u03C4\u03B9\u03C3\u03BC\u03CC\u03C2");
		textField_politismos.setHorizontalAlignment(SwingConstants.CENTER);
		textField_politismos.setColumns(10);
		textField_politismos.setBounds(867, 215, 219, 65);
		contentPane.add(textField_politismos);

		textField_mesa = new JTextField();
		textField_mesa.setEditable(false);
		textField_mesa.setHorizontalAlignment(SwingConstants.CENTER);
		textField_mesa.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField_mesa.setText("\u039C\u03AD\u03C3\u03B1 \u03BC\u03B5\u03C4\u03B1\u03C6\u03BF\u03C1\u03AC\u03C2");
		textField_mesa.setBounds(10, 215, 219, 65);
		contentPane.add(textField_mesa);
		textField_mesa.setColumns(10);

		textField_diamoni = new JTextField();
		textField_diamoni.setEditable(false);
		textField_diamoni.setHorizontalAlignment(SwingConstants.CENTER);
		textField_diamoni.setText("\u0394\u03B9\u03B1\u03BC\u03CC\u03BD\u03B7");
		textField_diamoni.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField_diamoni.setColumns(10);
		textField_diamoni.setBounds(296, 215, 219, 65);
		contentPane.add(textField_diamoni);

		textField_diaskedasi = new JTextField();
		textField_diaskedasi.setEditable(false);
		textField_diaskedasi.setHorizontalAlignment(SwingConstants.CENTER);
		textField_diaskedasi.setText("\u0394\u03B9\u03B1\u03C3\u03BA\u03AD\u03B4\u03B1\u03C3\u03B7");
		textField_diaskedasi.setFont(new Font("Tahoma", Font.PLAIN, 28));
		textField_diaskedasi.setColumns(10);
		textField_diaskedasi.setBounds(582, 215, 219, 65);
		contentPane.add(textField_diaskedasi);

		JLabel lblBackround = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Images/dusk-city-wallpaper-wallpaper-3.jpg")));
		lblBackround.setBounds(0, 0, 1370, 750);
		contentPane.add(lblBackround);
		
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
					comboDisable(comboBox_politismos);
					comboDisable(comboBox_mesa);
					comboDisable(comboBox_diamoni);
					comboBox_politismos.setSelectedIndex(0);
					comboBox_mesa.setSelectedIndex(0);
					comboBox_diamoni.setSelectedIndex(0);
				}
			});
		} else if (jc.getName().equals("comboBox_3")) {
			comboBox_politismos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboDisable(comboBox_athlitismos);
					comboDisable(comboBox_mesa);
					comboDisable(comboBox_diamoni);
					comboBox_athlitismos.setSelectedIndex(0);
					comboBox_mesa.setSelectedIndex(0);
					comboBox_diamoni.setSelectedIndex(0);
				}
			});
		} else if (jc.getName().equals("comboBox_2")) {
			comboBox_mesa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboDisable(comboBox_athlitismos);
					comboDisable(comboBox_politismos);
					comboDisable(comboBox_diamoni);
					comboBox_athlitismos.setSelectedIndex(0);
					comboBox_politismos.setSelectedIndex(0);
					comboBox_diamoni.setSelectedIndex(0);
				}
			});
		} else {
			comboBox_diamoni.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					comboDisable(comboBox_athlitismos);
					comboDisable(comboBox_politismos);
					comboDisable(comboBox_mesa);
					comboBox_athlitismos.setSelectedIndex(0);
					comboBox_politismos.setSelectedIndex(0);
					comboBox_mesa.setSelectedIndex(0);
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
			comboBox_politismos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
		} else if (jc.getName().equals("comboBox_2")) {
			comboBox_mesa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
		} else {
			comboBox_diamoni.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
		}

	}
}
