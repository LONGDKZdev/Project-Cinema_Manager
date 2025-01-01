
package view;

import controller.DAOEmployee;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;


public class EmployeeManage extends javax.swing.JFrame {
   private static final long serialVersionUID = 1L;
private List<Employee> employee ;
   private DefaultTableModel Model ;
   
    public EmployeeManage() {
        initComponents();
        this.setLocationRelativeTo(null);
        Model = (DefaultTableModel)TableResult.getModel();
        showTable();
    }
    
    
 // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboxCV;
    private javax.swing.JRadioButton RdNam;
    private javax.swing.JRadioButton RdNu;
    private javax.swing.JTable TableResult;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReplace;
//    private javax.swing.ButtonGroup buttonGroup1;
//    private javax.swing.ButtonGroup buttonGroup2;
//    private javax.swing.ButtonGroup buttonGroup3;
//    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtManv;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTennv;
    private javax.swing.JTextField txtdate;
    // End of variables declaration//GEN-END:variables
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

//        buttonGroup1 = new javax.swing.ButtonGroup();
//        buttonGroup2 = new javax.swing.ButtonGroup();
//        buttonGroup3 = new javax.swing.ButtonGroup();
//        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtManv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTennv = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        RdNam = new javax.swing.JRadioButton();
        RdNu = new javax.swing.JRadioButton();
        ComboxCV = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnReplace = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableResult = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLOYEE MANAGER");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Employee ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Full Name:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gender:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Postion:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Birth Date:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Address:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Phone Num:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Salary:");

        RdNam.setText("Man");
        RdNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdNamActionPerformed(evt);
            }
        });

        RdNu.setText("Woman");
        RdNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdNuActionPerformed(evt);
            }
        });

        ComboxCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sell", "Guard", "Manager" }));
        ComboxCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboxCVActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnReplace.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReplace.setText("Replace");
        btnReplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplaceActionPerformed(evt);
            }
        });

        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnRefresh)
                        .addGap(18, 18, 18)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReplace)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnReplace)
                    .addComponent(btnRemove))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(btnFind))
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
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RdNam, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtLuong))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSDT))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEmail))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtAddress))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdate))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ComboxCV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTennv))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RdNam)
                    .addComponent(RdNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboxCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TableResult.setFont(new Font("Tahoma", Font.PLAIN, 12)); // NOI18N
        TableResult.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Number", "Emp ID", "Full Name", "Position", "Birth Date", "Gender", "Address", "Phone Number", "Email ", "Salary"
        	}
        ));
        jScrollPane1.setViewportView(TableResult);

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setText("Return");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 676, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(241, Short.MAX_VALUE)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 500, GroupLayout.PREFERRED_SIZE)
        			.addGap(156)
        			.addComponent(btnExit)
        			.addGap(14))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(btnExit)
        					.addGap(53))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(jLabel1)
        					.addGap(18)))
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        				.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 540, GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2.setLayout(jPanel2Layout);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplaceActionPerformed
      DAOEmployee dao = new DAOEmployee();
        Employee employee = new Employee();
    employee.setEmployeeID(txtManv.getText());
    employee.setName(txtTennv.getText());
    employee.setPosition(ComboxCV.getSelectedItem().toString());
    employee.setDate(txtdate.getText());
    employee.setAddress(txtAddress.getText());
    employee.setPhoneNumber(txtSDT.getText());
    employee.setEmail(txtEmail.getText());
    employee.setSalary(Integer.parseInt(txtLuong.getText()));
    String gender = "";
    if (RdNam.isSelected()) {
     gender = "Man";
    } else if (RdNu.isSelected()) {
    gender = "Female";
    }
    employee.setGender(gender);
    
    boolean success = dao.updateEmployee(employee);
    if (success) {
        JOptionPane.showMessageDialog(this, "Employee updated successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Update failed!");
    }
   showTable(); 
    }//GEN-LAST:event_btnReplaceActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
    	try {// đã thêm try catch để không bị dừng chương trình (btnRemove)
            DAOEmployee dao = new DAOEmployee();
            String employeeID = JOptionPane.showInputDialog(this, "Enter Employee ID to delete:");
            if (employeeID != null && !employeeID.trim().isEmpty()) {
                int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this employee?");
                if (confirm == JOptionPane.YES_OPTION) {
                    boolean success = dao.deleteEmployee(employeeID);       
                    if (success) {
                        JOptionPane.showMessageDialog(this, "Employee deleted successfully!");
                        showTable();
                    } else {
                        JOptionPane.showMessageDialog(this, "Delete failed! Employee ID not found.");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Employee ID is required to delete!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred while deleting: " + e.getMessage());
        }
    }

    private void RdNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdNamActionPerformed
    }
    private void ComboxCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboxCVActionPerformed 
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
    	try {
            DAOEmployee dao = new DAOEmployee();
            Employee employee = new Employee();

            if (txtManv.getText().trim().isEmpty() || txtTennv.getText().trim().isEmpty() ||
                txtdate.getText().trim().isEmpty() || txtAddress.getText().trim().isEmpty() ||
                txtEmail.getText().trim().isEmpty() || txtSDT.getText().trim().isEmpty() ||
                txtLuong.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required!");
                return;
            }

            employee.setEmployeeID(txtManv.getText());
            employee.setName(txtTennv.getText());
            employee.setPosition(ComboxCV.getSelectedItem().toString());
            employee.setDate(txtdate.getText());
            employee.setAddress(txtAddress.getText());
            employee.setPhoneNumber(txtSDT.getText());
            employee.setEmail(txtEmail.getText());
            employee.setSalary(Integer.parseInt(txtLuong.getText()));

            String gender = RdNam.isSelected() ? "Man" : "Female";
            employee.setGender(gender);

            boolean success = dao.AddEmployee(employee);
            if (success) {
                JOptionPane.showMessageDialog(this, "Employee added successfully!");
                showTable();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add employee.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid salary input. Please enter a number.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred: " + e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        showTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
    	try {// đã thêm try catch để không bị dừng chương trình(btnFind)
            DAOEmployee dao = new DAOEmployee();
            String keyword = JOptionPane.showInputDialog(this, "Enter Employee ID to find:");
            if (keyword != null && !keyword.trim().isEmpty()) {
                employee = dao.searchEmployee(keyword);
                if (employee.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No employee found with the given ID.");
                } else {
                    Model.setRowCount(0); 
                    int count = 1;
                    for (Employee e : employee) {
                        Model.addRow(new Object[]{
                            count++,
                            e.getEmployeeID(),
                            e.getNameEmployee(),
                            e.getPosition(),
                            e.getDate(),
                            e.getGender(),
                            e.getAddress(),
                            e.getPhoneNumber(),
                            e.getEmail(),
                            e.getSalary()
                        });
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Keyword ID is required!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred while searching: " + e.getMessage());
        }
    }
    private void RdNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdNuActionPerformed
       
    }//GEN-LAST:event_RdNuActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed


    

    private void showTable() {
       employee = new DAOEmployee().getListEmployee();
       Model.setRowCount(0);
        int count = 1;
        for (Employee e : employee) {
        Model.addRow(new Object[]{
            count++, // Số thứ tự
            e.getEmployeeID(),
            e.getNameEmployee(),
            e.getPosition(),
            e.getDate(),
            e.getGender(),
            e.getAddress(),
            e.getPhoneNumber(),
            e.getEmail(),
            e.getSalary()
        });
    }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeManage().setVisible(true);
            }
        });
    }
}
