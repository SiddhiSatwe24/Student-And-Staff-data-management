package mainPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCHandling2 {
    Connection con = null;
    PreparedStatement pstmt = null;

    JDBCHandling2() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Got Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/JavaDatabase", 
                "root", 
                "Siddhie@2409"
            );
            System.out.println("Got Connection");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet getTable() {
        ResultSet result = null;
        Statement stmt;
        try {
            stmt = con.createStatement();
            result = stmt.executeQuery("SELECT * FROM StaffData");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int insertData(int serialNumber, String firstName, String lastName, long mobile, String address, String gender,
                          String degree, String date, String subject1, String subject2) {
        int status = 0;
        try {
            pstmt = con.prepareStatement("INSERT INTO StaffData VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            pstmt.setInt(1, serialNumber);
            pstmt.setString(2, firstName);
            pstmt.setString(3, lastName);
            pstmt.setLong(4, mobile);
            pstmt.setString(5, address);
            pstmt.setString(6, gender);
            pstmt.setString(7, degree);
            pstmt.setString(8, date);
            pstmt.setString(9, subject1);
            pstmt.setString(10, subject2);
            status = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    public ResultSet getSerialNumberData(int serialNumber) {
        ResultSet result = null;
        try {
            String query = "SELECT * FROM StaffData WHERE serialNumber = ?";
            pstmt = con.prepareStatement(query);
            pstmt.setInt(1, serialNumber);
            result = pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int insertUpdate(int serialNumber, String firstName, String lastName, long mobile, String address,
                            String gender, String degree, String date, String subject1, String subject2) {
        int status = 0;
        try {
            pstmt = con.prepareStatement(
                "UPDATE StaffData SET firstName = ?, lastName = ?, mobile = ?, address = ?, gender = ?, degree = ?, date = ?, subject1 = ?, subject2 = ? WHERE serialNumber = ?"
            );
            pstmt.setString(1, firstName);
            pstmt.setString(2, lastName);
            pstmt.setLong(3, mobile);
            pstmt.setString(4, address);
            pstmt.setString(5, gender);
            pstmt.setString(6, degree);
            pstmt.setString(7, date);
            pstmt.setString(8, subject1);
            pstmt.setString(9, subject2);
            pstmt.setInt(10, serialNumber);
            status = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }
}
