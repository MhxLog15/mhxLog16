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

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 2147483647, 2147483647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button_1 = new JButton("\u0394\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AE \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		button_1.setBounds(501, 474, 316, 124);
		contentPane.add(button_1);
		
		JButton btnNewButton = new JButton("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBounds(501, 339, 316, 124);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\u03A0\u03C1\u03BF\u03C3\u03B8\u03AE\u03BA\u03B7 \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5");
		button.setFont(new Font("Tahoma", Font.PLAIN, 28));
		button.setBounds(501, 200, 316, 124);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mili\\Desktop\\dusk-city-wallpaper-wallpaper-3.jpg"));
		lblNewLabel.setBounds(0, 0, 1370, 750);
		contentPane.add(lblNewLabel);
	}
}
