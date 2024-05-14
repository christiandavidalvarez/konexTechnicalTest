package com.co.konex.technicaltest.automationtest.wikipedia.stepDefinitions;

import com.co.konex.technicaltest.automationtest.common.navigation.NavigateTo;
import com.co.konex.technicaltest.automationtest.wikipedia.home.tasks.Search;
import com.co.konex.technicaltest.automationtest.wikipedia.searchResult.questions.SearchResultQuestions;
import com.co.konex.technicaltest.automationtest.wikipedia.searchResult.tasks.ScrollResult;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class SearchWordStepDefinition {

    @Given("{actor} is on the wikipedia home page")
    public void mario_is_on_the_wikipedia_home_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theWikipediaHomePage());
    }

    @When("{actor} search the word {string}")
    public void he_search_the_word(Actor actor,String word) {
        actor.attemptsTo(
            Search.theWord(word)
        );
    }

    @Then("{actor} should see the word {string} in the results tittle")
    public void he_should_see_the_word(Actor actor, String word) {
        actor.attemptsTo(
            Ensure.that(SearchResultQuestions.resultTitle()).containsIgnoringCase(word)
        );
    }

    @Then("{actor} should see the word {string} in the result body")
    public void he_should_see_the_word_in_result_body(Actor actor, String word) {
        actor.attemptsTo(
            Ensure.that(SearchResultQuestions.resultTitle()).containsIgnoringCase(word),
            ScrollResult.toCeemContent()
        );
    }

}
