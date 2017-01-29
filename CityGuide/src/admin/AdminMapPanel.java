package admin;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AdminMapPanel {

	private JPanel contentPane;
	public JPanel panel;
	private JTextArea textArea_Address, textArea_Number, textArea_Description;
	private int x = -1, y = -1, selectedID = -1;
	private JComboBox comboBox;
	private String mode = "";
	public Spot spot;
	////////////////// public SELECTED button-label

	public JPanel panel(JButton back, String mode) {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		this.mode = mode;
		spot = new Spot();

		JButton btnSave = new JButton();
		btnSave.setBounds(888, 616, 377, 93);
		if (mode.equals("add"))
			btnSave.setText("\u0391\u03c0\u03bf\u03b8\u03ae\u03ba\u03b5\u03c5\u03c3\u03b7");
		else if (mode.equals("edi"))
			btnSave.setText("\u0395\u03c0\u03b5\u03be\u03b5\u03c1\u03b3\u03b1\u03c3\u03af\u03b1");
		else
			btnSave.setText("\u0394\u03b9\u03b1\u03b3\u03c1\u03b1\u03c6\u03ae");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mode.equals("add")) {
					if (selectedID == -1) {
						JOptionPane.showMessageDialog(null,
								"\u0395\u03c0\u03ad\u03bb\u03b5\u03be\u03b5 \u03c0\u03c1\u03ce\u03c4\u03b1 \u03ad\u03bd\u03b1 \u03ba\u03b5\u03bd\u03cc \u03c3\u03b7\u03bc\u03b5\u03af\u03bf \u03c3\u03c4\u03bf\u03bd \u03c7\u03ac\u03c1\u03c4\u03b7\u002e",
								"Info", JOptionPane.INFORMATION_MESSAGE);
						return;
					} else if (selectedID == 0) {
						spot.SetAddress(textArea_Address.getText());
						spot.SetNumber(textArea_Number.getText());
						spot.SetDecription(textArea_Description.getText());
						spot.SetX(x);
						spot.SetY(y);
						spot.SetCategory(comboBox.getSelectedItem().toString());
					} else {
						JOptionPane.showMessageDialog(null,
								"\u03a5\u03c0\u03ac\u03c1\u03c7\u03b5\u03b9 \u03ae\u03b4\u03b7 \u03ad\u03bd\u03b1 \u03c3\u03b7\u03bc\u03b5\u03af\u03bf \u03c3\u03b5 \u03b1\u03c5\u03c4\u03ae \u03c4\u03b7\u03bd \u03c4\u03bf\u03c0\u03bf\u03b8\u03b5\u03c3\u03af\u03b1\u002e",
								"Info", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
				} else if (mode.equals("edi")) {
					if (selectedID == -1) {
						JOptionPane.showMessageDialog(null,
								"\u0394\u03b5\u03bd \u03ad\u03c7\u03b5\u03c4\u03b5 \u03b5\u03c0\u03b9\u03bb\u03ad\u03be\u03b5\u03b9 \u03c3\u03b7\u03bc\u03b5\u03af\u03bf \u03b3\u03b9\u03b1 \u0395\u03c0\u03b5\u03be\u03b5\u03c1\u03b3\u03b1\u03c3\u03af\u03b1\u002e",
								"Info", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					spot.SetId(selectedID);
					spot.SetAddress(textArea_Address.getText());
					spot.SetNumber(textArea_Number.getText());
					spot.SetDecription(textArea_Description.getText());
					spot.SetX(x);
					spot.SetY(y);
					spot.SetCategory(comboBox.getSelectedItem().toString());
				} else {
					if (selectedID == -1) {
						JOptionPane.showMessageDialog(null,
								"\u0394\u03b5\u03bd \u03ad\u03c7\u03b5\u03c4\u03b5 \u03b5\u03c0\u03b9\u03bb\u03ad\u03be\u03b5\u03b9 \u03c3\u03b7\u03bc\u03b5\u03af\u03bf \u03b3\u03b9\u03b1 \u0394\u03b9\u03b1\u03b3\u03c1\u03b1\u03c6\u03ae\u002e",
								"Info", JOptionPane.INFORMATION_MESSAGE);
						return;
					}
					spot.SetId(selectedID);
				}
				back.doClick();
			}
		});
		contentPane.setLayout(null);
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 28));
		contentPane.add(btnSave);

		JLabel lblAddress = new JLabel("\u0394\u03B9\u03B5\u03CD\u03C5\u03BD\u03C3\u03B7 :");
		lblAddress.setBounds(10, 533, 236, 27);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(lblAddress);

		textArea_Address = new JTextArea();
		textArea_Address.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textArea_Address.setBounds(10, 563, 236, 48);
		textArea_Address.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(textArea_Address);

		JLabel lblNumber = new JLabel("\u0391\u03C1\u03B9\u03B8\u03BC\u03CC\u03C2 :");
		lblNumber.setBounds(10, 622, 236, 27);
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(lblNumber);

		textArea_Number = new JTextArea();
		textArea_Number.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textArea_Number.setBounds(10, 660, 236, 49);
		textArea_Number.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(textArea_Number);

		JLabel lblDescription = new JLabel(
				"\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5 :");
		lblDescription.setBounds(274, 533, 204, 27);
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(lblDescription);

		textArea_Description = new JTextArea();
		textArea_Description.setLineWrap(true);
		textArea_Description.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textArea_Description.setBounds(274, 563, 604, 146);
		textArea_Description.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.add(textArea_Description);

		JLabel lblCategory = new JLabel("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1 :");
		lblCategory.setBounds(888, 533, 179, 27);
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(lblCategory);

		comboBox = new JComboBox();
		comboBox.setBounds(888, 571, 222, 36);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Metro", "Tram", "Leoforeia", "Aerodromia",
				"Limania", "Ksenodoxeia", "Kentra diaskedasis", "Kafeteries", "Estiatoria", "Aksiotheata", "Theatra",
				"Mouseia", "Cinema", "Stadia podosfairou", "Kleista gipeda", "Proponitika kentra" }));
		contentPane.add(comboBox);

		return contentPane;
	}

	public void newpanel(List<Spot> spotlist) {
		for (Spot spot : spotlist)
			newSpot(spot);
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 10, 1257, 520);
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (true) {
					if (mode.equals("add")) {
						x = e.getX();
						y = e.getY();
						selectedID = 0;
					} else
						selectedID = -1;
				}
			}
		});
		contentPane.add(panel);
	}

	public void newSpot(Spot spot) {
		JLabel lblPin = new JLabel();
		if (spot.GetCategory().equals("Metro"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/sub.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Tram"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/Tram.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Leoforeia"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/bus.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Aerodromia"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/airport.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Limania"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/port.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Ksenodoxeia"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/hotel.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Kentra diaskedasis"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/bar.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Kafeteries"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/cofee.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Estiatoria"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/restaurant.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Aksiotheata"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/camera.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Theatra"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/theater.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Mouseia"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/museum.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Cinema"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/cinema.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Stadia podosfairou"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/stadium.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Kleista gipeda"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/closed.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else if (spot.GetCategory().equals("Proponitika kentra"))
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/runing.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		else
			lblPin.setIcon(new ImageIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/ts-map-pin.png"))
					.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		lblPin.setBounds(spot.GetX() - 15, spot.GetY() - 15, 30, 30);
		lblPin.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				textArea_Address.setText(spot.GetAddress());
				textArea_Number.setText(spot.GetNumber());
				textArea_Description.setText(spot.GetDecription());
				comboBox.setSelectedItem(spot.GetCategory());
				selectedID = spot.GetId();
			}
		});
		contentPane.add(lblPin);
	}
}
