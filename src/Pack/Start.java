package Pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Start {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Start() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setSize(1280,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 235, 206));
		panel.setBounds(0, 0, 1264, 681);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(170, 139, 86));
		panel_1.setBounds(0, 216, 1264, 263);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton signupButton = new JButton("Sign up");
		signupButton.setBackground(new Color(238, 238, 238));
		signupButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		signupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				new Signup();
			}
		});
		signupButton.setFocusable(false);
		signupButton.setBounds(673, 186, 115, 40);
		panel_1.add(signupButton);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBackground(new Color(238, 238, 238));
		loginButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		loginButton.setBounds(507, 186, 115, 40);
		loginButton.setFocusable(false);
		panel_1.add(loginButton);
		
		JLabel joinLabel = new JLabel("Join us now!");
		joinLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 70));
		joinLabel.setBounds(416, 11, 445, 155);
		panel_1.add(joinLabel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(306, 0, 100, 184);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\coffee-cup.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
		
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				new Login();
			}
		});
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
