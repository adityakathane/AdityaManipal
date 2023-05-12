package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragndrop {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.msedgedriver.driver","D:\\Downloads_chrome\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://jqueryui.com/checkboxradio/");
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));

        driver.switchTo().frame(frame);

        Thread.sleep(500);

        Actions builder = new Actions(driver);

        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));

        WebElement dest = driver.findElement(By.xpath("//p[contains(text(),'Drop here')]"));

        builder.dragAndDrop(source,dest).perform();

        Thread.sleep(500);



    }
}