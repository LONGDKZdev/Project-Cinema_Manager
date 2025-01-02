package controller;

import model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ConnectSQL_Server.SQLServerConnection;

public class DAOProduct {
    private Connection conn;

    public DAOProduct() {
        conn = SQLServerConnection.getConnection();
    }

    public ArrayList<Product> getListProduct() {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM tblproduct";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Product product = new Product();
                product.setProductID(rs.getString("productID"));
                product.setNameProduct(rs.getString("nameProduct"));
                product.setType(rs.getString("type"));
                product.setQuantity(rs.getInt("quantity"));
                product.setPrice(rs.getInt("price"));
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error fetching products: " + e.getMessage());
        }
        return list;
    }

    public void AddProduct(Product product) {
        String sql = "INSERT INTO tblproduct(productID, nameProduct, type, quantity, price) VALUES (?,?,?,?,?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, product.getProductID());
            ps.setString(2, product.getNameProduct());
            ps.setString(3, product.getType());
            ps.setInt(4, product.getQuantity());
            ps.setInt(5, product.getPrice());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Product added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding product: " + e.getMessage());
        }
    }

    public void removeProduct(String productID) {
        String sql = "DELETE FROM tblproduct WHERE productID=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, productID);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Product removed successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "No product found with the given ID!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error removing product: " + e.getMessage());
        }
    }

    // THÊM PHƯƠNG THỨC searchProduct 
    public ArrayList<Product> searchProduct(String productID) {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM tblproduct WHERE productID = ?"; // Tìm theo productID
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, productID); // Gán giá trị productID
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Product product = new Product();
                    product.setProductID(rs.getString("productID"));
                    product.setNameProduct(rs.getString("nameProduct")); // Đúng tên cột trong database
                    product.setType(rs.getString("type"));
                    product.setQuantity(rs.getInt("quantity"));
                    product.setPrice(rs.getInt("price"));
                    list.add(product);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error searching for product: " + e.getMessage());
        }
        return list;
    }


    public boolean updateProduct(Product product) {
        String sql = "UPDATE tblproduct SET nameProduct=?, type=?, quantity=?, price=? WHERE productID=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, product.getNameProduct()); // Đúng tên cột nameProduct
            ps.setString(2, product.getType());
            ps.setInt(3, product.getQuantity());
            ps.setInt(4, product.getPrice());
            ps.setString(5, product.getProductID());

            int rowsUpdated = ps.executeUpdate();
            return rowsUpdated > 0; // Trả về true nếu cập nhật thành công
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating product: " + e.getMessage());
        }
        return false; // Trả về false nếu xảy ra lỗi
    }

}
