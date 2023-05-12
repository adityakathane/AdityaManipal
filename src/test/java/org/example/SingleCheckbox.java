package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SingleCheckbox {
    public static void main(String[] args) {
        System.setProperty("webdriver.msedgedriver.driver","D:\\Downloads_chrome\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://jqueryui.com/checkboxradio/");

        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));

        driver.switchTo().frame(frame);

        WebElement checkBox = driver.findElement(By.xpath(("(//span[@class = 'ui-checkboxradio-icon-space'])[1]")));
        if (checkBox.isEnabled()){
            checkBox.click();
        }
        driver.close();

    }
}
