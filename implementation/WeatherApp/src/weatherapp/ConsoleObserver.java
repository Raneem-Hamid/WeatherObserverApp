package weatherapp;

public class ConsoleObserver implements Observer {
    private String name;

    public ConsoleObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(WeatherData data) {
        System.out.println("[" + name + "] Weather Update:");
        System.out.println("Temperature: " + data.getTemp() + "C");
        System.out.println("Description: " + data.getDescription());
        System.out.println("---------------------------");
    }
}