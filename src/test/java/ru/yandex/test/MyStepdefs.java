package ru.yandex.test;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static ru.yandex.test.MyTestPage.*;

public class MyStepdefs {

    private WebDriverSettings wds;
    private MyTestPage myTestPage;
    private WebDriver driver;

    public MyStepdefs() {
    }

    @Before
    public void init() {
        this.wds = new WebDriverSettings();
        this.driver = wds.getDriver();
        this.myTestPage = new MyTestPage();
    }

    @Given("Open {string}")
    public void open(String arg0) {
        driver.get(arg0);
    }

    @When("write word {string} into search bar")
    public void writeWordIntoSearchBar(String arg0) {
        myTestPage.findByXpath(searchField, driver).sendKeys(arg0);
    }

    @And("click search button")
    public void clickSearchButton() {
        myTestPage.findByXpath(searchButton, driver).click();
    }

    @Then("The page with search-result has loaded completely")
    public void thePageWithSearchResultHasLoadedCompletely() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(webDriver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete"));
    }

    @Then("Check yandex map is visible")
    public void checkYandexMapIsVisible() {
        assert myTestPage.findByXpath(yandexMap, driver).isDisplayed();
    }

    @After
    public void close() {
        wds.close();
    }
}
