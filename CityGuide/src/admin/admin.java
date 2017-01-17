package admin;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;

public class admin extends JFrame {

	private JPanel contentPane;
	private AdminMapPanel am;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin frame = new admin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2147483647, 2147483647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDelete = new JButton("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnDelete.setBounds(501, 474, 316, 124);
		contentPane.add(btnDelete);
		
		JButton btnEdit = new JButton("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5");
		btnEdit.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnEdit.setBounds(501, 339, 316, 124);
		contentPane.add(btnEdit);
		
		JButton btnEnter = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5");
		btnEnter.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnEnter.setBounds(501, 200, 316, 124);
		contentPane.add(btnEnter);
		
		JLabel lblBackround = new JLabel("just backround");
		lblBackround.setIcon(new ImageIcon("C:\\Users\\mili\\Desktop\\dusk-city-wallpaper-wallpaper-3.jpg"));
		lblBackround.setBounds(0, 0, 1370, 750);
		contentPane.add(lblBackround);
	}
}
