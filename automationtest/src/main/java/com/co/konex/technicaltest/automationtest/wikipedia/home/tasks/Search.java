package com.co.konex.technicaltest.automationtest.wikipedia.home.tasks;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import com.co.konex.technicaltest.automationtest.wikipedia.ui.HomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Search {

    public static Performable theWord(String word) {
        return Task. where("search the word",
            Click.on(HomePage.SEARCH_ICON_BUTTON),
            WaitUntil.the(HomePage.SEARCH_INPUT, isVisible()).forNoMoreThan(10).seconds(),
            Enter.theValue(word).into(HomePage.SEARCH_INPUT),
            Click.on(HomePage.SEARCH_BUTTON)
        );
    }

}