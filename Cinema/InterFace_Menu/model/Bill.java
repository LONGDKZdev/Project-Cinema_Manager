
package model;


public class Bill {
    private int billID ;
    private String dateOrder;
    private int price;
    
    public Bill() {
    }

    public Bill(int billID, String dateOrder, int price) {
        this.billID = billID;
        this.dateOrder = dateOrder;
        this.price = price;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        this.dateOrder = dateOrder;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
