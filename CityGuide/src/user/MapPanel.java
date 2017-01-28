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
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBounds(10, 11, 1350, 541);
		contentPane.add(panel);
		
		JButton btnBack = new JButton("<<  \u03A0\u03AF\u03C3\u03C9");
		btnBack.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		    	back.doClick();    
		    }
		});
		btnBack.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnBack.setBounds(10, 563, 198, 176);
		contentPane.add(btnBack);
		
		JTextArea textAreaDescription = new JTextArea();
		textAreaDescription.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textAreaDescription.setForeground(new Color(0, 0, 0));
		textAreaDescription.setSize(new Dimension(4, 4));
		textAreaDescription.setBounds(218, 563, 1142, 176);
		contentPane.add(textAreaDescription);

		return contentPane;
		}
}
