 Feature: Validate login functionality

  Scenario: Verify user is able to login to sauce labs with correct credentials
  Given User enters the URL 
  Then User lands on login page of saucelabs
  When User Enters username "standard_user"
  And User Enters password "secret_sauce"
  And User clicks on Login button
  Then User should land on home page of saucelabs 
   
    
  