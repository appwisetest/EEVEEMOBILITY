package com.eeveemobility.stepdefinitions;

import com.eeveemobility.pages.HomePage;
import com.eeveemobility.pages.SignUpPage;
import com.eeveemobility.pages.TalkToUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TalkToUsPageSD {

    // Testing Talk To Us Page

    @Given("User will on the TalkToUs page")
    public void userWillOnTheTalkToUsPage() throws InterruptedException {
        HomePage.clickTalkToUs();
    }

    @When("Test TalkToUs contact form")
    public void testTalkToUsContactForm() {
        TalkToUsPage.checkContactForm();
    }
    @And("User sees first name input field")
    public void userSeesFirstNameInputField() {
        TalkToUsPage.checkFirstNameInput();
    }

    @And("User sees last name input field")
    public void userSeesLastNameInputField() {
        TalkToUsPage.checkLastNameInput();
    }

    @And("User sees contact email input field")
    public void userSeesContactEmailInputField() {
        TalkToUsPage.checkEmailInputField();
    }

    @And("User sees country input field")
    public void userSeesCountryInputField() {
        TalkToUsPage.checkCountryInputField();
    }

    @Then("User clicks send button")
    public void userdClicksSendButton() {
        TalkToUsPage.clickSendButtonOfContactForm();

    }




    //Testing HomePage Talk to us page button

//    @When("User Click EeveeTalkPage button")
//    public void userClickEeveeTalkPageButton() throws InterruptedException {
//        HomePage.clickTalkToUs();
//    }
//
//    @Then("User sees TalkToUs page")
//    public void userSeesTalkToUsPage() {
//        String expectedURL = "https://eeveemobility.com/talk";
//        Assert.assertEquals(expectedURL, HomePage.verifyURL());
//        System.out.println(HomePage.verifyURL());
//    }


}
