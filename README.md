# 🌤️ WeatherApp

# 📦 Submission Files

## 📄 Documentation Files

| Document | Link |
|---|---|
| Scenario | [scenario.md](docs/scenario.md) |
| Problem Analysis | [problem-analysis.md](docs/problem-analysis.md) |
| Trade-offs | [trade-offs.md](docs/trade-offs.md) |
| Pattern Justification | [pattern-justification.md](docs/pattern-justification.md) |
| Code Implementation Explanation | [code-implementation.md](docs/code-implementation.md) |
| UML Description | [uml-description.md](docs/UMLDocumentation.md) |
| Contribution Log | [contribution-log.md](docs/contribution-log.md) |

---

## 📊 UML Diagram

[Open UML Diagram](uml/uml.png)

---

## 🎞️ Presentation Slides

[Open Presentation](presentation/weather.pdf)

---

## 💻 Source Code

### Main Source Folder

[Open Source Code Folder](implementation/WeatherApp/src/weatherapp)

---

# 📌 Overview

**WeatherApp** is a Java application that fetches real-time weather information using the OpenWeatherMap API. The app uses the **Observer Pattern** to notify multiple observers when weather data changes.

Observers include:

- **ConsoleObserver** → prints updates to console  
- **EmailObserver** → simulates email notifications

---

# 🎯 Project Objective

The main objectives:

- Demonstrate Observer Pattern in real-time notifications  
- Decouple WeatherService from observers  
- Support multiple observers with easy addition/removal  
- Maintain modular, extensible, and maintainable code

---

# 🧠 Design Pattern Used

## ✅ Observer Pattern

### 🔹 Subject
`WeatherService` – fetches weather and notifies observers

### 🔹 Observer Interface
`Observer` – defines `update(WeatherData data)`

### 🔹 Concrete Observers
- `ConsoleObserver` – prints to console  
- `EmailObserver` – simulates email notifications

### 🔹 Data Object
`WeatherData` – stores temperature and description passed to observers

---

# 👥 Team Members

- Raneem Hamid
- Rahaf Atmah
- Sidra Wali

---

# ⚙️ Project Management

The project was organized and tracked using GitHub Project tools:

- [Project](https://github.com/users/Raneem-Hamid/projects/6/views/1) 

These tools were used to:

- Track progress
- Manage tasks
- Organize team workflow
- Ensure project completion
