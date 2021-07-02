package com.pnt.tests;

import com.pnt.base.TestBase;
import com.td.pages.BankLocationPage;
import com.td.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindTDBank extends TestBase {
    private HomePage homePage;
    private BankLocationPage bank;

    @BeforeMethod
    private void pages(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        bank =PageFactory.initElements(driver, BankLocationPage.class);
    }

    @Test
    public void validateUserAbleToFindABank()  {
        sleepFor(3);
        homePage.clickMenuButton();
        homePage.clickFindBank();
        bank.findBankValidation();
    }
}
