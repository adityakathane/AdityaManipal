package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class MultyCheckBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.msedgedriver.driver","D:\\Downloads_chrome\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://jqueryui.com/checkboxradio/");




// maximize the window
        driver.manage().window().maximize();
        WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
        driver.switchTo().frame(frame);
        List<WebElement> radios = driver.findElements(By.xpath("//span[@class = 'ui-checkboxradio-icon-space']"));
        int size = radios.size();
        System.out.println(size);
// for loop
        for(int i = 0; i<=size; i++) {
            radios.get(i).click();


        }


        }
}
