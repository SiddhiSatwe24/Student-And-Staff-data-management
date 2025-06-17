package mainPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class AddStudent {

	private JFrame frmAddStudentInformation;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobile;
	private JTextArea txtAddress;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	protected int serialNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
					window.frmAddStudentInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentInformation = new JFrame();
		frmAddStudentInformation.setTitle("Add Student Information");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmAddStudentInformation.setSize(width , height);
		frmAddStudentInformation.setLocationRelativeTo(null);
		//frmAddStudentInformation.setBounds(100, 100, 450, 300);
		frmAddStudentInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentInformation.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Login Details");
		lblNewLabel.setForeground(new Color(66, 66, 66));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(483, 6, 473, 68);
		frmAddStudentInformation.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(193, 96, 138, 45);
		frmAddStudentInformation.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(193, 187, 138, 45);
		frmAddStudentInformation.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mobile");
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(193, 280, 138, 45);
		frmAddStudentInformation.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(193, 371, 138, 45);
		frmAddStudentInformation.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Gender");
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(193, 471, 138, 45);
		frmAddStudentInformation.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Degree");
		lblNewLabel_1_5.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(898, 471, 138, 45);
		frmAddStudentInformation.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("D O B");
		lblNewLabel_1_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(193, 553, 138, 45);
		frmAddStudentInformation.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Subject");
		lblNewLabel_1_7.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_7.setBounds(898, 553, 138, 45);
		frmAddStudentInformation.getContentPane().add(lblNewLabel_1_7);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStudentInformation.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(159, 687, 138, 45);
		frmAddStudentInformation.getContentPane().add(btnNewButton);
		JComboBox comboDegree = new JComboBox();
		comboDegree.setFont(new Font("Arial Black", Font.BOLD, 15));
		comboDegree.setModel(new DefaultComboBoxModel(new String[] {"BE", "BTECH", "BCA", "MCA", "ME", "MBA"}));
		comboDegree.setBounds(1037, 457, 277, 75);
		frmAddStudentInformation.getContentPane().add(comboDegree);
		
		JCheckBox chckbxJAVA = new JCheckBox("JAVA");
		chckbxJAVA.setFont(new Font("Arial Black", Font.BOLD, 15));
		chckbxJAVA.setBounds(1037, 558, 128, 40);
		frmAddStudentInformation.getContentPane().add(chckbxJAVA);
		
		JCheckBox chckbxCpp = new JCheckBox("CPP");
		chckbxCpp.setFont(new Font("Arial Black", Font.BOLD, 15));
		chckbxCpp.setBounds(1186, 557, 128, 40);
		frmAddStudentInformation.getContentPane().add(chckbxCpp);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd-MM-yyyy");
		dateChooser.setBounds(385, 558, 334, 33);
		frmAddStudentInformation.getContentPane().add(dateChooser);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtFirstName.setBounds(385, 94, 936, 45);
		frmAddStudentInformation.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtLastName.setColumns(10);
		txtLastName.setBounds(385, 187, 936, 45);
		frmAddStudentInformation.getContentPane().add(txtLastName);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtMobile.setColumns(10);
		txtMobile.setBounds(385, 280, 936, 45);
		frmAddStudentInformation.getContentPane().add(txtMobile);
		
		JTextArea txtAddress = new JTextArea();
		txtAddress.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		txtAddress.setBounds(385, 360, 936, 85);
		frmAddStudentInformation.getContentPane().add(txtAddress);
		
		JPanel panel = new JPanel();
		panel.setBounds(385, 464, 334, 68);
		frmAddStudentInformation.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setFont(new Font("Arial Black", Font.BOLD, 15));
		rdbtnMale.setBounds(6, 19, 141, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Arial Black", Font.BOLD, 15));
		rdbtnFemale.setBounds(206, 19, 141, 23);
		panel.add(rdbtnFemale);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtMobile.setText(null);
				txtAddress.setText(null);
				chckbxJAVA.setSelected(false);
				chckbxCpp.setSelected(false);
				dateChooser.setCalendar(null);
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(476, 687, 138, 45);
		frmAddStudentInformation.getContentPane().add(btnReset);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				long mobile = Long.parseLong(txtMobile.getText());
				String address = txtAddress.getText();
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				String date = sdf.format(dateChooser.getDate());
				String subject1 = null;
				String subject2 = null;
				boolean isSelected = chckbxJAVA.isSelected();
				if(isSelected) {
					subject1 = chckbxJAVA.getLabel();
				}
				isSelected = chckbxCpp.isSelected();
				if(isSelected) {
					subject2 = chckbxCpp.getLabel();
				}
				String gender = null;
				if(rdbtnMale.isSelected()) {
					gender = "Male";
				}else if(rdbtnFemale.isSelected()) {
					gender = "Female";
				}
				String degree = null;
				degree = (String)comboDegree.getSelectedItem();
				//System.out.println(firstName+lastName+mobile+address+date+subject1+subject2+gender+degree);
				JDBCHandling db = new JDBCHandling();
				int status = db.insertData(firstName, lastName, mobile, address, gender, degree, date, subject1, subject2);
				if(status==1) {
					JOptionPane.showMessageDialog(null, "Data is Updated");
				}else {
					JOptionPane.showMessageDialog(null, "Problem in adding data");
				}
			}
			
		});
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSave.setBounds(786, 687, 138, 45);
		frmAddStudentInformation.getContentPane().add(btnSave);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(1089, 687, 138, 45);
		frmAddStudentInformation.getContentPane().add(btnExit);
		
	}
}
