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
import javax.swing.JPanel;
import javax.swing.JTextPane;

import java.awt.BorderLayout;
import java.awt.Color;

public class Favorites {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Favorites window = new Favorites();
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
	public Favorites() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 235, 206));
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setSize(1264, 80);
		panel.setBackground(new Color(170, 139, 86));
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(25, 15, 50, 50);
		panel.add(lblNewLabel_1);
		lblNewLabel_1
				.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\archive-black-box.png")
						.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));

		JButton homeButton = new JButton("Home");
		homeButton.setBackground(new Color(238, 238, 238));
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new MainMenu();
			}
		});
		homeButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\home.png").getImage()
				.getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		homeButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		homeButton.setBounds(181, 28, 150, 40);
		homeButton.setFocusable(false);
		panel.add(homeButton);

		JButton myFilesButton = new JButton("My Files");
		myFilesButton.setBackground(new Color(238, 238, 238));
		myFilesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new MyFiles();
			}

		});
		myFilesButton.setIcon(
				new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\open-folder-outline.png")
						.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		myFilesButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		myFilesButton.setBounds(363, 28, 150, 40);
		myFilesButton.setFocusable(false);
		panel.add(myFilesButton);

		JButton aboutButton = new JButton("About");
		aboutButton.setBackground(new Color(238, 238, 238));
		aboutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new About();
			}
		});
		aboutButton
				.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\information-symbol.png")
						.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		aboutButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		aboutButton.setBounds(545, 28, 150, 40);
		aboutButton.setFocusable(false);
		panel.add(aboutButton);

		JButton settingsButton = new JButton("Settings");
		settingsButton.setBackground(new Color(238, 238, 238));
		settingsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new Settings();
			}
		});
		settingsButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\settings.png")
				.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		settingsButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		settingsButton.setBounds(726, 28, 150, 40);
		settingsButton.setFocusable(false);
		panel.add(settingsButton);

		JButton backButton = new JButton("");
		backButton.setBackground(new Color(238, 238, 238));
		backButton.setBounds(25, 92, 50, 50);
		frame.getContentPane().add(backButton);
		backButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new MainMenu();
			}
		});
		backButton.setIcon(new ImageIcon(
				new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\chevron-pointing-to-the-left.png").getImage()
						.getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		backButton.setFocusable(false);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 235, 206));
		panel_1.setBounds(156, 228, 656, 306);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 22, 187, 71);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\star.png")
				.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		lblNewLabel_2.setBounds(10, 0, 30, 71);
		panel_2.add(lblNewLabel_2);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(144, 161, 125));
		panel_4.setBounds(0, 0, 53, 71);
		panel_2.add(panel_4);
		panel_4.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("R Programming");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(59, 11, 118, 49);
		panel_2.add(lblNewLabel_3);

		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(242, 22, 187, 71);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);

		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\star.png")
				.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		lblNewLabel_2_3.setBounds(10, 0, 30, 71);
		panel_2_1.add(lblNewLabel_2_3);

		JPanel panel_4_3 = new JPanel();
		panel_4_3.setLayout(null);
		panel_4_3.setBackground(new Color(144, 161, 125));
		panel_4_3.setBounds(0, 0, 53, 71);
		panel_2_1.add(panel_4_3);

		JLabel lblNewLabel_3_3 = new JLabel("Java Spring");
		lblNewLabel_3_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(63, 11, 118, 49);
		panel_2_1.add(lblNewLabel_3_3);

		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(459, 22, 187, 71);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);

		JLabel lblNewLabel_2_6 = new JLabel("");
		lblNewLabel_2_6.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\star.png")
				.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		lblNewLabel_2_6.setBounds(10, 0, 30, 71);
		panel_2_2.add(lblNewLabel_2_6);

		JPanel panel_4_6 = new JPanel();
		panel_4_6.setLayout(null);
		panel_4_6.setBackground(new Color(144, 161, 125));
		panel_4_6.setBounds(0, 0, 53, 71);
		panel_2_2.add(panel_4_6);

		JLabel lblNewLabel_3_6 = new JLabel("JavaScript");
		lblNewLabel_3_6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_3_6.setBounds(63, 11, 118, 49);
		panel_2_2.add(lblNewLabel_3_6);

		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBounds(10, 117, 187, 71);
		panel_1.add(panel_2_3);
		panel_2_3.setLayout(null);

		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\star.png")
				.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		lblNewLabel_2_1.setBounds(10, 0, 30, 71);
		panel_2_3.add(lblNewLabel_2_1);

		JPanel panel_4_1 = new JPanel();
		panel_4_1.setLayout(null);
		panel_4_1.setBackground(new Color(144, 161, 125));
		panel_4_1.setBounds(0, 0, 53, 71);
		panel_2_3.add(panel_4_1);

		JLabel lblNewLabel_3_1 = new JLabel("Python");
		lblNewLabel_3_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(63, 11, 118, 49);
		panel_2_3.add(lblNewLabel_3_1);

		JPanel panel_2_4 = new JPanel();
		panel_2_4.setBounds(242, 117, 187, 71);
		panel_1.add(panel_2_4);
		panel_2_4.setLayout(null);

		JLabel lblNewLabel_2_4 = new JLabel("");
		lblNewLabel_2_4.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\star.png")
				.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		lblNewLabel_2_4.setBounds(10, 0, 30, 71);
		panel_2_4.add(lblNewLabel_2_4);

		JPanel panel_4_4 = new JPanel();
		panel_4_4.setLayout(null);
		panel_4_4.setBackground(new Color(144, 161, 125));
		panel_4_4.setBounds(0, 0, 53, 71);
		panel_2_4.add(panel_4_4);

		JLabel lblNewLabel_3_4 = new JLabel("React JS");
		lblNewLabel_3_4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(63, 11, 118, 49);
		panel_2_4.add(lblNewLabel_3_4);

		JPanel panel_2_5 = new JPanel();
		panel_2_5.setBounds(459, 117, 187, 71);
		panel_1.add(panel_2_5);
		panel_2_5.setLayout(null);

		JLabel lblNewLabel_2_7 = new JLabel("");
		lblNewLabel_2_7.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\star.png")
				.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		lblNewLabel_2_7.setBounds(10, 0, 30, 71);
		panel_2_5.add(lblNewLabel_2_7);

		JPanel panel_4_7 = new JPanel();
		panel_4_7.setLayout(null);
		panel_4_7.setBackground(new Color(144, 161, 125));
		panel_4_7.setBounds(0, 0, 53, 71);
		panel_2_5.add(panel_4_7);

		JLabel lblNewLabel_3_7 = new JLabel("JQuery");
		lblNewLabel_3_7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_3_7.setBounds(63, 11, 118, 49);
		panel_2_5.add(lblNewLabel_3_7);

		JPanel panel_2_6 = new JPanel();
		panel_2_6.setBounds(10, 211, 187, 71);
		panel_1.add(panel_2_6);
		panel_2_6.setLayout(null);

		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\star.png")
				.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		lblNewLabel_2_2.setBounds(10, 0, 30, 71);
		panel_2_6.add(lblNewLabel_2_2);

		JPanel panel_4_2 = new JPanel();
		panel_4_2.setLayout(null);
		panel_4_2.setBackground(new Color(144, 161, 125));
		panel_4_2.setBounds(0, 0, 53, 71);
		panel_2_6.add(panel_4_2);

		JLabel lblNewLabel_3_2 = new JLabel("Java API");
		lblNewLabel_3_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(63, 11, 118, 49);
		panel_2_6.add(lblNewLabel_3_2);

		JPanel panel_2_7 = new JPanel();
		panel_2_7.setBounds(242, 211, 187, 71);
		panel_1.add(panel_2_7);
		panel_2_7.setLayout(null);

		JLabel lblNewLabel_2_5 = new JLabel("");
		lblNewLabel_2_5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\star.png")
				.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		lblNewLabel_2_5.setBounds(10, 0, 30, 71);
		panel_2_7.add(lblNewLabel_2_5);

		JPanel panel_4_5 = new JPanel();
		panel_4_5.setLayout(null);
		panel_4_5.setBackground(new Color(144, 161, 125));
		panel_4_5.setBounds(0, 0, 53, 71);
		panel_2_7.add(panel_4_5);

		JLabel lblNewLabel_3_5 = new JLabel("ASM TASM");
		lblNewLabel_3_5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_3_5.setBounds(59, 11, 118, 49);
		panel_2_7.add(lblNewLabel_3_5);

		JPanel panel_2_8 = new JPanel();
		panel_2_8.setBounds(459, 211, 187, 71);
		panel_1.add(panel_2_8);
		panel_2_8.setLayout(null);

		JLabel lblNewLabel_2_8 = new JLabel("");
		lblNewLabel_2_8.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\star.png")
				.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		lblNewLabel_2_8.setBounds(10, 0, 30, 71);
		panel_2_8.add(lblNewLabel_2_8);

		JPanel panel_4_8 = new JPanel();
		panel_4_8.setLayout(null);
		panel_4_8.setBackground(new Color(144, 161, 125));
		panel_4_8.setBounds(0, 0, 53, 71);
		panel_2_8.add(panel_4_8);

		JLabel lblNewLabel_3_8 = new JLabel("Bash Script");
		lblNewLabel_3_8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel_3_8.setBounds(59, 11, 118, 49);
		panel_2_8.add(lblNewLabel_3_8);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(170, 139, 86));
		panel_3.setBounds(156, 178, 656, 50);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel = new JLabel("   Favorites :");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 161, 28);
		panel_3.add(lblNewLabel);

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(937, 204, 317, 393);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(170, 139, 86));
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
		txtpnWhatIsLorem.setText(
				"Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\r\nIt is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English.");
		txtpnWhatIsLorem.setBounds(10, 74, 297, 308);
		panel_5.add(txtpnWhatIsLorem);

		JLabel lblNewLabel_5 = new JLabel("README.md");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(166, 545, 129, 41);
		frame.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_5_1 = new JLabel("This is your favorite files!");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5_1.setBounds(166, 580, 154, 41);
		frame.getContentPane().add(lblNewLabel_5_1);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_7.setBounds(156, 545, 198, 76);
		frame.getContentPane().add(panel_7);
		panel_7.setLayout(null);

		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(new Color(170, 139, 86));
		panel_7_1.setBounds(0, 0, 198, 34);
		panel_7.add(panel_7_1);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(78, 108, 80));
		panel_8.setBounds(124, 162, 726, 473);
		frame.getContentPane().add(panel_8);
		panel_8.setLayout(null);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(78, 108, 80));
		panel_9.setBounds(925, 190, 339, 415);
		frame.getContentPane().add(panel_9);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
