package com.td.pages;

import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FeedBackPage {
    private Logger logger = Logger.getLogger(BankLocationPage.class);

    @FindBy(id="com.tdbank:id/feedbackFormLandingTitleTextView")
    private WebElement message;

    public void feedBackValidation(){
        Assert.assertTrue(message.isDisplayed());
        ExtentTestManager.log("User Able to give FeedBack",logger);

    }

}
