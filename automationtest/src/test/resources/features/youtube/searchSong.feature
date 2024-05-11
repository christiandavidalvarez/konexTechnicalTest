Feature: Search song in youtube
    As Mario
    Mario want search a song in youtube

    Scenario: Search song in youtube
        Given Mario is on youtube home page
        When he search for song
        Then he should be able to see song