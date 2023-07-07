Feature: Signup page

Scenario Outline: user is able to register with valid cred
    Given user click on register page
    When user enter <Firstname> and <Lastname>
    When user give <emailid> and <phonenumber>
    When user put <password> and <confirmpassword>
    And user check the privecy policy
    And user click on continue
    Then user registered successfully
 
 Examples:
 |Firstname    |Lastname|emailid       |phonenumber    |password  |confirmpassword|
 |Subhransu    |Sahoo   |abc@gmail.com |9787845789     |123456    |123456|