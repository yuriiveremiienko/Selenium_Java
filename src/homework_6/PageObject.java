package homework_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*
* 5) написать класс, описывающий эту страницу: полями будут вебэлементы
*/

public class PageObject {

    private static WebDriver driver = Smoketest.driver;

    static WebElement header = driver.findElement(By.xpath(".//header"));
    static WebElement body = driver.findElement(By.xpath(".//div[@class=\"primary_content_wrap clearfix\"]"));
    static WebElement footer = driver.findElement(By.xpath(".//footer"));

    //Registration form
    static WebElement courseMenu = driver.findElement(By.xpath(".//select[@name=\"menu-99\"]"));

    public static WebElement selectCourse(String courseName) {
        return driver.findElement(By.xpath(".//option[@value=\"" + courseName + "\"]"));
    }

    public static WebElement formField(String fieldName) {
        return driver.findElement(By.xpath(".//p[contains(text(), \"" + fieldName + "\")]/span/input"));
    }

    static WebElement submitButton = driver.findElement(By.xpath(".//input[@type=\"submit\"]"));
}

