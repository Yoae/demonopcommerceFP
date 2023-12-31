package org.example.stepDefs;

import io.cucumber.java.en.Given;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import static org.example.stepDefs.Hooks.driver;


import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Random;

public class D05_hoverCategoriesStepDef {

    P03_homePage home = new P03_homePage();

    Random ran = new Random();
    int num = (ran.nextInt(0,3));
    public String subCategory;
    Actions actions = new Actions(driver);

    @Given("user hovers over a category")
    public void hover(){

        if (num == 0){
            actions.moveToElement(home.computersList().get(0)).perform();

        }
        if (num == 1) {
            actions.moveToElement(home.electronicsList().get(0)).perform();

        }
        if (num == 2) {
            actions.moveToElement(home.apparelsList().get(0)).perform();

        }

    }

    @When("user clicks on subcategory")
    public void userClicksOnSubcategory() {
        int number =(ran.nextInt(0,3));
        if (number==0 && num == 0){
            subCategory = home.desktops().get(0).getText().toLowerCase().trim();
            home.desktops().get(1).click();
        }
        if (number==1 && num == 0){
            subCategory = home.software().get(0).getText().toLowerCase().trim();
            home.software().get(1).click();
        }
        if (number==2 && num == 0){
            subCategory = home.notebooks().get(0).getText().toLowerCase().trim();
            home.notebooks().get(1).click();
        }
        if (number==0 && num == 1){
            subCategory = home.cameraPhoto().get(0).getText().toLowerCase().trim();
            home.cameraPhoto().get(0).click();
        }
        if (number==1 && num == 1){
            subCategory = home.cellPhones().get(0).getText().toLowerCase().trim();
            home.cameraPhoto().get(0).click();
        }
        if (number==2 && num == 1){
            subCategory = home.others().get(0).getText().toLowerCase().trim();
            home.others().get(0).click();
        }
        if (number==0 && num == 2){
            subCategory = home.shoes().get(0).getText().toLowerCase().trim();
            home.shoes().get(0).click();
        }
        if (number==1 && num == 2){
            subCategory = home.clothing().get(0).getText().toLowerCase().trim();
            home.clothing().get(0).click();
        }
        if (number==2 && num == 2){
            subCategory = home.accessories().get(0).getText().toLowerCase().trim();
            home.accessories().get(0).click();
        }

    }


    @Then("subcategory page appears with the title containing subcategory name")
    public void subcategoryPageAppearsWithTheTitleContainingSubcategoryName() {
        String title = home.pagestitle().toLowerCase().trim();
        Assert.assertTrue(title.contains(subCategory));
    }
}
