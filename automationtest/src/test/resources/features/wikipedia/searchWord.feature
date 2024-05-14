Feature: Search a word in wikipedia
    As Mario
    Mario want a word in wikipedia
    So he can search a word in wikipedia

    Scenario: Search a word in wikipedia
        Given Mario is on the wikipedia home page
        When he search the word "Sistema"
        Then he should see the word "Sistema" in the result tittle
        And he should see the word "Análisis CEEM" in the result body