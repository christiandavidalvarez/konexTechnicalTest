package com.co.konex.technicaltest.automationtest.wikipedia.navigate;

import com.co.konex.technicaltest.automationtest.wikipedia.ui.HomePage;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class NavigateWikipediaTo {
    
    public static Performable registerWikipediaFromHomePage(){
        return Task.where("{0} go to register of wikipedia",
                Click.on(HomePage.REGISTER_LINK));   
    }
}
