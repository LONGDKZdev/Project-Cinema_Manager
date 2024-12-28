package cinema;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main_RunPrograming extends JFrame{
	public Main_RunPrograming() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main_RunPrograming.class.getResource("/Image_icon/icons8-$.gif")));
	}
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Tạo JFrame chính
            JFrame mainFrame = new JFrame("Cinema Ticket Sell");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setSize(200, 140); // Kích thước bắt đầu cho hoạt ảnh
            
            //thiết lập ở trung tâm màng hình
            //mainFrame.setLocationRelativeTo(null);
            
            mainFrame.setLocation(200, 200);
            mainFrame.setUndecorated(true); // Bỏ khung mặc định
            mainFrame.getContentPane().setLayout(new BorderLayout());

            // Thiết lập hoạt ảnh mở cửa sổ
            mainFrame.addWindowListener(new WindowAdapter() {
                public void windowOpened(WindowEvent e) {
                    new Thread(() -> {
                        int targetWidth = 1200, targetHeight = 750; // Kích thước mục tiêu
                        int width = mainFrame.getWidth(), height = mainFrame.getHeight();

                        while (width < targetWidth || height < targetHeight) {
                            width = Math.min(width + 50, targetWidth);
                            height = Math.min(height + 35, targetHeight);
                            int finalWidth = width, finalHeight = height;

                            SwingUtilities.invokeLater(() -> mainFrame.setSize(finalWidth, finalHeight));
                            try {
                                Thread.sleep(40);
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }).start();
                }
            });

            // Panel tiêu đề (title bar)
            JPanel titleBar = new JPanel();
            titleBar.setBackground(Color.DARK_GRAY);
            titleBar.setPreferredSize(new Dimension(mainFrame.getWidth(), 40));
            titleBar.setLayout(new FlowLayout(FlowLayout.RIGHT));

            // Nút Close
            JButton btnClose = new JButton("X");
            btnClose.setFont(new Font("Tahoma", Font.PLAIN, 20));
            btnClose.setFocusable(false);
            btnClose.setBackground(Color.RED);
            btnClose.setForeground(Color.WHITE);
            btnClose.setBorder(null);
            btnClose.setFocusPainted(false);
            btnClose.setPreferredSize(new Dimension(50, 30));
            btnClose.addActionListener(e -> System.exit(0));

            // Nút Minimize
            JButton btnMinimize = new JButton("-");
            btnMinimize.setFont(new Font("Tahoma", Font.PLAIN, 20));
            btnMinimize.setFocusable(false);
            btnMinimize.setBackground(Color.GRAY);
            btnMinimize.setForeground(Color.WHITE);
            btnMinimize.setBorder(null);
            btnMinimize.setFocusPainted(false);
            btnMinimize.setPreferredSize(new Dimension(50, 30));
            btnMinimize.addActionListener(e -> mainFrame.setState(Frame.ICONIFIED));

            // Nút Maximize
            JButton btnMaximum = new JButton("");
            btnMaximum.setIcon(new ImageIcon(Main_RunPrograming.class.getResource("/Image_icon/icons8-rounded-square-48.png")));
            btnMaximum.setPreferredSize(new Dimension(50, 30));
            btnMaximum.setForeground(Color.WHITE);
            btnMaximum.setFocusable(false);
            btnMaximum.setFocusPainted(false);
            btnMaximum.setBorder(null);
            btnMaximum.setBackground(Color.GRAY);
            btnMaximum.addActionListener(e -> {
                int state = mainFrame.getExtendedState();
                if ((state & JFrame.MAXIMIZED_BOTH) == JFrame.MAXIMIZED_BOTH) {
                    mainFrame.setExtendedState(JFrame.NORMAL);
                } else {
                    mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
            });

            titleBar.add(btnMinimize);
            titleBar.add(btnMaximum);
            titleBar.add(btnClose);
            mainFrame.getContentPane().add(titleBar, BorderLayout.NORTH);

            // Thêm tính năng kéo cửa sổ
            addDragFunctionality(titleBar, mainFrame);

            // Thêm giao diện chính vào JFrame
            mainFrame.getContentPane().add(new Body_Cinema_SELL());
            mainFrame.setVisible(true);
        });
    }
    //thiết lập khả năng kéo thả cho chương trình
    private static void addDragFunctionality(JPanel titleBar, JFrame frame) {
        final Point[] mouseClickPoint = {null};

        titleBar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseClickPoint[0] = e.getPoint();
            }
        });

        titleBar.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Point currentScreenLocation = e.getLocationOnScreen();
                frame.setLocation(
                    currentScreenLocation.x - mouseClickPoint[0].x,
                    currentScreenLocation.y - mouseClickPoint[0].y
                );
            }
        });
    }
}
