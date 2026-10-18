package rtnklogistic.order_components;

public class Product {

    private String productCode;
    private int quantity;

    public Product() {
    }

    public Product(String product_code, int quantity) {
        this.setProductCode(product_code);
        this.setQuantity(quantity);
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
