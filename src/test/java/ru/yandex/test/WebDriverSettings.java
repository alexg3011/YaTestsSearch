package ru.yandex.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    private final WebDriver driver;

    public WebDriverSettings(WebDriver driver) {
        this.driver = driver;
    }

    public ChromeDriver init() {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
        return new ChromeDriver();
    }

    public void close() {
        driver.quit();
    }
}
