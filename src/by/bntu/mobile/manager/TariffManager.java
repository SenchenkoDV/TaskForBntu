package by.bntu.mobile.manager;

import java.util.ResourceBundle;

public class TariffManager {
    private static final String TARIFFS_PROPERTY = "property.tariffs";
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle(TARIFFS_PROPERTY);

    public static String getProperty(String key) {
        String resource;
        resource = resourceBundle.getString(key);
        return resource;
    }
}
