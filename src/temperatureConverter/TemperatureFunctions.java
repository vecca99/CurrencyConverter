package temperatureConverter;

import javax.swing.*;

public class TemperatureFunctions {

    TemperatureConverter temperatureConverter = new TemperatureConverter();

    public void ConvertTemperature(double input) {
        String option = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(option) {
            case "Grados Celcius a Grados Farenheit":
                temperatureConverter.ConvertCelsiusToFahrenheit(input);
                break;
            case "Grados Celcius a Kelvin":
                temperatureConverter.ConvertCelsiusToKelvin(input);
                break;
            case "Grados Farenheit a Grados Celcius":
                temperatureConverter.ConvertFahrenheitToCelsius(input);
                break;
            case "Kelvin a Grados Celcius":
                temperatureConverter.ConvertKelvinToCelsius(input);
                break;
            case "Kelvin a Grados Farenheit":
                temperatureConverter.ConvertKelvinToFahrenheit(input);
                break;
        }
    }
}
