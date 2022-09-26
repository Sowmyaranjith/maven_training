package java;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class project3 {
    public static void main(String[] args) throws InterruptedException, IOException {
        String timestamp= LocalDateTime.now().toString().replace(":","-");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732520\\jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File temp = ts.getScreenshotAs(OutputType.FILE);
        File dist = new File("C:\\sowmya" + "facebook.png");
        System.out.println("taken");
        FileHandler.copy(temp,dist);
        driver.quit();;
    }
}
