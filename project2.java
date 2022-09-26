package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project2 {
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732520\\jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[type='Password']")).sendKeys("Sow1234");
        Thread.sleep(3000);
        driver.close();
    }
}
