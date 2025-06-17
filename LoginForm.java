package mainPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginForm {

	private JFrame frmNInfinityEngineering;
	private JTextField txtLoginName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
					window.frmNInfinityEngineering.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNInfinityEngineering = new JFrame();
		frmNInfinityEngineering.getContentPane().setBackground(new Color(234, 234, 234));
		frmNInfinityEngineering.getContentPane().setForeground(new Color(0, 0, 0));
		frmNInfinityEngineering.setForeground(new Color(0, 0, 0));
		frmNInfinityEngineering.setTitle("Login Page");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmNInfinityEngineering.setSize(width/2,height/2);
		frmNInfinityEngineering.setLocationRelativeTo(null);
//		frame.setBounds(100, 100, 450, 300);
		frmNInfinityEngineering.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNInfinityEngineering.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login System");
		lblNewLabel.setForeground(new Color(66, 66, 66));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel.setBounds(268, 22, 708, 42);
		frmNInfinityEngineering.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(37, 77, 646, 1);
		frmNInfinityEngineering.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(58, 79, 614, 12);
		frmNInfinityEngineering.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Login Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(99, 133, 123, 34);
		frmNInfinityEngineering.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(99, 211, 123, 34);
		frmNInfinityEngineering.getContentPane().add(lblNewLabel_1_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBounds(58, 296, 614, 12);
		frmNInfinityEngineering.getContentPane().add(separator_1_1);
		
		txtLoginName = new JTextField();
		txtLoginName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtLoginName.setBounds(235, 132, 412, 42);
		frmNInfinityEngineering.getContentPane().add(txtLoginName);
		txtLoginName.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(0, 0, 0));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String loginName = txtLoginName.getText();
				String password = txtPassword.getText();
				
				if(loginName.equals("Jessica") && password.equals("Jessi24")) {
					JOptionPane.showMessageDialog(null, "Valid User");
					EntryPage.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "Invalid User");
				}
			}
		});
		btnLogin.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnLogin.setBounds(99, 339, 117, 42);
		frmNInfinityEngineering.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLoginName.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(303, 339, 117, 42);
		frmNInfinityEngineering.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(509, 339, 117, 42);
		frmNInfinityEngineering.getContentPane().add(btnExit);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(234, 211, 413, 42);
		frmNInfinityEngineering.getContentPane().add(txtPassword);
	}
}
