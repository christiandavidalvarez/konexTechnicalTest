package com.co.konex.technicaltest.automationtest.wikipedia.searchResult.tasks;

import com.co.konex.technicaltest.automationtest.wikipedia.ui.ResultPage;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;

public class ScrollResult {

    public static Performable toCeemContent() {
        return Task.where("{0} scroll to ceem content",
                Scroll.to(ResultPage.SEARCH_RESULT_CEEM));
    }

}
