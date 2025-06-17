package mainPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class StudentDataManagement {

	private JFrame frmStudentDatabase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentDataManagement window = new StudentDataManagement();
					window.frmStudentDatabase.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentDataManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStudentDatabase = new JFrame();
		frmStudentDatabase.setTitle("Student Database");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmStudentDatabase.setSize(width , height);
		frmStudentDatabase.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 300);
		frmStudentDatabase.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStudentDatabase.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Database Management");
		lblNewLabel.setForeground(new Color(66, 66, 66));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(374, 20, 692, 53);
		frmStudentDatabase.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(334, 154, 828, 466);
		frmStudentDatabase.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnADD = new JButton("");
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent.main(null);
			}
		});
		btnADD.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/Insert.png")));
		btnADD.setBounds(6, 6, 386, 222);
		panel.add(btnADD);
		
		JButton btnSHOW = new JButton("");
		btnSHOW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayStudent.main(null);
			}
		});
		btnSHOW.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/show.png")));
		btnSHOW.setBounds(436, 6, 386, 222);
		panel.add(btnSHOW);
		
		JButton btnUPDATE = new JButton("");
		btnUPDATE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateStudent.main(null);
			}
		});
		btnUPDATE.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/updates.png")));
		btnUPDATE.setBounds(6, 240, 386, 222);
		panel.add(btnUPDATE);
		
		JButton btnDELETE = new JButton("");
		btnDELETE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteStudent.main(null);
			}
		});
		btnDELETE.setIcon(new ImageIcon(StudentDataManagement.class.getResource("/Images/deleted.png")));
		btnDELETE.setBounds(436, 240, 386, 222);
		panel.add(btnDELETE);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmStudentDatabase.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(177, 700, 139, 47);
		frmStudentDatabase.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(1159, 700, 139, 47);
		frmStudentDatabase.getContentPane().add(btnExit);
	}
}

