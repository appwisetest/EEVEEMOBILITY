Feature: Home Page Test

  Scenario: Test Home Page URL
    Given User is on the home page
    When get home page url
    Then verify if url is expected

  Scenario: Test Home Page Title
    Given User is on the home page
    When get home page title
    Then verify if title is expected

  Scenario: Test Pricing Page Button
    Given User is on the home page
    When Test pricing page button
    Then User sees pricing page

  Scenario: Test TalkToUs Page Button
    Given User is on the home page
    When Test talk to us page button
    Then User sees talk to us page

  Scenario: Test Eevee Launch Business Page Button
    Given User is on the home page
    When Test Eevee launch business page button
    Then User sees Eevee launch business page

# Eevee Mobility Checking Lijst for testing
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

