package controller;

import model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ConnectSQL_Server.SQLServerConnection;

public class DAOEmployee {
    private Connection conn;

    public DAOEmployee() {
        conn = SQLServerConnection.getConnection();
    }

    public ArrayList<Employee> getListEmployee() {
        ArrayList<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM tblemployee";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Employee emp = new Employee();
                emp.setEmployeeID(rs.getString("employeeID"));
                emp.setNameEmployee(rs.getString("nameEmployee"));
                emp.setPosition(rs.getString("position"));
                emp.setDate(rs.getString("date"));
                emp.setGender(rs.getString("gender"));
                emp.setAddress(rs.getString("address"));
                emp.setPhoneNumber(rs.getString("phoneNumber"));
                emp.setEmail(rs.getString("email"));
                emp.setSalary(rs.getInt("salary"));
                list.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching employees: " + e.getMessage());
        }
        return list;
    }

    public void AddEmployee(Employee emp) {
        String sql = "INSERT INTO tblemployee(employeeID, nameEmployee, position, date, gender, address, phoneNumber, email, salary) VALUES (?,?,?,?,?,?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, emp.getEmployeeID());
            ps.setString(2, emp.getNameEmployee());
            ps.setString(3, emp.getPosition());
            ps.setString(4, emp.getDate());
            ps.setString(5, emp.getGender());
            ps.setString(6, emp.getAddress());
            ps.setString(7, emp.getPhoneNumber());
            ps.setString(8, emp.getEmail());
            ps.setInt(9, emp.getSalary());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Employee added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding employee: " + e.getMessage());
        }
    }

    public void removeEmployee(String employeeID) {
        String sql = "DELETE FROM tblemployee WHERE employeeID=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, employeeID);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Employee removed successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No employee found with the given ID!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error removing employee: " + e.getMessage());
        }
    }
}
