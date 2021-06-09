package com.eeveemobility.pages;

import com.eeveemobility.utils.HelperMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Set;

import static com.eeveemobility.base.BasePage.driver;

public class HomePage {

    // Fields: locators, webelements,

    // Menu > Pricing
    // //*[@id="app"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[2]/a/div/a
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[2]/a/div/a")
    public static WebElement pricingButton;

    // Menu > Talk To Us
    // //*[@id="app"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[3]/div/a
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[3]/div/a")
    public static WebElement talkPageButton;

    // Menu > Sign Up
    // //a[@href='https://business.eeveemobility.com']
    // //*[@id="app"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[4]/div/a
    @FindBy(xpath="//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div[2]/header/nav/ul/li[4]/div/a")
    public static WebElement eeveeBusinessButton;

    // AppStore
    // //*[@id="app"]/div[2]/div/div[1]/div/div/div[1]/p[1]/a[1]
    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div[1]/p[1]/a[1]")
    public static WebElement appStoreLink;

    // GooglePlay
    // //*[@id="app"]/div[2]/div/div[1]/div/div/div[1]/p[1]/a[2]
    @FindBy(xpath="//*[@id=\"app\"]/div[2]/div/div[1]/div/div/div[1]/p[1]/a[2]")
    public static WebElement googlePlayLink;


    // PageFactory
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    public static String getHomepageTitle(){
        return HelperMethods.doGetPageTitle();
    }
    public static String getHomepageURL(){
        return HelperMethods.getCurrentURL();
    }
    public static String verifyURL(){
        return HelperMethods.getCurrentURL();
    }

    // CLICK PRICING
    public static void clickPricing()throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(pricingButton.getText());
        HelperMethods.doClick(pricingButton);
    }

    // CLICK TALK TO US
    public static void clickTalkToUs() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(talkPageButton.getText());
        HelperMethods.doClick(talkPageButton);
    }

    // CLICK SIGN UP
    public static void clickEeveeLaunchBusiness() throws InterruptedException{
        Thread.sleep(2000);
        System.out.println(eeveeBusinessButton.getText());
        HelperMethods.doClick(eeveeBusinessButton);
    }

//    public static void clickGooglePlay() {
////        Thread.sleep(2000);
////        System.out.println(googlePlayLink.getText());
//        HelperMethods.doClick(googlePlayLink);
//    }
//    public static String getAppstoreURL() throws InterruptedException{
//        Thread.sleep(2000);
//        Set<String> windowsHandles = driver.getWindowHandles();
//        ArrayList<String> windowsHandleList = new ArrayList<String>(windowsHandles);
//        System.out.println(windowsHandleList);
//        driver.switchTo().window(windowsHandleList.get(1));
//        return driver.getCurrentUrl();  }

//    public static String getGoogleplayURL(){
//        return HelperMethods.getCurrentURL();
//    }
//
//    public static void clickAppStore() {
//        HelperMethods.doClick(appStoreLink);
//    }
//    public static String getAppstoreURL(){
//        return HelperMethods.getCurrentURL();
//    }
}
