package view;
import controller.DAOProduct;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import model.Product;

public class ProductManage extends javax.swing.JFrame {
 private static final long serialVersionUID = 1L;
private List<Product> product ;
   private DefaultTableModel Model ;
  
    public ProductManage() {
        this.setLocation(230,80);
        initComponents();
        Model = (DefaultTableModel)TableResult.getModel();
        showTable();
    }

   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLablePrice = new javax.swing.JLabel();
        jLableID = new javax.swing.JLabel();
        jLableName = new javax.swing.JLabel();
        jLableType = new javax.swing.JLabel();
        jLableQuantity = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnFind = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnReplace = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        txtPrice = new javax.swing.JTextField();
        txtProductID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        comboBoxType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableResult = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PRODUCT MANAGE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 520, -1));

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setText("Return");
        btnExit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 80, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLablePrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLablePrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLablePrice.setText("Price:");
        jPanel2.add(jLablePrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 90, 30));

        jLableID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLableID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLableID.setText("Product ID:");
        jPanel2.add(jLableID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 90, 30));

        jLableName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLableName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLableName.setText("Name:");
        jPanel2.add(jLableName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 90, 30));

        jLableType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLableType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLableType.setText("Type:");
        jPanel2.add(jLableType, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 90, 30));

        jLableQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLableQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLableQuantity.setText("Quantity:");
        jPanel2.add(jLableQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 90, 30));

        jPanel3.setBackground(new java.awt.Color(222, 222, 222));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFind.setText("Find");
        btnFind.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel3.add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 70, 30));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 70, 30));

        btnReplace.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReplace.setText("Replace");
        btnReplace.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplaceActionPerformed(evt);
            }
        });
        jPanel3.add(btnReplace, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 70, 30));

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel3.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 90, 30));

        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel3.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 250, 180));

        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        jPanel2.add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 140, -1));

        txtProductID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtProductID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtProductID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 140, -1));

        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 140, -1));

        txtQuantity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        jPanel2.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 140, -1));

        comboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T-Shirt", "Denim", "Polo", "Vest", "Jean", "Blouse", "Jacket" }));
        comboBoxType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboBoxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTypeActionPerformed(evt);
            }
        });
        jPanel2.add(comboBoxType, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 250, 470));

        TableResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "ProductID", "Name", "Type", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(TableResult);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 550, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
       DAOProduct dao = new DAOProduct();
    String keyword = JOptionPane.showInputDialog(this, "Enter Product ID to find:");
    if (keyword != null && !keyword.trim().isEmpty()) {
     product = dao.searchProduct(keyword);

    Model.setRowCount(0); 
    int count = 1;
    for (Product p : product) {
        Model.addRow(new Object[]{
            count++,
            p.getProductID(),
            p.getNameProduct(),
            p.getType(),
            p.getQuantity(),
            p.getPrice()
            
        });
    }
    } else {
    JOptionPane.showMessageDialog(this, "Keyword ID is required!");
}
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
   DAOProduct dao = new DAOProduct();
        Product product = new Product();
        product.setProductID(txtProductID.getText());
        product.setNameProduct(txtName.getText());
        product.setType(comboBoxType.getSelectedItem().toString());
        product.setQuantity(Integer.parseInt(txtQuantity.getText()));
        product.setPrice(Integer.parseInt(txtPrice.getText()));
         boolean isOK = true ; 
         if(isOK) {
        dao.AddProduct(product);
        showTable();
        JOptionPane.showMessageDialog(this, "Susscessful Added");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplaceActionPerformed
        DAOProduct dao = new DAOProduct();
        Product product = new Product();
    product.setProductID(txtProductID.getText());
    product.setNameProduct(txtName.getText());
    product.setType(comboBoxType.getSelectedItem().toString());
    product.setQuantity(Integer.parseInt(txtQuantity.getText()));
    product.setPrice(Integer.parseInt(txtPrice.getText()));
     boolean success = dao.updateProduct(product);
    if (success) {
        JOptionPane.showMessageDialog(this, "Product updated successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Update failed!");
    }
   showTable(); 
    }//GEN-LAST:event_btnReplaceActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
      showTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
      DAOProduct dao = new DAOProduct();
   String productID = JOptionPane.showInputDialog(this, "Enter product ID to delete:");

   if (productID != null && !productID.trim().isEmpty()) {
    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this product?");
    if (confirm == JOptionPane.YES_OPTION) {
        boolean success = dao.deleteProduct(productID);
        
        if (success) {
            JOptionPane.showMessageDialog(this, "Product deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Delete failed!");
        }
        showTable();
    }
   }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtProductIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIDActionPerformed
       
    }//GEN-LAST:event_txtProductIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void comboBoxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTypeActionPerformed
        
    }//GEN-LAST:event_comboBoxTypeActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
         dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableResult;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReplace;
    private javax.swing.JComboBox<String> comboBoxType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLableID;
    private javax.swing.JLabel jLableName;
    private javax.swing.JLabel jLablePrice;
    private javax.swing.JLabel jLableQuantity;
    private javax.swing.JLabel jLableType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
        product = new DAOProduct().getListProduct();
       Model.setRowCount(0);
        int count = 1;
        for (Product p : product) {
        Model.addRow(new Object[]{
            count++, // Số thứ tự
            p.getProductID(),
            p.getNameProduct(),
            p.getType(),
            p.getQuantity(),
            p.getPrice()
            
        });
    }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductManage().setVisible(true);
            }
        });
    }
}
