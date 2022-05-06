import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.WebDriverSettings;

import java.time.Duration;

import static ru.yandex.MyTestPage.*;

public class MyStepdefs1111 extends WebDriverSettings {

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
}
