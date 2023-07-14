package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By clickLogoutButton = By.xpath("//button[contains(text(),'Logout')]");
    By verifyText= By.xpath("//button[contains(text(),'Login')]");
    By verifyLogoutText= By.xpath("//button[contains(text(),'Logout')]");
    By clickDepositButton= By.xpath("//div[@class='center']//button[contains(text(),'Deposit')]");
    By clickWithdrawlButton= By.xpath("//div[@class='center']//button[contains(text(),'Withdrawl')]");
    By clickOnWithdrawButton= By.xpath("//div[@class='ng-scope']//button[@class='btn btn-default']");
    By enterAmount= By.xpath("//div[@class='form-group']//input");
    By verifyDepositSuccessfulText= By.xpath("//span[contains(text(),'Deposit Successful')]");
    By verifyTransactionSuccessfulText= By.xpath("//span[contains(text(),'Transaction successful')]");
    public void clickOnLogoutButton(){
        clickOnElement(clickLogoutButton);
    }
    public String getverifyText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(verifyText);
    }
    public String getLogoutText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(verifyLogoutText);
    }
    public void clickOnDepositButton(){
        clickOnElement(clickDepositButton);
    }
    public void clickOnWithdrawlButton(){
        clickOnElement(clickWithdrawlButton);
    }
    public void clickOnWithdrawButton(){
        clickOnElement(clickOnWithdrawButton);
    }
    public void enterAmountInField(String value) throws InterruptedException {
        Thread.sleep(1000);
        sendTextToElement(enterAmount,value);
    }
    public String getDepositsuccessfulText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(verifyDepositSuccessfulText);
    }
    public String getTransactionsuccessfulText() throws InterruptedException {
        Thread.sleep(1000);
        return getTextFromElement(verifyTransactionSuccessfulText);
    }
}
