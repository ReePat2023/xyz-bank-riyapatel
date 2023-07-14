package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomer= By.xpath("//div[@class='center']//button[normalize-space()='Add Customer']");
    By openAccount= By.xpath("//div[@class='center']//button[normalize-space()='Open Account']");
    By customers = By.xpath("//div[@class='center']//button[normalize-space()='Customers']");

    public void clickOnAddCustomer(){
        clickOnElement(addCustomer);
    }
    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }
    public void clickOnCustomers(){
        clickOnElement(customers);
    }
}
