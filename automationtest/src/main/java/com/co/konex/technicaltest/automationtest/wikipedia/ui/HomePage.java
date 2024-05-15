package com.co.konex.technicaltest.automationtest.wikipedia.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target TITLE_LABEL = Target.the("Title label").locatedBy("//*[@id='Bienvenidos_a_Wikipedia,']");

    public static Target SEARCH_INPUT = Target.the("Search input").located(By.name("search"));

    public static Target SEARCH_ICON_BUTTON = Target.the("search icon button").locatedBy("//*[@id='p-search']/a");

    public static Target SEARCH_BUTTON = Target.the("Search button")
            .locatedBy("//*[@id='searchform']/div/button");

    public static Target REGISTER_LINK = Target.the("Register link").locatedBy("//*[@id='pt-createaccount-2']/a");

}
