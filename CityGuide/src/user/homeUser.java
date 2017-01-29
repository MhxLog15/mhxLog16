package user;

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

public class homeUser extends JFrame {

	private boolean panelBool = true; // true = Search , false = Map
	JButton btnback = new JButton("Do Something");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homeUser frame = new homeUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public homeUser() {
		SearchPanel sp = new SearchPanel();
		MapPanel mp = new MapPanel();

		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!panelBool)
					setContentPane(sp.panel(btnback));
				else
					setContentPane(mp.panel(btnback));
				panelBool = !panelBool;
				revalidate();
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 750);
		setContentPane(sp.panel(btnback));

	}
}
