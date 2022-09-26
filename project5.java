package java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project5{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732520\\jar\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("redmi 10");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[text()='Xiaomi Redmi 10 4G Volte GSM Factory Unlocked 6.5\" 50MP Quad Camera (Not Verizon Sprint Boost Cricket) + Fast Car Charger Bundle (Carbon Gray, 64GB + 4GB)']")).click();;
        Thread.sleep(3000);
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("sw-gtc")).click();;
        driver.findElement(By.name("proceedToRetailCheckout")).click();;
    }
}


