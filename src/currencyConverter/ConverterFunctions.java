package currencyConverter;

import javax.swing.*;

public class ConverterFunctions {
    CurrencyConverter currencyConverter = new CurrencyConverter();
    CurrencyConverterToPesos pesosConverter = new CurrencyConverterToPesos();

    public void ConvertCurrency(double input) {
        String option = (JOptionPane.showInputDialog(null,
                "Elije la moneda a la que deseas convertir tu dinero ", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]
                        {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras","De Pesos a Yen","De Pesos a Won Coreano","De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos","De Yen a Pesos","De Won Coreano a Pesos"},
                "Seleccion")).toString();
        switch(option) {
            case "De Pesos a Dólar":
                currencyConverter.ConvertPesosToDollars(input);
                break;
            case "De Pesos a Euros":
                currencyConverter.ConvertPesosToEuros(input);
                break;
            case "De Pesos a Pounds":
                currencyConverter.ConvertPesosToPounds(input);
                break;
            case "De Pesos a Yen":
                currencyConverter.ConvertPesosToYen(input);
                break;
            case "De Pesos a Korean Won":
                currencyConverter.ConvertPesosToWon(input);
                break;
            case "De Dólar a Pesos":
                pesosConverter.ConvertDollarsToPesos(input);
                break;
            case "De Euros a Pesos":
                pesosConverter.ConvertEurosToPesos(input);
                break;
            case "De Pounds a Pesos":
                pesosConverter.ConvertPoundsToPesos(input);
                break;
            case "De Yen a Pesos":
                pesosConverter.ConvertYenToPesos(input);
                break;
            case "De Korean Won a Pesos":
                pesosConverter.ConvertWonToPesos(input);
                break;
        }
    }
}
