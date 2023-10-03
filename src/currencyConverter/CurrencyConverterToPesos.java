package currencyConverter;

import javax.swing.*;

public class CurrencyConverterToPesos {
    private double dollarExchangeRate = 17.41;
    private double euroExchangeRate = 18.71;
    private double poundExchangeRate = 21.58;
    private double yenExchangeRate = 0.12;
    private double wonExchangeRate = 0.013;

    public void ConvertDollarsToPesos(double value) {
        double pesoAmount = value * dollarExchangeRate;
        pesoAmount = (double) Math.round(pesoAmount * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesoAmount + " Pesos Mexicanos");
    }

    public void ConvertEurosToPesos(double value) {
        double pesoAmount = value * euroExchangeRate;
        pesoAmount = (double) Math.round(pesoAmount * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesoAmount + " Pesos Mexicanos");
    }

    public void ConvertPoundsToPesos(double value) {
        double pesoAmount = value * poundExchangeRate;
        pesoAmount = (double) Math.round(pesoAmount * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesoAmount + " Pesos Mexicanos");
    }

    public void ConvertYenToPesos(double value) {
        double pesoAmount = value * yenExchangeRate;
        pesoAmount = (double) Math.round(pesoAmount * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesoAmount + " Pesos Mexicanos");
    }

    public void ConvertWonToPesos(double value) {
        double pesoAmount = value * wonExchangeRate;
        pesoAmount = (double) Math.round(pesoAmount * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + pesoAmount + " Pesos Mexicanos");
    }
}
