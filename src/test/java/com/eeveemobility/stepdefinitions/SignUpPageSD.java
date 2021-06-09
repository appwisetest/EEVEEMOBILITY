package com.eeveemobility.stepdefinitions;

import com.eeveemobility.base.BasePage;
import com.eeveemobility.base.ConfigReader;
import com.eeveemobility.pages.HomePage;
import com.eeveemobility.pages.SignUpPage;
import com.eeveemobility.pages.TalkToUsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SignUpPageSD {

    // LOGIN FORM CHECKING

    @Given("User is on the launch Eevee business page")
    public void userIsOnTheLaunchEeveeBusinessPage() throws InterruptedException {
        HomePage.clickEeveeLaunchBusiness();
    }

    @When("Test login form")
    public void testLoginForm() {
            SignUpPage.checkLoginForm();
    }

    @And("User sees email input field")
    public void userSeesEmailInputField() {
        SignUpPage.checkEmailInput();
    }

    @And("User sees password input field")
    public void userSeesPasswordInputField() {
        SignUpPage.checkPasswordInput();
    }

    @Then("User click TalkToUs button of login form")
    public void userClickTalkToUsButtonOfLoginForm() {
        SignUpPage.clickTalkToUsButtonOfLoginForm();
//        TalkToUsPage.getTalkToUsURL();
//        System.out.println(TalkToUsPage.getTalkToUsURL());
    }


    // LOGIN WITH VALID EMAIL-ADRESS

    @Given("User is on the signup page")
    public void userIsOnTheSignupPage() {
        SignUpPage.clickSignUpLink();
    }


    @When("User enter valid email")
    public void userEnterValidEmail() {
//        SignUpPage.checkEmailInput();
        SignUpPage.sendEmail(ConfigReader.getProperty("valid_email"));
    }
    @And("User enter valid password")
    public void userEnterValidPassword() {
        SignUpPage.sendPassword(ConfigReader.getProperty("valid_password"));
    }
    // LOGIN WITH INVALID EMAIL-ADRESS

    @Given("User is on the home page second")
    public void userIsOnTheHomePageSecond() {
        BasePage.initializeDriver();
    }

//    @When("User is clicks signUp second")
//    public void userIsClicksSignUpSecond() {
//        SignUpPage.clickSignUpLink();
//    }
//
//    @Given("User is on the signup page")
//    public void userIsOnTheSignupPageSecond() {
//        SignUpPage.getSignUpURL();
//        System.out.println(SignUpPage.getSignUpURL());
//    }

    @And("User enter invalid email")
    public void userEnterInvalidEmail() {
//        SignUpPage.checkEmailInput();
        SignUpPage.sendEmail(ConfigReader.getProperty("invalid_email"));
    }

    @And("User enter invalid password")
    public void userEnterInvalidPassword() {
        SignUpPage.sendPassword(ConfigReader.getProperty("invalid_password"));
    }

    @And("User clicks on the login button")
    public void userClicksOnTheLoginButton() {
        SignUpPage.clickLoginButton();
    }

    @Then("User sees login page message")
    public void userSeesLoginpageMessage() {
    }

    @And("User sees the alert message")
    public void userSeesTheAlertMessage() {
        SignUpPage.checkAlertMessageBox();
    }

    @Then("Verify if the login alert message")
    public void verifyIfTheLoginAlertMessage() {
        String expectedMessage ="Incorrect username or password";
        Assert.assertEquals(expectedMessage,SignUpPage.getAlertText());
        System.out.println("Alert message: " + SignUpPage.getAlertText());
    }




    // HOMEPAGE SIGNUP BUTTON CONTROL

    //    @Given("User is on home page")
//    public void userIsOnTheHomePage() {
//        BasePage.initializeDriver();
//    }
//
//    @When("User is clicks signUp")
//    public void userIsClicksSignUp() { SignUpPage.clickSignUpLink(); }
//
//    @And("User sees signup page")
//    public void userSeesSignupPage() {
////        SignUpPage.getSignUpURL();
//        System.out.println(SignUpPage.getSignUpURL());
//    }


//    @Then("Verify if links open correct page")
//    public void verifyIfLinksOpenCorrectPage() {
////        SignUpPage.verifyURL();
////        System.out.println(SignUpPage.verifyURL());
//        SignUpPage.getVerifySignUpText();
//        System.out.println(SignUpPage.getVerifySignUpText());
//    }

    //SUBSCRIBE NEWS LETTER - other test
//    @And("User clicks on the subscribe button")
//    public void userClicksOnTheSubscribeButton() {
//        SignUpPage.clickSubscribeButton();
//    }
//
//    @Then("User sees the subscribing message")
//    public void userSeesTheSubscribingMessage() {
//        SignUpPage.checkSubscribed();
////        String expectedMessage ="Thanks for subscribing.";
////        Assert.assertEquals(expectedMessage,SignUpPage.getSubscribedText());
////        System.out.println(SignUpPage.getSubscribedText());
//    }


//    @And("User clicks on the subscribe button second")
//    public void userClicksOnTheSubscribeButtonSecond() {
//        SignUpPage.clickSubscribeButton();
//    }

    //Testing HomePage Launch Eevee Business page button

//    @When("User Click LaunchBusiness button")
//    public void userClickLaunchBusinessButton() {
//        SignUpPage.clickSignUpLink();
//    }
//
//    @Then("User sees EeveeBusiness page")
//    public void userSeesEeveeBusinessPage() {
//        SignUpPage.getSignUpURL();
//        System.out.println(SignUpPage.getSignUpURL());
//    }

    // Testing Launch EeveeBusiness Page
//    @When("User is on the LaunchEeveeBusiness page")
//    public void userIsOnTheLaunchEeveeBusinessPage() {
//    }
//
//    @When("Test Login Form")
//    public void testLoginForm() {
//    }
//
//    @And("User sees Email input field")
//    public void userSeesEmailInputField() {
//    }
//
//    @Then("User sees Password input field")
//    public void userSeesPasswordInputField() {
//    }


}
