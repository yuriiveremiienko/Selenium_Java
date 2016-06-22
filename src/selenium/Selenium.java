package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium {


    public static void main(String[] args) {
//        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Java\\Desktop\\Selenium_Java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.seleniumhq.org/");
        driver.findElement(By.xpath("//a[@title=\"Get Selenium\"]")).click();
        driver.findElement(By.cssSelector("[title=\"Return to Selenium home page\"]")).click();
    }

}
