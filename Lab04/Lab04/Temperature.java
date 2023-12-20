
public class Temperature{
    public static double celsiusToFahrenheit(double celsius){
        double cel = celsius; //created a local variable
        double fahrenheit = (9.0/5.0) * cel + 32;
        return fahrenheit;
    }
    public static double celsiusToKelvin(double celsius){
        double kelvin = celsius + 273.15; //using the parameter as variable
        return kelvin;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9.0) * (fahrenheit - 32);
        return celsius;
    }
    public static double fahrenheitToKelvin(double fahrenheit){
        double kelvin = (5.0/9.0) * (fahrenheit + 459.67);
        return kelvin;
    }
    public static double kelvinToFahrenheit(double kelvin){
        double fahrenheit = (9.0/5.0) * kelvin - 459.67;
        return fahrenheit;
    }
    public static double kelvinToCelsius(double kelvin){
        return kelvin - 273.15;
    }
}