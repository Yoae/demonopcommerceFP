package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;



public class D01_registerStepDef {

    P01_register register = new P01_register();
    @Given("user go to register page")
    public void goRegisterPage(){
        register.registerlink().click();

    }

    @When("user selects gender type")
    public void userSelectsGenderType() {
        register.gendertype().click();
    }

    @And("user enters first name {string} and last name {string}")
    public void userEntersFirstNameAndLastName(String firstname, String lastname) {
    register.firstname().sendKeys(firstname);
    register.lastName().sendKeys(lastname);
    }

    @And("user enters birth of date")
    public void userEntersBirthOfDate() throws InterruptedException {
        Select dayOfBirth = new Select(register.dayOfBirth());
        Select monthOfBirth = new Select(register.monthOfBirth());
        Select yearOfBirth = new Select(register.yearOfBirth());
        dayOfBirth.selectByIndex(17);
        monthOfBirth.selectByIndex(1);
        yearOfBirth.selectByValue("2002");
        Thread.sleep(3000);
    }

    @And("user enters email {string} field")
    public void userEntersEmailField(String email) {
        register.email().sendKeys(email);
    }

    @And("user fills Password fields {string}{string}")
    public void userFillsPasswordFields(String password, String cPassword) {
        register.password().sendKeys(password);
        register.confirmPassword().sendKeys(cPassword);
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.registerButton().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert soft = new SoftAssert();

        soft.assertTrue(register.successMessage().getText().contains("Your registration completed"));

        String actualColor = register.successMessage().getCssValue("color");
        String hexColor = Color.fromString(actualColor).asHex();
        soft.assertEquals(hexColor,"#4cb17c");
        soft.assertAll();
    }
}
