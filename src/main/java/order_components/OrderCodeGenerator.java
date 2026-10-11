package order_components;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class OrderCodeGenerator {
    public static String generate(OrderRequest order) {

        StringBuilder data = new StringBuilder();

        data.append(order.getCustomer().getFirstName());
        data.append(order.getCustomer().getLastName());
        data.append(order.getCustomer().getEmail());
        data.append(order.getCustomer().getPhoneNumber());

        for (Product product : order.getProducts()) {
            data.append(product.getProductCode());
            data.append(product.getQuantity());
        }

        try {

            MessageDigest md =
                    MessageDigest.getInstance("SHA-256");

            byte[] hash =
                    md.digest(data.toString()
                            .getBytes(StandardCharsets.UTF_8));

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < 8; i++) {
                result.append(
                        String.format("%02x", hash[i]));
            }

            return result.toString().toUpperCase();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
