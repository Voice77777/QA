package com.test.auto.wiki.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    //Wait wrapper method
    private void waitVisibility(By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click method
    public void click(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //Write text
    public void writeText(By elementBy, String text){
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    //Read text
    public String readText(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Clear text
    public void clearText(By elementBy){
        waitVisibility(elementBy);
        driver.findElement(elementBy).clear();
    }

    //Alternative method for read text (placeholder)
    public String readValueAttribute(By elementBy){
        waitVisibility(elementBy);
        return driver.findElement(elementBy).getAttribute("value");
    }
}
