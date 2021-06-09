package com.eeveemobility.pages;

import com.eeveemobility.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.eeveemobility.base.BasePage.driver;

public class PricingPage {

    //PageFactory
    public PricingPage(){
        PageFactory.initElements(driver, this);
    }

    //FIELDS: LOCATORS, WEBELEMENTS

    // Pricing Page Link
    // //*[@id="app"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[2]/a/div/a
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[2]/a/div/a")
    public static WebElement pricingPageLink;

    //Pricing Page Driver Box // first feature
    // //*[@id="app"]/div[2]/div/div[2]/div[4]/div/div/div[1]/div
    // //*[@id="app"]/div/div[1]/div[2]/div[4]/div/div/div[1]/div/h2
    // //h2[normalize-space()='Driver']
    @FindBy(xpath="//h2[normalize-space()='Driver']")
    public static WebElement driverBox;

    // //*[@id="app"]/div/div[1]/div[2]/div[4]/div/div/div[1]/div/div[2]/div/div[1]/span
    // //span[normalize-space()='Super easy and convenient app to track charging.']
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[2]/div[4]/div/div/div[1]/div/div[2]/div/div[1]/span")
    public static WebElement driverBoxFirstFeature;


    //Pricing Page Business Box // second feature
    // //h2[normalize-space()='Business']
    // //*[@id="app"]/div/div[1]/div[2]/div[4]/div/div/div[2]/div/h2
    // //*[@id="app"]/div/div[1]/div[2]/div[4]/div/div/div[1]/div/h2
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[2]/div[4]/div/div/div[2]/div/h2")
    public static WebElement businessBox;

    // //span[contains(text(),'Easily monitor, reimburse and forecast EV charging')]
    // //*[@id="app"]/div/div[1]/div[2]/div[4]/div/div/div[2]/div/div[2]/div/div[2]/span
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[2]/div[4]/div/div/div[2]/div/div[2]/div/div[2]/span")
    public static WebElement businessBoxSecondFeature;


    //Pricing Page Energy Box // first feature
    // //h2[normalize-space()='Energy']
    // //*[@id="app"]/div/div[1]/div[2]/div[4]/div/div/div[3]/div/h2
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[2]/div[4]/div/div/div[3]/div/h2")
    public static WebElement energyBox;

    // //span[normalize-space()='Generate EV insights.']
    // //*[@id="app"]/div/div[1]/div[2]/div[4]/div/div/div[3]/div/div[2]/div/div[1]/span
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[2]/div[4]/div/div/div[3]/div/div[2]/div/div[1]/span")
    public static WebElement energyBoxFirstFeature;

    //Pricing Page Business Box Talk To Us button
    // //*[@id="app"]/div/div[1]/div[2]/div[4]/div/div/div[2]/div/div[1]/div[2]/div/a/div
    // //div[@class='relative w-screen overflow-hidden']//div[2]//div[1]//div[1]//div[2]//div[1]//a[1]//div[1]
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[2]/div[4]/div/div/div[2]/div/div[1]/div[2]/div/a/div")
    public static WebElement businessBoxTalkToUsBtn;

    //Pricing Page Energy Box Talk To Us button
    // //*[@id="app"]/div/div[1]/div[2]/div[4]/div/div/div[3]/div/div[1]/div[2]/div/a/div
    // //div[3]//div[1]//div[1]//div[2]//div[1]//a[1]//div[1]
    @FindBy(xpath="//div[3]//div[1]//div[1]//div[2]//div[1]//a[1]//div[1]")
    public static WebElement energyBoxTalkToUsBtn;


    // ACTIONS
    public static void clickPricingLink(){ HelperMethods.doClick(pricingPageLink);}
    public static String getPricingURL(){ return HelperMethods.getCurrentURL();}
    public static String getBusinessBoxTitle(){
        return HelperMethods.doGetPageTitle();
    }

    public static Boolean checkDriverBox(){
        return HelperMethods.doIsDisplayed(driverBox);
    }

    public static String getDriverBoxFirstFeatureText() {
        return HelperMethods.doGetText(driverBoxFirstFeature);
    }

    public static Boolean checkBusinessBox(){
        return HelperMethods.doIsDisplayed(businessBox);
    }

    public static String getBusinessBoxSecondFeatureText() {
        return HelperMethods.doGetText(businessBoxSecondFeature);
    }

    public static Boolean checkEnergyBox(){
        return HelperMethods.doIsDisplayed(energyBox);
    }

    public static String getEnergyBoxFirstFeatureText() {
        return HelperMethods.doGetText(energyBoxFirstFeature);
    }
    public static void clickBusinessBoxTalkToUs() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(businessBoxTalkToUsBtn.getText());
        HelperMethods.doClick(businessBoxTalkToUsBtn);
    }

    public static void clickEnergyBoxTalkToUs() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(energyBoxTalkToUsBtn.getText());
        HelperMethods.doClick(energyBoxTalkToUsBtn);
    }


}
