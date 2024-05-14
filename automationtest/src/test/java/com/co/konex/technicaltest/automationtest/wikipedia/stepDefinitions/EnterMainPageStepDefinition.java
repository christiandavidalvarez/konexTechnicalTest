package com.co.konex.technicaltest.automationtest.wikipedia.stepDefinitions;

import com.co.konex.technicaltest.automationtest.common.navigation.NavigateTo;
import com.co.konex.technicaltest.automationtest.wikipedia.home.questions.HomePageQuestions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class EnterMainPageStepDefinition {

    @Given("{actor} is on a browser")
    public void mario_is_on_a_browser(Actor actor) {
    }

    @When("{actor} enter to main page")
    public void mario_enter_to_main_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @Then("{actor} should see the main page")
    public void mario_should_see_the_main_page(Actor actor) {
        actor.attemptsTo(
            Ensure.that(HomePageQuestions.homePageTitle()).containsIgnoringCase( "Bienvenidos a Wikipedia")
        );
    }

}
