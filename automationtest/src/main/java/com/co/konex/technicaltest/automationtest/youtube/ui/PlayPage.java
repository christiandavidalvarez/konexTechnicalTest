package com.co.konex.technicaltest.automationtest.youtube.ui;

import net.serenitybdd.screenplay.targets.Target;

public class PlayPage {

    public static final Target SONG_TITLE_LABEL = Target.the("Song title label")
            .locatedBy("//*[@id='title']/h1/yt-formatted-string");

}
