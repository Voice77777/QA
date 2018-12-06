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

public class SignInInvalidTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void invalidDataInput() throws InterruptedException {
        driver.get(TestDataProperties.getTestProperty("td.SignInUrl"));//("https://leantesting.com");
        BasePage basePage = new BasePage(driver);
        basePage.writeText(Locators.get("lc.userNameInput"), TestDataProperties.getTestProperty("td.logNot"));
        basePage.writeText(Locators.get("lc.userPassInput"), TestDataProperties.getTestProperty("td.passNot"));
        Thread.sleep(1000);
        basePage.click(Locators.get("lc.loginButton"));
        Assert.assertEquals(basePage.readText(Locators.get("lc.errorInputMessage")),
                TestDataProperties.getTestProperty("td.errorInputMessage"));
    }

    @AfterTest
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
