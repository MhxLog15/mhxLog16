package user;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class MapPanel {

	private JPanel contentPane;

	public JPanel panel(JButton back) {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 11, 1350, 541);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("<<  \u03A0\u03AF\u03C3\u03C9");
		btnNewButton.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    back.doClick();    
		    }
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnNewButton.setBounds(10, 563, 198, 176);
		contentPane.add(btnNewButton);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textArea.setForeground(new Color(0, 0, 0));
		textArea.setSize(new Dimension(4, 4));
		textArea.setBounds(218, 563, 1142, 176);
		contentPane.add(textArea);

		return contentPane;
		}
}
