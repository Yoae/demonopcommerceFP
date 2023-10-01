package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import static org.example.stepDefs.Hooks.driver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;

public class D07_followUs {

    ArrayList<String> list;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    P03_homePage home = new P03_homePage();
    @Given("user opens facebook link")
    public void facebookSymbol(){
    home.facebookLink().click();
    }

    @Given("user opens twitter link")
    public void userOpensTwitterLink() {
        home.twitterLink().click();
    }

    @Given("user opens rss link")
    public void userOpensRssLink() {
        home.rssLink().click();
    }

    @Given("user opens youtube link")
    public void userOpensYoutubeLink() {
        home.youtubeLink().click();
    }
    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String link) {
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        list = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));

        home.currentUrl();
        Assert.assertEquals(home.currentUrl(),link);
    }
}
