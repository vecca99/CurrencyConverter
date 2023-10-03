package main;

import currencyConverter.ConverterFunctions;
import temperatureConverter.TemperatureFunctions;

import javax.swing.*;

public class Main {
    public static void main (String[] args) {

        ConverterFunctions currencies = new ConverterFunctions();
        TemperatureFunctions temperature = new TemperatureFunctions();

        while(true) {

            String options = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

            switch(options) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if(ValidateNumber(input) == true) {
                        double Minput = Double.parseDouble(input);
                        currencies.ConvertCurrency(Minput);

                        int response=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == response){
                            System.out.println("Selecciona opción Afirmativa");
                        } else{
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");
                    }
                    break;


                case "Conversor de Temperatura":
                    input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if(ValidateNumber(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperature.ConvertTemperature(Minput);

                        int response = 0;
                        response = JOptionPane.showConfirmDialog(null, "Desea continuar?");
                        if((response == 0) && (ValidateNumber(input) == true)) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Valor invalido");
                    }
                    break;
            }
        }

    }
    public static boolean ValidateNumber(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
