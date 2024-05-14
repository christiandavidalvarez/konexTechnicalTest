package com.co.konex.technicaltest.automationtest.youtube.play.questions;

import com.co.konex.technicaltest.automationtest.youtube.ui.PlayPage;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class PlayPageQuestions {

    public static Question<String> songFound() {
        return Text.of(PlayPage.SONG_TITLE_LABEL);
    }
    
}
