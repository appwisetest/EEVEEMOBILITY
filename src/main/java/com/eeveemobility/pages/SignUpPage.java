package com.eeveemobility.pages;

import com.eeveemobility.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import static com.eeveemobility.base.BasePage.driver;

public class SignUpPage {

    //PageFactory
    public SignUpPage(){
        PageFactory.initElements(driver, this);
    }

    //FIELDS: LOCATORS, WEBELEMENTS

    // //*[@id="app"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[4]/div/a
    // //a[@href='https://business.eeveemobility.com']
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[4]/div/a")
    public static WebElement signupPageLink;

    // //*[@id="app"]/div[1]/div/div/div[1]/div
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div/div[1]/div")
    public static WebElement loginForm;

    // //input[@placeholder='Password']
    @FindBy(xpath="//input[@placeholder='Password']")
    public static WebElement passwordInput;

    // //*[@id="app"]/div[2]/div/div[2]/div/div/div/div[2]/input
    @FindBy(xpath="//input[@placeholder='Email']")
    public static WebElement emailInput;

    // //*[@id="app"]/div[1]/div/div/div[1]/div/div[2]/div[6]/div/div[2]
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div/div[1]/div/div[2]/div[6]/div/div[2]")
    public static WebElement talkToUsLoginBtn;


    ////*[@id="app"]/div[1]/div/div/div[1]/div/div[2]/div[4]/div[2]
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div/div[1]/div/div[2]/div[4]/div[2]")
    public static WebElement loginButton;

    //alert message
    // //*[@id="app"]/div[1]/div/div/div[1]/div/div[2]/div[4]/div[1]/p
    // //p[@class='text-red-600']
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div/div[1]/div/div[2]/div[4]/div[1]/p")
    public static WebElement AlertText;

//    //subscribe
//    // //*[@id="app"]/div[2]/div/div[2]/div/div/div/div[3]/div/a
//    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div[3]/div/a")
//    public static WebElement subscribeButton;
//
//    // //h1[normalize-space()='Thanks for subscribing.']
//    @FindBy(xpath="////h1[normalize-space()='Thanks for subscribing.']")
//    public static WebElement subscribeMsg;


    //   //*[@id="app"]/div[2]/div/div[2]/div/div/div/div[1]
//    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div[1]")
//    public static WebElement signUpInfoMsg;

    // subscribed text
    // //*[@id="app"]/div[2]/div/div[2]/div/div/div/div
    // @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div[2]/div/div/div/div")
    // public static WebElement SubscribedText;


    // ACTIONS
    public static void clickSignUpLink(){ HelperMethods.doClick(signupPageLink);}
    public static String getSignUpURL(){ return HelperMethods.getCurrentURL();}
//  public static String verifyURL (){ return HelperMethods.getCurrentURL();}

    public static void checkLoginForm(){HelperMethods.doIsDisplayed(loginForm);}
    public static void checkEmailInput(){HelperMethods.doIsDisplayed(emailInput);}
    public static void checkPasswordInput(){HelperMethods.doIsDisplayed(passwordInput);}
    public static void clickTalkToUsButtonOfLoginForm(){HelperMethods.doClick(talkToUsLoginBtn);}
    public static void sendEmail(String valid_email){ HelperMethods.sendText(emailInput,valid_email);}
    public static void sendPassword(String valid_password){HelperMethods.sendText(passwordInput,valid_password);}
    public static void clickLoginButton(){HelperMethods.doClick(loginButton);}

//    public static String getVerifySignUpText(){return HelperMethods.doGetText(signUpInfoMsg);}
//    public static void clickSubscribeButton(){ HelperMethods.doClick(subscribeButton);}
//    public static void checkSubscribed() { HelperMethods.doIsDisplayed(subscribeMsg);}
//  public static String getSubscribedText(){return HelperMethods.doGetText(SubscribedText);}
    public static void checkAlertMessageBox(){HelperMethods.doIsDisplayed(AlertText);}
    public static String getAlertText(){return HelperMethods.doGetText(AlertText);}


}
