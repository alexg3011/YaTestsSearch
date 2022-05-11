package ru.yandex.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyTestPage {

    protected static final String searchField = "//input[@class='input__control input__input mini-suggest__input']";
    protected static final String searchButton = "//button[@class='button mini-suggest__button button_theme_search button_size_search i-bem button_js_inited']";
    protected static final String yandexMap = "//*[contains(@class, 'map2__container')]";

    public WebElement findByXpath(String element, WebDriver driver) {

        return driver.findElement(By.xpath(element));
    }
}
