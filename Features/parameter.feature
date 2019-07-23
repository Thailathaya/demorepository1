Feature: Login Action
 

  
  Scenario Outline: successful login with valid credentials
    Given user open the application
    When user click on signin button
    And user enters "<username>" and "<password>"
    Then message displayed as login successful
  

 
    Examples: 
      |username|password| 
      |lalitha|password123| 
      |admin|pasword456| 
