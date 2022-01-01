package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DarazAutomation extends DriverSetup {

    public static String base_url = "https://www.daraz.com.bd/#";

    @Test
    public static void runTest() throws InterruptedException {
        driver.get(base_url);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        String actualText = "Online Shopping in Bangladesh: Order Now from DarazAutomation.com.bd";
        String titleTest = driver.getTitle();
        System.out.println(titleTest);

        //Login

        driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("01631846218");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demo1234");
        driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();
        Thread.sleep(2000);
        System.out.println("Matched");

        //selectProduct
        driver.findElement(By.xpath("//span[contains(text(),'Automotive & Motorbike')]")).click();
        Thread.sleep(1000);
        WebElement mobile = driver.findElement(By.xpath("//span[contains(text(),'Automobile')]"));

        Actions action = new Actions(driver);
        action.clickAndHold(mobile).build().perform();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[contains(text(),'Imported Cars')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//img[@alt='Proton Preve Car - Brown']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(text(),'CHECK OUT')]")).click();
        Thread.sleep(2000);

        //logout
        driver.findElement(By.xpath("//div[@id='topActionUserAccont']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[@class='account-icon test logout']")).click();
        Thread.sleep(2000);

    }
}
