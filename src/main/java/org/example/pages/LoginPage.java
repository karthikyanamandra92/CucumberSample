package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private By emailInputLocator = By.name("email");
    private By passwordInputLocator = By.name("password");
    private By loginButton = By.xpath("//input[@value='Login']");
    private By forgotPwdLink = By.linkText("Forgotten Password");

    public void enterEmail(String email){
        WebElement emailInput=driver.findElement(emailInputLocator);
        emailInput.sendKeys(email);
    }

    public void enterPassword(String pwd){
        WebElement pwdInput = driver.findElement(passwordInputLocator);
        pwdInput.sendKeys(pwd);
    }

    public void clickLoginButton(){
        WebElement loginBtn = driver.findElement(loginButton);
        loginBtn.click();
    }

    public void clickForgotPwdLink(){
        WebElement forgotPwdLnk = driver.findElement(forgotPwdLink);
        forgotPwdLnk.click();
    }

    public boolean checkLoginButton(){

        return driver.findElement(loginButton).isDisplayed();
    }
}
