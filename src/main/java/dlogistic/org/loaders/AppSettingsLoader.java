package dlogistic.org.loaders;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class AppSettingsLoader {

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
