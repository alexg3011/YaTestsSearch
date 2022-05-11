package ru.yandex.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.yandex.test.MyTestPage.searchButton;
import static ru.yandex.test.MyTestPage.searchField;

public class PureSeleniumMyTests {

    private final MyTestPage myTestPage;

    public PureSeleniumMyTests(MyTestPage myTestPage) {
        this.myTestPage = myTestPage;
    }

    public void whenUsingYandexSearch(WebDriver driver) {
        driver.get("https://yandex.ru/");
        myTestPage.findByXpath(searchField, driver).sendKeys("qwerty");
        myTestPage.findByXpath(searchButton, driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
    }
}
