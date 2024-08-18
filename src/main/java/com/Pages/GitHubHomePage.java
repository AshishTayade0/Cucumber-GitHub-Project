package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GitHubHomePage {
    protected static WebDriver driver;

    public GitHubHomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By Product = By.xpath("//button[contains(text(),'Product')]");
    private final By Solutions = By.xpath("//button[contains(text(),'Solutions')]");
    private final By Resources = By.xpath("//button[contains(text(),'Resources')]");
    private final By OpenSource  = By.xpath("//button[contains(text(),'Open Source')]");
    private final By Enterprise = By.xpath("//button[contains(text(),'Enterprise')]");
    private final By Pricing = By.xpath("//*[text()='Pricing']");
    private final By SearchBar = By.xpath("//span[@class='flex-1']");
    private final By SignIn  = By.xpath("//div[@class='position-relative HeaderMenu-link-wrap d-lg-inline-block']/*[contains(text(),'Sign in')]");
    private final By SignUp  = By.xpath("//*[contains(text(),'Sign up')]");


    public boolean ProductButtonIsDisplayed(){
        return driver.findElement(Product).isDisplayed();
    }
    public boolean SolutionsButtonIsDisplayed(){
        return driver.findElement(Solutions).isDisplayed();
    }
    public boolean ResourcesButtonIsDisplayed(){
        return driver.findElement(Resources).isDisplayed();
    }
    public boolean OpenSourceButtonIsDisplayed(){
       return driver.findElement(OpenSource).isDisplayed();
    }
    public boolean EnterpriseButtonIsDisplayed(){
        return driver.findElement(Enterprise).isDisplayed();
    }
    public boolean PricingButtonIsDisplayed(){
        return driver.findElement(Pricing).isDisplayed();
    }
    public boolean SearchBarIsDisplayed(){
        return driver.findElement(SearchBar).isDisplayed();
    }
    public boolean SignInButtonIsDisplayed(){
        return driver.findElement(SignIn).isDisplayed();
    }
    public boolean SignUpButtonIsDisplayed(){
        return driver.findElement(SignUp).isDisplayed();
    }

    //Actions
    public GitHubLoginPage clickOnSignInButton(){
        driver.findElement(SignIn).click();
        return new GitHubLoginPage(driver);
    }

}
