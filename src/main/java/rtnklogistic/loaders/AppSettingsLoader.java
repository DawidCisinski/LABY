package rtnklogistic.loaders;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class AppSettingsLoader {

    //final dlatego by po przypisaniu wartości nie dało jej sie zmienić!
    private final String ordersDirectory;

    public AppSettingsLoader() throws ConfigurationException {
        Configurations configs = new Configurations();

        Configuration config =
                configs.properties("appsettings.properties");

        this.ordersDirectory = config.getString("orders.directory");
    }

    public String getOrdersDirectory() {
        return ordersDirectory;
    }
}

/*
    try {
        Configurations configs = new Configurations();
        Configuration config =
                configs.properties("appsettings.properties");

        this.ordersDirectory =
                config.getString("orders.directory");
    } catch (ConfigurationException e) {
        System.out.println("Error: " + e.getMessage());
*/