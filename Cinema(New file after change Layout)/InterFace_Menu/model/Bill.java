package model;

public class Bill {
    private int billID;
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
        if (billID < 0) {
            throw new IllegalArgumentException("Bill ID must be a positive integer.");
        }
        this.billID = billID;
    }

    public String getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(String dateOrder) {
        if (dateOrder == null || dateOrder.isEmpty()) {
            throw new IllegalArgumentException("Date Order cannot be null or empty.");
        }
        this.dateOrder = dateOrder;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price must be a positive integer.");
        }
        this.price = price;
    }
}
