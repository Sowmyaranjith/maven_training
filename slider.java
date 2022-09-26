package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732520\\jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/slider");
        Thread.sleep(1000);
        WebElement a1 = driver.findElement(By.xpath("//input[@type='range']"));
        Actions a = new Actions(driver);
        a.dragAndDropBy(a1,1,10).perform();
}
    }
