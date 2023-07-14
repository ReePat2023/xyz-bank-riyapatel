package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OpenAccountPage extends Utility {
    By customerSearch = By.xpath("//select[@id='userSelect']");
    By currencySearch = By.xpath("//select[@id='currency']");
    By process = By.xpath("//button[contains(text(),'Process')]");

    public void selectCustomerSearch(String name) throws InterruptedException {
        Thread.sleep(1000);
        selectFromDropDownMenu(customerSearch,name);
    }

    public void selectCurrencySearch(String value) throws InterruptedException {
        Thread.sleep(1000);
        selectFromDropDownMenu(currencySearch,value);
    }

    public void clickOnProcessButton(){
        clickOnElement(process);
    }
    public void verifyAlertText (){
        String actual = getTextFromAlert();
        String expected = "Customer added successfully with customer id :6";
        Assert.assertEquals(expected,actual,"incorrect text");
    }
    public void alertTextAccept () {
        acceptAlert();
    }
}
