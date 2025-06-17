package mainPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextField;

import com.mysql.cj.protocol.Resultset;

public class JDBCHandling {
	Connection con = null;
	PreparedStatement pstmt = null;
	
	JDBCHandling(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Got Driver ");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaDatabase","root","Siddhie@2409");
			System.out.println("Got Connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ResultSet getTable() {
		ResultSet result = null;
		Statement stmt = null;
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			result = stmt.executeQuery("select * from StudentData");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public int insertData(String firstName, String lastName, long mobile, String address, String gender, String degree,
			String date, String subject1, String subject2) {
		int status = 0;
		try {
			pstmt = con.prepareStatement("insert into StudentData values (?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setLong(3,mobile);
			pstmt.setString(4, address);
			pstmt.setString(5, gender);
			pstmt.setString(6, degree);
			pstmt.setString(7, date);
			pstmt.setString(8, subject1);
			pstmt.setString(9, subject2);
			status = pstmt.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public ResultSet getSerialNumberData(int serialNumber) {
		ResultSet result = null;
		try {
			String query = "SELECT firstName, lastName FROM StudentData WHERE serialNumber = ?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, serialNumber);
			result = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	int insertUpdate(int SerialNumber, String FirstName, String LastName , long Mobile , String Address , String Gender , String Degree , String Date , String Subject1 , String Subject2) {
		int status = 0;
		
		try {
			pstmt = con.prepareStatement("update StudentData set firstName = ?,lastName = ?,mobile = ?,address = ?,gender = ? , degree = ? ,date = ?,subject1 = ?,subject2 = ?");
			pstmt.setInt(1, SerialNumber);
			pstmt.setString(2, FirstName);
			pstmt.setString(3, LastName);
			pstmt.setLong(4,Mobile);
			pstmt.setString(5, Address);
			pstmt.setString(6, Gender);
			pstmt.setString(7, Degree);
			pstmt.setString(8, Date);
			pstmt.setString(9, Subject1);
			pstmt.setString(10, Subject2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
}


