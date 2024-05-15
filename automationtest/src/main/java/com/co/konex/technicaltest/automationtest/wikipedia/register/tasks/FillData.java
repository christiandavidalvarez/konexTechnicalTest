package com.co.konex.technicaltest.automationtest.wikipedia.register.tasks;

import com.co.konex.technicaltest.automationtest.wikipedia.ui.RegisterPage;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FillData {

    public static Performable completeAll(String userName, String password, String retypePassword, String email) {
        return Task.where("Fill data",
                Enter.theValue(userName).into(RegisterPage.USERNAME),
                Enter.theValue(password).into(RegisterPage.PASSWORD),
                Enter.theValue(retypePassword).into(RegisterPage.CONFIRM_PASSWORD),
                Enter.theValue(email).into(RegisterPage.EMAIL));
    }

    public static Performable confirmCreateAccount() {
        return Task.where("Confirm create account",
                Click.on(RegisterPage.REGISTER_BUTTON));
    }

}
