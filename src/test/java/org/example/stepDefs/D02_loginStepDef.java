package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();

    @Given("user go to login page")
    public void usergotologinpage(){
    login.goToLoginPage().click();
    }

    @When("user login with {string}{string} and {string}")
    public void userLoginWithAnd(String bool, String email, String password) {
        login.email().sendKeys(email);
        login.password().sendKeys(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {
        login.loginButton().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert soft = new SoftAssert();

        soft.assertEquals(login.getCurrentUrl(),"https://demo.nopcommerce.com/");

        soft.assertTrue(login.myaccount().isDisplayed());

        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(login.errorMessage().getText().contains("Login was unsuccessful"));

        String actualColor = login.errorMessage().getCssValue("color");
        String hexcolor = Color.fromString(actualColor).asHex();
        soft.assertEquals(hexcolor,"#e4434b");

        soft.assertAll();
    }
}
