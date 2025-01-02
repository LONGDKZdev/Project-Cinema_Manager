package Admin_Long;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Login extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField userText;
	private JPasswordField passText;
	private String userName;
	private String passWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setFont(new Font("Times New Roman", Font.BOLD, 15));
		setTitle("Login Admin");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Admin_Long__Image__/Log icon(Programing).png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 1280, 720);
		setLocationRelativeTo(null);
		setResizable(true);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea messageLabel = new JTextArea();
		messageLabel.setFont(new Font("Times New Roman", Font.BOLD, 32));
		messageLabel.setBounds(66, 464, 258, 76);
		contentPane.add(messageLabel);
		messageLabel.setLineWrap(true); // Bật tính năng tự động xuống dòng
		messageLabel.setWrapStyleWord(true); // Bật tính năng ngắt dòng theo từ

		
		JLabel lblNewLabel_3 = new JLabel("LOGIN STATUS");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(90, 364, 220, 89);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setIcon(new ImageIcon(Login.class.getResource("/Admin_Long__Image__/Login status.png")));
		lblNewLabel_4.setBounds(31, 330, 332, 297);
		contentPane.add(lblNewLabel_4);
		
		JLabel JL_Login = new JLabel("LOGIN ADMIN");
		JL_Login.setForeground(new Color(255, 0, 0));
		JL_Login.setFont(new Font("Sylfaen", Font.BOLD, 35));
		JL_Login.setHorizontalAlignment(SwingConstants.CENTER);
		JL_Login.setBounds(691, 109, 292, 123);
		contentPane.add(JL_Login);
		
		JLabel JL_UserName = new JLabel("User name:");
		JL_UserName.setForeground(new Color(255, 255, 255));
		JL_UserName.setFont(new Font("Times New Roman", Font.BOLD, 25));
		JL_UserName.setHorizontalAlignment(SwingConstants.CENTER);
		JL_UserName.setBounds(562, 243, 145, 76);
		contentPane.add(JL_UserName);
		
		JLabel JL_Password = new JLabel("Password:");
		JL_Password.setForeground(new Color(255, 255, 255));
		JL_Password.setHorizontalAlignment(SwingConstants.CENTER);
		JL_Password.setFont(new Font("Times New Roman", Font.BOLD, 25));
		JL_Password.setBounds(562, 344, 145, 76);
		contentPane.add(JL_Password);
		
		userText = new JTextField();
		userText.setFont(new Font("Times New Roman", Font.BOLD, 25));
		userText.setBounds(717, 241, 253, 80);
		contentPane.add(userText);
		userText.setColumns(10);
		
		passText = new JPasswordField();
		passText.setFont(new Font("Times New Roman", Font.BOLD, 25));
		passText.setBounds(716, 342, 253, 80);
		contentPane.add(passText);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 userName = userText.getText();
                 passWord = String.valueOf(passText.getPassword());

                // Kiểm tra đăng nhập bằng cách gọi phương thức từ ConnectMySQL
                if (userName.equals("vohuylong")&& passWord.equals("24ITB104")) {
                    messageLabel.setText("Login successful!");
                    messageLabel.setForeground(new Color(0, 128, 0));//thay đổi màu 
                    
                    
//                    MENU_Test menuInterface = new MENU_Test();
//                    menuInterface.setVisible(true);
//                    dispose();             
                    
                } else {
                    messageLabel.setText("Invalid username or password.");
                    messageLabel.setForeground(Color.RED);
                }
			}
		});
		btnNewButton.setBackground(new Color(125, 190, 255));
		btnNewButton.setIcon(new ImageIcon(Login.class.getResource("/Admin_Long__Image__/Login button.png")));
		btnNewButton.setBounds(691, 464, 304, 112);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/Admin_Long__Image__/My photo.jpg")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(214, 119, 145, 200);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/Admin_Long__Image__/napkin-selection.png")));
		lblNewLabel_1.setBounds(31, 119, 173, 200);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/Admin_Long__Image__/Red backgroun.png")));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(0, 10, 382, 673);
		contentPane.add(lblNewLabel_2);
		
		
		

		JLabel BackGround = new JLabel("");
		BackGround.setIcon(new ImageIcon(Login.class.getResource("/Admin_Long__Image__/CinemaBackgroun.png")));
		BackGround.setHorizontalAlignment(SwingConstants.CENTER);
		BackGround.setBounds(384, 10, 882, 673);
		contentPane.add(BackGround);
		
		
	}
}
