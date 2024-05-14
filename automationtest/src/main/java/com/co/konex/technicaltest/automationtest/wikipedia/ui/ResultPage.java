package com.co.konex.technicaltest.automationtest.wikipedia.ui;

import net.serenitybdd.screenplay.targets.Target;

public class ResultPage {

public static Target SEARCH_TITLE= Target.the("Search title").locatedBy("//*[@id='firstHeading']/span");
public static Target SEARCH_RESULT_CEEM= Target.the("Search result").locatedBy("//*[@id='An\u00e1lisis_CEEM']");
    
}
