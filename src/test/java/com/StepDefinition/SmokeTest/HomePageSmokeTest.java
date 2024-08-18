package com.StepDefinition.SmokeTest;

import com.Pages.GitHubHomePage;
import com.TestManager.ManageDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class HomePageSmokeTest {
    ManageDriver manageDriver;
    GitHubHomePage gitHubHomePage;

    public HomePageSmokeTest(ManageDriver manageDriver) {
        this.manageDriver = manageDriver;
    }

    @Given("User is on GitHub HomePage")
    public void user_is_on_git_hub_home_page() {
        manageDriver.driver.get("https://github.com/");
    }

    @When("User is able see Product button")
    public void user_is_able_see_product() {
        gitHubHomePage = new GitHubHomePage(manageDriver.driver);
        gitHubHomePage.ProductButtonIsDisplayed();

    }

    @When("User is able see Solutions button")
    public void user_is_able_see_solutions_button() {
        gitHubHomePage.SolutionsButtonIsDisplayed();
    }

    @When("User is able see Resources button")
    public void user_is_able_see_resources_button() {
        gitHubHomePage.ResourcesButtonIsDisplayed();
    }

    @When("User is able see Open Source button")
    public void user_is_able_see_open_source_button() {
        gitHubHomePage.OpenSourceButtonIsDisplayed();
    }

    @When("User is able see Enterprise button")
    public void user_is_able_see_enterprise_button() {
        gitHubHomePage.EnterpriseButtonIsDisplayed();
    }

    @When("User is able see Pricing button")
    public void user_is_able_see_pricing_button() {
        gitHubHomePage.PricingButtonIsDisplayed();
    }

    @When("User is able see SearchBar button")
    public void user_is_able_see_search_bar_button() {
        gitHubHomePage.SearchBarIsDisplayed();
    }

    @When("User is able see Sign-In button")
    public void user_is_able_see_sign_in_button() {
        gitHubHomePage.SignInButtonIsDisplayed();
    }

    @When("User is able see Sign-Up button")
    public void user_is_able_see_sign_up_button() {
        gitHubHomePage.SignUpButtonIsDisplayed();
    }

}
