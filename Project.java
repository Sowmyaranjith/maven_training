package java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project
{
    public static void main(String[]args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\i732520\\jar\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://voya.net/");

    }
}
