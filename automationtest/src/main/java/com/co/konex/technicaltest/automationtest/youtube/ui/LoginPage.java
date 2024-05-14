package com.co.konex.technicaltest.automationtest.youtube.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target USERNAME_FIELD = Target.the("username field").locatedBy("//input[@id='identifierId']");
    public static final Target PASSWORD_FIELD = Target.the("password field").locatedBy("//input[@name='Passwd']");
    public static final Target LOGIN_LINK = Target.the("login link").locatedBy("//*[@id='buttons']/ytd-button-renderer/yt-button-shape/a");
    public static final Target CONFIRM_USERNAME_BUTTON = Target.the("confirm username button").located(By.id("identifierNext"));
    public static final Target CONFIRM_PASSWORD_BUTTON = Target.the("confirm password button").located(By.id("passwordNext"));
    public static final Target SUCCESSFUL_MESSAGE = Target.the("error message").locatedBy("//div[@id='title-container']/yt-formatted-string[@id='title']");

}
