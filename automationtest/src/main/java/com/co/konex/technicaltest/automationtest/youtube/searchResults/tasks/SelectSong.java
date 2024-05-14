package com.co.konex.technicaltest.automationtest.youtube.searchResults.tasks;

import com.co.konex.technicaltest.automationtest.youtube.ui.PlayPage;
import com.co.konex.technicaltest.automationtest.youtube.ui.SongsResult;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class SelectSong {

    public static Performable firstResult() {
        return Task.where("Select the first result",
                Click.on(SongsResult.SONG_RESULT_FIRST),
                WaitUntil.the(PlayPage.SONG_TITLE_LABEL, isVisible()).forNoMoreThan(10).seconds()
            );
    }

}
