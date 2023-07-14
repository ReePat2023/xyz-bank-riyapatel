package com.bank.testbase;

import com.bank.utilities.Utility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = "chrome";

    @BeforeClass
    public void setup(){
        selectBrowser(browser);
    }

    @AfterClass
    public void tearDon(){
        closeBrowser();
    }
}
