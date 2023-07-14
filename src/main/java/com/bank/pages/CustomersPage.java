package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {
    By createdCustomerSearch = By.xpath("//select[@id='userSelect']");
    By clickLogin= By.xpath("//button[contains(text(),'Login')]");


    public void selectCustomerSearch(String name) throws InterruptedException {
        Thread.sleep(1000);
        selectFromDropDownMenu(createdCustomerSearch,name);
    }
    public void clickOnLoginButton(){
        clickOnElement(clickLogin);
    }

}
