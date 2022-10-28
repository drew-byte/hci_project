package Pack;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Settings {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Settings window = new Settings();
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
	public Settings() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setSize(1280,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setSize(1264,80);
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(25, 15, 50, 50);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\archive-black-box.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		
		JButton homeButton = new JButton("Home");
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				new MainMenu();
			}
		});
		homeButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\home.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		homeButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		homeButton.setBounds(181, 28, 150, 40);
		homeButton.setFocusable(false);
		panel.add(homeButton);
		
		JButton myFilesButton = new JButton("My Files");
		myFilesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				new MyFiles();
			}
		});
		myFilesButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\open-folder-outline.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		myFilesButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		myFilesButton.setBounds(363, 28, 150, 40);
		myFilesButton.setFocusable(false);
		panel.add(myFilesButton);
		
		JButton aboutButton = new JButton("About");
		aboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				new About();
			}
		});
		aboutButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\information-symbol.png").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		aboutButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		aboutButton.setBounds(545, 28, 150, 40);
		aboutButton.setFocusable(false);
		panel.add(aboutButton);
		
		JButton settingsButton = new JButton("Settings");
		settingsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				new Settings();
			}
		});
		settingsButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\settings.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		settingsButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		settingsButton.setBounds(726, 28, 150, 40);
		settingsButton.setFocusable(false);
		panel.add(settingsButton);
		
	
		
		JButton backButton = new JButton("");
		backButton.setBounds(25, 92, 50, 50);
		frame.getContentPane().add(backButton);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				new MainMenu();
			}
		});
		backButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\chevron-pointing-to-the-left.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		backButton.setFocusable(false);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(270, 227, 685, 367);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("First Name : ");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(226, 143, 83, 29);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(319, 146, 138, 24);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Last Name : ");
		lblNewLabel_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(226, 178, 83, 29);
		panel_1.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(319, 181, 138, 24);
		panel_1.add(textField_1);
		
		JButton btnNewButton_6 = new JButton("Confirm");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(e.getSource() == btnNewButton_6)
				{
					textField.setText("");
					textField_1.setText("");
					JOptionPane.showMessageDialog(null,"Saved!");
				
					
				}
			}
		});
		
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.setBounds(363, 216, 92, 23);
		panel_1.add(btnNewButton_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(38, 227, 196, 367);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 0, 196, 50);
		panel_2.add(panel_3);
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Settings :");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 176, 28);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("   Change First Name");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(0, 61, 133, 42);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("   Change Last Name");
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(0, 113, 133, 42);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("   Change Mail");
		lblNewLabel_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(0, 164, 133, 42);
		panel_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("   Change Password");
		lblNewLabel_2_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(0, 217, 133, 42);
		panel_2.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("   Change Age");
		lblNewLabel_2_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_2_4.setBounds(0, 270, 133, 42);
		panel_2.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("   Change Address");
		lblNewLabel_2_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 12));
		lblNewLabel_2_5.setBounds(0, 325, 133, 42);
		panel_2.add(lblNewLabel_2_5);
		
		JButton btnNewButton = new JButton(">>>>>>>>>>>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Settings();
		        frame.dispose();
			}
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setBounds(143, 72, 41, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton(">>>>>>>>>>>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Settings();
		        frame.dispose();
			}
		});
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(143, 124, 41, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton(">>>>>>>>>>>");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Settings1();
				frame.dispose();
			}
		});
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBounds(143, 175, 41, 23);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(">>>>>>>>>>>");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Settings1();
				frame.dispose();
			}
		});
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setBounds(143, 228, 41, 23);
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton(">>>>>>>>>>>");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Settings2();
				frame.dispose();
			}
		});
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setBounds(143, 281, 41, 23);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton(">>>>>>>>>>>");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Settings2();
				frame.dispose();
			}
		});
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setBounds(143, 336, 41, 23);
		panel_2.add(btnNewButton_5);
		
		
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
