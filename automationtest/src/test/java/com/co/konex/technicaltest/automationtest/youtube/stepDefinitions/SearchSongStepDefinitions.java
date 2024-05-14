package com.co.konex.technicaltest.automationtest.youtube.stepDefinitions;

import com.co.konex.technicaltest.automationtest.common.navigation.NavigateTo;
import com.co.konex.technicaltest.automationtest.youtube.home.tasks.Search;
import com.co.konex.technicaltest.automationtest.youtube.play.questions.PlayPageQuestions;
import com.co.konex.technicaltest.automationtest.youtube.searchResults.tasks.SelectSong;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class SearchSongStepDefinitions {

    String searchedSong;

    @Given("{actor} is on youtube home page")
    public void mario_is_on_youtube_home_page(Actor actor) {
        actor.wasAbleTo(NavigateTo.theYoutubeHomePage());
    }

    @When("{actor} search for song {string}")
    public void he_search_for_song(Actor actor, String song) {
        searchedSong = song;
        actor.attemptsTo(Search.theSong(song),
                SelectSong.firstResult());
    }

    @Then("{actor} should be able to see song")
    public void he_should_be_able_to_see_song(Actor actor) {
        actor.attemptsTo(
                Ensure.that(PlayPageQuestions.songFound()).containsIgnoringCase(searchedSong));
    }
}
