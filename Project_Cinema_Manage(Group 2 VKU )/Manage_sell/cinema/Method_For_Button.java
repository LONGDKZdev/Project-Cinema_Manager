package cinema;

import java.awt.event.ActionEvent;

public interface Method_For_Button {
	 // Trung gian để gọi các phương thức từ class CinemaMethod
     void calculateTotal(ActionEvent e);
     void resetFields();
     void saveReceipt(ActionEvent e);
}
