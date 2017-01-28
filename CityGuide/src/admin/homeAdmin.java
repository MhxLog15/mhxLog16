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
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class homeAdmin extends JFrame {
	private boolean panelBool = true; // true = Search , false = Map
	JButton btnback = new JButton("Do Something");
	dbAdmin db = new dbAdmin();
	Spot spoff = new Spot();///////////////////////
	//private boolean firstmap = true;
	List<Spot> spotlist = new ArrayList<Spot>();

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
		db.NewConnection();

		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!panelBool) {
					if (ap.action.equals("add")) {
						spoff.SetAddress(mp.textArea_Address.getText());
						spoff.SetNumber(mp.textArea_Number.getText());
						spoff.SetDecription(mp.textArea_Description.getText());
						spoff.SetX(mp.x);
						spoff.SetY(mp.y);
						spoff.SetCategory(mp.comboBox.getSelectedItem().toString());
						db.Add(spoff);
					} else if (ap.action.equals("edi")) {
						///////////////// spoff.SetId();
						spoff.SetAddress(mp.textArea_Address.getText());
						spoff.SetNumber(mp.textArea_Number.getText());
						spoff.SetDecription(mp.textArea_Description.getText());
						spoff.SetX(mp.x);
						spoff.SetY(mp.y);
						spoff.SetCategory(mp.comboBox.getSelectedItem().toString());
						db.Edit(spoff);
					} else {
						//////////////// spoff.SetId();
						db.Delete(spoff);
					}
					setContentPane(ap.panel(btnback));
				} else {
				//	if (!firstmap){

				//	}
					setContentPane(mp.panel(btnback, ap.action));
					spotlist = new ArrayList<Spot>();
					db.GetSpots(spotlist);
					mp.newpanel(spotlist);
				}
				panelBool = !panelBool;
				revalidate();
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 750);
		setContentPane(ap.panel(btnback));

	}
}
