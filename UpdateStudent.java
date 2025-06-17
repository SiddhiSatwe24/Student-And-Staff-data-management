package mainPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class UpdateStudent {

	private JFrame frmUpdateStudentInformation;
	private JTextField txtSerialnumber;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobile;
	protected int Serialnumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStudent window = new UpdateStudent();
					window.frmUpdateStudentInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UpdateStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUpdateStudentInformation = new JFrame();
		frmUpdateStudentInformation.setTitle("Update Student Information");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmUpdateStudentInformation.setSize(width , height);
		frmUpdateStudentInformation.setLocationRelativeTo(null);
		//frmUpdateStudentInformation.setBounds(100, 100, 450, 300);
		frmUpdateStudentInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUpdateStudentInformation.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the Serial Number to Update");
		lblNewLabel.setForeground(new Color(66, 66, 66));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(84, 6, 759, 60);
		frmUpdateStudentInformation.getContentPane().add(lblNewLabel);
		
		txtSerialnumber = new JTextField();
		txtSerialnumber.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		txtSerialnumber.setBounds(910, 6, 164, 60);
		frmUpdateStudentInformation.getContentPane().add(txtSerialnumber);
		txtSerialnumber.setColumns(10);
		
		JButton btnNewButton = new JButton("Get Data");
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(1186, 6, 191, 60);
		frmUpdateStudentInformation.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(119, 78, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(119, 182, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mobile");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(119, 286, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Address");
		lblNewLabel_1_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1_2.setBounds(119, 385, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(lblNewLabel_1_1_2);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtFirstName.setColumns(10);
		txtFirstName.setBounds(306, 78, 936, 45);
		frmUpdateStudentInformation.getContentPane().add(txtFirstName);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtLastName.setColumns(10);
		txtLastName.setBounds(306, 182, 936, 45);
		frmUpdateStudentInformation.getContentPane().add(txtLastName);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtMobile.setColumns(10);
		txtMobile.setBounds(306, 286, 936, 45);
		frmUpdateStudentInformation.getContentPane().add(txtMobile);
		
		JTextArea txtAddressField = new JTextArea();
		txtAddressField.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtAddressField.setBounds(306, 385, 936, 85);
		frmUpdateStudentInformation.getContentPane().add(txtAddressField);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gender");
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(119, 510, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(lblNewLabel_1_4);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(306, 510, 334, 68);
		frmUpdateStudentInformation.getContentPane().add(panel);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setFont(new Font("Arial Black", Font.BOLD, 15));
		rdbtnMale.setBounds(6, 19, 141, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 15));
		rdbtnFemale.setBounds(206, 19, 141, 23);
		panel.add(rdbtnFemale);
		
		JLabel lblNewLabel_1_5 = new JLabel("Degree");
		lblNewLabel_1_5.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(808, 510, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("D O B");
		lblNewLabel_1_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(119, 610, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(lblNewLabel_1_6);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd-MM-yyyy\n");
		dateChooser.setBounds(306, 610, 334, 34);
		frmUpdateStudentInformation.getContentPane().add(dateChooser);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "BTech", "ME", "MCA", "BCA", "BCS", "MBA"}));
		comboBox.setBounds(951, 498, 291, 68);
		frmUpdateStudentInformation.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_1_7 = new JLabel("Subject");
		lblNewLabel_1_7.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_7.setBounds(808, 610, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(lblNewLabel_1_7);
		
		JCheckBox chckbxJAVA = new JCheckBox("JAVA");
		chckbxJAVA.setFont(new Font("Arial Black", Font.BOLD, 15));
		chckbxJAVA.setBounds(951, 615, 128, 40);
		frmUpdateStudentInformation.getContentPane().add(chckbxJAVA);
		
		JCheckBox chckbxCpp = new JCheckBox("CPP");
		chckbxCpp.setFont(new Font("Arial Black", Font.BOLD, 15));
		chckbxCpp.setBounds(1114, 614, 128, 40);
		frmUpdateStudentInformation.getContentPane().add(chckbxCpp);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmUpdateStudentInformation.setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton_1.setBounds(84, 715, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(btnNewButton_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSave.setBounds(466, 715, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtMobile.setText(null);
				txtAddressField.setText(null);
				chckbxJAVA.setSelected(false);
				chckbxCpp.setSelected(false);
				dateChooser.setCalendar(null);
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(866, 715, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(1239, 715, 138, 45);
		frmUpdateStudentInformation.getContentPane().add(btnExit);
	}
}
