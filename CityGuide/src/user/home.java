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

public class home extends JFrame {

	private boolean panelBool = true; // true = Search , false =  Map
	JButton buttonBack = new JButton("Do Something");

//	private JPanel searchPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public home() {
		SearchPanel sp = new SearchPanel();
		MapPanel mp = new MapPanel();

		buttonBack.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		   {
		    	if(!panelBool)
		    		setContentPane(sp.panel(buttonBack));
		    		else
		    		setContentPane(mp.panel(buttonBack));
		    	panelBool = !panelBool;
		    	revalidate(); 
		    }
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2147483647, 2147483647);
		setContentPane(sp.panel(buttonBack));
			
	
	

	
	
	
	
	}
}



