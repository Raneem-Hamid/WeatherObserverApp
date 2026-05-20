/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weatherapp;

/**
 *
 * @author Student
 */
public class WeatherData {
   
     private double temp;
    private String description;

    public WeatherData(double temp, String description) {
        this.temp = temp;
        this.description = description;
    }

    public double getTemp() {
        return temp;
    }

    public String getDescription() {
        return description;
    }
}

