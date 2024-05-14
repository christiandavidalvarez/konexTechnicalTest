package com.co.konex.technicaltest.automationtest.youtube.login.questions;

import com.co.konex.technicaltest.automationtest.youtube.ui.LoginPage;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginPageQuestion {
    
    public static Question<String> successfulMessage(){
        return Text.of(LoginPage.SUCCESSFUL_MESSAGE);
    }
    
}
