package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class Selenium {


    public static void main(String[] args) {
//        WebDriver driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Java\\Desktop\\Selenium_Java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://old.qalight.com.ua/zapisatsya-na-kursy/");

        WebElement surname = driver.findElement(By.xpath(".//*[@id='wpcf7-f637-p638-o1']/form/p[2]/span/input"));
        surname.sendKeys("rklgshdkgshdkf");
        surname.submit();

        boolean isElementPresent = driver.findElement(By.xpath(".//*[@id='wpcf7-f637-p638-o1']/form/p[8]/span/span")).isDisplayed();


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);




//        String url = driver.getCurrentUrl();
//        String handle = driver.getWindowHandle();
//        String source = driver.getPageSource();
//
//        System.out.println(url);
//        System.out.println(handle);
//        System.out.println(source);

//        driver.close(); //close current tab/window
//        driver.quit(); //end session
    }

}
