package Admin_An;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cinema extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
    private boolean rememberPassword = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cinema frame = new cinema();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cinema() {
		setTitle("Login Admin");
		setIconImage(Toolkit.getDefaultToolkit().getImage(cinema.class.getResource("/Admin_An__Image__/admin-login-icon-15.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setBounds(100, 100, 1214,620 );
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 JCheckBox chckbxRememberPassword = new JCheckBox("Remember password");
	        chckbxRememberPassword.setBackground(Color.DARK_GRAY);
	        chckbxRememberPassword.setForeground(Color.RED);
	        chckbxRememberPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
	        chckbxRememberPassword.setBounds(297, 396, 217, 21);
	        chckbxRememberPassword.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                rememberPassword = chckbxRememberPassword.isSelected();
	                System.out.println("Remember password: " + rememberPassword);
	            }
	        });
	        contentPane.add(chckbxRememberPassword);

	        JButton btnLogin = new JButton("LOGIN");
	        btnLogin.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String username = textField.getText();
	                String password = new String(passwordField.getPassword());

	                if ("admin".equals(username) && "12345".equals(password)) {
	                    JOptionPane.showMessageDialog(contentPane, "Login successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
	                    if (rememberPassword) {
	                        System.out.println("Password remembered for user: " + username);
	                    }
	                    
	                    // muốn chuyển đổi qua cửa số khác thì thêm bên dưới nhé
	                } else {
	                    JOptionPane.showMessageDialog(contentPane, "Invalid username or password!", "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });
	        btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 21));
	        btnLogin.setBounds(297, 431, 228, 118);
	        btnLogin.setIcon(new ImageIcon(cinema.class.getResource("/Admin_An__Image__/admin-login-icon-16.jpg")));
	        contentPane.add(btnLogin);

		
		JLabel lblNewLabel_4 = new JLabel("nen password");
		lblNewLabel_4.setIcon(new ImageIcon(cinema.class.getResource("/Admin_An__Image__/e36cf9e1-dd47-421d-907a-0b2ada4ed316.jpg")));
		lblNewLabel_4.setBounds(276, 343, 40, 33);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1_2 = new JLabel("nen login");
		lblNewLabel_1_2.setIcon(new ImageIcon(cinema.class.getResource("/Admin_An__Image__/e66d4bd0-b81d-4f5a-aa28-d12f0b503f78.jpg")));
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 45));
		lblNewLabel_1_2.setBounds(350, 54, 80, 80);
		contentPane.add(lblNewLabel_1_2);
	
		
		JLabel lblNewLabel = new JLabel("LOGIN ADMIN");
		lblNewLabel.setBounds(276, 149, 255, 33);
		lblNewLabel.setForeground(new Color(0, 128, 255));
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username:");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setBounds(325, 217, 200, 33);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.DARK_GRAY);
		textField.setBounds(325, 254, 200, 41);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 30));
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.BOLD, 30));
		passwordField.setBackground(Color.DARK_GRAY);
		passwordField.setForeground(Color.WHITE);
		passwordField.setBounds(325, 333, 200, 41);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setBounds(325, 300, 200, 33);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 27));
		contentPane.add(lblNewLabel_1_1);
		
		lblNewLabel_2 = new JLabel("anh nen");
		lblNewLabel_2.setIcon(new ImageIcon(cinema.class.getResource("/Admin_An__Image__/23a9ea2b-cdb4-4719-91c3-567797eb7e44.jpg")));
		lblNewLabel_2.setBounds(29, 234, 206, 250);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("nen username");
		lblNewLabel_4_1.setIcon(new ImageIcon(cinema.class.getResource("/Admin_An__Image__/fb40ca7a-35a6-41ce-be67-8996a06cc099.jpg")));
		lblNewLabel_4_1.setBounds(276, 264, 40, 33);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("poster");
		lblNewLabel_5.setIcon(new ImageIcon(cinema.class.getResource("/Admin_An__Image__/a012edcc-6807-4f60-8267-4bc659ef83bb.jpg")));
		lblNewLabel_5.setBounds(587, 49, 590, 500);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_3 = new JLabel("nen anh");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setIcon(new ImageIcon(cinema.class.getResource("/Admin_An__Image__/pngtree-abstract-background-of-an-empty-cinema-in-3d-rendered-model-picture-image_3708942.jpg")));
		lblNewLabel_3.setBounds(0, 0, 1200, 620);
		contentPane.add(lblNewLabel_3);
	}
}
