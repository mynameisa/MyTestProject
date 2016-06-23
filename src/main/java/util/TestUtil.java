package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class TestUtil {
        private static Properties prop = new Properties();
    static {
        InputStream in = Object.class.getResourceAsStream("/conf.properties");
        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getConfig(String key){
        return prop.getProperty(key);
    }
}


