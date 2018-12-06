package com.test.auto.lean.tests;

import com.test.auto.lean.pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.Locators;
import utils.TestDataProperties;

public class SignUpInvalidTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void invalidDataInput() throws InterruptedException {
        driver.get(TestDataProperties.getTestProperty("td.SignUpUrl"));
        BasePage basePage = new BasePage(driver);
        basePage.writeText(Locators.get("lc.userMailInput"), TestDataProperties.getTestProperty("td.mixData"));
        basePage.writeText(Locators.get("lc.userNameInput"), TestDataProperties.getTestProperty("td.logNot"));
        basePage.writeText(Locators.get("lc.userPassInput"), TestDataProperties.getTestProperty("td.passNot"));
        Thread.sleep(1000);
        basePage.click(Locators.get("lc.SignUpButton"));
        Assert.assertEquals(driver.getTitle(),Locators.title("lc.SignUpTitle"));
    }

    @AfterTest
    void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }
}
