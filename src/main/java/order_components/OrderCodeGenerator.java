package order_components;

import java.util.List;
import java.util.ArrayList;

public class OrderCodeGenerator {

    public static String generate(OrderRequest order) {

        List<String> list_data = new ArrayList<>();;

        list_data.add(order.getCustomer().getFirstName());
        list_data.add(order.getCustomer().getLastName());
        list_data.add(order.getCustomer().getEmail());
        list_data.add(order.getCustomer().getPhoneNumber());

        for (Product product : order.getProducts()) {
            list_data.add(product.getProductCode());
            list_data.add(Integer.toString(product.getQuantity()));
        }
        String string_data = String.join("", list_data);

        int hash_data = Math.abs(string_data.hashCode());

        string_data = Integer.toString(hash_data);

        while (string_data.length() < 12) {
            string_data = "0" + string_data;
        }

        return string_data.toUpperCase().substring(0, 12);
    }
}

