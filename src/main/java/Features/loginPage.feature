Feature: login Page

Scenario: user is able to login with cred

    Given Enter url of the website 'https://valorcommunities.stg.lotvue.com/'
    Then I should see 'Customer Login' page with all the details
    When I click on the Login button without entering the login credentials
    Then I should see user validation text messages
    When I enter the uname 'gousebashas@lotvue.com' and password '1'
    Then based on the entered login details it should show Error Message or Username
    When I click on the product type dropdown list
    Then Select the Marketing product type from the list
    Then Click on the '<Community>' specific Sales Statuses drop-downs, and from the statuses drop-down list, click on the '<Status>' checkbox
    And Save the details
    When I click on the communities dropdown list
    Then I should be able to see the list of communities
    When Select '<Community>' community from the list
    Then Verify the map loading, lot hover popup and legend type filter options in the below-mentioned views
      | Views       |
      | SALESSTATUS |
    When I clicks on website preview link
    Then It should redirects to website preview page and I should able to see the community map
     When I click on the Inventory Lots tab, the Inventory Lots legend should get opened
    Then Compare the Statuses of the lots in the inventory legend with the actual status '<Status>'

    Examples: 

      | ProductType | Community    | Status     |AccordionType             |
      | Marketing   | Bridgemill | Sold       |Lots to show in Inventory Lots|









