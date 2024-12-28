package cinema;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Body_Cinema_SELL extends JPanel implements Method_For_Button {
    private static final long serialVersionUID = 1L;
    private JTextArea receiptArea;
    private JTextField totalField;
    private JCheckBox chkAdultTicket, chkChildTicket, chkPopcorn, chkDrink;
    private JSpinner spnAdultTicket, spnChildTicket, spnPopcorn, spnDrink;

    @Override
    public void calculateTotal(ActionEvent e) {}

    @Override
    public void resetFields() {}

    @Override
    public void saveReceipt(ActionEvent e) {}

    public Body_Cinema_SELL() {
        setLayout(new BorderLayout());

        // Panel chứa hóa đơn và tổng tiền
        JPanel receiptPanel = new JPanel();
        receiptPanel.setPreferredSize(new Dimension(450, 600));
        receiptPanel.setBorder(new LineBorder(Color.BLACK));
        receiptPanel.setLayout(null);

        receiptArea = new JTextArea("      *****************************************************************************\n"
            + "      ************************ CINEMA RECEIPT ********************************\n"
            + "      *****************************************************************************\n");
        receiptArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(receiptArea);
        scrollPane.setBounds(10, 10, 430, 450);
        receiptPanel.add(scrollPane);

        JLabel lblTotal = new JLabel("TOTAL :");
        lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
        lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblTotal.setBounds(10, 470, 80, 30);
        receiptPanel.add(lblTotal);

        totalField = new JTextField("0 VND");
        totalField.setFont(new Font("Segoe UI", Font.BOLD, 16));
        totalField.setBounds(100, 470, 300, 30);
        totalField.setEditable(false);
        receiptPanel.add(totalField);

        add(receiptPanel, BorderLayout.WEST);

        // Panel chứa các sản phẩm
        JPanel productContainer = new JPanel();
        productContainer.setLayout(new BoxLayout(productContainer, BoxLayout.Y_AXIS));
        productContainer.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Thêm các sản phẩm vào container
        addProduct(productContainer, "adult ticket (Vé người lớn)", "100,000 VND", true, 10);
        addProduct(productContainer, "child ticket (Vé trẻ em)", "65,000 VND", true, 10);
        addProduct(productContainer, "Popcorn (Bắp rang)", "40,000 VND", true, 10);
        addProduct(productContainer, "drink (Nước uống)", "25,000 VND", true, 10);

        // Thêm container vào JScrollPane
        JScrollPane productScrollPane = new JScrollPane(productContainer);
        productScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        productScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        add(productScrollPane, BorderLayout.CENTER);

        // Thêm các nút chức năng
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));

        JButton btnCalculate = createButton("Calculate", Color.GREEN, e -> {
            CinemaMethods.calculateTotal(receiptArea, totalField, chkAdultTicket, spnAdultTicket,
                    chkChildTicket, spnChildTicket, chkPopcorn, spnPopcorn, chkDrink, spnDrink);
        });

        JButton btnReset = createButton("RESET", Color.YELLOW, e -> {
            CinemaMethods.resetFields(receiptArea, totalField, chkAdultTicket, chkChildTicket,
                    chkPopcorn, chkDrink, spnAdultTicket, spnChildTicket, spnPopcorn, spnDrink);
        });

        JButton btnSave = createButton("PRINT RECEIPT", Color.CYAN, e -> {
            CinemaMethods.saveReceipt(receiptArea, Body_Cinema_SELL.this);
        });

        buttonPanel.add(btnCalculate);
        buttonPanel.add(btnReset);
        buttonPanel.add(btnSave);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addProduct(JPanel panel, String name, String price, boolean isSelectable, int maxQty) {
        JPanel product = new JPanel();
        product.setLayout(null);
        product.setBorder(new LineBorder(Color.GRAY));
        product.setPreferredSize(new Dimension(400, 100));

        JLabel lblName = new JLabel(name);
        lblName.setBounds(10, 10, 200, 20);
        product.add(lblName);

        JLabel lblPrice = new JLabel("Price: " + price);
        lblPrice.setBounds(10, 40, 200, 20);
        product.add(lblPrice);

        JCheckBox checkBox = new JCheckBox("Select");
        checkBox.setBounds(10, 70, 80, 20);
        product.add(checkBox);

        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, maxQty, 1));
        spinner.setBounds(95, 71, 50, 20);
        product.add(spinner);

        if (name.contains("người lớn")) {
            chkAdultTicket = checkBox;
            spnAdultTicket = spinner;
        } else if (name.contains("trẻ em")) {
            chkChildTicket = checkBox;
            spnChildTicket = spinner;
        } else if (name.contains("Bắp")) {
            chkPopcorn = checkBox;
            spnPopcorn = spinner;
        } else if (name.contains("Nước")) {
            chkDrink = checkBox;
            spnDrink = spinner;
        }

        panel.add(product);
    }

    private JButton createButton(String text, Color color, ActionListener actionListener) {
        JButton button = new JButton(text);
        button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        button.setBackground(color);
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addActionListener(actionListener);
        return button;
    }
}
// Dự án quản lý rạp phim
