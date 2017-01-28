package admin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.border.LineBorder;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;

import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AdminMapPanel extends JFrame {

	private JPanel contentPane;
	public JPanel panel;
	public JTextArea textArea_Address, textArea_Number, textArea_Description;
	public int x = -10, y = -10;
	public JComboBox comboBox;
	private String mode = "";
	////////////////// public SELECTED button-label

	public JPanel panel(JButton back, String mode) {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		
		this.mode = mode;

		// String[] values = new String[] {"Metro", "Tram", "Leoforeia",
		// "Aerodromia", "Limania", "Ksenodoxeia", "Kentra diaskedasis",
		// "Kafeteries", "Estiatoria", "Aksiotheata", "Theatra", "Mouseia",
		// "Cinema", "Stadia podosfairou", "Kleista gipeda", "Proponitika
		// kentra"};

	//	newpanel();

		/*
		 * JLabel lblMap = new JLabel(""); lblMap.setBorder(new LineBorder(new
		 * Color(0, 0, 0), 2)); lblMap.setBounds(new Rectangle(4, 4, 4, 4));
		 * lblMap.setSize(new Dimension(4, 4));
		 * lblMap.setBackground(Color.BLACK); lblMap.setBounds(10, 11, 1350,
		 * 541); contentPane.add(lblMap);
		 */
		JButton btnSave = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back.doClick();
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnSave.setBounds(10, 560, 227, 179);
		contentPane.add(btnSave);

		JLabel lblAddress = new JLabel("\u0394\u03B9\u03B5\u03CD\u03C5\u03BD\u03C3\u03B7 :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAddress.setBounds(247, 565, 236, 27);
		contentPane.add(lblAddress);

		textArea_Address = new JTextArea();
		textArea_Address.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_Address.setBounds(247, 597, 236, 47);
		contentPane.add(textArea_Address);

		JLabel lblNumber = new JLabel("\u0391\u03C1\u03B9\u03B8\u03BC\u03CC\u03C2 :");
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNumber.setBounds(247, 655, 236, 27);
		contentPane.add(lblNumber);

		textArea_Number = new JTextArea();
		textArea_Number.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_Number.setBounds(247, 692, 236, 47);
		contentPane.add(textArea_Number);

		JLabel lblDescription = new JLabel(
				"\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5 :");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDescription.setBounds(511, 565, 236, 27);
		contentPane.add(lblDescription);

		textArea_Description = new JTextArea();
		textArea_Description.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_Description.setBounds(511, 596, 604, 143);
		contentPane.add(textArea_Description);

		JLabel lblCategory = new JLabel("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1 :");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCategory.setBounds(1134, 667, 236, 27);
		contentPane.add(lblCategory);

		comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Metro", "Tram", "Leoforeia", "Aerodromia", "Limania",
				"Ksenodoxeia", "Kentra diaskedasis", "Kafeteries", "Estiatoria", "Aksiotheata", "Theatra", "Mouseia",
				"Cinema", "Stadia podosfairou", "Kleista gipeda", "Proponitika kentra" }));
		comboBox.setBounds(1134, 703, 226, 36);
		contentPane.add(comboBox);

		return contentPane;
	}

	public void newpanel(List<Spot> spotlist) {
		for(Spot spot : spotlist)
		{
			//JLabel lblPin = new JLabel(new ImageIcon(getClass().getClassLoader().getResource("Images/ts-map-pin.png")));
		JLabel lblPin = new JLabel();
		lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/ts-map-pin.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
			lblPin.setBounds(spot.GetX()-15, spot.GetY()-15, 30, 30);
			lblPin.addMouseListener(new MouseAdapter()  
			{  
			    public void mouseClicked(MouseEvent e)  
			    {  
					JOptionPane.showMessageDialog(null, "WORKS", "X=" + e.getX() + "; Y=" + e.getY(),
							JOptionPane.INFORMATION_MESSAGE);
			    }  
			}); 
			contentPane.add(lblPin);
		}
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 11, 1350, 541);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (true) {
					JOptionPane.showMessageDialog(null, "erererrr", "X=" + e.getX() + "; Y=" + e.getY(),
							JOptionPane.INFORMATION_MESSAGE);
					x = e.getX();
					y = e.getY();
				}
			}
		});
		contentPane.add(panel);
	}
}
