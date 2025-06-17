package mainPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class EntryPage {

	private JFrame frmEntryPage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntryPage window = new EntryPage();
					window.frmEntryPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public EntryPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEntryPage = new JFrame();
		frmEntryPage.setTitle("Entry Page");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmEntryPage.setSize(width,height);
		frmEntryPage.setLocationRelativeTo(null);
		//frmEntryPage.setBounds(100, 100, 450, 300);
		frmEntryPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEntryPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student and Staff Login");
		lblNewLabel.setForeground(new Color(66, 66, 66));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(460, 6, 520, 92);
		frmEntryPage.getContentPane().add(lblNewLabel);
		
		JButton btnStaff = new JButton("");
		btnStaff.setBackground(new Color(141, 249, 0));
		btnStaff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StaffDataManagement.main(null);
			}
		});
		btnStaff.setIcon(new ImageIcon(EntryPage.class.getResource("/Images/professor.png")));
		btnStaff.setBounds(176, 195, 456, 392);
		frmEntryPage.getContentPane().add(btnStaff);
		
		JButton btnStudent = new JButton("");
		btnStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentDataManagement.main(null);
			}
		});
		btnStudent.setIcon(new ImageIcon(EntryPage.class.getResource("/Images/STUDENT.png")));
		btnStudent.setBounds(803, 195, 456, 392);
		frmEntryPage.getContentPane().add(btnStudent);
		
		JLabel lblNewLabel_1 = new JLabel("Staff");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(368, 146, 61, 37);
		frmEntryPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Student");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(991, 146, 240, 37);
		frmEntryPage.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEntryPage.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBounds(102, 690, 147, 51);
		frmEntryPage.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(1191, 690, 147, 51);
		frmEntryPage.getContentPane().add(btnExit);
	}
}
