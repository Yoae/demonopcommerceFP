package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import static org.example.stepDefs.Hooks.driver;


import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;


public class D08_WishlistStepDef {
    P03_homePage home= new P03_homePage();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
@Given("user wishlists HTC One M8 Android L 5.0 Lollipop")
    public void wishlist(){

    home.wishlist().get(2).click();
}

    @Then("success message is displayed for wishlist")
    public void successMessageIsDisplayedForWishlist() {
        SoftAssert soft= new SoftAssert();
        soft.assertTrue(home.successWishlistMessage().isDisplayed());

        String expColor ="#4bb07a";
        String actColor = home.successWishlistMessageColor().getCssValue("background-color");
        String hexcolor=Color.fromString(actColor).asHex();

        soft.assertEquals(hexcolor,expColor);
        soft.assertAll();
    }

    @When("success message dissapears")
    public void successMessageDissapears() {
    wait.until(ExpectedConditions.invisibilityOf(home.successWishlistMessage()));
    }

    @And("user goes to wishlist page")
    public void userGoesToWishlistPage() {
    home.wishlistButton().click();
    }

    @Then("Qty is bigger than {string}")
    public void qtyIsBiggerThan(String qty) {
    String actQty=home.qtyItem().getAttribute("value");
        Assert.assertEquals(actQty,qty);

    }
}
