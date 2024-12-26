package org.codefromscratch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.edge.driver","C:\\selenium\\msedgedriver.exe");

        EdgeDriver driver = new EdgeDriver();
        try {
            driver.navigate().to("https://shuchu.vercel.app/");

            WebElement element = driver.findElement(By.name("selenium_start"));
            element.click();
            Thread.sleep(3000);
            element = driver.findElement(By.name("selenium_pause"));
            element.click();
            Thread.sleep(3000);
            element = driver.findElement(By.name("selenium_pause"));
            element.click();

            Thread.sleep(3000);
            element = driver.findElement(By.name("selenium_tasks"));
            element.click();

            Thread.sleep(3000);
            element = driver.findElement(By.id("selenium_task"));
            element.sendKeys("we're testing via selenium");

            Thread.sleep(1000);
            element = driver.findElement(By.name("selenium_add_task"));
            element.click();
            System.out.println(element.getText());

            Thread.sleep(6000000);
        } finally {
            driver.quit();
        }
    }
}