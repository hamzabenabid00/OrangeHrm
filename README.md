# 🧪 OrangeHRM Test Automation

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge\&logo=openjdk)
![Selenium](https://img.shields.io/badge/Selenium-4.49.0-green?style=for-the-badge\&logo=selenium)
![Cucumber](https://img.shields.io/badge/Cucumber-7.34.9-brightgreen?style=for-the-badge\&logo=cucumber)
![JUnit](https://img.shields.io/badge/JUnit-4.13.2-red?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-blue?style=for-the-badge\&logo=apachemaven)

## 📌 About

Web UI automation framework for **OrangeHRM**, built with **Java, Selenium WebDriver, Cucumber BDD, JUnit and Maven**.

The project follows the **Page Object Model (POM)** and includes automated failure screenshots and **ExtentReports**.

## 🛠️ Tech Stack

* ☕ Java 17
* 🌐 Selenium WebDriver
* 🥒 Cucumber / Gherkin
* 🧪 JUnit 4
* 📦 Maven
* 📊 ExtentReports
* 🌍 Microsoft Edge

## 🏗️ Architecture

```text
Feature Files
     ↓
Step Definitions
     ↓
Page Objects (POM)
     ↓
Selenium WebDriver
     ↓
OrangeHRM
     ↓
Assertions
     ↓
ExtentReports
```

## 📂 Project Structure

```text
src/test
├── java
│   ├── Helper
│   ├── Pages
│   ├── StepDef
│   └── Runner
│
└── resources
    ├── features
    └── extent.properties
```

## 🧪 Current Tests

Automated OrangeHRM navigation scenarios including:

* ✅ Admin
* ✅ My Info
* ✅ Performance
* ✅ Login

## 📸 Failure Screenshots

Screenshots are automatically captured when a Cucumber scenario fails and attached to the test report.

## 📊 Test Reports

ExtentReports generates an HTML report containing:

* ✅ Passed tests
* ❌ Failed tests
* 📋 Test steps
* 📸 Failure screenshots
* ⏱️ Execution information

Report:

```text
test-output/SparkReport/Spark.html
```

### Report Preview

*Add your real ExtentReports screenshot here.*

```text
docs/images/extent-report.png
```

## 🚀 Run the Tests

Clone the repository:

```bash
git clone https://github.com/hamzabenabid00/OrangeHrm.git
```

Install dependencies:

```bash
mvn clean install
```

Run the Cucumber `Runner` class.

## 🔮 Future Improvements

* [ ] Increase test coverage
* [ ] Data-driven testing
* [ ] Cross-browser testing
* [ ] Parallel execution
* [ ] GitHub Actions CI/CD
* [ ] API testing

## 👨‍💻 Author

**Hamza Ben Abid**

QA Automation / Software Testing

🔗 [GitHub](https://github.com/hamzabenabid00)

---

⭐ If you find this project useful, consider giving it a star.
