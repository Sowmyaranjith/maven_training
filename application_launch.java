package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class application_launch
{

    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732520\\jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//div[@class='header-wrapper'])[1]")).click();
        Thread.sleep(5000);

driver.findElement(By.xpath("//span[text()='Check Box']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//span[text()='Home']")).click();
Thread.sleep(5000);
driver.quit();
 driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
driver.quit();
    }
}