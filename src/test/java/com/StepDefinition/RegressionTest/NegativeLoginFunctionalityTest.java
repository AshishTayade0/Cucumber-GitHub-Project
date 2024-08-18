package com.StepDefinition.RegressionTest;

import com.Pages.GitHubHomePage;
import com.Pages.GitHubLoginPage;
import com.TestManager.ManageDriver;
import com.PageUtils.WaitUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NegativeLoginFunctionalityTest {
    ManageDriver manageDriver;
    GitHubHomePage gitHubHomePage;
    GitHubLoginPage gitHubLoginPage;
    WaitUtils waitUtils;

    public NegativeLoginFunctionalityTest(ManageDriver manageDriver) {
        this.manageDriver = manageDriver;
    }

    @When("User click on Sign-In button from HomePage")
    public void user_click_on_sign_in_button_from_home_page(){
        gitHubHomePage = new GitHubHomePage(manageDriver.driver);
        gitHubLoginPage = gitHubHomePage.clickOnSignInButton();
    }

    @When("^User enters username as (.*)$")
    public void user_enters_username(String username) {
        gitHubLoginPage.usernameSendKeys(username);
    }

    @When("^User enters password as (.*)$")
    public void user_enters_password(String password) {
        gitHubLoginPage.passwordSendKeys(password);
    }

    @When("User click on SignIn Button")
    public void user_click_on_sign_in_button() {
        gitHubLoginPage.signInButtonClick();
    }
    @Then("User gets error message")
    public void user_gets_error_message() {
        gitHubLoginPage.errorMessageIsDisplayed();
    }

}
