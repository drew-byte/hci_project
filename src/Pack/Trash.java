package Pack;

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
import javax.swing.JTextPane;

import java.awt.BorderLayout;
import java.awt.Color;

public class Trash {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Trash window = new Trash();
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
	public Trash() {
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
		panel_1.setBounds(185, 204, 726, 393);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 0, 726, 71);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("   Trash  :");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 329, 49);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.WHITE);
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(10, 82, 330, 300);
		panel_1.add(panel_3_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(0, 0, 330, 56);
		panel_3_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("   Done activity :");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel_2.setBounds(0, 0, 330, 56);
		panel_4.add(lblNewLabel_2);
		
		JLabel label1 = new JLabel("Palindrome.py");
		label1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		label1.setBounds(10, 62, 310, 36);
		panel_3_1.add(label1);
		
		JLabel label2 = new JLabel("methods.cpp");
		label2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		label2.setBounds(10, 97, 310, 36);
		panel_3_1.add(label2);
		
		JLabel label3 = new JLabel("recursion.c");
		label3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		label3.setBounds(10, 134, 310, 36);
		panel_3_1.add(label3);
		
		JLabel label4 = new JLabel("loop.asm");
		label4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		label4.setBounds(10, 171, 310, 36);
		panel_3_1.add(label4);
		
		JLabel label5 = new JLabel("andrew.java");
		label5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		label5.setBounds(10, 205, 310, 36);
		panel_3_1.add(label5);
		
		JLabel label6 = new JLabel("index.html");
		label6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		label6.setBounds(10, 241, 310, 36);
		panel_3_1.add(label6);
		
		JButton delete = new JButton("Delete All");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 label1.setVisible(false);
				 label2.setVisible(false);
				 label3.setVisible(false);
				 label4.setVisible(false);
				 label5.setVisible(false);
				 label6.setVisible(false);
				 
				 JOptionPane.showMessageDialog(null, "File Deleted!");
				 
			}
		});
		delete.setBounds(627, 26, 89, 23);
		delete.setFocusable(false);
		panel_2.add(delete);
		
		JLabel lblNewLabel_3 = new JLabel("Restore the Files ?");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(470, 124, 139, 48);
		panel_1.add(lblNewLabel_3);
		
		JButton restore = new JButton("Restore");
		restore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				 label1.setVisible(true);
				 label2.setVisible(true);
				 label3.setVisible(true);
				 label4.setVisible(true);
				 label5.setVisible(true);
				 label6.setVisible(true);
				 
				 JOptionPane.showMessageDialog(null, "File Restore!");
			}
		});
		restore.setFocusable(false);
		restore.setBounds(490, 195, 89, 23);
		panel_1.add(restore);
		
		JLabel lblNewLabel_5 = new JLabel("");
		
		lblNewLabel_5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\open-folder-outline.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
		lblNewLabel_5.setBounds(490, 240, 119, 78);
		panel_1.add(lblNewLabel_5);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(937, 204, 317, 393);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(0, 0, 317, 64);
		panel_5.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Did you know ?");
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 11, 222, 42);
		panel_6.add(lblNewLabel_4);
		
		JTextPane txtpnWhatIsLorem = new JTextPane();
		txtpnWhatIsLorem.setEditable(false);
		txtpnWhatIsLorem.setFont(new Font("Tahoma", Font.ITALIC, 11));
		txtpnWhatIsLorem.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\r\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.");
		txtpnWhatIsLorem.setBounds(10, 74, 297, 308);
		panel_5.add(txtpnWhatIsLorem);
		
		
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
