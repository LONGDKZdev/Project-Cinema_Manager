/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private Connection conn ;
    
    public DAOProduct() {
    	conn = SQLServerConnection.getConnection();
    }
   
     public ArrayList<Product> getListProduct() {
        ArrayList<Product> list = new ArrayList<>() ;
        String sql = "SELECT * FROM tblproduct";
        try {
             if (conn == null) {
                System.out.println("Database connection failed!");
                return list;
            }
            
           PreparedStatement ps = conn.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
               Product product = new Product();
               
               product.setProductID(rs.getString("productID"));
               product.setNameProduct(rs.getString("nameProduct"));
               product.setType(rs.getString("type"));
               product.setQuantity(rs.getInt("quantity"));
               product.setPrice(rs.getInt("price"));
  
               list.add(product);
           }

        } catch(Exception e) {
            e.printStackTrace();
             JOptionPane.showMessageDialog(null, "Error fetching products: " + e.getMessage());
        }
        return list;
    }
    
    public void AddProduct(Product product) { 
    String sql = "INSERT INTO tblproduct (productID, nameProduct, type, quantity, price) VALUES (?,?,?,?,?)"; 
    try {
        if (conn == null) {
                System.out.println("Database connection failed!");
                return;
        }
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,product.getProductID());
        ps.setString(2,product.getNameProduct());
        ps.setString(3,product.getType());
        ps.setInt(4,product.getQuantity());
        ps.setInt(5,product.getPrice());
         ps.executeUpdate();
         
    } catch(SQLException e) {
   e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error adding employee: " + e.getMessage());
    }
    }
     
     public boolean updateProduct(Product product) { 
     String sql = "UPDATE tblproduct SET nameProduct=?, type=?, quantity=?, price=? WHERE productID=?";
      try {
            if (conn == null) {
                System.out.println("Database connection failed!");
                return false;
            }
              PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, product.getNameProduct());
            ps.setString(2, product.getType());
            ps.setInt(3, product.getQuantity());
            ps.setInt(4, product.getPrice());
            ps.setString(5, product.getProductID());
            int rowsUpdated = ps.executeUpdate();
            return rowsUpdated > 0;
                
      } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating employee: " + e.getMessage());
        }
        return false;
     }
     
     public boolean deleteProduct(String productID) {
        String sql = "DELETE FROM tblproduct WHERE productID=?";
        try {
            if (conn == null) {
                System.out.println("Database connection failed!");
                return false;
            }

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, productID);
            int rowsDeleted = ps.executeUpdate();

            return rowsDeleted > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error deleting product: " + e.getMessage());
        }
        return false;
    }
      
    public ArrayList<Product> searchProduct(String keyword) {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM tblproduct WHERE productID LIKE ? OR name LIKE ?";
        try {
            if (conn == null) {
                System.out.println("Database connection failed!");
                return list;
            }

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            ps.setString(2, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) /*chứa những dữ liệu có điểm chung với keyword*/  {
                Product product = new Product();

                product.setProductID(rs.getString("productID"));
                product.setNameProduct(rs.getString("nameProduct"));
                product.setType(rs.getString("type"));
                product.setQuantity(rs.getInt("quantity"));
                product.setPrice(rs.getInt("price"));
               
                list.add(product);
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error searching for employees: " + e.getMessage());
        }
        return list;
    }
     
     
}
