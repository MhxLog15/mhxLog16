package admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AdminMapPanel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMapPanel frame = new AdminMapPanel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminMapPanel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100, 2147483647, 2147483647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] values = new String[] {"Metro", "Tram", "Leoforeia", "Aerodromia", "Limania", "Ksenodoxeia", "Kentra diaskedasis", "Kafeteries", "Estiatoria", "Aksiotheata", "Theatra", "Mouseia", "Cinema", "Stadia podosfairou", "Kleista gipeda", "Proponitika kentra"};

		DefaultListModel<String> model = new DefaultListModel<>();
		for(int i=0;i<values.length;i++)
		model.addElement(values[i]);
		
		JLabel lbl_map = new JLabel("");
		lbl_map.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbl_map.setBounds(new Rectangle(4, 4, 4, 4));
		lbl_map.setSize(new Dimension(4, 4));
		lbl_map.setBackground(Color.BLACK);
		lbl_map.setBounds(10, 11, 1350, 541);
		contentPane.add(lbl_map);
		
		JButton btnSave = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnSave.setBounds(10, 560, 227, 179);
		contentPane.add(btnSave);
		
		JLabel lblAddress = new JLabel("\u0394\u03B9\u03B5\u03CD\u03C5\u03BD\u03C3\u03B7 :");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblAddress.setBounds(247, 565, 236, 27);
		contentPane.add(lblAddress);
		
		JTextArea textArea_Address = new JTextArea();
		textArea_Address.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_Address.setBounds(247, 597, 236, 47);
		contentPane.add(textArea_Address);
		
		JLabel lblNumber = new JLabel("\u0391\u03C1\u03B9\u03B8\u03BC\u03CC\u03C2 :");
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNumber.setBounds(247, 655, 236, 27);
		contentPane.add(lblNumber);
		
		JTextArea textArea_Number = new JTextArea();
		textArea_Number.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_Number.setBounds(247, 692, 236, 47);
		contentPane.add(textArea_Number);
		
		JLabel lblDescription = new JLabel("\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5 :");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDescription.setBounds(511, 565, 236, 27);
		contentPane.add(lblDescription);
		
		JTextArea textArea_Description = new JTextArea();
		textArea_Description.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_Description.setBounds(511, 596, 604, 143);
		contentPane.add(textArea_Description);
		
		JLabel CategoryLabel = new JLabel("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1 :");
		CategoryLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		CategoryLabel.setBounds(1134, 667, 236, 27);
		contentPane.add(CategoryLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Metro", "Tram", "Leoforeia", "Aerodromia", "Limania", "Ksenodoxeia", "Kentra diaskedasis", "Kafeteries", "Estiatoria", "Aksiotheata", "Theatra", "Mouseia", "Cinema", "Stadia podosfairou", "Kleista gipeda", "Proponitika kentra"}));
		comboBox.setBounds(1134, 703, 226, 36);
		contentPane.add(comboBox);
	}
}
