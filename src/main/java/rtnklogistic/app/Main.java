package rtnklogistic.app;


import rtnklogistic.loaders.AppSettingsLoader;
import rtnklogistic.loaders.JsonFilesPathLoader;

import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            AppSettingsLoader settings_loader = new AppSettingsLoader();
            JsonFilesPathLoader json_files_loader = new JsonFilesPathLoader();

            List<File> files_path_list = json_files_loader.getJsonFiles(settings_loader.getOrdersDirectory());

            OrdersListSystem order_list = new OrdersListSystem(files_path_list);

            order_list.map();

        } catch (ConfigurationException e) {
            System.out.println("(Error) invalid [appsettings] file format: " + e.getMessage());
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("(Error) invalid orders folder path: " + e.getMessage());
            e.printStackTrace();
        }
    }
}