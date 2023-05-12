package org.example;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ChromeLauncher {

    @Test
    public void aditya(){
        System.setProperty("webdriver.msedgedriver.driver", "D:\\Downloads_chrome\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
    }
}
