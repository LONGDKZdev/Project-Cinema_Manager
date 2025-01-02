package ConnectSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectMySQL {
    private static final String STORAGE_URL = "jdbc:mysql://localhost:3306/storagedemo?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String InfoStudent_URL = "jdbc:mysql://localhost:3306/information_student?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "123456789@";

    public static void main(String[] args) {
        // Kết nối và gọi bảng từ cơ sở dữ liệu storagedemo
        try (Connection connStorage = DriverManager.getConnection(STORAGE_URL, USER_NAME, PASSWORD)) {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Truy vấn bảng student từ storagedemo
            String sql_1 = "SELECT * FROM student";
            try (PreparedStatement pr1 = connStorage.prepareStatement(sql_1);
                 ResultSet rs1 = pr1.executeQuery()) {

                System.out.printf("%-10s %-20s %-10s%n", "ID", "Full Name", "Score");
                System.out.println("--------------------------------------------");

                while (rs1.next()) {
                    System.out.printf("%-10d %-20s %-10.2f%n", 
                        rs1.getInt("id_student"), 
                        rs1.getString("full_name"), 
                        rs1.getDouble("score"));
                }
            }

        } catch (ClassNotFoundException e) {
            System.err.println("Không tìm thấy driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Kết nối thất bại với cơ sở dữ liệu storagedemo!");
            e.printStackTrace();
        }

        // Kết nối và gọi bảng từ cơ sở dữ liệu information_student
        try (Connection connInfoStudent = DriverManager.getConnection(InfoStudent_URL, USER_NAME, PASSWORD)) {

            String sql_2 = "SELECT * FROM qlsinhvien";
            try (PreparedStatement pr2 = connInfoStudent.prepareStatement(sql_2);
                 ResultSet rs2 = pr2.executeQuery()) {

                System.out.printf("%-10s %-20s %-10s%n", "ID", "Name Student", "Score");
                System.out.println("--------------------------------------------");

                while (rs2.next()) {
                    System.out.printf("%-10d %-20s %-10.2f%n", 
                        rs2.getInt("Student_id"), 
                        rs2.getString("Name_Student"), 
                        rs2.getDouble("score"));
                }
            }

        } catch (SQLException e) {
            System.err.println("Kết nối thất bại với cơ sở dữ liệu information_student!");
            e.printStackTrace();
        }
    }

	public static boolean authenticate(String username, String password2) {
		return false;
	}
}
