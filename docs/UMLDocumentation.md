# WeatherApp UML Flow Description

## Overview
This document describes the flow of the WeatherApp project according to the UML diagram. It focuses on the sequence of actions from initialization to observer notification.

---

## Flow Steps

### 1. Initialization
- `WeatherApp` (Main Class) creates an instance of `WeatherService`.
- `WeatherService` loads configuration values (`API_KEY` and `CITY`) from `config.properties`.
- `WeatherService` initializes an internal list of observers.

### 2. Observer Registration
- `WeatherApp` creates observer instances:
  - `ConsoleObserver` → prints updates to console.
  - `EmailObserver` → simulates sending email notifications.
- Observers are subscribed to `WeatherService` using `subscribe()`.
- UML shows an aggregation: `WeatherService` has many `Observer`s.

### 3. Fetching Weather
- `WeatherService.fetchWeather()` is called.
- An HTTP GET request is sent to the OpenWeatherMap API.
- API returns JSON containing temperature and description.
- UML represents this as a method inside `WeatherService`.

### 4. Parsing and Comparing Data
- `WeatherService.parseWeather(json)` parses JSON into a `WeatherData` object.
- New data is compared with `lastData`:
  - If unchanged → no notification.
  - If changed → notify observers.
- UML shows a dependency: `WeatherService` depends on `WeatherData`.

### 5. Notifying Observers
- `WeatherService.notifyObservers()` iterates over the observer list.
- Each observer executes `update(WeatherData)`:
  - `ConsoleObserver` prints updated weather.
  - `EmailObserver` prints simulated email notification.
- UML shows implementation: Observers implement `Observer` interface.

### 6. Continuous Updates
- The process repeats periodically or on-demand.
- New observers can be added or removed dynamically.
- UML emphasizes loose coupling: `WeatherService` does not know observer specifics.

---

## Summary
- Main class initializes service and observers.
- Service fetches and parses weather data.
- Service checks for changes and notifies observers.
- Observers handle updates independently.
- Observer pattern ensures flexibility and maintainability.