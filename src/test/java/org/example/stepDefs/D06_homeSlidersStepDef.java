package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.example.pages.P03_homePage;
import static org.example.stepDefs.Hooks.driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_homePage home = new P03_homePage();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    @Given("user clicks on slider {string}")
    public void clickOnSlider(String slide){
        if (slide.equals("0")){
            home.sliders().get(0).click();
            wait.until(ExpectedConditions.visibilityOf(home.sliders().get(0)));
        } else if (slide.equals("1")) {
            wait.until(ExpectedConditions.visibilityOf(home.sliders().get(1)));
            home.sliders().get(1).click();
        }

    }

    @Then("user gets redirected to sliders page {string}")
    public void userGetsRedirectedToSlidersPage(String expectedUrl) {
        wait.until(ExpectedConditions.urlMatches(expectedUrl));
        Assert.assertEquals(home.currentUrl(),expectedUrl);
    }
}
