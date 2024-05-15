package com.co.konex.technicaltest.automationtest.wikipedia.register.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ValidationMessageIsVisible implements Question<Boolean> {

    private static final By CAPTCHA_INPUT_SELECTOR = By.id("mw-input-captchaWord");

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElement captchaInput = BrowseTheWeb.as(actor).getDriver().findElement(CAPTCHA_INPUT_SELECTOR);
        String validationMessage = captchaInput.getAttribute("required");
        return validationMessage != null;
    }

    public static ValidationMessageIsVisible forCaptcha() {
        return new ValidationMessageIsVisible();
    }
}
