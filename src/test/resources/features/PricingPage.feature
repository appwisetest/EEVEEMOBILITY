Feature: Pricing Page Test

  Scenario: Test Eevee Pricing Button
    Given User will on the home page
    When User click Eevee pricing page button
    Then User sees Eevee pricing page

  Scenario: Test Pricing DriverBox Element
    Given User is on the pricing page
    When Test driver box element
    Then User sees driver box element

  Scenario: Test Pricing BusinessBox Element
    Given User is on the pricing page
    When Test business box element
    Then User sees business box element

  Scenario: Test Pricing EnergyBox Element
    Given User is on the pricing page
    When Test energy box element
    Then User sees energy box element


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
