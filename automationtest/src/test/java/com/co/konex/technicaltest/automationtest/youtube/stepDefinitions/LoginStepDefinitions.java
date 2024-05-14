package com.co.konex.technicaltest.automationtest.youtube.stepDefinitions;

import com.co.konex.technicaltest.automationtest.common.navigation.NavigateTo;
import com.co.konex.technicaltest.automationtest.common.utils.Credentials;
import com.co.konex.technicaltest.automationtest.youtube.login.questions.LoginPageQuestion;
import com.co.konex.technicaltest.automationtest.youtube.login.tasks.Login;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoginStepDefinitions {

    @Given("{actor} is on the login page")
    public void mario_is_on_the_login_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theYoutubeHomePage());
    }

    @When("{actor} enters his username and password")
    public void he_enters_his_username_and_password(Actor actor) {
        actor.attemptsTo(
                Login.withCorrectCredentials(Credentials.getUsernameYoutube(), Credentials.getPasswordYoutube()));
    }

    @Then("{actor} should be logged in")
    public void he_should_be_logged_in(Actor actor) {
        actor.attemptsTo(
            Ensure.that(LoginPageQuestion.successfulMessage()).containsIgnoringCase("Try searching to get started")
        );
    }

}
