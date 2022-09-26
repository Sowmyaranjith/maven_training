package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732520\\jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        WebElement ele =driver.findElement(By.xpath("//div[.='Beauty, Toys & More']"));
        WebElement el = driver.findElement(By.xpath("//img[@alt='Electronics']"));
        WebElement el1 = driver.findElement(By.xpath("//img[@alt='Home']"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();
        Thread.sleep(1000);
        act.moveToElement(el1).perform();
        driver.close();
    }
}






