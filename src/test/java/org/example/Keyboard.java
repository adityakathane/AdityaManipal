package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {


    public static void main(String[] args) {


        System.setProperty("webdriver.msedgedriver.driver","D:\\Downloads_chrome\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/login/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

        Actions alt = new Actions(driver);

        Action seriesofactions = alt.moveToElement(username).click().keyDown(username , Keys.SHIFT).sendKeys(username, "Aditya").build();

        seriesofactions.perform();


    }

}
