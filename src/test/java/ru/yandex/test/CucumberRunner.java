package ru.yandex.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        monochrome = true,
        features = "resources/features/",
        dryRun = false
)
public class CucumberRunner {

}
