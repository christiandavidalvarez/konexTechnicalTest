package com.co.konex.technicaltest.automationtest.wikipedia.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {

    public static Target USERNAME = Target.the("username").locatedBy("//input[@id='wpName2']");
    public static Target PASSWORD = Target.the("password").locatedBy("//input[@id='wpPassword2']");
    public static Target CONFIRM_PASSWORD = Target.the("confirm password").locatedBy("//input[@id='wpRetype']");
    public static Target EMAIL = Target.the("email").locatedBy("//input[@id='wpEmail']");
    public static Target REGISTER_BUTTON = Target.the("register button")
            .locatedBy("//button[@id='wpCreateaccount']");

}
