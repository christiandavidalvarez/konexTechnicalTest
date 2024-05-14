package com.co.konex.technicaltest.automationtest.youtube.home.tasks;

import com.co.konex.technicaltest.automationtest.youtube.ui.HomePage;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search {

    public static Performable theSong(String song) {
        return Task.where("{0} search the song: #song",
                Enter.theValue(song).into(HomePage.SEARCH_FIELD),
                Click.on(HomePage.SEARCH_BUTTON));
    }

}
