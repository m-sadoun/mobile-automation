package com.td.pages;

import com.pnt.base.report.ExtentTestManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BankLocationPage {
    private Logger logger = Logger.getLogger(BankLocationPage.class);

    @FindBy(id="com.android.permissioncontroller:id/permission_deny_button")
    private WebElement deny;

    public void findBankValidation(){
        Assert.assertTrue(deny.isDisplayed());
        ExtentTestManager.log("User Able To Search for bank location",logger);

    }


}
