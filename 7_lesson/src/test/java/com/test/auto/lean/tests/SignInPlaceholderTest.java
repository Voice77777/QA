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

public class SignInPlaceholderTest {
    private WebDriver driver;

    @BeforeTest
    public void setupTest(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void placeholderInputField(){
        driver.get(TestDataProperties.getTestProperty("td.SignInUrl"));
        BasePage basePage = new BasePage(driver);
        Assert.assertEquals(basePage.readValueAttribute(Locators.get("lc.userNameInput")),
                TestDataProperties.getTestProperty("td.usernameSignInPlaceholder"));
        Assert.assertEquals(basePage.readValueAttribute(Locators.get("lc.userPassInput")),
                TestDataProperties.getTestProperty("td.passwordSignInPlaceholder"));
    }


    @AfterTest
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
