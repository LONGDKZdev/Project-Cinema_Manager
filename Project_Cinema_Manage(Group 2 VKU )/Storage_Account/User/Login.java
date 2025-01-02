package User;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
import java.awt.Toolkit;

public class Login extends JFrame {
	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public Login() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/User/bekzsoqs.png")));
        setTitle("Login User");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(true);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        usernameLabel.setBounds(160, 111, 130, 60);
        usernameField = new JTextField(15);
        usernameField.setBounds(316, 135, 205, 36);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        passwordLabel.setBounds(160, 179, 130, 60);
        passwordField = new JPasswordField(15);
        passwordField.setBounds(316, 195, 205, 36);

        loginButton = new JButton("Login");
        loginButton.setBounds(305, 261, 110, 50);
        getContentPane().setLayout(null);

        getContentPane().add(usernameLabel);
        getContentPane().add(usernameField);
        getContentPane().add(passwordLabel);
        getContentPane().add(passwordField);
        getContentPane().add(loginButton);

        // Event for Login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String enteredUsername = usernameField.getText();
                String enteredPassword = new String(passwordField.getPassword());

                boolean found = false;
                for (Account account : SignUp_User.accounts) {
                    if (account.getUsername().equals(enteredUsername) && account.getPassword().equals(enteredPassword)) {
                        JOptionPane.showMessageDialog(null, "Login successful!");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
