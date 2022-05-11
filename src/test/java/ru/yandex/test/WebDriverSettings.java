package ru.yandex.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    private final WebDriver driver;

    public WebDriverSettings() {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public void close() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return this.driver;
    }
}
