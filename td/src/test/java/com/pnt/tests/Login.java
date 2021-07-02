package com.pnt.tests;

import com.pnt.base.TestBase;
import com.td.data.DataProv;
import com.td.pages.HomePage;
import com.td.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends TestBase {
    private HomePage homePage;
    private LoginPage loginPage;

    @BeforeMethod
    private void pages(){
      homePage = PageFactory.initElements(driver, HomePage.class);
     loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @Test(dataProvider = "logindata",dataProviderClass =DataProv.class)
    public void validateusercannotLoginWithInvalidData(String name,String password) {
        sleepFor(3);
        homePage.clickAcounts();
        loginPage.typeInFields(name,password);
        loginPage.clickOnLogin();
         sleepFor(20);
        loginPage.loginValidation();

    }
}
