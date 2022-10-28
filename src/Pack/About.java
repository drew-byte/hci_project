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
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Label;

public class About {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					About window = new About();
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
	public About() {
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
		
		JTextPane txtpnLoremIpsumIs = new JTextPane();
		txtpnLoremIpsumIs.setEditable(false);
		txtpnLoremIpsumIs.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		txtpnLoremIpsumIs.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.  It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\r\n\r\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\r\n\r\nContrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source.");
		txtpnLoremIpsumIs.setToolTipText("");
		txtpnLoremIpsumIs.setBounds(187, 191, 936, 368);
		frame.getContentPane().add(txtpnLoremIpsumIs);
		
		JLabel github = new JLabel("");
		github.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\github-sign.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
	
		github.setBounds(654, 601, 50, 50);
		frame.getContentPane().add(github);
		
		JLabel linkedIn = new JLabel("");
		linkedIn.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\linkedin-letters.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		linkedIn.setBounds(733, 600, 50, 50);
		frame.getContentPane().add(linkedIn);
		
		JLabel phoneNumber = new JLabel("");
		phoneNumber.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\telephone-symbol-button.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		phoneNumber.setBounds(817, 601, 50, 50);
		frame.getContentPane().add(phoneNumber);
		
		JLabel website = new JLabel("");
		website.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\earth-globe.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
		website.setBounds(899, 601, 50, 50);
		frame.getContentPane().add(website);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(370, 570, 100, 100);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\drewProfile.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
		
		JLabel name = new JLabel("Andrew Felix Cunanan\r");
		name.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		name.setToolTipText("");
		name.setBounds(480, 601, 150, 33);
		frame.getContentPane().add(name);
		
		JLabel bio = new JLabel("CS Student at NEU");
		bio.setToolTipText("");
		bio.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		bio.setBounds(480, 625, 150, 33);
		frame.getContentPane().add(bio);
		
		
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
