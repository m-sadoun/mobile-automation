package com.espn.tests;

import com.espn.pages.HomePage;
import com.espn.pages.LoginPage;
import com.pnt.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {
    private HomePage homePage;
    private LoginPage loginPage;
    @BeforeMethod
    private void pages(){
        homePage = PageFactory.initElements(driver,HomePage.class);
        loginPage= PageFactory.initElements(driver,LoginPage.class);

    }
    @Test
    public void validateUsercannotLoginWithInvalidData(){
        sleepFor(10);
        homePage.clickAllow();
        homePage.clickOnLogin();
        sleepFor(3);
        loginPage.typeInFields("hhghg","hfhfhfh");
        loginPage.clickLogin();
        loginPage.loginValidation();

    }
}
