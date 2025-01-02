package ConnectSQL_Server;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerConnection {
    private static final String SERVER_NAME = "DESKTOP-12FN1VC"; 
    private static final String DATABASE_NAME = "CinemaDataBase"; 
    private static final String USERNAME = "sa"; 
    private static final String PASSWORD = "123"; 
    private static final String URL = "jdbc:sqlserver://" + SERVER_NAME + ":1433;databaseName=" + DATABASE_NAME 
            + ";encrypt=true;trustServerCertificate=true";

    // Sử dụng singleton pattern
    private static Connection connection = null;

    // Phương thức trả về kết nối
    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Nạp driver
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); // Kết nối
                System.out.println("Connected to table **" + DATABASE_NAME + "** SQL Server successfully!");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Connection failed: " + e.getMessage());
            }
        }
        return connection;
    }
}

    /*
    public static void main(String[] args) {
		Connection con = SQLServerConnection.getConnection();
		
		if(con != null) {
			System.out.println("Connected successfully!");
		} else {
			System.out.println("Connected FAILED !!!!");
		}


	}
	*/

