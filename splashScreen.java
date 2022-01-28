package edu.pupr.pillIdentifier;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.Font;

public class splashScreen extends JFrame {

	private JPanel contentPane;
	private static JProgressBar progressBar;
	private static JLabel label1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
				
					int x;
					
					splashScreen frame = new splashScreen();
					frame.setVisible(true);
					
					try {
						for(x=0; x<=100; x++){
							splashScreen.progressBar.setValue(x);
							Thread.sleep(50);
							splashScreen.label1.setText(Integer.toString(x)+" %");
							if(x==100) {
								frame.dispose();
							}
						}
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
					
	}

	/**
	 * Create the frame.
	 */
	public splashScreen() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.GRAY);
		label.setIcon(new ImageIcon(splashScreen.class.getResource("/edu/pupr/pillIdentifier/splashscreen.gif.gif")));
		label.setBounds(0, 0, 450, 227);
		contentPane.add(label);
		
		progressBar = new JProgressBar();
		progressBar.setBackground(Color.BLACK);
		progressBar.setForeground(Color.RED);
		progressBar.setBounds(20, 266, 410, 14);
		contentPane.add(progressBar);
		
		label1 = new JLabel("");
		label1.setForeground(Color.RED);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label1.setBounds(192, 248, 46, 14);
		contentPane.add(label1);
	}
}
