package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

    @Test
    public void verifyGoogleTitle(){
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");
        option.addArguments("--no-sandbox");
        option.addArguments("--disable-dev-sm-usage");

        WebDriver driver = new ChromeDriver(option);
        driver.get("https://www.google.com");

        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.toLowerCase().contains("google"),"Navigation failed");

        driver.quit();
    }
}
