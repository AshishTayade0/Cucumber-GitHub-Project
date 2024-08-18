package com.Pages;

import com.PageUtils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GitHubLoginPage {
    protected static WebDriver driver;

    public GitHubLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By userNameTextBox = By.name("login");
    private final By passWordTextBox = By.name("password");
    private final By signInButton = By.xpath("//input[@value='Sign in']");
    private final By errorMessage = By.xpath("//div[contains(text(),'Incorrect username or password')]");

    public void usernameSendKeys(String username) {
        WaitUtils.waitForElementToBeVisible(driver, userNameTextBox, 5);
        driver.findElement(userNameTextBox).sendKeys(username);}

    public void passwordSendKeys(String password) {
        driver.findElement(passWordTextBox).sendKeys(password);
    }

    public void signInButtonClick() {
        driver.findElement(signInButton).click();
    }

    public boolean errorMessageIsDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
    }

}
