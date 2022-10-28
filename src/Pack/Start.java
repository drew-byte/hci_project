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

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public Start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1280,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1264, 681);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 216, 1264, 263);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton signupButton = new JButton("Sign up");
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
		loginButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		
		loginButton.setBounds(507, 186, 115, 40);
		loginButton.setFocusable(false);
		panel_1.add(loginButton);
		
		JLabel joinLabel = new JLabel("Join us now!");
		joinLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 70));
		joinLabel.setBounds(416, 11, 445, 155);
		panel_1.add(joinLabel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\logo.png").getImage().getScaledInstance(500, 350, Image.SCALE_DEFAULT)));
		lblNewLabel.setBounds(411, 11, 500, 220);
		panel.add(lblNewLabel);
		
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
