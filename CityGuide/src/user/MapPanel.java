package user;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.LineBorder;

import user.Spot;

public class MapPanel {

	private JPanel contentPane;
	private JPanel panel;
	private JTextArea textAreaDescription;

	public JPanel panel(JButton back) {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);

		JButton btnBack = new JButton("<<  \u03A0\u03AF\u03C3\u03C9");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				back.doClick();
			}
		});
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnBack.setBounds(10, 540, 198, 170);
		contentPane.add(btnBack);

		textAreaDescription = new JTextArea();
		textAreaDescription.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textAreaDescription.setForeground(new Color(0, 0, 0));
		textAreaDescription.setSize(new Dimension(4, 4));
		textAreaDescription.setBounds(218, 540, 1051, 170);
		textAreaDescription.setFont(new Font("Tahoma", Font.PLAIN, 28));
		contentPane.add(textAreaDescription);

		return contentPane;
	}

	public void newpanel(List<Spot> spotlist) {
		for (Spot spot : spotlist)
			newSpot(spot);
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 10, 1257, 520);
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
				textAreaDescription.setText(spot.GetAddress());
				textAreaDescription.setText(textAreaDescription.getText() + "\r\n" + spot.GetNumber());
				textAreaDescription.setText(textAreaDescription.getText() + "\r\n" + spot.GetDecription());
			}
		});
		contentPane.add(lblPin);
	}
}
