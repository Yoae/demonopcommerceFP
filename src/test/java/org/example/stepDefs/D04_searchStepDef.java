package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {

    P03_homePage home = new P03_homePage();
    @Given("user search by products name or sku as {string}")
    public void clickOnSearchbox(String name){
        home.searchBox().sendKeys(name);
    }

    @When("user clicks on search button")
    public void userWritesProduct() {

        home.searchButton().click();
    }

    @Then("product page is displayed with {string} in the results")
    public void productPageIsDisplayed(String name) {
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(home.currentUrl().contains("https://demo.nopcommerce.com/search?q="));

        int results = home.productsBox().size();
        for (int i = 0;i < results; i++){
            String actualname = home.productsBox().get(i).getText().toLowerCase();
            soft.assertTrue(actualname.contains(name));
        }
        soft.assertAll();
    }

    @And("user clicks on product")
    public void userClicksOnProduct() {
        home.clickOnProduct().click();

    }

    @Then("product page is displayed with products sku as {string}")
    public void productPageIsDisplayedWithProductsSkuAs(String name) {

        Assert.assertEquals(home.productsName().getText(),name);
    }
}
