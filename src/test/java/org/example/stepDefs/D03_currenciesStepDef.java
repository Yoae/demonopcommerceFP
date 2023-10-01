package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.example.pages.P03_homePage;

public class D03_currenciesStepDef {
    P03_homePage home = new P03_homePage();
    @Given("user changes currency to euro")
    public void changecurrency(){
    home.changeCurrency().click();
    }

    @Then("all prices changes to euro")
    public void allPricesChangesToEuro() {

        for (int i = 0;i<4;i++){
            String priceText = home.priceTag().get(i).getText();
            Assert.assertTrue(priceText.contains("€"));
        }

    }
}
