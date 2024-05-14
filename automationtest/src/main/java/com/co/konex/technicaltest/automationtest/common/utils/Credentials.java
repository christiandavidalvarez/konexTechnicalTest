package com.co.konex.technicaltest.automationtest.common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Credentials {
    private static final Properties properties = new Properties();

    static {
        try (InputStream input = Credentials.class.getClassLoader().getResourceAsStream("credentials.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find credentials.properties");
            }
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getUsernameYoutube() {
        return properties.getProperty("usernameYoutube");
    }

    public static String getPasswordYoutube() {
        return properties.getProperty("passwordYoutube");
    }
}
