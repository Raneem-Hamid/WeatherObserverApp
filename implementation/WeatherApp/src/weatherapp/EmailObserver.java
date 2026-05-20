package weatherapp;

public class EmailObserver implements Observer {
    private String email;

    public EmailObserver(String email) {
        this.email = email;
    }

    @Override
    public void update(WeatherData data) {
        System.out.println("Sending email to " + email +
                " Current weather: " + data.getTemp() +
                "C (" + data.getDescription() + ")");
    } 
}