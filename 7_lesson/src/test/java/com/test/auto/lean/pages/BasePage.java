package com.test.auto.lean.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    //Wait Wrapper Method
    private void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click Method
    public void click(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //Write Text
    public void writeText(By elementBy, String text){
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    //Read Text
    public String readText(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Clear Text in Field
    public void clearText(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
    }

    //Alternative method for read text placeholder
    public String readValueAttribute(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getAttribute("placeholder");
    }
}
//sendKeys(Keys.SPACE)