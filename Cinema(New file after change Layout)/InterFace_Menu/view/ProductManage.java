package view;

import controller.DAOProduct;
import model.Product;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.List;

public class ProductManage extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    private List<Product> products;
    private DefaultTableModel model;

    public ProductManage() {
        initComponents();
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel) TableResult.getModel();
        showTable();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableResult = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Management");

        jPanel1.setLayout(null); // Absolute Layout

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCT MANAGEMENT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(120, 10, 400, 50);

        TableResult.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Product ID", "Name", "Type", "Quantity", "Price"}
        ));
        jScrollPane1.setViewportView(TableResult);
        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 80, 500, 300);

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnAdd.setText("Add");
        btnAdd.addActionListener(evt -> btnAddActionPerformed(evt));
        jPanel1.add(btnAdd);
        btnAdd.setBounds(50, 400, 100, 30);

        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(evt -> btnRemoveActionPerformed(evt));
        jPanel1.add(btnRemove);
        btnRemove.setBounds(180, 400, 100, 30);

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(evt -> btnUpdateActionPerformed(evt));
        jPanel1.add(btnUpdate);
        btnUpdate.setBounds(310, 400, 100, 30);

        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnFind.setText("Find");
        btnFind.addActionListener(evt -> btnFindActionPerformed(evt));
        jPanel1.add(btnFind);
        btnFind.setBounds(440, 400, 100, 30);

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(evt -> btnRefreshActionPerformed(evt));
        jPanel1.add(btnRefresh);
        btnRefresh.setBounds(50, 450, 200, 30);

        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnReturn.setText("Return");
        btnReturn.addActionListener(evt -> btnReturnActionPerformed(evt));
        jPanel1.add(btnReturn);
        btnReturn.setBounds(300, 450, 200, 30);

        getContentPane().add(jPanel1);
        setSize(600, 550);
    }

    private void showTable() {
        products = new DAOProduct().getListProduct();
        model.setRowCount(0);
        for (Product p : products) {
            model.addRow(new Object[]{
                p.getProductID(),
                p.getNameProduct(),
                p.getType(),
                p.getQuantity(),
                p.getPrice()
            });
        }
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String productID = JOptionPane.showInputDialog(this, "Enter Product ID:");
            String nameProduct = JOptionPane.showInputDialog(this, "Enter Product Name:");
            String type = JOptionPane.showInputDialog(this, "Enter Type:");
            int quantity = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Quantity:"));
            int price = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Price:"));

            Product product = new Product(productID, nameProduct, type, quantity, price);
            new DAOProduct().AddProduct(product);
            JOptionPane.showMessageDialog(this, "Product added successfully!");
            showTable();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter numeric values for quantity and price.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {
        String productID = JOptionPane.showInputDialog(this, "Enter Product ID to remove:");
        if (productID == null || productID.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product ID is required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean success = new DAOProduct().removeProduct(productID);
        if (success) {
            JOptionPane.showMessageDialog(this, "Product removed successfully!");
            showTable();
        } else {
            JOptionPane.showMessageDialog(this, "No product found with the given ID!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String productID = JOptionPane.showInputDialog(this, "Enter Product ID:");
            String nameProduct = JOptionPane.showInputDialog(this, "Enter New Product Name:");
            String type = JOptionPane.showInputDialog(this, "Enter New Type:");
            int quantity = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter New Quantity:"));
            int price = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter New Price:"));

            Product product = new Product(productID, nameProduct, type, quantity, price);
            boolean success = new DAOProduct().updateProduct(product);
            if (success) {
                JOptionPane.showMessageDialog(this, "Product updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Update failed! Please check the Product ID.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            showTable();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter numeric values for quantity and price.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {
        String productID = JOptionPane.showInputDialog(this, "Enter Product ID to find:");
        if (productID == null || productID.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Product ID is required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        products = new DAOProduct().searchProduct(productID);
        model.setRowCount(0);
        if (products.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No product found with the given ID!", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
            for (Product p : products) {
                model.addRow(new Object[]{
                    p.getProductID(),
                    p.getNameProduct(),
                    p.getType(),
                    p.getQuantity(),
                    p.getPrice()
                });
            }
        }
    }

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        showTable();
    }

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new Home().setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new ProductManage().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JTable TableResult;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
}
