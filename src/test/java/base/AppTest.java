/*
 *  UCF COP3330 Summer 2021 Exercise 11 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_is_formatted_properly() {
        App myApp = new App();

        double euros = 81;
        double exchangeRate = 1.3751;
        double usd = 111.38;

        String expectedOutput = String.format("81 euros at an exchange rate of 1.3751 is%n" +
                "111.38 U.S. dollars.");
        String actualOutput = myApp.generateOutputString(euros, exchangeRate, usd);

        assertEquals(expectedOutput, actualOutput);
    }
}