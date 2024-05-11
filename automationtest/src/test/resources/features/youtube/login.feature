Feature: Login in youtube
    As Mario
    Mario wants to login in youtube

    Scenario: Login in youtube
        Given Mario is on the login page
        When he enters his username and password
        Then he should be logged in