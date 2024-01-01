 Feature: Validate login functionality

  Scenario: Verify user is able to login to sauce labs with correct credentials
  Given User enters the URL 
  Then User lands on login page of saucelabs
  When User Enters username "standard_user"
  And User Enters password "secret_sauce"
  And User clicks on Login button
  Then User should land on home page of saucelabs 
   
  Scenario: Verify user is not able to login to sauce labs with incorrect username
  Given User enters the URL 
  Then User lands on login page of saucelabs
  When User Enters username "incorrectUn"
  And User Enters password "secret_sauce"
  And User clicks on Login button
  Then Validate correct error message should come for UN
  
  
  Scenario: Verify user is not able to login to sauce labs with incorrect password
  Given User enters the URL 
  Then User lands on login page of saucelabs
  When User Enters username "standard_user"
  And User Enters password "incorrectpw"
  And User clicks on Login button
  Then Validate correct error message should come for PW
  
  
  Scenario: Verify user error message when user clicks on submit without entering un or pw
  Given User enters the URL 
  Then User lands on login page of saucelabs
  And User clicks on Login button
  Then Validate correct error message should come
  When User clicks on close button
  Then error message should disappear

 