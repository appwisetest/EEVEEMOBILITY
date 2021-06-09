package com.eeveemobility.pages;

import com.eeveemobility.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.eeveemobility.base.BasePage.driver;

public class TalkToUsPage {

    //PageFactory
    public TalkToUsPage(){
        PageFactory.initElements(driver, this);
    }

    //FIELDS: LOCATORS, WEBELEMENTS

    // Talk To Us Page Link
    // //*[@id="app"]/div[2]/div/header/div[2]/div/div[2]/header/nav/ul/li[3]/div/a
    // //*[@id="app"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[3]/div/a
    // //a[@class='relative flex items-center justify-center w-full px-8 py-3 border cursor-pointer font-600 border-white text-white']
    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/header/div[2]/div/div[2]/header/nav/ul/li[3]/div/a")
    public static WebElement talkToUsPageLink;

    // //*[@id="app"]/div[2]/div/div[5]/div/div[2]/div/div
    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div[5]/div/div[2]/div/div")
    public static WebElement contactForm;

    // //*[@id="app"]/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div[1]/div/input
    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div[1]/div/input")
    public static WebElement firstNameInput;

    // //*[@id="app"]/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div[2]/div/input
    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div[2]/div/input")
    public static WebElement lastNameInput;

    ////*[@id="app"]/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div[3]/div/input
    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div[3]/div/input")
    public static WebElement emailInput;

    // //*[@id="app"]/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div[4]/div/input
    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div[5]/div/div[2]/div/div/div[1]/div[4]/div/input")
    public static WebElement countryInput;

    ////*[@id="app"]/div[2]/div/div[5]/div/div[2]/div/div/div[5]/div/a
    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div[5]/div/div[2]/div/div/div[5]/div/a")
    public static WebElement sendButton;


    //ACTIONS

    public static void clickTalkToUsLink(){ HelperMethods.doClick(talkToUsPageLink);}
    public static String getTalkToUsURL(){ return HelperMethods.getCurrentURL();}
    public static String getTalktToUsTitle(){
        return HelperMethods.doGetPageTitle();
    }


    public static void checkContactForm(){HelperMethods.doIsDisplayed(contactForm);}
    public static void checkFirstNameInput(){HelperMethods.doIsDisplayed(firstNameInput);}
    public static void checkLastNameInput(){HelperMethods.doIsDisplayed(lastNameInput);}
    public static void checkEmailInputField(){HelperMethods.doIsDisplayed(emailInput);}
    public static void checkCountryInputField(){HelperMethods.doIsDisplayed(countryInput);}
    public static void clickSendButtonOfContactForm(){HelperMethods.doClick(sendButton);}

}
