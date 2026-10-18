package dlogistic.order_components;

public class Product {

    private double quantity;
    private String unit;
    private String productCode;

    public Product() {
    }

    public Product(String product_code, double quantity, String unit) {
        this.setProductCode(product_code);
        this.setQuantity(quantity);
        this.setUnit(unit);
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getUnit() { return this.unit; }

    public void setUnit(String Unit) {
        this.unit = Unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
