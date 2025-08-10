
# Test Automation framework

Description : 
This project is a **Java-based automation testing framework** built to provide reliable and scalable automated testing across local and cloud-based environments. It uses **TestNG** for test orchestration, supports **data-driven testing** with CSV, Excel, and JSON files, and integrates with **LambdaTest** for cloud execution. The framework supports **headless mode** for faster testing and generates rich HTML reports and detailed logs to track execution results.

## Author
Abhijit Naik

Email - naikabhijit9005@gmail.com

## Tech tack
Programming Language : Java - 11
## Prerequisites

Java 11

Maven 

Download link - https://maven.apache.org/download.cgi
## Features

- **Java 11** based framework
- **TestNG** for test execution
- **Data-driven testing** using:
  - OpenCSV
  - Gson
  - Apache POI
- **Faker library** for generating dynamic fake data
- **LambdaTest** integration for cloud-based execution
- **Headless browser** support for faster execution
- **CLI support** via Maven Surefire Plugin
- **HTML report** generation using Extent Reports
- **Logging** using Log4j

## Tech Stack

| Category                 | Technology / Tool                  | Purpose                                         |
| ------------------------ | ---------------------------------- | ----------------------------------------------- |
| **Programming Language** | Java 11                            | Core language used for developing the framework |
| **Build Tool**           | Maven                              | Dependency management and test execution        |
| **Testing Framework**    | TestNG                             | Test structure, execution, and assertions       |
| **Data-Driven Testing**  | OpenCSV, Apache POI, Gson          | Read test data from CSV, Excel, and JSON files  |
| **Test Data Generation** | Java Faker                         | Create dynamic and realistic fake test data     |
| **Cloud Execution**      | LambdaTest                         | Run tests on cloud-based browsers               |
| **Browser Automation**   | Selenium WebDriver                 | Interact with web elements and browser          |
| **Headless Execution**   | Chrome Headless / Firefox Headless | Faster execution without GUI                    |
| **Logging**              | Log4j                              | Capture and store execution logs                |
| **Reporting**            | Extent Reports                     | Generate interactive and detailed HTML reports  |
| **CLI Test Execution**   | Maven Surefire Plugin              | Run tests from the command line with parameters |



## How to run the Project?
How to run the project?
You can run the project on local system for that :

**Clone the the project on local system** : git clone https://github.com/AbhijitNaik05/Automation_Assignment.git

cd Automation_Assignment

**Run Locally (Headless Mode)**

mvn clean test -Dbrowser=chrome -DisLambdaTest=false -DisHeadless=true

**Run on LambdaTest**

mvn clean test -Dbrowser=chrome -DisLambdaTest=true -DisHeadless=false

**Reports & Logs**
After execution:

- Test Report: reports/report.html

- Logs: logs/automation.log

**Integrated Github Actions**

This automation framework integrated with Github actions. This framework will executed on everyday at 11.30 IST. 

The report is archived in gh-pages branch. 
You can view the html report 
https://abhijitnaik05.github.io/Automation_Assignment/report.html#
