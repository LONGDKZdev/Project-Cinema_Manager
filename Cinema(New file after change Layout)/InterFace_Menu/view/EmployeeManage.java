package view;

import controller.DAOEmployee;
import model.Employee;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.List;

public class EmployeeManage extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    private List<Employee> employees;
    private DefaultTableModel model;

    public EmployeeManage() {
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
        btnRefresh = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Management");

        jPanel1.setLayout(null); // Absolute Layout

        // Title Label
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLOYEE MANAGEMENT");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 10, 400, 50);

        // Table for Employees
        TableResult.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{"Employee ID", "Name", "Position", "Salary"}
        ));
        jScrollPane1.setViewportView(TableResult);
        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 80, 500, 300);

        // Add Button
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnAdd.setText("Add");
        btnAdd.addActionListener(evt -> btnAddActionPerformed(evt));
        jPanel1.add(btnAdd);
        btnAdd.setBounds(50, 400, 100, 30);

        // Remove Button
        btnRemove.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(evt -> btnRemoveActionPerformed(evt));
        jPanel1.add(btnRemove);
        btnRemove.setBounds(180, 400, 100, 30);

        // Refresh Button
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(evt -> btnRefreshActionPerformed(evt));
        jPanel1.add(btnRefresh);
        btnRefresh.setBounds(310, 400, 100, 30);

        // Return Button
        btnReturn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        btnReturn.setText("Return");
        btnReturn.addActionListener(evt -> btnReturnActionPerformed(evt));
        jPanel1.add(btnReturn);
        btnReturn.setBounds(440, 400, 100, 30);

        getContentPane().add(jPanel1);
        setSize(600, 500);
    }

    private void showTable() {
        employees = new DAOEmployee().getListEmployee();
        model.setRowCount(0);
        for (Employee e : employees) {
            model.addRow(new Object[]{
                    e.getEmployeeID(),
                    e.getNameEmployee(),
                    e.getPosition(),
                    e.getSalary()
            });
        }
    }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {
        String employeeID = JOptionPane.showInputDialog(this, "Enter Employee ID:");
        String name = JOptionPane.showInputDialog(this, "Enter Employee Name:");
        String position = JOptionPane.showInputDialog(this, "Enter Position:");
        int salary = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter Salary:"));

        Employee employee = new Employee(employeeID, name, position, null, null, null, null, null, salary);
        new DAOEmployee().AddEmployee(employee);
        showTable();
    }

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {
        String employeeID = JOptionPane.showInputDialog(this, "Enter Employee ID to remove:");
        new DAOEmployee().removeEmployee(employeeID);
        showTable();
    }

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        showTable();
    }

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new Home().setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new EmployeeManage().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JTable TableResult;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
}
