# Problem Analysis: WeatherApp

## Problem
We need a system that fetches weather data from an external API and updates multiple parts of an application (console, email, etc.) whenever the weather changes. 

## Challenges
- Avoid tight coupling between the data-fetching component and notification components.
- Ensure that new notification types can be added easily.
- Manage repeated API calls efficiently and only notify on changes.
- Handle network errors or invalid API responses gracefully.

## Requirements
- Fetch weather data for a configurable city.
- Support multiple observers (console, email, etc.).
- Only notify observers when data changes.
- Allow dynamic addition and removal of observers.