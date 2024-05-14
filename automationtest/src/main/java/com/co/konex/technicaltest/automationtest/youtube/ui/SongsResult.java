package com.co.konex.technicaltest.automationtest.youtube.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SongsResult {

    public static final Target SONG_RESULT_FIRST = Target.the("Song result first")
            .locatedBy("//div[@id='contents']/ytd-video-renderer[1]//ytd-thumbnail/a");

}
