Feature: Registration Feature

Scenario: User register with valid credentials
  Given the signup page is opend
  When user enters anitha as username  
  And  user enters thaila as firstname
  And  user enters thaya as lastname
  And user enters password123 aspassword 
  And  user enters password123 as confirmpassword  
  And  user select female as gender  
  And  user enters thailathaya@gmail.com as email 
   And  user enters 8940107407 as mobilenumber
    And  user select 12/05/1998 as dob  
      And  user enters chennai as address
      And  user enters 8940107407 as mobilenumber
     And  user select What is your Birth Place as SecurityQuestion
     And  user enters tanjore as answer
      And  user clicks on  register
  Then  message will displayes user  registered successfully
  