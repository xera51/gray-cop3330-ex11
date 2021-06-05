/*
 *  UCF COP3330 Summer 2021 Exercise 11 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double euros = myApp.readEuros();
        double exchangeRate = myApp.readExchangeRate();
        double usd = myApp.calculateNumUsd(euros, exchangeRate);

        String output = myApp.generateOutputString(euros, exchangeRate, usd);
        myApp.displayOutput(output);

    }

    private double readEuros() {
        System.out.print("How many euros are you exchanging? ");
        return in.nextDouble();
    }

    private double readExchangeRate() {
        System.out.print("What is the exchange rate? ");
        return in.nextDouble();
    }

    private double calculateNumUsd(double euros, double rate) {
        return Math.round(100 * euros * rate) / 100.0;
    }

    public String generateOutputString(double euros, double rate, double usd) {
        DecimalFormat df = new DecimalFormat("0.######");
        return String.format("%.0f euros at an exchange rate of %s is%n" +
                "%.2f U.S. dollars.", euros, df.format(rate), usd);
    }

    public void displayOutput(String output) { System.out.println(output); }
}
