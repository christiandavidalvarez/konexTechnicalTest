Feature: validate captcha in register form
    As Mario
    Mario Mario wants to register in the website
    So that he see the captcha validator

    Scenario: Validate captcha in register form
        Given Mario is in the register form
        When he fill the register form
        And he click on the register button
        Then he should see the captcha validator