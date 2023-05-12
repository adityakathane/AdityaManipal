package org.example;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxLauncher {

    @Test
    public void aditya(){
        System.setProperty("webdriver.gecko.driver", "D:\\Downloads_chrome\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
    }
}
