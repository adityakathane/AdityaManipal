package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelMethods {


    @Test
    public void chrome(){

        System.setProperty("webdriver.msedgedriver.driver", "D:\\Downloads_chrome\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");


    }

    @Test
    public  void edge() {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Harsha Patil\\Downloads\\edgedriver_win32 (1)\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/login/");
    }

    @Test
    public  void firefox() {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harsha Patil\\Downloads\\geckodriver-v0.31.0-win64(1)\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/login/");


    }


}
