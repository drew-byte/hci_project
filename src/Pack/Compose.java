package Pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

public class Compose {

	private JFrame frame;
	private JTextField subjectText;
	private JTextField toText;
	private DefaultTableModel model;
	private JTable table;
	private Connection con;
	private PreparedStatement pst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compose window = new Compose();
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
	public Compose() {
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 235, 206));
		panel_1.setBounds(0, 0, 1264, 681);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

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

		JLabel lblNewLabel_3 = new JLabel("   Mail : ");
		lblNewLabel_3.setBackground(new Color(170, 139, 86));
		lblNewLabel_3.setToolTipText("");
		lblNewLabel_3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblNewLabel_3.setBounds(0, 0, 109, 70);
		panel_5.add(lblNewLabel_3);

		JTextArea mailText = new JTextArea();
		mailText.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));
		mailText.setBounds(10, 185, 380, 204);
		panel_4.add(mailText);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(144, 161, 125));
		panel_9.setBounds(0, 69, 400, 105);
		panel_4.add(panel_9);
		panel_9.setLayout(null);

		JLabel lblNewLabel = new JLabel("Subject :");
		lblNewLabel.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 11, 100, 40);
		panel_9.add(lblNewLabel);

		JLabel lblTo = new JLabel("         To :");
		lblTo.setFont(new Font("Bell MT", Font.BOLD | Font.ITALIC, 15));
		lblTo.setBounds(10, 52, 100, 40);
		panel_9.add(lblTo);

		subjectText = new JTextField();
		subjectText.setBounds(83, 14, 200, 35);
		panel_9.add(subjectText);
		subjectText.setColumns(10);

		toText = new JTextField();
		toText.setColumns(10);
		toText.setBounds(83, 52, 200, 35);
		panel_9.add(toText);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(25, 15, 50, 50);
		panel_1.add(lblNewLabel_1);
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
		panel_1.add(homeButton);

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
		panel_1.add(myFilesButton);

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
		panel_1.add(aboutButton);

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
		panel_1.add(settingsButton);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(170, 139, 86));
		panel.setBounds(0, 0, 1264, 81);
		panel_1.add(panel);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(25, 92, 50, 50);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JButton backButton = new JButton("");
		backButton.setBackground(new Color(238, 238, 238));
		backButton.setBounds(0, 0, 50, 50);
		panel_2.add(backButton);
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

		JLabel lblNewLabel_3_1 = new JLabel("   txt : ");
		lblNewLabel_3_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(801, 174, 98, 70);
		panel_1.add(lblNewLabel_3_1);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(170, 139, 86));
		panel_3.setBounds(801, 174, 400, 70);
		panel_1.add(panel_3);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(78, 108, 80));
		panel_6.setBounds(277, 141, 963, 502);
		panel_1.add(panel_6);
		panel_6.setLayout(null);

		JButton sendButton = new JButton("Send");
		sendButton.setBackground(new Color(238, 238, 238));
		sendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = toText.getText();
				JOptionPane.showMessageDialog(null, "Send to " + text);
				JOptionPane.showMessageDialog(null, "Done!");
				toText.setText("");
				mailText.setText("");
				subjectText.setText("");
			}
		});

		sendButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		sendButton.setBounds(353, 450, 100, 40);
		sendButton.setFocusable(false);
		panel_6.add(sendButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(25, 174, 196, 464);
		panel_1.add(scrollPane);

		table = new JTable();

		model = new DefaultTableModel();
		Object[] column = { "List : " };
		final Object[] row = new Object[1];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(240, 235, 206));
		panel_7.setBounds(525, 102, 400, 331);
		panel_6.add(panel_7);
		panel_7.setLayout(null);

		JTextArea txtText = new JTextArea();
		txtText.setBounds(10, 11, 380, 309);
		panel_7.add(txtText);
		txtText.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 13));

		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(238, 238, 238));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String nameFile = JOptionPane.showInputDialog(null, "Name and Format of file!");

				String note = "";
				String list = nameFile;
				String var1 = txtText.getText();
				String var2 = "";

				int i = 0;

				JOptionPane.showMessageDialog(null, "Saved!");
				txtText.setText("");

				row[i] = nameFile;
				i++;

				model.addRow(row);
				nameFile = ("");

				try {
					pst = con.prepareStatement("INSERT INTO hci_table (note,list,var1,var2) VALUES (?,?,?,?)");
					pst.setString(1, note);
					pst.setString(2, list);
					pst.setString(3, var1);
					pst.setString(4, var2);

					int k = pst.executeUpdate();
					if (k == 1) {
						JOptionPane.showMessageDialog(null, "Added Succesfully!");
						// textArea.setText("");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
		btnSave.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		btnSave.setFocusable(false);
		btnSave.setBounds(842, 450, 100, 40);
		panel_6.add(btnSave);

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
