package util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class EnvPropReader {

    private static final Properties prop = new Properties();

    static {
        try (InputStream input =
                     EnvPropReader.class.getClassLoader()
                             .getResourceAsStream("environment.properties")) {
            prop.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load test data");
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }
}
