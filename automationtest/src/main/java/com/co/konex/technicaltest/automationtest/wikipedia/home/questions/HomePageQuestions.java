package com.co.konex.technicaltest.automationtest.wikipedia.home.questions;

import com.co.konex.technicaltest.automationtest.wikipedia.ui.HomePage;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class HomePageQuestions {

    public static Question<String> homePageTitle(){
        return Text.of(HomePage.TITLE_LABEL);
    }

}