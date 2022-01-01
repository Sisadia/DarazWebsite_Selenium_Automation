package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DarazAutomationAgain extends DriverSetup {

    public static String base_url = "https://www.daraz.com.bd/#";

    @Test
    public static void runTest() throws InterruptedException {
        driver.get(base_url);
        driver.manage().window().maximize();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[contains(text(),'Electronic Devices')]")).click();
        Thread.sleep(1000);

        WebElement mobile = driver.findElement(By.xpath("//span[contains(text(),'Laptops')]"));
        Thread.sleep(1000);

        Actions action = new Actions(driver);
        action.clickAndHold(mobile).build().perform();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[contains(text(),'Asus Laptops')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[2]/a[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();

        int size =driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='login-iframe']")));


        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("01631846218");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("demo1234");
        driver.findElement(By.xpath("//button[contains(text(),'LOGIN')]")).click();

        driver.switchTo().parentFrame();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[contains(text(),'CHECK OUT')]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='Enter your first and last name']")).sendKeys("Sadia Islam");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Please enter your phone number']")).sendKeys("01631846218");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Please enter your email']")).sendKeys("s@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[contains(text(),'Please choose your region')]")).click();
        driver.findElement(By.xpath("//li[@id='R3921322']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[contains(text(),'Please choose your city')]")).click();
        driver.findElement(By.xpath("//li[@id='R80300576']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[contains(text(),'Please choose your area')]")).click();
        driver.findElement(By.xpath("//li[@id='R80314576']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='For Example: House# 123, Street# 123, ABC Road']")).sendKeys("House# 123, Street# 123, ABC Road");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[contains(text(),'SAVE')]")).click();
        Thread.sleep(5000);

    }

}
