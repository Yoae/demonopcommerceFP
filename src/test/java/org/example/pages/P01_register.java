package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.Hooks.driver;
public class P01_register {
    public WebElement registerlink (){
    return driver.findElement(By.className("ico-register"));
    }
    public WebElement gendertype(){return driver.findElement(By.id("gender-male"));}
    public WebElement firstname(){return driver.findElement(By.id("FirstName"));}
    public WebElement lastName(){return driver.findElement(By.id("LastName"));}
    public WebElement dayOfBirth(){return driver.findElement(By.xpath("//option[text()=\"9\"]"));}
    public WebElement monthOfBirth(){return driver.findElement(By.xpath("//option[text()=\"March\"]"));}
    public WebElement yearOfBirth(){return driver.findElement(By.xpath("//option[text()=\"1932\"]"));}
    public WebElement email(){return driver.findElement(By.id("Email"));}
    public WebElement password(){return driver.findElement(By.id("Password"));}
    public WebElement confirmPassword(){return driver.findElement(By.id("ConfirmPassword"));}
    public WebElement registerButton(){return driver.findElement(By.id("register-button"));}

    public WebElement successMessage(){return driver.findElement(By.className("result"));}
}
