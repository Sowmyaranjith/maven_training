package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732520\\jar\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("a[aria-label='Google apps']")).click();
        Thread.sleep(3000);
        driver.switchTo().frame(1);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@style='background-position: 0 0;']")).click();
        Thread.sleep(3000);
    }
}

