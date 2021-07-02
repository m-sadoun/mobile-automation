package com.pnt.tests;

import com.pnt.base.TestBase;
import com.td.pages.FeedBackPage;
import com.td.pages.HomePage;
import com.td.pages.LoginPage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Feedback extends TestBase {
    private HomePage homePage;
    private FeedBackPage feedback;


    @BeforeMethod
    private void pages() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        feedback = PageFactory.initElements(driver,FeedBackPage.class);

    }
@Test
    public void ValidateUserAbleToGiveFeedBack()  {
        sleepFor(3);
        homePage.clickMenuButton();
        homePage.clickFeedBack();
        feedback.feedBackValidation();

}
}