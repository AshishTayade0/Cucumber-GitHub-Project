Automated Testing Framework

Welcome to the Automated Testing Framework- BDD repository! This project is designed to facilitate automated testing of web applications using various tools and methodologies. Below you'll find details about the tools used, project management, reporting, and sample tests.

Tools Used
Cucumber: Used for Behavior-Driven Development (BDD). It allows us to write test scenarios in plain language and map them to code.
Selenium: Provides the core automation capabilities for interacting with web elements.
Java: The programming language used for writing test scripts and framework logic.
TestNG: A testing framework that provides various annotations and features for test management and execution.

Project Management Tool
Maven: Manages project dependencies and build processes. It follows the Page Object Model (POM) design pattern to ensure a clean and maintainable test suite.
Reporting
HTML Reports: Provides a comprehensive view of test execution results in a user-friendly format.
JSON Reports: Useful for data interchange and integration with other tools or services.
Extent Report: Generates detailed and visually appealing HTML and PDF reports that offer insights into test execution and outcomes.
Sample Tests
GitHub HomePage Test
The test verifies basic functionalities on the GitHub homepage. It ensures that elements like the search bar, navigation menu, and login link are present and interactable.

GitHub Login Page Test
The test focuses on the login functionality of GitHub. It checks the presence of login fields, validates the login process, and handles any error messages.

Getting Started
Prerequisites
Before running the tests, ensure you have the following installed:

Java Development Kit (JDK) 8 or higher
Apache Maven
Selenium WebDriver
Cucumber
Setup
Clone the Repository:

bash
Copy code
git clone [https://github.com/yourusername/your-repo-name.git](https://github.com/AshishTayade0/Cucumber-GitHub-Project.git)
cd your-repo-name
Install Dependencies:

Run the following command to download and install the necessary dependencies:

bash
Copy code
mvn clean install
Configure WebDriver:

Ensure that you have the appropriate WebDriver binaries (e.g., ChromeDriver for Chrome, GeckoDriver for Firefox) available in your system's PATH.

Run Tests:

Execute the tests using Maven:

bash
Copy code
mvn test
For generating reports, use:

bash
Copy code
mvn surefire-report:report
Directory Structure
src/test/java: Contains the test classes and step definitions.
src/test/resources: Holds the feature files written in Gherkin syntax.
pom.xml: Maven configuration file that includes dependencies and plugin configurations.
Contributing
Feel free to contribute to this project by creating pull requests or opening issues. For any major changes, please open an issue first to discuss what you would like to change.
