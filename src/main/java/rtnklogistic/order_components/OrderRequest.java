package rtnklogistic.order_components;

import java.util.List;

public class OrderRequest {

    private Customer customer;
    private List<Product> products;

    public OrderRequest() {
    }

    public OrderRequest(Customer customer, List<Product> products) {
        this.setCustomer(customer);
        this.setProducts(products);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
