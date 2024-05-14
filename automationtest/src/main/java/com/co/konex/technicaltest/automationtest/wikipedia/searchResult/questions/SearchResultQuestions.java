package com.co.konex.technicaltest.automationtest.wikipedia.searchResult.questions;

import com.co.konex.technicaltest.automationtest.wikipedia.ui.ResultPage;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class SearchResultQuestions {

    public static Question<String> resultTitle() {
        return Text.of(ResultPage.SEARCH_TITLE);
    }

    public static Question<String> resultCEEM() {
        return Text.of(ResultPage.SEARCH_RESULT_CEEM);
    }

}
