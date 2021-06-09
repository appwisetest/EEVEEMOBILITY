package com.eeveemobility.stepdefinitions;

import com.eeveemobility.base.BasePage;
import com.eeveemobility.base.ConfigReader;
import com.eeveemobility.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSD {

    //Testing HomePage Buttons
    @Given("User is on the home page")
    public void userIsOnTheHomePage() {
        BasePage.initializeDriver();
    }

    //get home page url and print
    @When("get home page url")
    public void getHomepageUrl() { System.out.println("Eevee Home Page URL: "  + HomePage.getHomepageURL());
    }

    @Then("verify if url is expected")
    public void verifyIfUrlIsExpected() {
        String expectedURL = ConfigReader.getProperty("url");
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
    }

    //get home page title and print
    @When("get home page title")
    public void getHomepageTitle() {
        System.out.println(" Expected Title: " + HomePage.getHomepageTitle());
    }

    @Then("verify if title is expected")
    public void verifyIfTitleIsExpected() {
        String expectedTitle = "EEVEE Mobility | Let’s Redefine Electric Vehicle Charging";
        Assert.assertEquals(expectedTitle, HomePage.getHomepageTitle());
    }

    //Testing Pricing Page Button
    @When("Test pricing page button")
    public void testPricingButton() throws InterruptedException {
        HomePage.clickPricing();
    }

    @Then("User sees pricing page")
    public void userSeesPricingPage() {
        String expectedURL = "https://eeveemobility.com/pricing";
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        System.out.println("Expected URL: " + HomePage.verifyURL());
    }

    //Testing Talk To Us Page Button
    @When("Test talk to us page button")
    public void testTalkToUsPageButton() throws InterruptedException {
        HomePage.clickTalkToUs();
    }

    @Then("User sees talk to us page")
    public void userSeesTalkToUsPage() {
        String expectedURL = "https://eeveemobility.com/talk";
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        System.out.println("Expected URL: " + HomePage.verifyURL());
    }


    //Testing Eevee Launch Business Page Button
    @When("Test Eevee launch business page button")
    public void testEeveeLaunchBusinessButton() throws InterruptedException {
        HomePage.clickEeveeLaunchBusiness();
    }

    @Then("User sees Eevee launch business page")
    public void userSeesEeveeLaunchBusinessPage() {
        String expectedURL = "https://business.eeveemobility.com/en/login";
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        System.out.println("Expected URL: " + HomePage.verifyURL());
    }


}
