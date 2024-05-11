Feature: Search a word in wikipedia
    As Mario
    Mario want a word in wikipedia
    So he can search a word in wikipedia

    Scenario: Search a word in wikipedia
        Given Mario is on the wikipedia home page
        When he search the word "Mario"
        Then he should see the word