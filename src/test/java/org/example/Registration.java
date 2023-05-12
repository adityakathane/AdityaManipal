package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    public static void main( String[] args) throws InterruptedException{
        System.setProperty("webdriver.msedgedriver.driver", "D:\\Downloads_chrome\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();





        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.sendKeys("Aditya");

        WebElement lastName = driver.findElement(By.xpath("//input[@name ='lastName']"));
        lastName.sendKeys("Kathane");
        Thread.sleep(500);

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("7972757580");

        WebElement email = driver.findElement(By.xpath("//input[@name='userName']"));
        email.sendKeys("Champ@gmail.com");

        WebElement address = driver.findElement(By.xpath("//input[@name='address1']"));
        address.sendKeys("Gadge Nagar Amravati");

        WebElement city = driver.findElement(By.xpath("//input[@name='city']"));
        city.sendKeys("Amravati");

        WebElement state = driver.findElement(By.xpath("//input[@name='state']"));
        state.sendKeys("Maharashtra");

        WebElement pc = driver.findElement(By.xpath("//input[@name='postalCode']"));
        pc.sendKeys("Maharashtra");

//Dropdown
        // Find the dropdown element
        WebElement cityDropdown = driver.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]"));

// Create a new Select object
        Select select = new Select(cityDropdown);

// Select the desired city by visible text
        select.selectByVisibleText("INDIA");

        //
        WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
        un.sendKeys("adityajr");

        WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
        pass.sendKeys("Dadu@75555");

        WebElement confpass = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
        confpass.sendKeys("Dadu@75555");

        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));
        submit.click();



    }
}