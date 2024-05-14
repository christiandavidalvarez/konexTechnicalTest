package com.co.konex.technicaltest.automationtest.common.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theYoutubeHomePage() {
        return Task.where("{0} opens the home page Demo Blaze",
                Open.browserOn().the(YoutubeHomePage.class));
    }

}
