package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigation {
    public static void main(String[] args) {
        System.setProperty("webdriver.msedgedriver.driver","D:\\Downloads_chrome\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/login/");

        driver.manage().window().maximize();

//Novigote to URL

        driver.navigate().to( "https://m.facebook.com/login/");

//avigate backward in browser history

        driver.navigate().back();

// fresh page driver.navigate().refresh();

// Navigate fermords in eroaser history

        driver.navigate().forward();
    }
}
