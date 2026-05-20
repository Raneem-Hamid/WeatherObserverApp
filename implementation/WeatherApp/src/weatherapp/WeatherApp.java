/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weatherapp;

/**
 *
 * @author Student
 */
public class WeatherApp {

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        WeatherService service = new WeatherService();

        // Create observers
        ConsoleObserver consoleObs = new ConsoleObserver("Console");
        EmailObserver emailObs = new EmailObserver("user@example.com");

        // Subscribe observers
        service.subscribe(consoleObs);
        service.subscribe(emailObs);

        // Fetch weather (this will notify observers automatically)
        service.fetchWeather();
    }
    
}
