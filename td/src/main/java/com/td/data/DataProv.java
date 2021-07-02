package com.td.data;

import org.testng.annotations.DataProvider;

import java.util.ResourceBundle;

public class DataProv {

    @DataProvider(name="logindata")
    public Object[][] getLoginData(){
        Object[][] data={{"dhfhff","jdjdjd"}};
        return data;
    }
}
