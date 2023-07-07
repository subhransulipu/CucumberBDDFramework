@tag
Feature: Login page

Scenario Outline: user is able to login with valid cred
    Given user enter with valid username in email field
    And user enter with valid password 
    When user click on login button
    Then user logedin successfully
 
    

    