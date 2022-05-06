package ru.yandex;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.yandex.MyTestPage.*;

public class PureSeleniumMyTests extends WebDriverSettings{

    @Test
    public void whenUsingYandexSearch() {
        driver.get("https://yandex.ru/");
        findByXpath(searchField).sendKeys("zalupa");
        findByXpath(searchButton).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
    }
}