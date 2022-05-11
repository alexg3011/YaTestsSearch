package ru.yandex.test;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.yandex.test.MyTestPage.*;

public class PureSeleniumMyTests {
    @Test
    public void whenUsingYandexSearch() {
        driver.get("https://yandex.ru/");
        findByXpath(searchField).sendKeys("qwerty");
        findByXpath(searchButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
    }
}
