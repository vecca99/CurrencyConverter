package temperatureConverter;

import javax.swing.*;

public class TemperatureConverter {
    public double ConvertCelsiusToFahrenheit(double value) {
        double fahrenheit = value * 1.8 + 32;
        fahrenheit = (double) Math.round(fahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, +value+ " Grados Celcius son " +fahrenheit+ " Grados Farenheit ");
        return fahrenheit;
    }

    public void ConvertCelsiusToKelvin(double value){
        double kelvin = value + 273.15;
        kelvin = (double) Math.round(kelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, +value+ " Grados Celcius son " +kelvin+ " Kelvin");
    }

    public void ConvertFahrenheitToCelsius(double value) {
        double celsius = (value - 32) / 1.8;
        celsius = (double) Math.round(celsius * 100d) / 100;
        JOptionPane.showMessageDialog(null, +value+ " Grados Farenheit son " +celsius+ " Celsius ");
    }

    public double ConvertKelvinToCelsius(double value) {
        double kelvinCelsius = value - 273.15;
        kelvinCelsius = (double) Math.round(kelvinCelsius * 100d) / 100;
        JOptionPane.showMessageDialog(null, +value+ " Kelvin son " +kelvinCelsius+ " Celsius");
        return kelvinCelsius;
    }

    public void ConvertKelvinToFahrenheit(double value) {
        double kelvinFahrenheit = ConvertKelvinToCelsius(value);
        kelvinFahrenheit = ConvertCelsiusToFahrenheit(kelvinFahrenheit);
        kelvinFahrenheit	= (double) Math.round(kelvinFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, +value+ " Kelvin son " +kelvinFahrenheit+ " Fahrenheit");
    }
}
