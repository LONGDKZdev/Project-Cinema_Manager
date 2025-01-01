package Login_cinema;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login_cinema extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Login_cinema frame = new Login_cinema();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Login_cinema() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 500);
        contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Draw background image
                ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/Login_cinema/anh_nen.jpg"));
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblTitle = new JLabel("Welcome to Cinema");
        lblTitle.setForeground(new Color(255, 255, 128));
        lblTitle.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 25));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setBounds(0, 20, getWidth(), 50);
        contentPane.add(lblTitle);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setForeground(Color.WHITE);
        lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblUsername.setBounds(200, 120, 130, 30);
        contentPane.add(lblUsername);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField.setBounds(340, 120, 200, 30);
        contentPane.add(textField);
        textField.setColumns(10);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblPassword.setBounds(200, 180, 130, 30);
        contentPane.add(lblPassword);

        textField_1 = new JTextField();
        textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField_1.setBounds(340, 180, 200, 30);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        JButton btnLogin = new JButton("LOGIN");
        btnLogin.setBackground(new Color(72, 48, 207));
        btnLogin.setForeground(Color.BLACK);
        btnLogin.setFont(new Font("Verdana", Font.PLAIN, 20));
        btnLogin.setBounds(340, 260, 130, 40);
        btnLogin.addActionListener(e -> {
            String username = textField.getText();
            String password = textField_1.getText();
            // Handle login logic here
            JOptionPane.showMessageDialog(this, "Username: " + username + "\nPassword: " + password);
        });
        contentPane.add(btnLogin);

        // Repaint the panel when the frame is resized
        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                lblTitle.setBounds(0, 20, getWidth(), 50);
                btnLogin.setBounds(getWidth() / 2 - 65, 260, 130, 40);
                lblUsername.setBounds(getWidth() / 2 - 190, 120, 130, 30);
                textField.setBounds(getWidth() / 2 - 50, 120, 200, 30);
                lblPassword.setBounds(getWidth() / 2 - 190, 180, 130, 30);
                textField_1.setBounds(getWidth() / 2 - 50, 180, 200, 30);
                repaint();
            }
        });
    }
}
