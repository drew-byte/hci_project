package Pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.ImageIcon;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1280,720);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLocation(0, 0);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setSize(1264,80);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setBounds(25, 15, 50, 50);
		lblNewLabel_1_2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\archive-black-box.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		panel.add(lblNewLabel_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 1264, 681);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Password : ");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblNewLabel_1.setBounds(374, 371, 177, 69);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username  : ");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(364, 291, 192, 69);
		panel_1.add(lblNewLabel_1_1);
		
		textField = new JTextField(20);
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		textField.setBounds(566, 312, 250, 40);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		btnNewButton.setBounds(715, 432, 100, 40);
		btnNewButton.setFocusable(false);
		panel_1.add(btnNewButton);
		
		passwordField = new JPasswordField(20);
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		passwordField.setBounds(566, 381, 250, 40);
		panel_1.add(passwordField);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("show password");
		rdbtnNewRadioButton.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 11));
		rdbtnNewRadioButton.setBackground(SystemColor.menu);
		rdbtnNewRadioButton.setBounds(566, 432, 119, 20);
		panel_1.add(rdbtnNewRadioButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(278, 246, 650, 271);
		panel_1.add(panel_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				frame.dispose();
				new Start();
			}
		});
		

		btnNewButton_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\back.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		btnNewButton_1.setBounds(278, 199, 40, 35);
		btnNewButton_1.setFocusable(false);
		panel_1.add(btnNewButton_1);

		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			 if (e.getSource() == rdbtnNewRadioButton) 
		       {
		           if (rdbtnNewRadioButton.isSelected()) 
		           {
		        	   passwordField.setEchoChar((char) 0);
		           } 
		           else 
		           {
		        	   passwordField.setEchoChar('*');
		           }
		       }
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = textField.getText();
				String pass = passwordField.getText();
				if (e.getSource() == btnNewButton) 
			       {
					
					if(user.equals("admin"))
					{
						if(pass.equals("admin"))
						{
							JOptionPane.showMessageDialog(null, "Login Successful!");
							frame.dispose();
							new MainMenu();
						}
						
					}
					else {
						
						JOptionPane.showMessageDialog(null, "Login Unsuccessful");
						JOptionPane.showMessageDialog(null, "Try Again!");
						textField.setText("");
						passwordField.setText("");
						
						
						
					}
					
			       }
			       
				
			}
			
		});
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
}
