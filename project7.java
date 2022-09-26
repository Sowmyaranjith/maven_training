package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class project7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732520\\jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://omayo.blogspot.com/?");
        String firstWindow = driver.getWindowHandle();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Open a popup window")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> itr = windows.iterator();
        while (itr.hasNext()) {
            String window = itr.next();
            driver.switchTo().window(window);
            if (driver.getTitle().equals("basic Web Page Title")) {
                driver.close();
            }
        }
    }
}


