package controller;

import model.Bill;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ConnectSQL_Server.SQLServerConnection;

public class DAOBill {
    private Connection conn;

    public DAOBill() {
        conn = SQLServerConnection.getConnection();
    }

    public ArrayList<Bill> getListBill() {
        ArrayList<Bill> list = new ArrayList<>();
        String sql = "SELECT * FROM tblbill";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setBillID(rs.getInt("billID"));
                bill.setDateOrder(rs.getString("dateOrder"));
                bill.setPrice(rs.getInt("price"));
                list.add(bill);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching bills: " + e.getMessage());
        }
        return list;
    }

    public ArrayList<Bill> searchDate(String keyword) {
        ArrayList<Bill> list = new ArrayList<>();
        String sql = "SELECT * FROM tblbill WHERE dateOrder LIKE ?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%" + keyword + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Bill bill = new Bill();
                    bill.setBillID(rs.getInt("billID"));
                    bill.setDateOrder(rs.getString("dateOrder"));
                    bill.setPrice(rs.getInt("price"));
                    list.add(bill);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error searching for bills: " + e.getMessage());
        }
        return list;
    }

    public void AddBill(Bill bill) {
        String sql = "INSERT INTO tblbill(billID, dateOrder, price) VALUES (?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, bill.getBillID());
            ps.setString(2, bill.getDateOrder());
            ps.setInt(3, bill.getPrice());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Bill added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding bill: " + e.getMessage());
        }
    }

    public void removeBill(int billID) {
        String sql = "DELETE FROM tblbill WHERE billID=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, billID);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Bill removed successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No bill found with the given ID!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error removing bill: " + e.getMessage());
        }
    }
}
