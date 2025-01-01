
package view;
import controller.DAOBill;
import controller.DAOProduct;
import controller.DAODetailProduct;
import model.Bill;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Product;
import model.DetailProduct;

public class BillingManage extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
	private List<Bill> bills ;
    private List<Product> products; 
    private List<DetailProduct> detailProducts; 
    private DefaultTableModel ModelBill;
    private DefaultTableModel ModelProduct;
    private DefaultTableModel ModelDetailProduct;
    private int selectedIndex ;
    
    public BillingManage() {
        
        this.setLocation(150,0);
        initComponents();
        ModelBill = (DefaultTableModel) BillTable.getModel();
        ModelProduct = (DefaultTableModel) ProductTable.getModel();
        ModelDetailProduct = (DefaultTableModel) DetailProductTable.getModel();
        showTableBill();
        showTableProduct();
        showTableDetailProduct();
    }

 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelProductID = new javax.swing.JLabel();
        jLabelProductName = new javax.swing.JLabel();
        jLabelType = new javax.swing.JLabel();
        txtProductID = new javax.swing.JTextField();
        comboProductType = new javax.swing.JComboBox<>();
        txtProductName = new javax.swing.JTextField();
        jLabelQuantity = new javax.swing.JLabel();
        txtProductQuantity = new javax.swing.JTextField();
        jLabelPrice = new javax.swing.JLabel();
        txtProductPrice = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        btnAddProduct = new javax.swing.JButton();
        jLabelProductTable = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DetailProductTable = new javax.swing.JTable();
        jLabelDetailProduct = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jLabelProductInf = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnRemoveBill = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        txtBillID = new javax.swing.JTextField();
        jLabelBillID = new javax.swing.JLabel();
        jLabelBillDate = new javax.swing.JLabel();
        txtBillDate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BILLING MANAGEMENT");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelProductID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelProductID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductID.setText("ProductID:");

        jLabelProductName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelProductName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductName.setText("Name:");

        jLabelType.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelType.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelType.setText("Type:");

        comboProductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T-Shirt", "Denim", "Polo", "Vest", "Jean", "Blouse", "Jacket" }));

        jLabelQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelQuantity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQuantity.setText("Quantity:");

        jLabelPrice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelPrice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrice.setText("Price:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelProductID, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jLabelProductName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jLabelType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboProductType, 0, 78, Short.MAX_VALUE)
                    .addComponent(txtProductQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProductPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelProductID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtProductID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboProductType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Name", "Type", "Quantity", "Price"
            }
        ));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        btnAddProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddProduct.setText("Add Product");
        btnAddProduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        jLabelProductTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelProductTable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductTable.setText("Product Table");

        DetailProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductID", "Quantity", "Price"
            }
        ));
        DetailProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetailProductTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DetailProductTable);

        jLabelDetailProduct.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDetailProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDetailProduct.setText("Detail Product");

        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bill_ID", "Date", "Price"
            }
        ));
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BillTable);

        jLabelProductInf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelProductInf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelProductInf.setText("Product Infromation");

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setText("Return");
        btnExit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRemoveBill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemoveBill.setText("Remove Bill");
        btnRemoveBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemoveBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveBillActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtBillID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBillID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillIDActionPerformed(evt);
            }
        });

        jLabelBillID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBillID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBillID.setText("Bill_ID:");

        jLabelBillDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelBillDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBillDate.setText("Date:");

        txtBillDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBillDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBillID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBillDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBillDate, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(txtBillID))
                .addGap(64, 64, 64)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveBill, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveBill)
                    .addComponent(txtBillID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBillID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(jLabelBillDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelProductInf)
                        .addGap(471, 471, 471))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelProductTable, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDetailProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit)))
                .addGap(12, 12, 12)
                .addComponent(jLabelProductInf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelProductTable, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDetailProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveBillActionPerformed
        selectedIndex = BillTable.getSelectedRow();
        JOptionPane.showConfirmDialog(this, "Do you want delete");
        Bill bill = bills.get(selectedIndex);
        new DAOBill().removeBill(bill.getBillID());
        showTableBill();
    }//GEN-LAST:event_btnRemoveBillActionPerformed

    private void txtBillDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillDateActionPerformed

    private void txtBillIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillIDActionPerformed

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
         selectedIndex = ProductTable.getSelectedRow(); //day la lenh mouseClicked
        Product product = products.get(selectedIndex);
        txtProductID.setText(product.getProductID());
        txtProductName.setText(product.getNameProduct());
        comboProductType.setSelectedItem(product.getType());
        txtProductPrice.setText(product.getPrice()+"");
    }//GEN-LAST:event_ProductTableMouseClicked

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
       String productID = "";
       int quantity = 0; 
       int price = 0;
        productID = txtProductID.getText();
       quantity = Integer.parseInt(txtProductQuantity.getText());
       price = Integer.parseInt(txtProductPrice.getText());
       
       DetailProduct detail = new DetailProduct(productID,quantity,price);
       new DAODetailProduct().AddDetailProduct(detail);
       showTableDetailProduct();
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void DetailProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailProductTableMouseClicked
        selectedIndex = DetailProductTable.getSelectedRow();  //day la lenh mouseClicked
        DetailProduct detail = detailProducts.get(selectedIndex);
        new DAODetailProduct().removeDetailProduct(detail.getProductID());
        showTableDetailProduct();
        
        
        
    }//GEN-LAST:event_DetailProductTableMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       int billID = Integer.parseInt(txtBillID.getText());
        String dateOrder = txtBillDate.getText();
       int price = 0;
       for (int i=0; i < DetailProductTable.getRowCount(); i++) {
     price += Integer.parseInt(DetailProductTable.getValueAt(i, 2).toString());
       }
       Bill bill = new Bill(billID,dateOrder,price);
        new DAOBill().AddBill(bill);
        showTableBill();
           JOptionPane.showMessageDialog(this, "Successful Add Bill");
       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BillTableMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
      this.dispose();
      Home home = new Home();
      home.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JTable DetailProductTable;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemoveBill;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboProductType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBillDate;
    private javax.swing.JLabel jLabelBillID;
    private javax.swing.JLabel jLabelDetailProduct;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelProductID;
    private javax.swing.JLabel jLabelProductInf;
    private javax.swing.JLabel jLabelProductName;
    private javax.swing.JLabel jLabelProductTable;
    private javax.swing.JLabel jLabelQuantity;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtBillDate;
    private javax.swing.JTextField txtBillID;
    private javax.swing.JTextField txtProductID;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    public javax.swing.JTextField txtProductQuantity;
    // End of variables declaration//GEN-END:variables

    private void showTableBill() {
       bills = new DAOBill().getListBill();
       ModelBill.setRowCount(0);
        for(Bill b : bills) {
         ModelBill.addRow(new Object[]{
         b.getBillID(),
         b.getDateOrder(),
         b.getPrice()
         });
         
        }
    }

    private void showTableProduct() {
      products = new DAOProduct().getListProduct();
      ModelProduct.setRowCount(0);
      for (Product p : products) {
          ModelProduct.addRow(new Object[]{
          p.getProductID(),
            p.getNameProduct(),
            p.getType(),
            p.getQuantity(),
            p.getPrice()
          });
      }
    }

    private void showTableDetailProduct() {
      detailProducts = new DAODetailProduct().getListProduct();
      ModelDetailProduct.setRowCount(0);
      for (DetailProduct p : detailProducts) {
          ModelDetailProduct.addRow(new Object[]{
          p.getProductID(),
          p.getQuantity(),
          p.getPrice()
          });
      }
    }
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingManage().setVisible(true);
            }
        });
    }
   
    
}
