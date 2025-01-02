package view;

import controller.DAOBill;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Bill;

public class AnalystManage extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    private List<Bill> bills;
    private DefaultTableModel Model;

    public AnalystManage() {
        initComponents();
        this.setLocationRelativeTo(null);
        Model = (DefaultTableModel) ResultTable.getModel();
        showTable();
        Total();
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFindDay = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ResultTable = new javax.swing.JTable();
        jLabel_Total = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Revenue Statistics");

        jPanel1.setLayout(null); // Set Absolute Layout

        // Label Title
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REVENUE STATISTICS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(82, 10, 400, 50);

        // Search Label
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel2.setText("Search Date:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 80, 100, 30);

        // Search Text Field
        jPanel1.add(txtFindDay);
        txtFindDay.setBounds(150, 80, 150, 30);

        // Find Button
        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnFind.setText("Find");
        btnFind.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFind.addActionListener(evt -> btnFindActionPerformed(evt));
        jPanel1.add(btnFind);
        btnFind.setBounds(320, 80, 80, 30);

        // Refresh Button
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnRefresh.setText("Refresh");
        btnRefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRefresh.addActionListener(evt -> btnRefreshActionPerformed(evt));
        jPanel1.add(btnRefresh);
        btnRefresh.setBounds(420, 80, 80, 30);

        // Result Table
        ResultTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ResultTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Bill_ID", "DateOrder", "Price"
                }
        ));
        jScrollPane1.setViewportView(ResultTable);
        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 130, 500, 250);

        // Total Price Label
        jLabel_Total.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel_Total.setText("TOTAL PRICE:");
        jPanel1.add(jLabel_Total);
        jLabel_Total.setBounds(50, 400, 500, 30);

        // Return Button
        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnReturn.setText("Return");
        btnReturn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReturn.addActionListener(evt -> btnReturnActionPerformed(evt));
        jPanel1.add(btnReturn);
        btnReturn.setBounds(510, 10, 80, 30);

        getContentPane().add(jPanel1);
        setSize(600, 500);
    }

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {
        String keyword = txtFindDay.getText();
        if (!keyword.isEmpty()) {
            bills = new DAOBill().searchDate(keyword);
            Model.setRowCount(0);
            for (Bill b : bills) {
                Model.addRow(new Object[]{
                    b.getBillID(),
                    b.getDateOrder(),
                    b.getPrice()
                });
            }
        }
        Total();
    }

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        txtFindDay.setText("");
        showTable();
        Total();
    }

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new Home().setVisible(true);
    }

    private void showTable() {
        bills = new DAOBill().getListBill();
        Model.setRowCount(0);
        for (Bill b : bills) {
            Model.addRow(new Object[]{
                b.getBillID(),
                b.getDateOrder(),
                b.getPrice()
            });
        }
    }

    private void Total() {
        DecimalFormat x = new DecimalFormat("###,###,###");
        int total = 0;
        for (int i = 0; i < ResultTable.getRowCount(); i++) {
            total += Integer.parseInt(Model.getValueAt(i, 2).toString());
        }
        jLabel_Total.setText("TOTAL PRICE: " + x.format(total) + " VND");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new AnalystManage().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JTable ResultTable;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Total;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtFindDay;
}
