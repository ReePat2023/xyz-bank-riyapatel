package com.bank.testsuite;

import com.bank.pages.*;
import junit.framework.Assert;
import org.testng.annotations.Test;

public class BankTest {

    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomersPage customersPage = new CustomersPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
       //click On "Bank Manager Login" Tab
        Thread.sleep(2000);
        homePage.clickOnBankManagerLogin();
        //click On "Add Customer" Tab
        bankManagerLoginPage.clickOnAddCustomer();
        //enter FirstName
        addCustomerPage.enterFirstname("Riya");
        //enter LastName
        addCustomerPage.enterLastname("Patel");
        //enter PostCode
        addCustomerPage.enterPostcode("HA1 2JR");
        //click On "Add Customer" Button
        addCustomerPage.clickOnAddtoCustomer();
        //popup display
        //verify message "Customer added successfully"
        addCustomerPage.verifyAlertText();
        //click on "ok" button on popup.
        addCustomerPage.acceptAlert();
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        //click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLogin();
        //click On "Open Account" Tab
        bankManagerLoginPage.clickOnOpenAccount();
        //Search customer that created in first test
        openAccountPage.selectCustomerSearch("Riya Patel");
        //Select currency "Pound"
        openAccountPage.selectCurrencySearch("Pound");
        //click on "process" button
        openAccountPage.clickOnProcessButton();
        //popup displayed
        //verify message "Account created successfully"
        openAccountPage.verifyAlertText();
        //click on "ok" button on popup.
        openAccountPage.alertTextAccept();
    }

    @Test
    public void customerShouldLoginAndLogoutSuceessfully() throws InterruptedException {
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        //search customer that you created.
        customersPage.selectCustomerSearch("Riya Patel");
        //click on "Login" Button
        customersPage.clickOnLoginButton();
        //verify "Your Name" text displayed.
        String expectedMessage = "Riya Patel";
        String actualMessage = customerLoginPage.getverifyText();
        Assert.assertEquals(expectedMessage, actualMessage);
        //verify "Logout" Tab displayed.
        String expectedMessage1 = "Logout";
        String actualMessage1 = customerLoginPage.getLogoutText();
        Assert.assertEquals(expectedMessage1, actualMessage1);
        //click on "Logout"
        customerLoginPage.clickOnLogoutButton();
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        //search customer that you created.
        customersPage.selectCustomerSearch("Riya Patel");
        //click on "Login" Button
        customersPage.clickOnLoginButton();
        //click on "Deposit" Tab
        customerLoginPage.clickOnDepositButton();
        //Enter amount 100
        customerLoginPage.enterAmountInField("100");
        //click on "Deposit" Button
        customerLoginPage.clickOnDepositButton();
        //verify message "Deposit Successful"
        String expectedMessage = "Deposit Successful";
        String actualMessage = customerLoginPage.getDepositsuccessfulText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        //click on "Customer Login" Tab
        homePage.clickOnCustomerLogin();
        //search customer that you created.
        customersPage.selectCustomerSearch("Riya Patel");
        //click on "Login" Button
        customersPage.clickOnLoginButton();
        //click on "Withdrawl" Tab
        customerLoginPage.clickOnWithdrawlButton();
        //Enter amount 50
        customerLoginPage.enterAmountInField("50");
        //click on "Deposit" Button
        customerLoginPage.clickOnWithdrawButton();
        //verify message "Transaction Successful"
        String expectedMessage = "Transaction successful";
        String actualMessage = customerLoginPage.getTransactionsuccessfulText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
