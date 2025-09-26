package Tasks;


public class TemperatureConverter {

    public double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public boolean isExtremeTemperature(double celsius) {
        return celsius < -40 || celsius > 50;
    }

    public static void main(String[] args) {
        TemperatureConverter tc = new TemperatureConverter();
        System.out.println("Temperature Converter is working!");
        System.out.println("100°F to Celsius: " + tc.fahrenheitToCelsius(100));
        System.out.println("0°C to Fahrenheit: " + tc.celsiusToFahrenheit(0));
    }
}