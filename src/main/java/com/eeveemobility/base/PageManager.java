package com.eeveemobility.base;

import com.eeveemobility.pages.*;

public class PageManager {
    public static PricingPage pricingPage;
    public static TalkToUsPage talkPage;
    public static HomePage homepage;
    public static SignUpPage signUpPage;

    public static void initialize(){
        pricingPage = new PricingPage();
        talkPage = new TalkToUsPage();
        signUpPage = new SignUpPage();
        homepage = new HomePage();

    }
}