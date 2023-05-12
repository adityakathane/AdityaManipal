package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeLauncher {

    @Test
    public void aditya(){
        System.setProperty("webdriver.chromedriver.driver", "D:\\Downloads_chrome\\chromedriver_win32\\chromedriver.xml");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/login/");
    }
}
