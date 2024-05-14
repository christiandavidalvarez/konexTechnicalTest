package com.co.konex.technicaltest.automationtest.youtube.login.tasks;

import com.co.konex.technicaltest.automationtest.youtube.ui.LoginPage;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class Login {

    public static Performable withCorrectCredentials(String usernameYoutube, String passwordYoutube) {
        return Task.where( "Login with correct credentials",
            Click.on(LoginPage.LOGIN_LINK),
            Enter.theValue(usernameYoutube).into(LoginPage.USERNAME_FIELD),
            Click.on(LoginPage.CONFIRM_USERNAME_BUTTON),
            Enter.theValue(passwordYoutube).into(LoginPage.PASSWORD_FIELD),
            Click.on(LoginPage.CONFIRM_PASSWORD_BUTTON),
            WaitUntil.the(LoginPage.SUCCESSFUL_MESSAGE, isVisible()).forNoMoreThan(10).seconds()
        );
    }


    
}
