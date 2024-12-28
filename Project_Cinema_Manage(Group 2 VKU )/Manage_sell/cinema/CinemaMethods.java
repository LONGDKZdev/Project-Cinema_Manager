package cinema;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class CinemaMethods {

    // Phương thức tính tổng
    public static void calculateTotal(JTextArea receiptArea, JTextField totalField, JCheckBox chkAdultTicket, JSpinner spnAdultTicket,
                                      JCheckBox chkChildTicket, JSpinner spnChildTicket, JCheckBox chkPopcorn, JSpinner spnPopcorn,
                                      JCheckBox chkDrink, JSpinner spnDrink) {
        StringBuilder receipt = new StringBuilder();
        int total = CinemaLogic.calculateTotal(
                chkAdultTicket.isSelected(), (int) spnAdultTicket.getValue(),
                chkChildTicket.isSelected(), (int) spnChildTicket.getValue(),
                chkPopcorn.isSelected(), (int) spnPopcorn.getValue(),
                chkDrink.isSelected(), (int) spnDrink.getValue(),
                receipt
        );
        
        receiptArea.setText(receipt.toString());
        totalField.setText(total > 0 ? total + " VND" : "0 VND");  // Hiển thị 0 nếu không có sản phẩm
    }

    // Phương thức reset các trường
    public static void resetFields(JTextArea receiptArea, JTextField totalField, JCheckBox chkAdultTicket, JCheckBox chkChildTicket,
                                   JCheckBox chkPopcorn, JCheckBox chkDrink, JSpinner spnAdultTicket, JSpinner spnChildTicket,
                                   JSpinner spnPopcorn, JSpinner spnDrink) {
        // Reset hóa đơn
        receiptArea.setText("      *****************************************************************************\n"
                + "      ************************ CINEMA RECEIPT ********************************\n"
                + "      *****************************************************************************\n");
        totalField.setText("0 VND");

        // Deselect các checkbox
        chkAdultTicket.setSelected(false);
        chkChildTicket.setSelected(false);
        chkPopcorn.setSelected(false);
        chkDrink.setSelected(false);

        // Đặt giá trị các Spinner về 0
        spnAdultTicket.setValue(0);
        spnChildTicket.setValue(0);
        spnPopcorn.setValue(0);
        spnDrink.setValue(0);
    }

    // Phương thức lưu hóa đơn
    public static void saveReceipt(JTextArea receiptArea, Component parentComponent) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Lưu hóa đơn");
        
        // Thiết lập các bộ lọc để chọn định dạng file (txt)
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Text Files", "txt"));

        int userSelection = fileChooser.showSaveDialog(parentComponent);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Lấy tên file và kiểm tra nếu không có phần mở rộng
            String filePath = fileChooser.getSelectedFile().getPath();
            if (!filePath.endsWith(".txt")) {
                filePath += ".txt"; // Thêm phần mở rộng nếu người dùng không nhập
            }

            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(receiptArea.getText());
                JOptionPane.showMessageDialog(parentComponent, "Hóa đơn đã được lưu!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(parentComponent, "Lỗi khi lưu hóa đơn!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
