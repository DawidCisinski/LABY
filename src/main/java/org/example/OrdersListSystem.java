package org.example;

import order_components.OrderCodeGenerator;
import order_components.OrderRequest;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;

public class OrdersListSystem {

    private List<File> files_path_list;

    public OrdersListSystem(List<File> files_path_list) {
        this.setFilesPathList(files_path_list);
    }

    public void setFilesPathList(List<File> files_path_list) {
        this.files_path_list = files_path_list;
    }

    public List<File> getFilesPathList() {
        return this.files_path_list;
    }

    public void map() {

        ObjectMapper mapper = new ObjectMapper();

        for (File file : getFilesPathList()) {

            OrderRequest order =
                    mapper.readValue(file, OrderRequest.class);

            System.out.println(order.getCustomer().getFirstName());
            String orderNumber = OrderCodeGenerator.generate(order);

            System.out.println("Order number: " + orderNumber);


        }
    }
}

