package edu.pupr.pillIdentifier;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(115, 0, 299, 239);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		user = new JTextField();
		user.setBounds(99, 58, 157, 20);
		panel_1.add(user);
		user.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get text from user y pass
				
				String un = user.getText();
				String pas = pass.getText();
				
				if(un.equals("admin")&&pas.equals("123")) {
					JOptionPane.showMessageDialog(null, "Login Successful");
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Username or Password");
				}
				
			}
		});
		btnLogin.setBounds(132, 164, 89, 23);
		panel_1.add(btnLogin);
		
		pass = new JPasswordField();
		pass.setBounds(99, 89, 157, 20);
		panel_1.add(pass);
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setBounds(23, 61, 66, 14);
		panel_1.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(23, 92, 66, 14);
		panel_1.add(lblPassword);
	}
}
