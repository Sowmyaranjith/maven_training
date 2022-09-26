package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class dynamic {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732520\\jar\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://timesofindia.indiatimes.com/city");
        try {
            Thread.sleep(3000);
            List<WebElement> weblist = driver.findElements(By.xpath(".//*[@id='main-nav']/ui/*[starts-with(data-id,'-212')]"));
            Iterator<WebElement> itr = weblist.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next().getText());
            }
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }

    }
}

