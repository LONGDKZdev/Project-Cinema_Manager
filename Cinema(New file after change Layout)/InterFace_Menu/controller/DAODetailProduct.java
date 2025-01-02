package controller;

import model.DetailProduct;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ConnectSQL_Server.SQLServerConnection;

public class DAODetailProduct {
    private Connection conn;

    public DAODetailProduct() {
        conn = SQLServerConnection.getConnection();
    }

    public ArrayList<DetailProduct> getListDetailProduct() {
        ArrayList<DetailProduct> list = new ArrayList<>();
        String sql = "SELECT * FROM tbldetailbill";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                DetailProduct detail = new DetailProduct();
                detail.setProductID(rs.getString("productID"));
                detail.setQuantity(rs.getInt("quantity"));
                detail.setPrice(rs.getInt("price"));
                list.add(detail);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching detail products: " + e.getMessage());
        }
        return list;
    }

    public void AddDetailProduct(DetailProduct detail) {
        String sql = "INSERT INTO tbldetailbill(productID, quantity, price) VALUES (?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, detail.getProductID());
            ps.setInt(2, detail.getQuantity());
            ps.setInt(3, detail.getPrice());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Detail product added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding detail product: " + e.getMessage());
        }
    }

    public void removeDetailProduct(String productID) {
        String sql = "DELETE FROM tbldetailbill WHERE productID=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, productID);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Detail product removed successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No detail product found with the given ID!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error removing detail product: " + e.getMessage());
        }
    }
}
