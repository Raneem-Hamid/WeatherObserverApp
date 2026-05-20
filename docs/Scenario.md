# Scenario: WeatherApp User Flow

## Actors
- **WeatherService**: Retrieves weather data from the API.
- **Observers**: Components that receive notifications (ConsoleObserver, EmailObserver).
- **User**: Registers observers and observes weather updates.

## Description
This scenario describes how a user interacts with WeatherApp to track weather changes.

---

### Step 1: Initialize the Application
1. User opens the WeatherApp.
2. WeatherService instance is created and prepares internal observer list.

---

### Step 2: Add Observers
1. User creates observers:
   - `ConsoleObserver` for console output.
   - `EmailObserver` for email notifications.
2. Observers are registered using `WeatherService.subscribe(observer)`.

---

### Step 3: Fetch Weather
1. User triggers the fetch manually or it happens periodically.
2. WeatherService retrieves data from OpenWeatherMap API.

---

### Step 4: Detect Changes
1. WeatherService compares new data with the last known weather.
2. If changes are detected, it triggers notifications to all observers.

---

### Step 5: Observer Notification
1. Each observer executes its `update()` method:
   - ConsoleObserver prints the updated weather.
   - EmailObserver simulates sending an email.

---

### Step 6: Continuous Monitoring
1. WeatherService continues fetching periodically or on demand.
2. New observers can be added or removed dynamically.