package Pack;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class Signup {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
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
	public Signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 235, 206));
		panel.setLocation(0, 0);
		panel.setSize(1264, 681);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel1 = new JPanel();
		panel1.setLocation(0, 0);
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.setSize(1264, 80);
		frame.getContentPane().add(panel);
		panel1.setLayout(null);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(238, 238, 238));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				new Start();
			}
		});

		btnNewButton_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\back.png")
				.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)));
		btnNewButton_1.setBounds(278, 199, 40, 35);
		btnNewButton_1.setFocusable(false);
		panel.add(btnNewButton_1);

		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(144, 161, 125));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(278, 245, 706, 340);
		panel.add(panel_1_1);

		JLabel lblNewLabel = new JLabel("First Name: ");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblNewLabel.setBounds(46, 56, 186, 40);
		panel_1_1.add(lblNewLabel);

		JLabel lblLastName = new JLabel("Last Name: ");
		lblLastName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblLastName.setBounds(46, 107, 186, 40);
		panel_1_1.add(lblLastName);

		JLabel lblAge = new JLabel("Age : ");
		lblAge.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblAge.setBounds(144, 158, 88, 40);
		panel_1_1.add(lblAge);

		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblEmail.setBounds(128, 209, 104, 40);
		panel_1_1.add(lblEmail);

		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		lblPassword.setBounds(63, 260, 169, 40);
		panel_1_1.add(lblPassword);

		textField = new JTextField();
		textField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		textField.setBounds(242, 56, 200, 40);
		panel_1_1.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(242, 107, 200, 40);
		panel_1_1.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(242, 158, 200, 40);
		panel_1_1.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		textField_3.setColumns(10);
		textField_3.setBounds(242, 209, 200, 40);
		panel_1_1.add(textField_3);

		JLabel btnNewButton_11 = new JLabel("");
		btnNewButton_11.setBackground(new Color(192, 192, 192));

		btnNewButton_11.setIcon(
				new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\font-selection-editor.png")
						.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
		btnNewButton_11.setBounds(535, 90, 100, 108);
		panel_1_1.add(btnNewButton_11);

		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBackground(new Color(238, 238, 238));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = JOptionPane.showInputDialog(frame, "Enter again password");
				JOptionPane.showMessageDialog(null, "Signup Successful!");
				frame.dispose();
				new Login();
			}
		});
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		btnNewButton.setBounds(535, 209, 100, 40);
		btnNewButton.setFocusable(false);
		panel_1_1.add(btnNewButton);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		passwordField.setBounds(242, 260, 200, 40);
		panel_1_1.add(passwordField);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("show password");
		rdbtnNewRadioButton.setBackground(new Color(144, 161, 125));
		rdbtnNewRadioButton.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 11));
		rdbtnNewRadioButton.setBounds(242, 310, 153, 23);
		panel_1_1.add(rdbtnNewRadioButton);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(170, 139, 86));
		panel_1.setBounds(0, 0, 1264, 80);
		panel.add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(25, 15, 50, 50);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1
				.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Shane\\Desktop\\Icons for HCI\\archive-black-box.png")
						.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));

		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == rdbtnNewRadioButton) {
					if (rdbtnNewRadioButton.isSelected()) {
						passwordField.setEchoChar((char) 0);
					} else {
						passwordField.setEchoChar('*');
					}
				}
			}
		});

		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
