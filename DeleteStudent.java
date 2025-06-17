package mainPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteStudent {

	private JFrame frmDeleteStudentInformation;
	private JTextField txtFirstName;
	private JTextField txtSrNo;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStudent window = new DeleteStudent();
					window.frmDeleteStudentInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DeleteStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDeleteStudentInformation = new JFrame();
		frmDeleteStudentInformation.setTitle("Delete Student Information");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmDeleteStudentInformation.setSize(width , height);
		frmDeleteStudentInformation.setLocationRelativeTo(null);
		//frmDeleteStudentInformation.setBounds(100, 100, 450, 300);
		frmDeleteStudentInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeleteStudentInformation.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Student Information");
		lblNewLabel.setForeground(new Color(66, 66, 66));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(421, 6, 598, 97);
		frmDeleteStudentInformation.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(256, 376, 138, 46);
		frmDeleteStudentInformation.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(256, 534, 138, 46);
		frmDeleteStudentInformation.getContentPane().add(lblNewLabel_1_1);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txtFirstName.setBounds(429, 369, 722, 53);
		frmDeleteStudentInformation.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enter the Serial Number to Update");
		lblNewLabel_2.setForeground(new Color(66, 66, 66));
		lblNewLabel_2.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel_2.setBounds(124, 201, 759, 60);
		frmDeleteStudentInformation.getContentPane().add(lblNewLabel_2);
		
		txtSrNo = new JTextField();
		txtSrNo.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		txtSrNo.setColumns(10);
		txtSrNo.setBounds(949, 201, 164, 60);
		frmDeleteStudentInformation.getContentPane().add(txtSrNo);
		
		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(1198, 201, 191, 60);
		frmDeleteStudentInformation.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDeleteStudentInformation.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1.setBounds(124, 686, 164, 60);
		frmDeleteStudentInformation.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("Exit");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_2.setBounds(1198, 686, 164, 60);
		frmDeleteStudentInformation.getContentPane().add(btnNewButton_1_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(429, 534, 722, 53);
		frmDeleteStudentInformation.getContentPane().add(textField);
		
		JButton btnNewButton_1_1 = new JButton("Delete");
		btnNewButton_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(663, 686, 164, 60);
		frmDeleteStudentInformation.getContentPane().add(btnNewButton_1_1);
	}
}
