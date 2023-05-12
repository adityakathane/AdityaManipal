package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.msedgedriver.driver","D:\\Downloads_chrome\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.facebook.com/login/");

        driver.manage().window().maximize();


        String title= driver.getTitle();
        System.out.println(title);
        Thread.sleep(500);

        String currenURL = driver.getCurrentUrl();
        System.out.println(currenURL);
        Thread.sleep(500);

        String pagesource = driver.getPageSource();
         System.out.println(pagesource);
        Thread.sleep(500);

        driver.close();
    }
}
