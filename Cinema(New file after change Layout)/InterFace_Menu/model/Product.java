package model;

public class Product {
    private String productID, nameProduct, type;
    private int quantity, price;

    public Product() {
    }

    public Product(String productID, String nameProduct, String type, int quantity, int price) {
        this.productID = productID;
        this.nameProduct = nameProduct;
        this.type = type;
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

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        if (nameProduct == null || nameProduct.isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty.");
        }
        this.nameProduct = nameProduct;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
