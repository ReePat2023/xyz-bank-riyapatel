package com.bank.utilities;

import com.bank.browserfactory.ManageBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static com.bank.browserfactory.ManageBrowser.driver;

public class Utility extends ManageBrowser {
    /**
     * This method will click on the element
     */
    //this method will find the element and click on that element
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }


    // this method is used to send the text to the element
    public void sendTextToElement(By by , String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //this method will get the text from an element
    public String getTextFromElement(By by)
    {
        return  driver.findElement(by).getText();

    }


    //This method will mouse hover on the element
    public void mouseHoverOnElement(By by)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).build().perform();
        //actions.moveToElement(driver.findElement(by)).click().build().perform();
    }
    //This method will mouse hover on the element and then click the element
    public void mouseHoverAndClickOnElement(By by)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().build().perform();
    }

    //This method will select the option from the dropdown
    public void selectFromDropDownMenu(By by , String text)
    {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    public void verifyElementMethod(String expectedMessage,String actualMessageText)
    {

        //Assert.assertEquals(expectedMessage,actualMessageText);


    }

    public void selectMenu(String menu) {
        driver.findElement(By.linkText(menu)).click();
    }

    /*
    select checkbox
     */
    public void selectCheckBox(By by) {

        WebElement checkBox = driver.findElement(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(checkBox);
        actions.perform();
        if (checkBox.isSelected()) {

        } else {
            checkBox.click();
        }
    }
    public void selectRadioButton(By by) {
        driver.findElement(by).click();
    }


    //----------------alert methods-------------------------
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    /**
     * This method will accept alert
     */
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    /**
     * This method will dismiss alert
     */
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    /**
     * This method will get text from alert
     */
    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    /**
     * This method will send text from alert
     */
    public void sendTextToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

}
