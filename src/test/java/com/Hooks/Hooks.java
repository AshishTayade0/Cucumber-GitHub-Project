package com.Hooks;

import com.TestManager.ManageDriver;
import com.Utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Hooks {
    private ManageDriver manageDriver;
    ConfigReader configReader;
    Properties prop;
    String browserName;

    public Hooks(ManageDriver manageDriver) {
        this.manageDriver = manageDriver;
    }

    @Before(order = 0)
    public void getProperty() {
        configReader = new ConfigReader();
        prop = configReader.init_prop();
        browserName = prop.getProperty("browser");
    }

    @Before(order = 1)
    public void  initBrowser() {
        if (browserName.endsWith("chrome")) {
            manageDriver.driver = new ChromeDriver();
            manageDriver.driver.manage().deleteAllCookies();
            manageDriver.driver.manage().window().maximize();
        }
        else if (browserName.endsWith("firefox")) {
            manageDriver.driver = new FirefoxDriver();
            manageDriver.driver.manage().deleteAllCookies();
            manageDriver.driver.manage().window().maximize();
        }  else {
            System.out.println("Browser is not available. Please install it first");
        }
    }


    @After()
    public void failScenarioScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            String scenarioName = scenario.getName().replaceAll(" ", "_") + ".png";
            File screenshotFile = ((TakesScreenshot) manageDriver.driver).getScreenshotAs(OutputType.FILE);
            try {
                // Specify the path where you want to save the screenshot
                Files.copy(screenshotFile.toPath(), Paths.get("screenshots", scenarioName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        manageDriver.driver.quit();
    }
}
