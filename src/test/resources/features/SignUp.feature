Feature: Signup Page Feature

  Scenario: Test Launch Eevee Business Login Form
    Given User is on the launch Eevee business page
    When Test login form
    And  User sees email input field
    And User sees password input field
    Then User click TalkToUs button of login form

  Scenario: Login With Valid Email
    Given User is on the signup page
    When User enter valid email
    And User enter valid password
    And User clicks on the login button
    Then User sees login page message

  Scenario: Login With Invalid Email
    Given User is on the signup page
    When User enter invalid email
    And User enter invalid password
    And  User clicks on the login button
    And User sees the alert message
    Then Verify if the login alert message


# Eevee Mobility Checking Lijst
#1. Open de site https://eeveemobility.com/
#2. Controleer als de knop "Talk to us" aanwezig is
#3. Controleer als de knop "Launch EEVEE business" aanwezig is
#4. Open de pagina Pricing
#5. controleer als de 3 objecten aanwezig zijn Driver, business, energy
#6. open de pagina Talk to us
#7. Zie dat het contactformulier aanwezig is
#8. Druk dan op Launch EEVEE business
#9. zie dat het veld email aanwezig is
#10. zie dat het veld Passwoord aanwezig is