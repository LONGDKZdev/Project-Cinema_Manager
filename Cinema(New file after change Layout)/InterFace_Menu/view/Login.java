package view;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel1.setLayout(null); // Absolute Layout

        // Title Label
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 20, 200, 50);

        // Username Label
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 100, 100, 30);

        // Username Field
        jPanel1.add(txtUsername);
        txtUsername.setBounds(150, 100, 200, 30);

        // Password Label
        jLabel2 = new javax.swing.JLabel("Password:");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 150, 100, 30);

        // Password Field
        jPanel1.add(txtPassword);
        txtPassword.setBounds(150, 150, 200, 30);

        // Login Button
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnLogin.setText("Login");
        btnLogin.addActionListener(evt -> btnLoginActionPerformed(evt));
        jPanel1.add(btnLogin);
        btnLogin.setBounds(150, 200, 90, 30);

        // Exit Button
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 14));
        btnExit.setText("Exit");
        btnExit.addActionListener(evt -> btnExitActionPerformed(evt));
        jPanel1.add(btnExit);
        btnExit.setBounds(260, 200, 90, 30);

        getContentPane().add(jPanel1);
        setSize(400, 300);
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        if ("admin".equals(username) && "123".equals(password)) {
            this.dispose();
            new Home().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
        }
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
}
