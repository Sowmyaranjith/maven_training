package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\i732520\\jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.airindia.in/");
        Thread.sleep(3000);
        //Departure date
        driver.findElement(By.xpath("(//img[@title='Date Picker'])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@data-month='8']//a[text()='28']")).click();
        Thread.sleep(2000);
        //Return date
        driver.findElement(By.xpath("(//img[@title='Date Picker'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//td[@data-month='9']//a[text()='28']")).click();
    }
}
