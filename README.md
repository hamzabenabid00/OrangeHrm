# 🧪 OrangeHRM Test Automation Framework

![Java](https://img.shields.io/badge/Java-17-orange)
![Selenium](https://img.shields.io/badge/Selenium-4.49.0-green)
![Cucumber](https://img.shields.io/badge/Cucumber-7.34.9-brightgreen)
![JUnit](https://img.shields.io/badge/JUnit-4.13.2-red)
![Maven](https://img.shields.io/badge/Maven-3.x-blue)
![ExtentReports](https://img.shields.io/badge/Reports-ExtentReports-purple)

## 📌 About the Project

This project is an automated testing framework for the **OrangeHRM web application**.

The objective of this project is to automate functional test scenarios using **Selenium WebDriver, Java, Cucumber, JUnit, Maven, and Page Object Model (POM)**.

The framework is designed to produce readable BDD test scenarios and detailed HTML test reports.

---

## 🛠️ Technologies & Tools

| Technology            | Purpose                           |
| --------------------- | --------------------------------- |
| ☕ Java 17             | Programming language              |
| 🌐 Selenium WebDriver | Web browser automation            |
| 🥒 Cucumber           | BDD / Gherkin test scenarios      |
| 🧪 JUnit 4            | Test execution                    |
| 📦 Maven              | Dependency and project management |
| 📊 ExtentReports      | Test reporting                    |
| 🖥️ Microsoft Edge    | Test browser                      |
| 🏗️ Page Object Model | Test architecture                 |

---

## 🏗️ Project Structure

```text
OrangeHRM
│
├── src
│   └── test
│       ├── java
│       │   ├── Pages
│       │   │   ├── LoginPage.java
│       │   │   └── HomePage.java
│       │   │
│       │   ├── StepDef
│       │   │   ├── CommunStepDef.java
│       │   │   └── HomepageStepDef.java
│       │   │
│       │   ├── Runner
│       │   │   └── Runner.java
│       │   │
│       │   └── Helper
│       │       ├── Config.java
│       │       └── Utlis.java
│       │
│       └── resources
│           ├── features
│           │   └── Homepage.feature
│           │
│           └── extent.properties
│
├── pom.xml
└── README.md
```

---

## 🧪 Testing Approach

The project uses **BDD (Behavior Driven Development)** with Cucumber.

Test scenarios are written using Gherkin syntax:

```gherkin
Feature: OrangeHRM Homepage

Scenario Outline: Access each menu of the homepage

Given user is connected with the correct username and password
When user clicks on the "<menu>" menu
Then the "<menu>" page is displayed
```

This approach makes the test scenarios easy to understand for both technical and non-technical team members.

---

## 🔍 Automated Test Coverage

The current automation focuses on the OrangeHRM homepage and navigation.

Examples of tested menus include:

* ✅ Admin
* ✅ My Info
* ✅ Performance
* 🔄 Additional OrangeHRM modules can be added

The framework can be extended to cover:

* Login
* Dashboard
* Admin
* PIM
* Leave
* Time
* Recruitment
* My Info
* Performance
* Employee Management

---

## 🧱 Framework Architecture

The project follows the **Page Object Model (POM)** architecture.

```text
Feature Files
      ↓
Step Definitions
      ↓
Page Objects
      ↓
Selenium WebDriver
      ↓
OrangeHRM Application
```

### Page Objects

Page classes contain the elements and actions related to a specific application page.

For example:

```java
LoginPage
HomePage
```

This keeps test logic separated from Selenium locators and makes the framework easier to maintain.

---

## 📸 Failure Screenshots

When a Cucumber scenario fails, the framework automatically captures a screenshot.

The screenshot is attached to the Cucumber scenario:

```java
if (scenario.isFailed()) {

    byte[] screenshot =
        ((TakesScreenshot) Config.driver)
        .getScreenshotAs(OutputType.BYTES);

    scenario.attach(
        screenshot,
        "image/png",
        "Failed Scenario Screenshot"
    );
}
```

This makes debugging failed tests easier.

---

## 📊 Test Reports

The project uses **ExtentReports with the Cucumber 7 adapter**.

The Spark HTML report provides:

* Test execution status
* Passed scenarios
* Failed scenarios
* Scenario steps
* Execution information
* Failure screenshots
* Browser information
* Selenium and Cucumber versions

The report is generated at:

```text
test-output/SparkReport/Spark.html
```

---

## ⚙️ Configuration

The ExtentReports configuration is stored in:

```text
src/test/resources/extent.properties
```

Example:

```properties
extent.reporter.spark.start=true
extent.reporter.spark.out=test-output/SparkReport/Spark.html

screenshot.dir=test-output/screenshots/
screenshot.rel.path=../screenshots/

systeminfo.os=Windows
systeminfo.browser=Edge
systeminfo.project=OrangeHRM
systeminfo.selenium=Selenium 4.49.0
systeminfo.cucumber=Cucumber 7.34.9
```

---

## 🚀 Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/hamzabenabid00/OrangeHrm.git
```

### 2. Open the project

Open the project using:

* Eclipse
* IntelliJ IDEA
* VS Code

### 3. Verify Java

The project uses:

```text
Java 17
```

### 4. Install Maven dependencies

Run:

```bash
mvn clean install
```

### 5. Run the tests

The Cucumber tests can be executed using the `Runner` class.

---

## 📦 Maven Dependencies

The project uses:

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.49.0</version>
</dependency>
```

```xml
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-java</artifactId>
    <version>7.34.9</version>
</dependency>
```

```xml
<dependency>
    <groupId>io.cucumber</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>7.34.9</version>
</dependency>
```

```xml
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
</dependency>
```

```xml
<dependency>
    <groupId>tech.grasshopper</groupId>
    <artifactId>extentreports-cucumber7-adapter</artifactId>
    <version>1.14.0</version>
</dependency>
```

---

## 🎯 Project Goals

The main goals of this project are to demonstrate practical experience with:

* Web UI automation
* Selenium WebDriver
* Java automation
* BDD with Cucumber
* Gherkin
* Page Object Model
* JUnit
* Maven
* Test reporting
* Failure screenshot handling
* Maintainable test automation architecture

---

## 🔮 Future Improvements

Planned improvements include:

* [ ] Expand OrangeHRM test coverage
* [ ] Improve ExtentReports dashboard
* [ ] Add more negative test scenarios
* [ ] Add data-driven testing
* [ ] Add parallel execution
* [ ] Add CI/CD with GitHub Actions
* [ ] Add API testing
* [ ] Add database validation
* [ ] Improve test data management

---

## 👨‍💻 Author

**Hamza Ben Abid**

QA Automation / Software Testing

GitHub:
https://github.com/hamzabenabid00

---

## ⭐ Project

If you find this project useful, feel free to give it a ⭐ on GitHub.
