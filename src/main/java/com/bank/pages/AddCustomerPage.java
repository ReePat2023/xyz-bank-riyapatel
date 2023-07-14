package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddCustomerPage extends Utility {
    By firstname = By.xpath("//div[@class='form-group']//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-touched']");
    By lastname = By.xpath("//div[@class='form-group']//input[@placeholder='Last Name']");
    By postcode = By.xpath("//div[@class='form-group']//input[@placeholder='Post Code']");
    By clickOnAddcustomer = By.xpath("//div[@class='marTop']//button[normalize-space()='Add Customer']");

    public void enterFirstname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(firstname,value);
    }

    public void enterLastname(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(lastname,value);
    }

    public void enterPostcode(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(postcode,value);
    }

    public void clickOnAddtoCustomer() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(clickOnAddcustomer);
    }

    public void verifyAlertText(){
        String actual = getTextFromAlert();
        String expected = "Customer added successfully with customer id :6";
        Assert.assertEquals(expected,actual,"incorrect text");
    }
    public void alertTextAccept() {
        acceptAlert();
    }
}
