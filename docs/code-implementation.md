# WeatherApp Code Implementation

## Overview
WeatherApp implements the **Observer Pattern** to notify multiple observers whenever weather data changes. This document explains the code structure in detail.

---

## Classes

### WeatherService
- **Purpose**: Fetch weather data and notify observers.
- **Fields**:
  - `List<Observer> observers`: Holds registered observers.
  - `WeatherData lastData`: Last weather data fetched.
  - `String API_KEY`, `String CITY`: Configurable through `config.properties`.
- **Methods**:
  - `subscribe(Observer obs)`: Adds an observer.
  - `unsubscribe(Observer obs)`: Removes an observer.
  - `fetchWeather()`: Fetches weather from API, parses JSON, updates lastData.
  - `notifyObservers()`: Calls `update()` on all observers.
  - `parseWeather(String json)`: Converts JSON into WeatherData object and triggers notifications if changed.

### WeatherData
- **Purpose**: Holds temperature and description.
- **Fields**:
  - `double temp`
  - `String description`
- **Methods**:
  - Getters for temp and description.

### Observer (Interface)
- **Purpose**: Defines the contract for observers.
- **Method**:
  - `update(WeatherData data)`

### ConsoleObserver
- **Purpose**: Prints weather updates to console.
- **Method**:
  - `update(WeatherData data)`

### EmailObserver
- **Purpose**: Simulates sending weather updates via email.
- **Method**:
  - `update(WeatherData data)`

---

## Workflow

1. `WeatherService` is initialized and loads API_KEY and CITY from config.
2. Observers are subscribed to WeatherService.
3. `fetchWeather()` retrieves data from API.
4. JSON data is parsed to `WeatherData`.
5. If data differs from `lastData`, `notifyObservers()` is called.
6. Each observer executes its `update()` method to process the new data.
7. This process repeats periodically or on user trigger.

---

## Notes
- Decoupling: Observers and WeatherService are loosely coupled.
- Extensibility: Adding new observer types requires no modification to WeatherService.