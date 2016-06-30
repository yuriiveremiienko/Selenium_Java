package homework_6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Smoketest {

    static WebDriver driver = new FirefoxDriver();

    /*
    * 1) На страницу http://old.qalight.com.ua/zapisatsya-na-kursy/
    * написать авто Смоук-тест (на своё усмотрение).
    */

    public static void main(String[] args) {

        driver.get("http://old.qalight.com.ua/zapisatsya-na-kursy/");

        PageObject.courseMenu.click();
        PageObject.selectCourse("Selenium").click();
        PageObject.formField("Ваша Фамилия*").sendKeys("Veremiienko");
        PageObject.formField("Ваше Имя*").sendKeys("Yurii");
        PageObject.formField("Ваш Телефон*").sendKeys("1231231231");
        PageObject.formField("Ваш E-Mail*").sendKeys("1@1.com");
        PageObject.formField("Ваш Skype*").sendKeys("skype");
        PageObject.formField("Введите код на картинке*").sendKeys("code");

        /*
        * 4) для этой же страницы написать одно (любое) явное ожидание
        */
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@type=\"submit\"]")));

        PageObject.submitButton.click();
        WebElement errorMessage = driver.findElement(By.xpath(".//span[@class=\"wpcf7-not-valid-tip-no-ajax\"]"));

        if (errorMessage.getText().equals("Пожалуйста, заполните обязательные поля.")) {
            System.out.println("Smoke Test Passed");
        } else {
            System.out.println("Smoke Test Failed");
        }
        driver.close();
    }



    /*2) Написать метод, который будет заполнять поле (писать в него)
    * вебэлемента, принимающий на вход как параметр
    * а) вебэлемент; б) локатор элемента.
    */

    public static void sendKeysToElement (WebElement el) {
        el.sendKeys("sample text");
    }

    public static void sendKeysToLocator (String locator) {
        driver.findElement(By.xpath(locator)).sendKeys("sample text");
    }

    /*
    * 3) Написать метод, получающий текст из вебэлемента;
    */

    public static String getElementText (WebElement el) {
        return el.getText();
    }

}
