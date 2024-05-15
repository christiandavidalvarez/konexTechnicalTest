package com.co.konex.technicaltest.automationtest.common.data;

import static com.co.konex.technicaltest.automationtest.common.enums.AccountDataEnum.*;

import java.util.HashMap;
import java.util.Map;

import com.github.javafaker.Faker;

public class DataFactory {

    private static Faker faker=Faker.instance();

    public static Map<String,String> accountData() {
        String user=faker.name().username();
        String password=faker.internet().password();
        String email = faker.internet().emailAddress();
        // Create a HashMap to store the information
        Map<String, String> fakeData = new HashMap<>();
        fakeData.put(USER.name(), user);
        fakeData.put(PASSWORD.name(), password);
        fakeData.put(EMAIL.name(), email);
        return fakeData;
    }

}