package admin;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class homeAdmin extends JFrame {
	private boolean panelBool = true; // true = Search , false = Map
	JButton btnback = new JButton("Do Something");
	dbAdmin db = new dbAdmin();
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
					if (ap.action.equals("add"))
						db.Add(mp.spot);
					else if (ap.action.equals("edi"))
						db.Edit(mp.spot);
					else
						db.Delete(mp.spot);
					setContentPane(ap.panel(btnback));
				} else {
					setContentPane(mp.panel(btnback, ap.action));
					spotlist = new ArrayList<Spot>();
					db.GetSpots(spotlist);
					mp.newpanel(spotlist);
				}
				panelBool = !panelBool;
				revalidate();
			}
		});
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				db.CloseConnection();
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1370, 750);
		setContentPane(ap.panel(btnback));
	}
}
