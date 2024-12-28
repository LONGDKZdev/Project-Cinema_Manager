// Class xử lý logic tính toán
package cinema;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CinemaLogic {

    public static int calculateTotal(boolean isAdultSelected, int adultQty,
    		boolean isChildSelected, int childQty,
    		boolean isPopcornSelected, int popcornQty,
    		boolean isDrinkSelected, int drinkQty,
    		StringBuilder receipt) {
        int totalPrice = 0;
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd-MM-yyyy, HH:mm:ss");
        SimpleDateFormat sdf_Time = new SimpleDateFormat("HH:mm:ss");

        receipt.append("      *****************************************************************************\n"
                + "      ************************ CINEMA RECEIPT ********************************\n"
                + "      *****************************************************************************\n");
        receipt.append("Date: " + sdf.format(new Date()) + "\n");
        receipt.append("Date: " + sdf_Time.format(new Date()) + "\n");
        
        receipt.append("purchase invoice(Hóa đơn mua):\n");

        if (isAdultSelected) {
            totalPrice += adultQty * 100000;
            receipt.append("adult ticket (Vé người lớn) x" + adultQty + " = " + (adultQty * 100000) + " VND\n");
        }

        
        
        if (isChildSelected) {
            totalPrice += childQty * 65000;
            receipt.append("child ticket (Vé trẻ em) x" + childQty + " = " + (childQty * 65000) + " VND\n");
        }

        if (isPopcornSelected) {
            totalPrice += popcornQty * 40000;
            receipt.append("Popcorn (Bắp rang) x" + popcornQty + " = " + (popcornQty * 40000) + " VND\n");
        }

        if (isDrinkSelected) {
            totalPrice += drinkQty * 25000;
            receipt.append("drink (Nước uống) x" + drinkQty + " = " + (drinkQty * 25000) + " VND\n");
        }

        return totalPrice ;
    }
}
