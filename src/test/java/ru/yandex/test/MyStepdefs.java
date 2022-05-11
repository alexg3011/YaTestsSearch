package ru.yandex.test;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.yandex.test.MyTestPage.*;

public class MyStepdefs {

    private WebDriverSettings wds;
    private ChromeDriver driver;
    @Before
    public void init() {
        driver = wds.init();
    }

    @Given("Open {string}")
    public void open(String arg0) {
        driver.get(arg0);
    }

    @When("write word {string} into search bar")
    public void writeWordIntoSearchBar(String arg0) {
        findByXpath(searchField).sendKeys(arg0);
    }

    @And("click search button")
    public void clickSearchButton() {
        findByXpath(searchButton).click();
    }

    @Then("The page with search-result has loaded completely")
    public void thePageWithSearchResultHasLoadedCompletely() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
    }

    @Then("Check yandex map is visible")
    public void checkYandexMapIsVisible() {
        assert findByXpath(yandexMap).isDisplayed();
    }

    @AfterStep
    public void close() {
        driver.quit();
    }
}
