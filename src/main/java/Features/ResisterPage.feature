Feature: Resister Page

Scenario: user is able to register with cred
    Given user go to register page
    When user enters the following user details
    |Firstname    |Lastname|emailid       |phonenumber    |password  |confirmpassword|
    |Subhransu    |Sahoo   |aobsdpjfbc@gmail.com |9759845787     |123456    |123456|
    Then user click the privecy policy
    Then user press on continue button
    #Then user registered successfully
 
 