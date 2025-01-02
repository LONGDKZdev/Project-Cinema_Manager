package view;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Home extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnProductManage = new javax.swing.JButton();
        btnEmployeeManage = new javax.swing.JButton();
        btnBillingManage = new javax.swing.JButton();
        btnAnalystManage = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // Title Font
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOME");

        btnProductManage.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnProductManage.setText("Product Management");
        btnProductManage.addActionListener(evt -> btnProductManageActionPerformed(evt));

        btnEmployeeManage.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnEmployeeManage.setText("Employee Management");
        btnEmployeeManage.addActionListener(evt -> btnEmployeeManageActionPerformed(evt));

        btnBillingManage.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnBillingManage.setText("Billing Management");
        btnBillingManage.addActionListener(evt -> btnBillingManageActionPerformed(evt));

        btnAnalystManage.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnAnalystManage.setText("Revenue Statistics");
        btnAnalystManage.addActionListener(evt -> btnAnalystManageActionPerformed(evt));

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(evt -> btnLogoutActionPerformed(evt));

        // Configure GroupLayout
        GroupLayout layout = new GroupLayout(jPanel1);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.CENTER)
        		.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
        		.addComponent(btnProductManage, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
        		.addComponent(btnEmployeeManage, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
        		.addComponent(btnBillingManage, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
        		.addComponent(btnAnalystManage, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
        		.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addGap(6)
        			.addComponent(btnProductManage, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addComponent(btnEmployeeManage, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addComponent(btnBillingManage, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addComponent(btnAnalystManage, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        			.addGap(20))
        );
        jPanel1.setLayout(layout);

        getContentPane().add(jPanel1);
        pack();
    }

    private void btnProductManageActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new ProductManage().setVisible(true);
    }

    private void btnEmployeeManageActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new EmployeeManage().setVisible(true);
    }

    private void btnBillingManageActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new BillingManage().setVisible(true);
    }

    private void btnAnalystManageActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new AnalystManage().setVisible(true);
    }

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new Login().setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Home().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JButton btnAnalystManage;
    private javax.swing.JButton btnBillingManage;
    private javax.swing.JButton btnEmployeeManage;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProductManage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
}
