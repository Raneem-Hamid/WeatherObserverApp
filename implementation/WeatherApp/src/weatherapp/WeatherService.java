package weatherapp;
import java.net.*;
import java.io.*;
import java.util.*;
import com.google.gson.*;

public class WeatherService {
    private List<Observer> observers = new ArrayList<>();
    private WeatherData lastData;

    private final String API_KEY = "3b0cc76cd560f79ec6fb6ef6a21f1a31";
    private final String CITY = "Amman";

    public void subscribe(Observer obs) {
        observers.add(obs);
    }

    public void unsubscribe(Observer obs) {
        observers.remove(obs);
    }

    private void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(lastData);
        }
    }

    public void fetchWeather() {
        try {
            String urlStr = "http://api.openweathermap.org/data/2.5/weather?q="
                    + CITY + "&units=metric&appid=" + API_KEY;

            URL url = new URL(urlStr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(conn.getInputStream(), "UTF-8")
                );

                StringBuilder content = new StringBuilder();
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
                in.close();

                parseWeather(content.toString());
            } else {
                System.out.println("Error connecting: Response code " + responseCode);
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private void parseWeather(String json) {
        JsonObject root = JsonParser.parseString(json).getAsJsonObject();

        double temp = root.getAsJsonObject("main").get("temp").getAsDouble();
        String desc = root.getAsJsonArray("weather")
                .get(0).getAsJsonObject().get("description").getAsString();

        WeatherData newData = new WeatherData(temp, desc);

        if (lastData == null || newData.getTemp() != lastData.getTemp() ||
                !newData.getDescription().equals(lastData.getDescription())) {
            lastData = newData;
            notifyObservers();
        }
    }
}