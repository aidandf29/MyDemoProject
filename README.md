# 🚀 Stockbit QA Automation - Mobile & API

![Java](https://img.shields.io/badge/Java-11-blue)
![Maven](https://img.shields.io/badge/Maven-3.9.11-orange)
![Appium](https://img.shields.io/badge/Appium-3.1.0-purple)
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-green)
![Node](https://img.shields.io/badge/Node.js-20.x-lightgrey)
![Platform](https://img.shields.io/badge/Platform-Android_EMULATOR-success)

This repository contains automation scripts for both Mobile UI and API testing, created as part of Stockbit QA Engineer Technical Test.  
The project is designed with scalable structure, using Page Object Model (POM) + Cucumber BDD to ensure readability, maintainability, and professional QA engineering standards.

---

## 📌 **Scope Covered**

### 🎯 Mobile Automation (Appium + Cucumber)

- Platform: **Android Emulator (API 16 - Pixel)**
- App under test: `my-demo-app-android`
- **Test Scenario:**
  - Open app and navigate to product list
  - Select **Sauce Lab Back Packs**
  - Change **Color: Blue**
  - Set **Quantity: 2**
  - Add to cart and validate cart details

### 🌐 API Automation (Rest Assured / Java)

Using endpoint: `https://fakerapi.it/api/v1/companies`

- ✅ Test `?_quantity=20`, `?_quantity=5`, `?_quantity=1` → verify total data count
- ✅ Validate that **all `id` values are not null**
- ✅ Validate **JSON Schema** using `companies_schema.json`

---

## 🧰 **Tech Stack**

| Component            | Version / Tool                        |
| -------------------- | ------------------------------------- |
| Language             | Java 11                               |
| Build Tool           | Maven 3.9.11                          |
| Automation Framework | Cucumber (BDD)                        |
| Mobile Automation    | Appium 3.1.0                          |
| API Testing          | REST Assured                          |
| Emulator             | Android Virtual Device (Pixel API 16) |
| Node.js              | 20.19.4                               |

---

## 📁 **Project Structure**

```
stockbit-qa-automation
│
├── src/test/java
│   ├── features/             # Gherkin feature files (UI & API)
│   ├── StepDefinitions/      # Step definition mappings
│   ├── pages/                # Page Object Model for Appium
│   ├── hooks/                # Setup & teardown (Appium driver init)
│   ├── utils/                # Helpers, constants (optional)
│   └── schema/               # JSON schema for API validation
│   └── runner/               # Cucumber test runner
├── pom.xml                   # Maven dependencies
└── README.md
```

---

## ⚙️ **Setup & Installation**

### ✅ Prerequisites

Make sure the following are installed:

- Java 11
- Maven 3.9.11
- Node.js 20.x
- Appium Server (`npm install -g appium`)
- Android Emulator configured (Pixel API 16)
- Appium Inspector (optional, for locator debugging)

### ▶️ **How to Run**

#### **Start Appium Server**

```bash
appium
```

#### **Run Tests (UI or API)**

You can execute test scenarios by running via feature file or:

```bash
mvn test
```

---

## 🎥 Evidence (Optional for Reviewer)

A test execution video will be added for quick review.

---

## 📎 Notes

This project follows clean automation architecture, ensuring:

- No hardcoded waits (`Thread.sleep`) — using smart waits instead
- Scalable folder structure
- Clear separation of feature files & step logic
- Easy to extend with future scenarios
