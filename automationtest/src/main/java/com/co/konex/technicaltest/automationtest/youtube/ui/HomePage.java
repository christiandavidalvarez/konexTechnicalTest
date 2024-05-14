package com.co.konex.technicaltest.automationtest.youtube.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target SEARCH_BUTTON = Target.the("search button").located(By.id("search-icon-legacy"));
    public static final Target SEARCH_FIELD = Target.the("search input").located(By.name("search_query"));
    
    
}
