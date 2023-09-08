package StepsForFeatureFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {
    WebDriver driver;

    @Given("User is on the travel website homepage")

    public void userIsOnHomepage() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://mailTravel.co.uk");
        Thread.sleep(2000);
        // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement acceptCookiesButton = driver.findElement(By.id("onetrust-accept-btn-handler"));


        // Click the accept cookies button
        if (acceptCookiesButton != null && acceptCookiesButton.isDisplayed()) {
            acceptCookiesButton.click();
        }
    }

    @When("User searches for a India")
    public void searchFlight() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement e1 = driver.findElement(By.xpath("//input[@id='searchtext_freetext_search_form']"));
        e1.sendKeys("India");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        e1.sendKeys(Keys.ARROW_DOWN);

       // Thread.sleep(2000);

        e1.sendKeys(Keys.ENTER);
    }

    @Then("Search results are displayed")
    public void verifySearchResults() {

    }

}