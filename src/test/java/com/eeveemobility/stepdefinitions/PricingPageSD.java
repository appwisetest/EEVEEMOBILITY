package com.eeveemobility.stepdefinitions;

import com.eeveemobility.base.BasePage;
import com.eeveemobility.pages.HomePage;
import com.eeveemobility.pages.PricingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PricingPageSD {

    //Testing HomePage Launch Eevee Pricing page button / driver / business / energy buttons

    @Given("User will on the home page")
    public void userWillOnTheHomePage() {
        BasePage.initializeDriver();
    }

    @When("User click Eevee pricing page button")
    public void userClickEeveePricingPageButton() throws InterruptedException {
        HomePage.clickPricing();
    }

    @Then("User sees Eevee pricing page")
    public void userSeesEeveePricingPage() {
        String expectedURL = "https://eeveemobility.com/pricing";
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        System.out.println(HomePage.verifyURL());
    }

    @Given("User is on the pricing page")
    public void userIsOnThePricingPage() {
        PricingPage.clickPricingLink();
    }

    @When("Test driver box element")
    public void testDriverBox() {
        Assert.assertTrue(PricingPage.checkDriverBox());
    }

    @Then("User sees driver box element")
    public void userSeesDriverBox() {
        Assert.assertEquals("Super easy and convenient app to track charging.", PricingPage.getDriverBoxFirstFeatureText());
    }

    @When("Test business box element")
    public void testBusinessBox() {
       Assert.assertTrue(PricingPage.checkBusinessBox());
    }

    @Then("User sees business box element")
    public void userSeesBusinessBox() {
        Assert.assertEquals("Easily monitor, reimburse and forecast EV charging at home, work and public.",PricingPage.getBusinessBoxSecondFeatureText());
    }

    @When("Test energy box element")
    public void testEnergyBox() {
        Assert.assertTrue(PricingPage.checkEnergyBox());
    }

    @Then("User sees energy box element")
    public void userSeesEnergyBox() {
        Assert.assertEquals("Generate EV insights.",PricingPage.getEnergyBoxFirstFeatureText());
    }

}
