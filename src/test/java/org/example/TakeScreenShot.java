package org.example;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;

public class TakeScreenShot {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.msedgedriver.driver", "D:\\Downloads_chrome\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://automationexercise.com/");


        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Files.copy(screenshot , new File(""));








    }
}