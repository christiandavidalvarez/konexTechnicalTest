package com.co.konex.technicaltest.automationtest.common.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable theYoutubeHomePage() {
        return Task.where("{0} opens the home page Youtube",
                Open.browserOn().the(YoutubeHomePage.class));
    }

    public static Performable theWikipediaHomePage() {
        return Task.where("{0} opens the home page Wikipedia",
                Open.browserOn().the(WikipediaHomePage.class));
    }

}
