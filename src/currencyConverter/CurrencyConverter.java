package currencyConverter;

import javax.swing.*;

public class CurrencyConverter {
    public void ConvertPesosToDollars(double value) {
        double exchangeRate = 20.00; // Updated exchange rate
        double dollarAmount = value / exchangeRate;
        dollarAmount = (double) Math.round(dollarAmount * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + dollarAmount + " Dolares");
    }

    public void ConvertPesosToEuros(double value) {
        double euroExchangeRate = 25.00; // Exchange rate from Mexican Pesos to Euros (for example)
        double euroAmount = value / euroExchangeRate;
        euroAmount = (double) Math.round(euroAmount * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Euros € " + euroAmount + " Euros");
    }

    public void ConvertPesosToPounds(double value) {
        double poundExchangeRate = 23.12;
        double poundAmount = value / poundExchangeRate;
        poundAmount = (double) Math.round(poundAmount * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes £ " + poundAmount + " Libras Esterlinas");
    }

    public void ConvertPesosToYen(double value) {
        double yenExchangeRate = 0.12;
        double yenAmount = value / yenExchangeRate;
        yenAmount = (double) Math.round(yenAmount * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes ¥ " + yenAmount + " Yenes");
    }

    public void ConvertPesosToWon(double value) {
        double wonExchangeRate = 76.92;
        double wonAmount = value / wonExchangeRate;
        wonAmount = (double) Math.round(wonAmount * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes ₩ " + wonAmount + " Wons");
    }
}
