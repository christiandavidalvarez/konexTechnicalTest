package com.co.konex.technicaltest.automationtest.wikipedia.stepDefinitions;

import static com.co.konex.technicaltest.automationtest.common.enums.AccountDataEnum.EMAIL;
import static com.co.konex.technicaltest.automationtest.common.enums.AccountDataEnum.PASSWORD;
import static com.co.konex.technicaltest.automationtest.common.enums.AccountDataEnum.USER;
import java.util.Map;
import com.co.konex.technicaltest.automationtest.common.data.DataFactory;
import com.co.konex.technicaltest.automationtest.common.navigation.NavigateTo;
import com.co.konex.technicaltest.automationtest.wikipedia.navigate.NavigateWikipediaTo;
import com.co.konex.technicaltest.automationtest.wikipedia.register.questions.ValidationMessageIsVisible;
import com.co.konex.technicaltest.automationtest.wikipedia.register.tasks.FillData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ValidateCaptchaStepDefinition {

    @Given("{actor} is in the register form")
    public void mario_is_in_the_register_form(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.theWikipediaHomePage(),
                NavigateWikipediaTo.registerWikipediaFromHomePage());
    }

    @When("{actor} fill the register form")
    public void he_fill_the_register_form(Actor actor) {
        Map<String, String> accountData = DataFactory.accountData();
        String userName = accountData.get(USER.name());
        String email = accountData.get(EMAIL.name());
        String password = accountData.get(PASSWORD.name());
        String retypePassword = accountData.get(PASSWORD.name());
        actor.attemptsTo(
                FillData.completeAll(userName, password, retypePassword, email));
    }

    @When("{actor} click on the register button")
    public void he_click_on_the_register_button(Actor actor) {
        actor.attemptsTo(
                FillData.confirmCreateAccount()
        );
    }

    @Then("{actor} should see the captcha validator")
    public void he_should_see_the_captcha_validator(Actor actor) {
        actor.attemptsTo(
            Ensure.that(ValidationMessageIsVisible.forCaptcha()).isTrue()
        );
    }

}
