Feature: TalkToUs Page Test

  Scenario: Test TalkToUs Contact form
    Given User will on the TalkToUs page
    When Test TalkToUs contact form
    And  User sees first name input field
    And User sees last name input field
    And User sees email input field
    And User sees country input field
    Then User clicks send button

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