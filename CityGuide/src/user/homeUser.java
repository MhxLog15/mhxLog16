package user;

import java.awt.EventQueue;
import javax.swing.JFrame;
import user.Spot;
import user.dbUser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class homeUser extends JFrame {

	private boolean panelBool = true; // true = Search , false = Map
	JButton btnback = new JButton("Do Something");
	private dbUser db = new dbUser();
	private List<Spot> spotlist = new ArrayList<Spot>();

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
				else {
					List<String> stringList = new ArrayList<String>();

					if (sp.comboBox_diamoni.getSelectedIndex() != 0)
						stringList.add("Ksenodoxeia");
					if (sp.comboBox_diaskedasi.getSelectedIndex() != 0) {
						if (sp.comboBox_diaskedasi.getSelectedIndex() == 1)
							stringList.add("Kentra diaskedasis");
						else if (sp.comboBox_diaskedasi.getSelectedIndex() == 2)
							stringList.add("Estiatoria");
						else
							stringList.add("Kafeteries");
					}
					if (sp.comboBox_politismos.getSelectedIndex() != 0) {
						if (sp.comboBox_politismos.getSelectedIndex() == 1)
							stringList.add("Aksiotheata");
						else if (sp.comboBox_politismos.getSelectedIndex() == 2)
							stringList.add("Theatra");
						else if (sp.comboBox_politismos.getSelectedIndex() == 3)
							stringList.add("Mouseia");
						else
							stringList.add("Cinema");
					}
					if (sp.comboBox_athlitismos.getSelectedIndex() != 0) {
						if (sp.comboBox_athlitismos.getSelectedIndex() == 1)
							stringList.add("Stadia podosfairou");
						else if (sp.comboBox_athlitismos.getSelectedIndex() == 2)
							stringList.add("Kleista gipeda");
						else
							stringList.add("Proponitika kentra");
					}
					if (sp.comboBox_mesa.getSelectedIndex() != 0) {
						if (sp.comboBox_mesa.getSelectedIndex() == 1)
							stringList.add("Aerodromia");
						else if (sp.comboBox_mesa.getSelectedIndex() == 2)
							stringList.add("Limania");
						else if (sp.comboBox_mesa.getSelectedIndex() == 3)
							stringList.add("Metro");
						else if (sp.comboBox_mesa.getSelectedIndex() == 4)
							stringList.add("Tram");
						else
							stringList.add("Leoforeia");
					}
					setContentPane(mp.panel(btnback));
					spotlist = new ArrayList<Spot>();
					db.NewConnection();
					db.GetSpots(spotlist, stringList);
					mp.newpanel(spotlist);
					db.CloseConnection();
				}
				panelBool = !panelBool;
				revalidate();
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1280 + 16, 720 + 39);
		setContentPane(sp.panel(btnback));

	}
}
