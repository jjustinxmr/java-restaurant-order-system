# Restaurant Order Management System

A console-based Restaurant Order Management System developed in Java. This project demonstrates core Object-Oriented Programming (OOP) concepts, order processing logic, and custom automated unit testing.

---

## Project Overview

This is my first Java project, created during my 2nd year as an Information Technology student. The main objective is to apply theoretical OOP concepts into a practical application while practicing software quality assurance principles through automated testing.

---

## Features

- **Menu Management**: Manage food and beverage items along with their categories and prices.
- **Table & Order Processing**: Assign orders to specific tables and calculate item totals.
- **Bill Calculation**: Compute subtotal, apply order items, and calculate final bills accurately.
- **Automated Unit Testing**: Integrated unit tests to verify core business logic and edge cases.

---

## Tech Stack & Prerequisites

- **Language**: Java (JDK 8 or higher)
- **Paradigm**: Object-Oriented Programming (OOP)
- **Testing Framework**: Custom JUnit 5 Test Suite (`TestCase.java`)
- **IDE**: Eclipse IDE

---

## Project Structure

```text
.
├── src/
│   └── Project/
│       ├── MainProgram.java     # Main application entry point
│       ├── TestCase.java        # Automated unit test cases
│       ├── Menu.java            # Menu entity class
│       ├── Order.java           # Order entity and calculation logic
│       ├── OrderItem.java       # Order item entity
│       ├── Restaurant.java      # Restaurant management class
│       └── Table.java           # Table entity class
├── docs/
│   └── testcase_restaurant.xlsx # Test execution matrix (Pass/Fail results)
├── .gitignore                   # Files excluded from version control
├── LICENSE                      # Open-source license
└── README.md                    # Project documentation
```

---

## How to Run

### Option 1: Running in an IDE (Eclipse / IntelliJ)

1. Import the project into your IDE.
2. Open `MainProgram.java` and click **Run** to execute the main application.
3. Open `TestCase.java` and click **Run as JUnit Test** to execute the test suite.

### Option 2: Running via Terminal / Command Prompt

Run all commands from the root folder of the project. A JDK (not just a JRE) is required.

**1. Run the Main Application**

Compile the source files into an `out` folder and run `Project.MainProgram`:

```bash
javac -d out src/Project/Menu.java src/Project/OrderItem.java src/Project/Order.java src/Project/Table.java src/Project/Restaurant.java src/Project/MainProgram.java
java -cp out Project.MainProgram
```

**2. Run the Unit Tests (JUnit 5)**

Download the [JUnit Platform Console Standalone](https://mvnrepository.com/artifact/org.junit.platform/junit-platform-console-standalone) jar and place it in the project root folder, then compile and run (replace `1.x.x` with the version you downloaded):

```bash
javac -d out -cp junit-platform-console-standalone-1.x.x.jar src/Project/*.java
java -jar junit-platform-console-standalone-1.x.x.jar --class-path out --select-class Project.TestCase
```

---

## Software Testing & QA Documentation

Detailed test case scenarios, boundary tests, edge cases, and execution Pass/Fail results can be found in the documentation folder:

- **Test Execution Matrix**: [docs/testcase_restaurant.xlsx](docs/testcase_restaurant.xlsx)
