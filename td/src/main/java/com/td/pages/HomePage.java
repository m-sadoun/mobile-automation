package com.td.pages;

import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

    private Logger logger = Logger.getLogger(HomePage.class);

    @FindBy(xpath = "//android.widget.TextView[@text='Manage Transfers']")
    private WebElement manageTransfers;

    @FindBy(xpath = "//android.widget.TextView[@text='View Accounts']")
    private WebElement viewAccounts;

    @FindBy(xpath = "//android.widget.TextView[@text='Mobile Deposit']")
    private WebElement mobileDeposit;

    @FindBy(xpath = "//android.widget.TextView[@text='Digital Wallets']")
    private WebElement digitalWallets;

    @FindBy(xpath = "//android.widget.Button[@text='DEPOSIT']")
    private WebElement depositBtn;

    @FindBy(xpath="//android.widget.ImageButton[@bounds='[0,68][98,166]']")
    private WebElement menuBtn;

    public void clickAcounts(){
        Assert.assertTrue(viewAccounts.isDisplayed());
        viewAccounts.click();
        ExtentTestManager.log("accounts displayed and has been clicked",logger);
    }
    public void clickMenuButton(){

        menuBtn.click();
        ExtentTestManager.log("Menu is displayed and has been clicked",logger);

    }
    public void clickFindBank(){
       WebElement find = (WebElement) TestBase.driver.findElementsById("com.tdbank:id/nav_menu_item_title").get(14);
       find.click();
       ExtentTestManager.log("Find bank link has been clicked",logger);

    }
    public void clickFeedBack(){
        WebElement find = (WebElement) TestBase.driver.findElementsById("com.tdbank:id/nav_menu_item_title").get(13);
        find.click();
        ExtentTestManager.log("FeedBack  link has been clicked",logger);

    }
}
