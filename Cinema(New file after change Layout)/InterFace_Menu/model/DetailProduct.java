package model;

public class DetailProduct {
    private String productID;
    private int quantity;
    private int price;

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
        if (productID == null || productID.isEmpty()) {
            throw new IllegalArgumentException("Product ID cannot be null or empty.");
        }
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity must be a positive integer.");
        }
        this.quantity = quantity;
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
