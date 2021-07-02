package com.td.pages;

import com.pnt.base.TestBase;
import com.pnt.base.report.ExtentTestManager;
import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    private Logger logger = Logger.getLogger(LoginPage.class);

    @FindBy(xpath="//android.widget.EditText[@text='User name']")
    private WebElement userName;
    @FindBy(xpath="//android.widget.EditText[@text='Password']")
    private WebElement passwordtxt;
    @FindBy(xpath="//android.widget.Button[@text='Log in']")
    private WebElement loginBtn;
    @FindBy(xpath = "//android.widget.LinearLayout[@resource-id='com.tdbank:id/alert_view']")
    private WebElement message;

    public void typeInFields( String name , String password){
        Assert.assertTrue(userName.isDisplayed() && userName.isEnabled());
        userName.sendKeys(name);
        ExtentTestManager.log("User Name Typed In",logger);
        Assert.assertTrue(passwordtxt.isDisplayed() && passwordtxt.isEnabled());
        passwordtxt.sendKeys(password);
        ExtentTestManager.log("Password typed in",logger);

    }
    public void clickOnLogin(){
        Assert.assertTrue(loginBtn.isDisplayed());
        loginBtn.click();
        ExtentTestManager.log("Login button has been dispalyed",logger);
    }
    public void loginValidation(){
        Assert.assertTrue(message.isDisplayed());
        ExtentTestManager.log("User cannot Login in With invalid Credentiels",logger);
    }

}
