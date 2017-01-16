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

public class AdminMap extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMap frame = new AdminMap();
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
	public AdminMap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100, 2147483647, 2147483647);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel.setBounds(new Rectangle(4, 4, 4, 4));
		lblNewLabel.setSize(new Dimension(4, 4));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(10, 11, 1350, 541);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBounds(10, 560, 227, 179);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\u0394\u03B9\u03B5\u03CD\u03C5\u03BD\u03C3\u03B7 :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(247, 565, 236, 27);
		contentPane.add(lblNewLabel_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setBounds(247, 597, 236, 47);
		contentPane.add(textArea);
		
		JLabel label = new JLabel("\u0391\u03C1\u03B9\u03B8\u03BC\u03CC\u03C2 :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label.setBounds(247, 655, 236, 27);
		contentPane.add(label);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_1.setBounds(247, 692, 236, 47);
		contentPane.add(textArea_1);
		
		JLabel label_1 = new JLabel("\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE \u03C3\u03B7\u03BC\u03B5\u03AF\u03BF\u03C5 :");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_1.setBounds(511, 565, 236, 27);
		contentPane.add(label_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea_2.setBounds(511, 596, 849, 143);
		contentPane.add(textArea_2);
	}
}
