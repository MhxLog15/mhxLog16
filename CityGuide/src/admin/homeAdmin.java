package admin;

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

public class homeAdmin extends JFrame {
	private boolean panelBool = true; // true = Search , false = Map
	JButton btnback = new JButton("Do Something");

	private boolean firstmap = true;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homeAdmin frame = new homeAdmin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public homeAdmin() {
		AdminPanel ap = new AdminPanel();
		AdminMapPanel mp = new AdminMapPanel();

		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!panelBool)
					//DB();
					setContentPane(ap.panel(btnback));
				else {
					if (!firstmap)
						mp.newpanel();
					setContentPane(mp.panel(btnback));
				}
				panelBool = !panelBool;
				revalidate();
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		setContentPane(ap.panel(btnback));

	}
}
