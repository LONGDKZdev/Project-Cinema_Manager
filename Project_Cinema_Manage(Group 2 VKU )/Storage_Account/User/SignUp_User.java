package User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class SignUp_User extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signUpButton;
    private JButton loginButton;

    // Danh sách lưu trữ tài khoản đã đăng ký
    public static List<Account> accounts = new ArrayList<>();
    private JLabel lblNewLabel;
    private JTextArea textArea;

    public SignUp_User() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp_User.class.getResource("/User/iku6x4hk.png")));
    	getContentPane().setBackground(new Color(0, 204, 255));
        setTitle("Sign Up");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        usernameLabel.setBounds(31, 100, 250, 14);
        usernameField = new JTextField(15);
        usernameField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        usernameField.setBounds(31, 117, 280, 50);
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        passwordLabel.setBounds(31, 168, 250, 14);
        passwordField = new JPasswordField(15);
        passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        passwordField.setBounds(31, 184, 280, 50);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBackground(new Color(0, 255, 128));
        signUpButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        signUpButton.setBounds(31, 245, 145, 55);
        loginButton = new JButton("Go to Login");
        loginButton.setBackground(new Color(128, 255, 255));
        loginButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        loginButton.setBounds(186, 245, 136, 55);
        getContentPane().setLayout(null);

        getContentPane().add(usernameLabel);
        getContentPane().add(usernameField);
        getContentPane().add(passwordLabel);
        getContentPane().add(passwordField);
        getContentPane().add(signUpButton);
        getContentPane().add(loginButton);
        
        lblNewLabel = new JLabel("CREATE ACCOUNT USER");
        lblNewLabel.setForeground(new Color(0, 128, 255));
        lblNewLabel.setFont(new Font("Traditional Arabic", Font.BOLD, 25));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(205, 11, 370, 84);
        getContentPane().add(lblNewLabel);
        
        textArea = new JTextArea();
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 20));
        textArea.setBounds(396, 117, 331, 117);
        getContentPane().add(textArea);
        textArea.setLineWrap(true); // Bật tính năng tự động xuống dòng
        textArea.setWrapStyleWord(true);//xuống dòng theo từ (tránh trường hợp bị tách chữ)

        // Event for Sign Up button
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Lưu tài khoản mới vào danh sách
                accounts.add(new Account(username, password));
                JOptionPane.showMessageDialog(null, "Sign Up Successful!");
                textArea.setText("the account you created : \n"
                				+"YOUR USERNAME : "+ username+"\n"
                				+"YOUR PASSWORD : "+ password+"\n");
            }
        });

        // Event for Login button (switch to Login screen)
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Login().setVisible(true);
                dispose(); // Close current frame
            }
        });
    }

    public static void main(String[] args) {
        new SignUp_User().setVisible(true);
        //asd
    }
}
