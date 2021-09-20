package com.greatlearning.currencyProblem.driver;

public class CurrencyDenomRunner {

    public Integer[] currenctDenominationCounter(Integer[] currencyDenominations, Integer amount) {
        Integer[] currencyCounter = new Integer[currencyDenominations.length];

        for (int i = 0; i < currencyDenominations.length; i++) {
            if (amount.compareTo(currencyDenominations[i])>=0 ) {
                currencyCounter[i] = amount / currencyDenominations[i];
                amount = amount - (currencyDenominations[i] * currencyCounter[i] );
            }
        }
        return currencyCounter;
    }
}