package Pack;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class MainMenu {

	private JFrame frame;
	private Connection con;
	private PreparedStatement pst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
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
	public MainMenu() {
		initialize();
		Connection();
	}

	public void Connection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/hci_db", "root", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(170, 139, 86));
		panel.setSize(1264, 80);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 235, 206));
		panel_1.setBounds(0, 0, 1264, 681);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(170, 139, 86));
		panel_2.setBounds(0, 80, 180, 601);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("   Drew");
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(53, 125, 81, 40);
		panel_2.add(lblNewLabel_2);

		JButton composeButton = new JButton("Compose");
		composeButton.setBackground(new Color(238, 238, 238));
		composeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new Compose();
			}
		});
		composeButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		composeButton
				.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\plus-black-symbol.png")
						.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		composeButton.setBounds(30, 169, 120, 40);
		composeButton.setFocusable(false);
		panel_2.add(composeButton);

		JButton myfilesButton = new JButton("Recent");
		myfilesButton.setBackground(new Color(238, 238, 238));
		myfilesButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		myfilesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new Recent();
			}
		});
		myfilesButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\clock.png")
				.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		myfilesButton.setBounds(30, 239, 120, 40);
		myfilesButton.setFocusable(false);
		panel_2.add(myfilesButton);

		JButton favoriteButton = new JButton("Favorites");
		favoriteButton.setBackground(new Color(238, 238, 238));
		favoriteButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		favoriteButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\star.png")
				.getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT)));
		favoriteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new Favorites();
			}
		});
		favoriteButton.setBounds(30, 306, 120, 40);
		favoriteButton.setFocusable(false);
		panel_2.add(favoriteButton);

		JButton trashButton = new JButton("Trash");
		trashButton.setBackground(new Color(238, 238, 238));
		trashButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new Trash();
			}
		});
		trashButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		trashButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\trash.png")
				.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		trashButton.setBounds(30, 377, 120, 40);
		trashButton.setFocusable(false);
		panel_2.add(trashButton);

		JButton logoutButton = new JButton("Logout");
		logoutButton.setBackground(new Color(238, 238, 238));
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure?", null, JOptionPane.OK_CANCEL_OPTION);

				if (choice == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "Thank you for using the app!");
					frame.dispose();
					new Start();
				} else {
					frame.dispose();
					new MainMenu();
				}

			}
		});
		logoutButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 11));
		logoutButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\logout.png")
				.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		logoutButton.setBounds(30, 446, 120, 40);
		logoutButton.setFocusable(false);
		panel_2.add(logoutButton);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(43, 27, 100, 100);
		panel_2.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\drewProfile.png")
				.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(240, 235, 206));
		panel_4.setBounds(319, 174, 400, 400);
		panel_1.add(panel_4);
		panel_4.setLayout(null);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(170, 139, 86));
		panel_5.setBounds(0, 0, 400, 70);
		panel_4.add(panel_5);
		panel_5.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("   Notes :");
		lblNewLabel_3.setBackground(new Color(57, 81, 68));
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblNewLabel_3.setBounds(0, 0, 113, 70);
		panel_5.add(lblNewLabel_3);

		JTextArea textArea = new JTextArea();
		textArea.setText("   •");
		textArea.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		textArea.setBounds(10, 79, 380, 310);
		panel_4.add(textArea);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(78, 108, 80));
		panel_7.setBounds(824, 93, 412, 577);
		panel_1.add(panel_7);
		panel_7.setLayout(null);

		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(new Color(240, 235, 206));
		panel_6_1.setBounds(27, 22, 363, 266);
		panel_7.add(panel_6_1);
		panel_6_1.setLayout(null);

		JPanel panel_5_1 = new JPanel();
		panel_5_1.setLayout(null);
		panel_5_1.setBackground(new Color(170, 139, 86));
		panel_5_1.setBounds(0, 0, 363, 70);
		panel_6_1.add(panel_5_1);

		JLabel lblNewLabel_4 = new JLabel("   Task to do :");
		lblNewLabel_4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel_4.setBounds(21, 11, 120, 48);
		panel_5_1.add(lblNewLabel_4);

		JTextPane txtpnAssignment = new JTextPane();
		txtpnAssignment.setEditable(false);
		txtpnAssignment.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		txtpnAssignment.setText(
				"   •\tAssignment 8 HCI\r\n   •\tAssessment Laboratory SE\r\n   •\tKanji FE\r\n   •\tHiragana FE\r\n   •\tAssembly Languge Assignment CAO\r\n   •\tData Structure (Book)\r\n   •\tSoftware Engineering (Book)\r\n\r\n");
		txtpnAssignment.setBounds(10, 81, 343, 174);
		panel_6_1.add(txtpnAssignment);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(240, 235, 206));
		panel_6.setBounds(27, 300, 363, 266);
		panel_7.add(panel_6);
		panel_6.setLayout(null);

		JPanel panel_5_2 = new JPanel();
		panel_5_2.setLayout(null);
		panel_5_2.setBackground(new Color(170, 139, 86));
		panel_5_2.setBounds(0, 0, 363, 70);
		panel_6.add(panel_5_2);

		JLabel lblNewLabel_4_1 = new JLabel("   Deadlines :");
		lblNewLabel_4_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel_4_1.setBounds(10, 11, 120, 48);
		panel_5_2.add(lblNewLabel_4_1);

		JTextPane txtpnQuiz = new JTextPane();
		txtpnQuiz.setEditable(false);
		txtpnQuiz.setText(
				"   •\tQuiz 2 CAO \r\n   •\tQuiz 3 CAO\r\n   •\tQuiz 4 HCI\r\n   •\tMidterm Exam HCI\r\n   •\tSE Aggregation\r\n   •\tTPL Act 3\r\n   •\tTPL Assignment 4\r\n\r\n");
		txtpnQuiz.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		txtpnQuiz.setBounds(10, 81, 343, 174);
		panel_6.add(txtpnQuiz);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(78, 108, 80));
		panel_8.setBounds(275, 150, 486, 453);
		panel_1.add(panel_8);

		JButton saveButton = new JButton("Save");
		saveButton.setBackground(new Color(238, 238, 238));
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String note = textArea.getText();
				String list = "";
				String var1 = "";
				String var2 = "";

				try {
					pst = con.prepareStatement("INSERT INTO hci_table (note,list,var1,var2) VALUES (?,?,?,?)");
					pst.setString(1, note);
					pst.setString(2, list);
					pst.setString(3, var1);
					pst.setString(4, var2);

					int k = pst.executeUpdate();
					if (k == 1) {
						JOptionPane.showMessageDialog(null, "Added Succesfully!");
						textArea.setText("");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		saveButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		saveButton.setBounds(630, 618, 100, 40);
		saveButton.setFocusable(false);
		panel_1.add(saveButton);

		JButton resetButton = new JButton("Reset");
		resetButton.setBackground(new Color(238, 238, 238));
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new MainMenu();
			}
		});
		resetButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		resetButton.setBounds(319, 618, 100, 40);
		resetButton.setFocusable(false);
		panel_1.add(resetButton);

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

		JButton btnMyFiles = new JButton("My Files");
		btnMyFiles.setBackground(new Color(238, 238, 238));
		btnMyFiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new MyFiles();
			}
		});
		btnMyFiles.setIcon(
				new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\open-folder-outline.png")
						.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		btnMyFiles.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		btnMyFiles.setBounds(363, 28, 150, 40);
		btnMyFiles.setFocusable(false);
		panel.add(btnMyFiles);

		JButton btnNewButton_1_1 = new JButton("About");
		btnNewButton_1_1.setBackground(new Color(238, 238, 238));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new About();
			}
		});
		btnNewButton_1_1
				.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\information-symbol.png")
						.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		btnNewButton_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(545, 28, 150, 40);
		btnNewButton_1_1.setFocusable(false);
		panel.add(btnNewButton_1_1);

		JButton btnNewButton_1 = new JButton("Settings");
		btnNewButton_1.setBackground(new Color(238, 238, 238));
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new Settings();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\settings.png")
				.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
		btnNewButton_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		btnNewButton_1.setBounds(726, 28, 150, 40);
		btnNewButton_1.setFocusable(false);
		panel.add(btnNewButton_1);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
