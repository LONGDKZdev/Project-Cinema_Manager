
package model;


public class DetailProduct {
   
    private String productID ;
    private int quantity;
    private int price ;
    
    public DetailProduct() {
    }

    public DetailProduct(String productID, int quantity, int price) {
        this.productID = productID;
        this.quantity = quantity;
        this.price = price;
    }


    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
