package mainPackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class DisplayStaff {

	private JFrame frmDisplayStaffInformation;
	private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayStaff window = new DisplayStaff();
					window.frmDisplayStaffInformation.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DisplayStaff() {
		initialize();
	}

	private void initialize() {
		frmDisplayStaffInformation = new JFrame();
		frmDisplayStaffInformation.getContentPane().setBackground(new Color(234, 234, 234));
		frmDisplayStaffInformation.setTitle("Display Staff Information");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmDisplayStaffInformation.setSize(width, height);
		frmDisplayStaffInformation.setLocationRelativeTo(null);
		frmDisplayStaffInformation.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDisplayStaffInformation.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Staff Information");
		lblNewLabel.setBounds(499, 33, 442, 54);
		lblNewLabel.setForeground(new Color(66, 66, 66));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		frmDisplayStaffInformation.getContentPane().add(lblNewLabel);

		JButton btnBack = new JButton("Back");
		btnBack.setBounds(115, 695, 138, 45);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmDisplayStaffInformation.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		frmDisplayStaffInformation.getContentPane().add(btnBack);

		JButton btnShow = new JButton("Show");
		btnShow.setBounds(657, 695, 138, 45);
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDBCHandling db = new JDBCHandling();
				ResultSet result = db.getTable();

				DefaultTableModel model = new DefaultTableModel();
				String[] columnNames = {"Serial Number", "First Name", "Last Name", "Mobile No.", "Address", "Gender", "Degree", "D O B", "Subject1", "Subject2"};
				model.setColumnIdentifiers(columnNames);

				try {
					int serial = 1;
					while (result.next()) {
						model.addRow(new Object[]{
							serial++,
							result.getString(1),
							result.getString(2),
							result.getLong(3),
							result.getString(4),
							result.getString(5),
							result.getString(6),
							result.getString(7),
							result.getString(8),
							result.getString(9)
						});
					}
					result.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

				table.setModel(model);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

				// Center cell contents
				DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
				centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
				table.setDefaultRenderer(Object.class, centerRenderer);
			}
		});
		btnShow.setFont(new Font("Arial Black", Font.BOLD, 20));
		frmDisplayStaffInformation.getContentPane().add(btnShow);

		JButton btnClose = new JButton("Close");
		btnClose.setBounds(1147, 695, 138, 45);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setFont(new Font("Arial Black", Font.BOLD, 20));
		frmDisplayStaffInformation.getContentPane().add(btnClose);

		table = new JTable();
		table.setBackground(Color.WHITE);                    // White background
		table.setForeground(Color.BLACK);                    // Black text
		table.setGridColor(Color.BLACK);                     // Black grid lines
		table.setShowGrid(true);                             // Show grid
		table.setBorder(new LineBorder(Color.BLACK));        // Black border

		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Serial Number", "First Name", "Last Name", "Mobile No.", "Address", "Gender", "Degree", "D . O . B", "Subject1", "Subject2"
			}
		));

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(115, 136, 1170, 524);
		frmDisplayStaffInformation.getContentPane().add(scrollPane);
	}
}
