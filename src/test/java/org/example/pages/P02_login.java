package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefs.Hooks.driver;
public class P02_login {
    public WebElement goToLoginPage(){return driver.findElement(By.className("ico-login"));}
    public WebElement email(){return driver.findElement(By.id("Email"));}
    public WebElement password(){return driver.findElement(By.id("Password"));}
    public WebElement loginButton(){return driver.findElement(By.className("login-button"));}
    public String getCurrentUrl(){return driver.getCurrentUrl();}
    public WebElement myaccount(){return driver.findElement(By.className("ico-account"));}
    public WebElement errorMessage(){return driver.findElement(By.className("message-error"));}
}
